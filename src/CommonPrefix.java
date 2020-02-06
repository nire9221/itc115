
public class CommonPrefix {

	public static void main(String[] args) {

		printCommonPrefix(3,5);
	}
	
	public static void printCommonPrefix (int x, int y) {
		
		int z=0;
		//Point A
		
		while (x !=y) {
				//point B
			z++;
			//point c
			if (x>y) {
				//point d
				x = x/10;
			}else {
				//point e
				y=y/10;
			}
			//point f
		}
		//point g
		System.out.println("common prefix = " + x);
		System.out.println("digits discarded = " + z);
	}
	

}
