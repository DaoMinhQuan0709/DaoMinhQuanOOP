package Bai7;

public class Circle {
	protected double radius = 1.0;
	
	public Circle() {}
	public Circle(double radius) {
		this.radius = radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}

	public double getPerimeter() {
		return radius * 2 * Math.PI;
	}

	public double getArea() {
		return Math.PI * radius * radius;
	}
}
