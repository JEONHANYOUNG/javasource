package afterschool;

public class ColorTv extends Tv {// ��� ����, �޴� ��
	private int color; // �������
	public ColorTv(int size, int color) {
		super(size);
	this.color = color;
	} 
  
	public void printProperty() { //���� Ÿ���� ��� void
	System.out.printf("%d��ġ %d�÷�", getSize(),color);
	}
	
	public int getColor() {
		return color;
	}
}
