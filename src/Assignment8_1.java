//1.
//P. 527, ex. 4 Write a method isSorted that accepts an array
//Test your methods from the main. 
//Do not use the built in sorting methods. Implement your own, or you will no get credit for this assignments.

//write a method called isSorted that accepts an array of real number as parameer and returns true if the list ins in sorted 
//(nondecreasing)order and forse otherwise. for example, if array named list1 and list2 store 
//[16.1, 12.3, 22.2, 14.4] and [1.5,4.3,7.0,19.5,25.1,46.2] respectively, the calls isSorted(list1) and isSorted(list2) 
//should return false and true respectively. Assume the array has at least one element. A one-element array is considered to be sorted

public class Assignment8_1 {

  public static void main(String[] args) { 

      //int arr[] = {30,24,22,55,32,54};
	  int arr[] = {2,4,10,15,22,34};
      int n = arr.length; 

 
      System.out.println(isSorted(arr, n));
      
      
  }
  public static boolean isSorted(int arr[], int n) { 
	  if (n == 0 || n == 1) {
          return true; 
      }
      for (int i = 1; i < n; i++) { 
          if (arr[i - 1] > arr[i]) {
              return false; 
          }
      }
      return true; 
  } 
}

