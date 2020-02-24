
public class Midterm2 {

	public static void main(String[] args) {
		
	      
	            System.out.println(isPowerOfTwo(4)); 
	            System.out.println(isPowerOfTwo(64)); 
	            System.out.println(isPowerOfTwo(55)); 
	            System.out.println(isPowerOfTwo(34)); 
	            System.out.println(isPowerOfTwo(48)); 

	}
	
	public static boolean isPowerOfTwo(int n)  { 
        if (n == 0 || n < 0) {
            return false;
        }
          
        while (n != 1) { 
            if (n % 2 != 0) {
                return false;
                } 
            	n = n / 2; 
        } 
        return true; 
	}

}
