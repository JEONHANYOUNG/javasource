package exception;

public class UnCheckedException3 {
	public static void main(String[] args) {
			Dog dog = new Dog();
			changeDog(dog);
		
			cat cat = new cat();
			changeDog(cat);
	}


	//Animal animal = dog;	
	//Animal animal = cat;	
	public static void changeDog(Animal animal) {
		if (animal instanceof Dog) {
			Dog dog = (Dog) animal;
			
		}
	
			
		}
		
	}



	
