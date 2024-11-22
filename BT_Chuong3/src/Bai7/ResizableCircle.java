package Bai7;

public class ResizableCircle extends Circle{
	public ResizableCircle() {
		super();
	}
	public ResizableCircle(double radius) {
		super(radius);
	}

	public void resize(int percent) {
		radius *= (1 + percent / 100.0);
	}
}

