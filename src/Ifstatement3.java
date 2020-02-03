

public class Ifstatement3 {

	public static void main(String[] args) {
		
	    isDate(35,60,65000.00,55); // should be true
		isDate (35,60,5000.00,42);
	}
	
	public static boolean isDate(int age, int height, double salary, int location) {
		boolean rich = salary >= 100000.00;
		boolean goodAge = age >=21 && age <50;
		boolean goodHeight = height>=50 && height < 84;
		boolean goodLocation = location <50;
		
		if ((goodAge && goodHeight || rich) && goodLocation ) {
			System.out.println("Ok, let's go out!");
			return true;
		}else {
			System.out.println("It's not you, it's me");
			return false;
		}
	}

}
