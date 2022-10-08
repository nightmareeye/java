package pz02;

public class Circle {

	public Dot point;
	public int rad;
	
	public Circle() {
		point.x=0;
		point.y=0;
		rad=0;
	}
	public Circle(Dot center, int radius) {
		point.x=center.x;
		point.y=center.y;
		rad = radius;
	}
}
