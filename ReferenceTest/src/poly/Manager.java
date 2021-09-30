package poly;

public class Manager extends Employee {
	@Override
	public void work() {
		System.out.println(super.getPosition()+ " 에서"+ super.getName()+" 가 일을 일합니다.");
	}
}
