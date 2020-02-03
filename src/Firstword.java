public class Firstword {

	public static void main(String[] args) {
		
		firstWord("one two three four");
		
	}
	public static String firstWord (String s) {
		int start =0;
		while (start <s.length() && s.charAt(start) == ' ') {
			start++;
		}
		int stop =0;
		while (stop < s.length() && s.charAt(stop) !=' ') {
			stop++;
		}
		return s.substring(start,stop);
	}
}
