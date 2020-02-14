//*******************************************************************
// get number of boys' num and girls' num (btotal/gtotal) 
// get sum each number  (boysum/girlsum)
// find the number in while loop and added up 
//By: Jinyoung Kang
//Date: 
//*******************************************************************

import java.io.*;     // for File
import java.util.*;   // for Scanner

public class Assignment6 {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner input = new Scanner(new File("sample/boysgirls.txt"));
		textfile(input);
		
	}
	
	public static void textfile (Scanner input) {	     
		int boysum = 0;
		int girlsum = 0;
	    int btotal = 0;
	    int gtotal = 0;
	    int count = 0; 
		
		while (input.hasNext()) {
	    	 String name = input.next();
	    	 int num = input.nextInt(); 
		     
			     
			 if(count % 2 == 0) {	 
				 btotal++;
				 boysum += num;
			       
			 }
			        
			 else if (count % 2 != 0) {
				 gtotal++;
				 girlsum += num;
			       
		     }
			 count++;
			 
		     }
		System.out.println("Difference between boys' and girls' sums : " + Math.abs((boysum - girlsum)));
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

