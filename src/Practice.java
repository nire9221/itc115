
public class Practice {

	public static void main(String[] args) {

		mystery(5, 3);
		mystery(2, 6);
		mystery(12, 18);
		
	}
	
	public static int mystery (int x, int y) {
		while (x !=0 && y !=0) {
			if (x < y) {
				y = y - x;
			}else {
				x= x - y;
			}
		}
		return x+y;
	}

}
