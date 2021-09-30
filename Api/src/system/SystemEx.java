package system;

public class SystemEx {

	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			System.out.println(i + "\t");

			if (i == 5) {
				System.exit(0);
			}
		}

		//System.arraycopy(src,src,dest,destpos,length)
		
	}

}
