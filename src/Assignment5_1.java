//*******************************************************************
//  create method 'season' with if statement 
//	call the method in different x,y value 
//By: Jinyoung Kang
//Date : 2/4/2019
//*******************************************************************

public class Assignment5_1 {

	public static void main(String[] args) {
	
		
		season(12,15);
		season(4,24);

	}
	
	public static void season(int x, int y) {
		
		if ((x == 12 && y > 16 && y <= 31) || (x== 1 && y <=31 ) || (x == 2 && y <= 28) ||(x ==3 && y < 16)) {
			System.out.println("Winter!");
		}
		else if ((x == 3 && y > 16 && y <= 31) || (x== 4 && y <=30 ) || (x == 5 && y <= 31) ||(x ==6 && y < 16)) {
				System.out.println("Spring!");
		}
		else if ((x == 6 && y > 16 && y <= 30) || (x== 7 && y <=31 ) || (x == 8 && y <= 31) ||(x ==9 && y < 16)) {
				System.out.println("Summer");
		}
		else if ((x == 9 && y > 16 && y <= 30) || (x== 10 && y <=31 ) || (x == 11 && y <= 30) ||(x ==12 && y < 16)) {
				System.out.println("Fall!");
		}
		
		}

}


//write a method called season that takes as parameter two integers representing 
//a month and day and returns a String indicating the season for that month and day
//Assume that the month is specified as an integer between 1 and 12 

//(1 for January, 2 for Feburuary ...) and that the day of the month is a number between 1 and 31.
//if the date falls between 12/16 and 3/15, the method should return "winter". 
//if the date falls between 3/16 and 6/15, the method should return "spring".
//if the date falls between 6/16 and 9/15, the method should return "summer". 
//And if the date falls between 9/16 and 12/15, the method should return "fall"