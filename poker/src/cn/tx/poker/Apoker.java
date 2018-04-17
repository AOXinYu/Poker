/**
 * @author 
 */
package cn.tx.poker;

/**
 * ����һ���˿���
 *
 */
public class Apoker implements Comparable<Apoker> {
	/*
	 * ��ɫ
	 */
	private int color;
	
	/*
	 * ��ɫ���ŵ�ֵ
	 */
	private String colorText;
	
	/*
	 * ������ֵ
	 */
	private int value;
	
	/*
	 * �������ŵ�ֵ
	 */
	private String valueText;
	
	

	public Apoker(int color, String colorText, int value, String valueText) {
		super();
		this.color = color;
		this.colorText = colorText;
		this.value = value;
		this.valueText = valueText;
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

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getValueText() {
		return valueText;
	}

	public void setValueText(String valueText) {
		this.valueText = valueText;
	}

	/*@Override
	 * �������д�ķ�����������չʾ
	public String toString() {
		return "Apoker [color=" + color + ", colorText=" + colorText + ", value=" + value + ", valueText=" + valueText
				+ "]\n";
	}*/
	@Override
	public String toString() {
		return "Apoker [colorText=" + colorText +", valueText=" + valueText
				+ "]\n";
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	
//	��д�Ƚϵķ���
	@Override
	public int compareTo(Apoker o) {
//		�ȸ��ݻ�ɫ���Ƚ�
		int Val=this.color-o.color;
//		�����ɫ��ͬ��ôʹ��ֵ���Ƚ�
		if(Val==0) {
			Val=o.value-this.value;
		}
	
		return Val;
	}
	
	

}
