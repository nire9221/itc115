
public class Point2 {
	// field 
	private int x; // protected int x; 
	private int y;
	
	
	// constructors 
	public Point2() {
		this(0,0);
	}
	
	public Point2(int x, int y) {
		if(x<0 || y<0) {
			throw new IllegalArgumentException();
		}
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}
	
	

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	// return whether a point refers to a point with the same x and y coordinates 
	public boolean equals(Object o) {
		if (o instanceof Point2) {
			Point2 other =(Point2) o;
			return x == other.x && y == other.y;
		} else {
			return false;
		}
	}
	
	// return a String representation of the point
	public String toString() {
		return "(" + x + "," + y + ")";
	}
}
