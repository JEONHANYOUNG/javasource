package afterschool;

public class ColorTv extends Tv {// 상속 관계, 받는 것
	private int color; // 멤버변수
	public ColorTv(int size, int color) {
		super(size);
	this.color = color;
	} 
  
	public void printProperty() { //리턴 타입의 경우 void
	System.out.printf("%d인치 %d컬러", getSize(),color);
	}
	
	public int getColor() {
		return color;
	}
}
