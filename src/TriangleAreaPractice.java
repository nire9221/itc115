
//BJP5 Exercise 3.16: triangleArea

public class TriangleAreaPractice {

	public static void main (String[] args) {
	
			triangleArea(8, 5.2, 7.1);
		
		
	}
	public static double triangleArea(double a, double b, double c) {
		
		double s = (a+b+c)/2.0;
		return Math.sqrt((s *(s-a)*(s-b)*(s-c)));
	}
	
}

