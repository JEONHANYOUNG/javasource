package shop;

// 완전 추상화 => 상수 필드, 추상메소드만 가짐
// jdk8 => default, static 메서드 가질 수  있기는 함

public interface Ishop {
	public void SetTitle(String title); // public abstract 부분이 생략됨
	public void genUser();
	public void genProduct();
	public void start();
}
