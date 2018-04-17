/**
 * @author ��
 */
package cn.tx.poker;

import java.util.List;

/**
 * 
 *
 */
public class Test {
	public static void main(String[] args) {
//		创建一副扑克牌的对象
		Pokers p=new Pokers();
//		创建扑克牌中的扑克牌
		List<Apoker> aList=p.createPoker();
//		System.out.println(aList);
		List<Apoker> aList1=p.shufflePoker();
//		System.out.println(aList1);
//		Apoker ap=p.getRandomPoker();
//		System.out.println(ap);
//		List<Apoker> aList2=p.sortPoker();
//		System.out.println(aList2);
		List<ColorGroup> cgList=p.sortGroup();
		System.out.println(cgList);
		
	}

}
