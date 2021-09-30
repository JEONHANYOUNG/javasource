package ClassTest;

public class Numbers2EX {

	public static void main(String[] args) {

		int num[]= {5,6,7,8,9};
				
		Numbers numbers =new Numbers(num);

		System.out.println("ÇÕ°è : "+numbers.getTotal());
		System.out.println("Æò±Õ : "+numbers.getAverage());
	}

}
