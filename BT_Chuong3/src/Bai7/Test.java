package Bai7;

public class Test {
	public static void main(String[] args) {
		ResizableCircle c = new ResizableCircle(5.0);
		System.out.print("Ban kinh ban dau : " + c.radius);
		System.out.print(" " + c.getPerimeter());
		System.out.print(" " + c.getArea());
		c.resize(50);
		System.out.print("\nBan kinh sau thay doi : " + c.radius);
		System.out.print(" " + c.getPerimeter());
		System.out.print(" " + c.getArea());
	}
}
