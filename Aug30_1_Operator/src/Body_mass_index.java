import java.util.Scanner;

public class Body_mass_index {
	public static void main(String[] args) {
		
		Scanner k = new Scanner(System.in);

		System.out.println("체질량 지수 검사"); 
		
		System.out.println("이름 : "); 
		String name = k.next();
		
		System.out.println("키 : "); 
		double height = k.nextDouble();
		
		if (height >= 3) {
			height /= 100;
		}
		
		System.out.println("몸무게 : "); 
		double weight = k.nextDouble();
		
		System.out.println("♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥");
		double bmi = weight / (height * height);
		System.out.printf("BMI : %.1f\n", bmi);
		if(bmi >= 35) {
			System.out.println("고도비만ㅠ_ㅠ괜찮아요!");
		}else if(bmi >= 30) { 
			System.out.println("과체중도 나름 건강해요!");
		} else if(bmi >= 25) { 
			System.out.println("경도비만은 귀여워요.");
		} else if(bmi >= 23) { 
			System.out.println("과체중은 무슨..그냥 멀쩡해요.");
		} else if(bmi >= 18.5) { 
			System.out.println("밥을 더 드세요!");
		} else {
			System.out.println("저체중이에요ㅠ_ㅠ");
		}
	}
}
