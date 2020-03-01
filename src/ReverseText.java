
public class ReverseText {

	public static void main(String[] args) {

		reverse("home");
		
	}
	
	public static String reverse(String text) {
		String result ="";
		for (int i=0; i<text.length();i++) {
			result = text.charAt(i) +result;
//			System.out.println(result);    
		}
		return result;
	}

}
