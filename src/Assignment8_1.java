import java.util.Scanner;

//1.
//P. 527, ex. 4 Write a method isSorted that accepts an array
//Test your methods from the main. 
//Do not use the built in sorting methods. Implement your own, or you will no get credit for this assignments.

//write a method called isSorted that accepts an array of real number as parameer and returns true if the list ins in sorted 
//(nondecreasing)order and forse otherwise. for example, if array named list1 and list2 store 
//[16.1, 12.3, 22.2, 14.4] and [1.5,4.3,7.0,19.5,25.1,46.2] respectively, the calls isSorted(list1) and isSorted(list2) 
//should return false and true respectively. Assume the array has at least one element. A one-element array is considered to be sorted

import java.util.Scanner;
public class Assignment8_1 {

	public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        isSorted(console);


	}

	
	public static double[] isSorted (Scanner console) {
		 System.out.print("Enter the number: ");
		double [] array = new double[5];
	     while (console.hasNextDouble()) {  
	    	 double num = console.nextDouble(); 
	    	 
	    	 if (array[0]<array[1]) {
	    		 return true;
	    	 } else if (array[1]<array[2]) {
	    		 return true;
			 }else if (array[2]<array[3]) {
				 return true;
			 }else if (array[3]<array[4]) {
				 return true;
			 } else if (array[4]>array[0]) {
				 return true;
	     		} else {
				 return false;
			 }
		 } return array;
	}
}


//$num = array(4,15,22,-2);
//function sortArray($num){
//    
//    for($i=0; $i<count($num); $i++)
//    {
//        for($j=$i+1; $j<count($num); $j++)
//        {
//            if($num[$i]> $num[$j]){
//                $temp= $num[$i];
//                $num[$i]= $num[$j];
//                $num[$j]= $temp;
//            }
//        }
//
//    } return $num;
//}
//
//print_r(sortArray($num));
