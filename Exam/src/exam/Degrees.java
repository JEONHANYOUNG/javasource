package exam;

import java.util.Scanner;

public class Degrees {

	public static void main(String[] args) {
		// È­¾¾ ¿Âµµ => ¼·¾¾¿Âµµ
		
		//Á¶°Ç 
		//È­¾¾¿Âµµ ÀÔ·Â¹Þ±â(Á¤¼ö)
		Scanner k = new Scanner(System.in);

	    System.out.println("È­¾¾¿Âµµ : ");
        int degrees = k.nextInt();
                	    
		//¹ÞÀº È­¾¾¿Âµµ=> ¼·¾¾¿Âµµ·Î º¯È¯ ÈÄ Ãâ·ÂÇÏ±â
		//(È­¾¾¿Âµµ-32)*5/9
        double cels =(degrees-32)*5/9.0;
        System.out.println("¼·¾¾ ¿Âµµ : "+cels);
        System.out.printf("¼·¾¾ ¿Âµµ : %.4f", cels);
	}

}
