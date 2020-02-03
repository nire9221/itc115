

public class PrintPractice {
	public static void main(String[] args) {
		
		System.out.println("Hello world");
		
		double x=3.14;
		System.out.println(x);
		
		for (int i=0; i<5; i++) {
			drawBox();
		}
	}
	
	public static void drawBox() {
		String hor ="+---+";
		String ver ="|   |";
		
		System.out.println(hor);
		System.out.println(ver);
		System.out.println(ver);
		System.out.println(hor);
		
	}
}
