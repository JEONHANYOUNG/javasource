// ������ �Ǵ��ϱ⿡ xx�� �ʿ��ϴٸ� �׶� ���� �� 

// ����(Variable)
// ���α׷� ���� �߿� ������� �����͸� ������ ��
// ���� ����?
// CPU ������ġ ������ ���� RAM ������ġ ������ ���� ����
// RAM ��������, �ӽ�����(�ڵ�����(������ϰų�))
// �޸� ������ �Ʒ��� ���� ������ �ִ�
// static
// stack - ���α׷� ���� �ڵ��ݳ�->���� �ȵ�����?->�������� �Ұ���
// heap - �ڵ� �ݳ����� ���� -> �����ڰ� �������� �ݳ� ó�� �ؾ�

// �޸� ���� ����
// Java���� GarbageCollection ����� �ִ�
// heap ���� �ڵ����� �ý��� - ����? ���� ����Ʈ! �ε�
// ���� ����! ����԰� ������ ��!
// ���..


// 16GB ---- 15.9GB
// �� ������ �� ���� �ݳ�
// 

// SDD/HDD ������ġ ������ ���� ���� 
// ��������, �������� -> ���� -> DB
// GPU �׷��� ���� ��ġ(CPU+RAM+HDD)
// eclipse : ssd�� �����ϸ� �ٷ� ��
// .java : hdd�� ���� �뷮�� ������

// ���� ����
// Variable ������ ��� �׸�
// �׸� ���� �׸� �̸�;
// � ������ ���� �׸��̸�;
// �ڷ���(data type) ������;
// ���α׷� ���� �߿� ������� �����͸� �ӽ÷� ������ ��

// �ڷ���
// ��� ���� ������ �ӽ� ���� - byte/short�� ���� but now, int
// why? �뷮 Ŀ��
// before, �˰����� �ô� : �ִ��� �Ƴ� ������ ¥���µ� �ַ�(��)
// now, ���������� �ô�(byte�� short ���� �߿����� �ʴ�)
// ������, �ΰ��Ű�� - ������ ������� -> �ϵ���� ���� ���� �Ұ�

// ������ �ڷ����� ã�� ���� �߿�
// 1bit = 0/1
// 1byte = 8bit
//		�⺻��
//		���� - byte(1byte : -100 ~ 100), short(2 : -6��~6��), 
//		int(4 : -21��~21��), long(8 : ŭ) (�׸�ũ������)
//		�Ǽ� - float(4), double(8) -> �ַ� 
// 		�� �����ϰ� �ƴϰ��� ����
//		���� - char(2)
//		�� - boolean(1)
//		���� - void
//	  	������*
//		���ڿ� - String



// ������
// 	    �������
// 		���ڷ� ���� �Ұ� - IT ������ 1asda.txt x
//		Ư������ ���� �Ұ�(_, $�� ������)
//		�ڹٹ��� �Ұ�

//		�ҹ��ڷ� ����
//		����+���� ����
//		���� �˱� ����
//		-> �ٵ� ����� ������
//		korScore : ��Ÿü
//		kor_score: ��ü
// = ����x
// = �����ʿ� �ִ� �� ���ʿ� �־��
// �̸� �Ѳ����� �ٲ� �� refactor, rename ����
public class VariableMain {
	public static void main(String[] args) {
	//���������� 80���� �Ÿ� �ӽ÷� ������ �� �ְ�
	int korScore;	//���� �����
	korScore = 80;	//���� �� ����
	float tem;
	tem = (float) 24.38;
	
	char laugh;
	laugh = '��';
	String laugh2;
	laugh2 = "����";
	
	System.out.println(tem);
	System.out.println(laugh);
	System.out.println(laugh2);
	System.out.println("korScore");
	System.out.println(korScore); //������ ����ִ� �� ���
	System.out.println(korScore); //������ ����ִ� �� ���
	System.out.println(korScore); //������ ����ִ� �� ���
	System.out.println(korScore); //������ ����ִ� �� ���
	System.out.println(korScore); //������ ����ִ� �� ���
	System.out.println(korScore); //������ ����ִ� �� ���
	System.out.println(korScore); //������ ����ִ� �� ���
	System.out.println(korScore); //������ ����ִ� �� ���
	System.out.println(korScore); //������ ����ִ� �� ���
	System.out.println(korScore); //������ ����ִ� �� ���
	
	
	// ����°��� �ӽ÷� ������ �� �ְ�
	
	boolean isHungry;
	isHungry = true; 
	
	System.out.println(isHungry);      
	
	
	double temp3; // �⺻�� ����
	Double temp2; // ������ ���� �⺻���� �����ϴ� �������� �ִ�
	// ���� �빮��
	
	
	// Java����
	// ���������� ����� ���� �ȳ����� ����� �Ұ���
	
	int age;
	age = 30;
	System.out.println(age);
	

	
	
		
		
		
	}
}









