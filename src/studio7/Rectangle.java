package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
	private double width, length;
	public Rectangle(double initWidth, double initLength){
		this.width = initWidth;
		this.length = initLength;
	}
	
	public double getWidth() {
		return this.width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getLength() {
		return this.length;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	public double getPerimeter() {
		return 2*this.width + 2*this.length;
	}
	
	public double getArea() {
		return this.width * this.length;
	}
	
	public boolean isSmaller(Rectangle thing) {
		if (this.getArea() < thing.getArea()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isSquare() {
		if(this.width==this.length) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void draw(double x, double y) {
		StdDraw.rectangle(x, y, this.width/2.0, this.length/2.0);
	}
	public String toString() {
		return "length: " + this.length + " width: " + this.width;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle thing1 = new Rectangle(.1, .2);
		Rectangle thing2 = new Rectangle(3, 4);
		System.out.println(thing1);
		
		thing1.draw(.5, 0.5);
	}

}
