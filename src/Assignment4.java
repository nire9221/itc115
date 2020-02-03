//  The class or method name : repl()
//Description of the class or method purpose : use scanner to get the number and word, then call
//the repl() method to print word variable as much as number of time we input     
//By: Jinyoung Kang
//Date : 1/31/2019
//*******************************************************************



import java.util.Scanner;

public class Assignment4 {
	  
	  
	public static void main(String[] args) {
		
		  Scanner console = new Scanner(System.in);
		  	  
		  
		  repl (console) ;		  
		
		  
		}

		public static void repl (Scanner console) {
			 
			System.out.print ("Type the numbers: " );
			int num = console.nextInt();
		   
		   System.out.print ("Type the word: "  );
		   String word = console.next();
		   
		   
			
		if (num == 0 || num < 0 ) {
				System.out.print("");
			
		}else {
			
			for (int i=1; i <= num; i++) {
				System.out.print(word);	
			
			} 
		    	
		}		    
		
	}
}




//write a method called repl that accepts a String and a number of repetitions as
//parameters and returns the String concatenated that many times.
//For example, the call repl("hello",3)should return "hellohellohello". If the number of repitions 
//is zero or less, the method should return and empty string 




