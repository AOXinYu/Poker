/**
 * @author 
 */
package cn.tx.poker;

/**
 * 创建一张扑克牌
 *
 */
public class Apoker implements Comparable<Apoker> {
	/*
	 * 花色
	 */
	private int color;
	
	/*
	 * 花色符号的值
	 */
	private String colorText;
	
	/*
	 * 点数的值
	 */
	private int value;
	
	/*
	 * 点数符号的值
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
	 * 下面的重写的方法是完整的展示
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
	
//	重写比较的方法
	@Override
	public int compareTo(Apoker o) {
//		先根据花色来比较
		int Val=this.color-o.color;
//		如果花色相同那么使用值来比较
		if(Val==0) {
			Val=o.value-this.value;
		}
	
		return Val;
	}
	
	

}
