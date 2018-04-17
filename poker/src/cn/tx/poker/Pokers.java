/**
 * @author 宇
 */
package cn.tx.poker;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * 
 *
 */
public class Pokers {
	/*
	 * 扑克张数
	 */
	public int pokerCount;

	/*
	 * 花色数量
	 */
	public int colorCount;

	/*
	 * 扑克牌的集合
	 */
	private List<Apoker> aList;

	/*
	 * 
	 * 存储组的集合
	 */

	private List<ColorGroup> cgList;

	public int getPokerCount() {
		return pokerCount;
	}

	public void setPokerCount(int pokerCount) {
		this.pokerCount = pokerCount;
	}

	public int getColorCount() {
		return colorCount;
	}

	public void setColorCount(int colorCount) {
		this.colorCount = colorCount;
	}

	public List<Apoker> getaList() {
		return aList;
	}

	public void setaList(List<Apoker> aList) {
		this.aList = aList;
	}

	/*
	 * 创建扑克牌的方法
	 */
	public List<Apoker> createPoker() {
		// 初始化扑克牌的数量
		pokerCount = 54;
		// 初始化花色的数量
		colorCount = 5;
		// 创建扑克集合
		aList = new ArrayList<Apoker>();
		/*
		 * 王 ♥ ■ ♠ ♣ 1 2 3 4 5
		 *
		 * A 2 3 4 5 6 7 8 9 10 J Q K 小王 大王 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
		 *
		 */
		// 循环花色非王
		for (int i = 2; i <= 5; i++) {
			// 循环非王花色内的值
			for (int j = 1; j <= 13; j++) {
				// 花色的符号
				String colorText = null;
				// 值的符号
				String valueText = null;
				// 给花色赋值符号的过程
				colorText=findColorText(i);
				// 给扑克的值赋符号
				valueText=findValueText(j);
				/*switch (i) {
				case 2:
					colorText = "♥";
					break;
				case 3:
					colorText = "■";
					break;
				case 4:
					colorText = "♠";
					break;
				case 5:
					colorText = "♣";
					break;

				}
				
				// 给扑克的值赋符号
				switch (j) {
				case 1:
					valueText = "A";
					break;
				case 11:
					valueText = "J";
					break;
				case 12:
					valueText = "Q";
					break;
				case 13:
					valueText = "K";
					break;
				default:
					valueText = j + "";
					break;

				}*/
				// 创建一张扑克对象
				Apoker ap = new Apoker(i, colorText, j, valueText);
				// 把每一张扑克对象放入扑克盒
				aList.add(ap);

			}
		}
		// 创建小王
		Apoker ap1 = new Apoker(1, "王", 14, "小王");
		// 创建大王
		Apoker ap2 = new Apoker(1, "王", 15, "大王");
		aList.add(ap1);
		aList.add(ap2);

		return aList;
	}

	/*
	 * 洗牌
	 */
	public List<Apoker> shufflePoker() {
		Collections.shuffle(aList);
		return aList;
	}

	/*
	 * 随机 抽取一张
	 */
	public Apoker getRandomPoker() {
		Random r = new Random();
		/*
		 * nextInt(int bound) 返回伪随机的，均匀分布 int值介于0（含）和指定值（不包括），从该随机数生成器的序列绘制。
		 */
		// 获取随机的索引
		// int index=r.nextInt(54)+1; 注意索引从0开始，所以不需要加1
		int index = r.nextInt(this.pokerCount);

		return aList.get(index);
	}

	/*
	 * 排序
	 */
	public List<Apoker> sortPoker() {
		Collections.sort(aList);
		return aList;

	}

	/*
	 * 分组
	 */
	public List<ColorGroup> sortGroup() {
		// 创建大集合
		cgList = new ArrayList<ColorGroup>();
		// 遍历扑克牌
		for (Apoker ap : aList) {
			// 获得扑克牌的花色
			int color = ap.getColor();
			// 根据花色找组
			ColorGroup cg = this.findGroup(color);
			if (cg == null) {
				// 创建一个组
				ColorGroup cGroup = new ColorGroup();
				cGroup.setColor(color);
//				设置花色符号
				cGroup.setColorText(findColorText(color));
//				把扑克加入组中
				cGroup.getApList().add(ap);
//				把组加入组集合
				cgList.add(cGroup);

			}else {
				cg.getApList().add(ap);
			}
		}
//		获得扑克组中的扑克牌的数量
		for(ColorGroup cg2:cgList) {
//			获得组中的集合
			List<Apoker> aList=cg2.getApList();
//			对组中的集合排序
			Collections.sort(aList);
//			设置组的扑克的张数
			cg2.setPokerCount(aList.size());
		}
//		将组排序
		Collections.sort(cgList);
		return cgList;
	}

	/*
	 * 根据花色找组
	 */
	public ColorGroup findGroup(int color) {
		// 定义一个组的对象
		ColorGroup cg1 = null;
		// 遍历组集合
		for (ColorGroup cg : cgList) {
			// 如果传递过来的花色和其中花色匹配
			if (color == cg.getColor()) {
				cg1 = cg;
				break;

			}
		}
		return cg1;
	}
	/*
	 * 跟据花色值来找花色的符号
	 */
	
	public static String findColorText(int color) {
		String colorText=null;
		switch (color) {
		case 1:
			colorText = "王";
			break;
		case 2:
			colorText = "♥";
			break;
		case 3:
			colorText = "■";
			break;
		case 4:
			colorText = "♠";
			break;
		case 5:
			colorText = "♣";
			break;

		}
		return colorText;
	}
	
	public static String findValueText(int value) {
		String valueText=null;
		switch (value) {
		case 1:
			valueText = "A";
			break;
		case 11:
			valueText = "J";
			break;
		case 12:
			valueText = "Q";
			break;
		case 13:
			valueText = "K";
			break;
		default:
			valueText = value + "";
			break;
		}
		return valueText;

		}

	
	

}
