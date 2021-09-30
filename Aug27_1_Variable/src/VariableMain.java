// 본인이 판단하기에 xx가 필요하다면 그때 쓰는 거 

// 변수(Variable)
// 프로그램 진행 중에 만들어진 데이터를 저장할 때
// 어디다 저장?
// CPU 연산장치 좋으면 빠름 RAM 저장장치 좋으면 많이 저장
// RAM 변수형태, 임시저장(자동삭제(재부팅하거나))
// 메모리 영역은 아래와 같이 나뉘어 있다
// static
// stack - 프로그램 종료 자동반납->종료 안됐으면?->수동정리 불가능
// heap - 자동 반납되지 않음 -> 개발자가 수동으로 반납 처리 해야

// 메모리 정리 어플
// Java에는 GarbageCollection 기능이 있다
// heap 영역 자동정리 시스템 - 언제? 면접 포인트! 두둥
// 지금 못해! 강사님과 열심히 해!
// 띠용..


// 16GB ---- 15.9GB
// 다 썼으면 그 공간 반납
// 

// SDD/HDD 저장장치 좋으면 많이 저장 
// 파일형태, 영구저장 -> 발전 -> DB
// GPU 그래픽 구현 장치(CPU+RAM+HDD)
// eclipse : ssd에 저장하면 바로 뜸
// .java : hdd에 저장 용량이 작으니

// 문법 변수
// Variable 데이터 담는 그릇
// 그릇 종류 그릇 이름;
// 어떤 데이터 저장 그릇이름;
// 자료형(data type) 변수명;
// 프로그램 진행 중에 만들어진 데이터를 임시로 저장할 때

// 자료형
// 사람 나이 데이터 임시 저장 - byte/short가 최적 but now, int
// why? 용량 커짐
// before, 알고리즘의 시대 : 최대한 아낄 전략을 짜내는데 주력(옛)
// now, 유지보수의 시대(byte와 short 별로 중요하지 않다)
// 딥러닝, 인공신경망 - 옛날에 만들어짐 -> 하드웨어 부족 실현 불가

// 최적의 자료형을 찾는 것이 중요
// 1bit = 0/1
// 1byte = 8bit
//		기본형
//		정수 - byte(1byte : -100 ~ 100), short(2 : -6만~6만), 
//		int(4 : -21억~21억), long(8 : 큼) (그릇크기차이)
//		실수 - float(4), double(8) -> 주력 
// 		더 정밀하고 아니고의 문제
//		글자 - char(2)
//		논리 - boolean(1)
//		없다 - void
//	  	참조형*
//		문자열 - String



// 변수명
// 	    마음대로
// 		숫자로 시작 불가 - IT 전반적 1asda.txt x
//		특수문자 시작 불가(_, $는 괜찮음)
//		자바문법 불가

//		소문자로 시작
//		영어+숫자 조합
//		뜻을 알기 좋게
//		-> 근데 띄어쓰기는 못쓰니
//		korScore : 낙타체
//		kor_score: 뱀체
// = 같다x
// = 오른쪽에 있는 거 왼쪽에 넣어라
// 이름 한꺼번에 바꿀 때 refactor, rename 들어가기
public class VariableMain {
	public static void main(String[] args) {
	//국어점수가 80점인 거를 임시로 저장할 수 있게
	int korScore;	//변수 만들기
	korScore = 80;	//변수 값 저장
	float tem;
	tem = (float) 24.38;
	
	char laugh;
	laugh = 'ㅋ';
	String laugh2;
	laugh2 = "ㅋㅋ";
	
	System.out.println(tem);
	System.out.println(laugh);
	System.out.println(laugh2);
	System.out.println("korScore");
	System.out.println(korScore); //변수에 들어있는 값 출력
	System.out.println(korScore); //변수에 들어있는 값 출력
	System.out.println(korScore); //변수에 들어있는 값 출력
	System.out.println(korScore); //변수에 들어있는 값 출력
	System.out.println(korScore); //변수에 들어있는 값 출력
	System.out.println(korScore); //변수에 들어있는 값 출력
	System.out.println(korScore); //변수에 들어있는 값 출력
	System.out.println(korScore); //변수에 들어있는 값 출력
	System.out.println(korScore); //변수에 들어있는 값 출력
	System.out.println(korScore); //변수에 들어있는 값 출력
	
	
	// 배고픈가를 임시로 저장할 수 있게
	
	boolean isHungry;
	isHungry = true; 
	
	System.out.println(isHungry);      
	
	
	double temp3; // 기본형 변수
	Double temp2; // 참조형 변수 기본형에 대응하는 참조형이 있다
	// 보통 대문자
	
	
	// Java에서
	// 지역변수를 만들고 값을 안넣으면 사용이 불가능
	
	int age;
	age = 30;
	System.out.println(age);
	

	
	
		
		
		
	}
}









