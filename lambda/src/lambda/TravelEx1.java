package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TravelEx1 {
	public static void main(String[] args) {
		List<TravelCustomer> customerList = new ArrayList<TravelCustomer>();
		
		customerList.add(new TravelCustomer("�̼���", 40, 1000000));
		customerList.add(new TravelCustomer("������", 30, 1200000));
		customerList.add(new TravelCustomer("�̸���", 25, 700000));
		customerList.add(new TravelCustomer("������", 38, 1300000));
		customerList.add(new TravelCustomer("������", 50, 800000));
	
		//�� ��� ����ϱ�(�̸���)
//		customerList.stream().map(TravelCustomer::getName).forEach(System.out::println);
		customerList.stream().map(c -> c.getName()).forEach(c-> System.out.println(c));
		
		System.out.println();
		
		//������ �� ���� ��� ����ϱ�
		System.out.println("�� ������ "+customerList.stream().mapToInt(c -> c.getPrice()).sum());
		
		System.out.println();
		//30�� �̻� ����� ����ϱ�
		customerList.stream()
					.filter(c -> c.getAge() >= 30)
					.map(TravelCustomer::getName)
					.sorted()
					.forEach(System.out::println);
	
	
	}

}
