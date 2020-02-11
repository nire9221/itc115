//*******************************************************************
//  The class or method name
//
// Description of the class or method purpose
//By: Jinyoung Kang
//Date: 
//*******************************************************************

import java.io.*;     // for File
import java.util.*;   // for Scanner

public class Assignment6 {

	public static void main(String[] args) throws FileNotFoundException {
		 Scanner input = new Scanner(new File("boysgirls.txt"));
		 while (input.hasNextLine()) {
			 String text = input.nextLine();
			 processLine(text);
		 }
	}
	public static void processLine (String text) {
		Scanner data = new Scanner (text);
		int id = data.nextInt();
		String name = data.next();
		double sum = 0.0;
		while (data.hasNextDouble()) {
			sum += data.nextDouble();
		}
		System.out.println("Total hours worked by " + name + "(id#" + id + ") = " + sum);
	}
	
	
	

}


//write a method called boyGirl that accepts a Scanner that is reading its input from a file containing a series 
//of names followed by integers. The names alternate between boys' name and girls' name. Your method should compute 
//the absolute difference between the sum of boys' integers and the sum of the girls' integers. The input could end
//with either a boy or girl; you may assume that it contains an even number of names. For example, if the input file
//contains the following text:
//Erik 3 Rita 7 Tanner 14 Jillyn 13 Curtis 4 Stefanie 12 Ben6
//Then the method should produce the following console output, since boys' sum is 27 and girls' sum is 32:
//4 boys, 3 girls 
//Difference betwwen boys' and girls' sums : 5 


//
//You can find the path to your project by clicking on your project folder in Eclipse, then => File => Properties. 
//Copy the file in this location (but not inside not inside src or class folders.)