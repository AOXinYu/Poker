/**
 * @author ��
 */
package cn.tx.poker;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * �������
 */
public class ColorGroup implements Comparable<ColorGroup> {
	// ���ڵ��˿���
	private int pokerCount;

	// ��Ļ�ɫ
	private int color;

	// ��ɫ����
	private String colorText;

	// ���ڵ��˿�
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
//		����������
		return this.getColor()-o.getColor();
	}
/*
	@Override
	������չʾ
	public String toString() {
		return "ColorGroup [pokerCount=" + pokerCount + ", color=" + color + ", colorText=" + colorText + ", apList="
				+ apList + "]\n";
	}*/

	@Override
	public String toString() {
		return "ColorGroup [pokerCount=" + pokerCount + "��,��ɫ:"+ colorText+",\n apList="
				+ apList + "]\n";
	}
	

}
