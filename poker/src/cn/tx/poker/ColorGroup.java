/**
 * @author 宇
 */
package cn.tx.poker;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 分组操作
 */
public class ColorGroup implements Comparable<ColorGroup> {
	// 组内的扑克数
	private int pokerCount;

	// 组的花色
	private int color;

	// 花色符号
	private String colorText;

	// 组内的扑克
	private List<Apoker> apList=new ArrayList<Apoker>();

	public int getPokerCount() {
		return pokerCount;
	}

	public void setPokerCount(int pokerCount) {
		this.pokerCount = pokerCount;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public String getColorText() {
		return colorText;
	}

	public void setColorText(String colorText) {
		this.colorText = colorText;
	}

	public List<Apoker> getApList() {
		return apList;
	}

	public void setApList(List<Apoker> apList) {
		this.apList = apList;
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(ColorGroup o) {
//		按照组排序
		return this.getColor()-o.getColor();
	}
/*
	@Override
	完整的展示
	public String toString() {
		return "ColorGroup [pokerCount=" + pokerCount + ", color=" + color + ", colorText=" + colorText + ", apList="
				+ apList + "]\n";
	}*/

	@Override
	public String toString() {
		return "ColorGroup [pokerCount=" + pokerCount + "张,花色:"+ colorText+",\n apList="
				+ apList + "]\n";
	}
	

}
