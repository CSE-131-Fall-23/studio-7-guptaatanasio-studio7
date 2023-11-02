package studio7;

public class Rectangle {

	//Instance variables
	private double length;
	private double width;
	
	public Rectangle(double length, double width){
		this.length = length;
		this.width = width;
	}
	
	public double area() {
		return length * width;
	}
	
	public double perimeter() {
		return 2*length + 2 * width;
	}
	
	public boolean isBigger(Rectangle r1) {
		return r1.area() < this.area();
	}
	
	public boolean isSquare() {
		return length == width;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}

}

