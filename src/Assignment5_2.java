//*******************************************************************
// 1) get input (name(string), score(int))
// 2) get summary (count # of score input, sum score)
// 3) get avg (sum/#of count)
//By: Jinyoung Kang
//Date: 2/4/2019, 2/6/2019 
//*******************************************************************

import java.util.Scanner;
public class Assignment5_2 {

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);
		PrintGPA(console);
		
	}
	public static void PrintGPA(Scanner console) {
		
        System.out.print("Enter a student record? ");
        
        String name = console.next();
        int num = console.nextInt();
        
        int sum = 0;
        //int count = 0;
        
        for (int i = 0; i <= num; i++)
        {
            sum += console.nextInt();
            //count++;
        }
        double gpa = (double) sum / num;
        System.out.println(name + "'s grade is " + gpa);
     }
}



//Write a method called PrintGPA that accepts a Scanner for the console as a parameter and 
//calculates a student's grade point average. The user will type a line of input containing the
//student's name, then a number that represents the number of scores, followed by that many
//integer scores. here are two example dialogues:

//	Enter a student record: Maria 5 72 91 84 89 78
//	Maria's grade is 82.8 
//	
//	Enter a student record: Jordan 4 86 71 62 90
//	Jordan's grade is 77.25