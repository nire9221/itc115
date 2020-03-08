
public class UsePoint {

	public static void main(String[] args) {
		
	//	Point.hiPoint(); // static class call itself (Point) instead of instance name
		
		// create an array of Points
		
		Point2 [] points = new Point2[2];
		
		points[0] = new Point2(2,4);
		points[1] = new Point2(4,5);
		
		for (Point2 p2 : points) {  // p2 : place hold variable (i)
			System.out.println(p2.toString());
		}
		
		
//		//create an instance of a Point object
//		Point2 p1 = new Point2 (2,3);
//		Point2 p2 = new Point2 (3,4);
//		
//		
//		p1.setX(5);  //using setter method to change the value 
//		p2.setX(6);
//		
//		System.out.println(p1.getX()+" " + p1.getY());
//		System.out.println(p1.equals(p2));
//		
//		//double d = p.distanceFromOrigin();
//		//System.out.println("distance: " + d);
//		
//		//p.translate(4, 5);
//		
//		System.out.println(p1.toString());
//		System.out.println(p2.toString());
	}

}
