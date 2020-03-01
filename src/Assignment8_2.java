//2.
//P. 528 ex 11 Write a method named isUnique
//Test your method from the main. 
//Hint: You will need a nested for loop to solve this.

//write a method called inUnique that accepts an array of integers as a parameter and returns a boolean value 
//indicating whether or not the value in the array are unique (true for yes, false for no). the value in the list
//are considered unique if there is no pair of value that are equal. for example, if passed an array containing
//[3,8,12,2,9,17,43,-8,46], your method should return true, but if passed [4,7,3,9,12,-47,3,74],your method
//should return false because the value 3 appears twice 

public class Assignment8_2 {

	public static void main(String[] args) {		
	     // int nums[] = {30,24,22,32,42,54}; 
	      int nums[] = {30,24,22,32,43,54}; 
	    
	 
	      System.out.println(inUnique(nums));
	}
	public static boolean inUnique(int[] arr) {	
		   for (int i = 0; i < arr.length; i++) {
			   for(int j=i+1 ; j<arr.length; j++) {
	            if (arr[i] == arr[j]) {
	                return false;
	            	}
	            }
	        } 
		   return true;
	}
}


