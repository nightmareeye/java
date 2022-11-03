package pz02;

public class Circle implements IDrawable {

	public Dot point;
	public double rad;
	
	public String draw() {
		return "Circle";
	}
	
	public Circle() {
		point.x=0;
		point.y=0;
		rad=0;
	}
	
	public Circle(Dot center, double radius) {
		point = center;
		rad = radius;
	}
	
	public double square(){
		return 3.14*rad*rad;
	}
	
	public String toString() {
		 return "Circle at ("+point.x+","+point.y+") with radius "+rad;
	}
	
	public Boolean equals(Circle c1, Circle c2){
		return (c1.point.x==c2.point.x)&&(c1.point.y==c2.point.y)&&(c1.rad==c2.rad);
	}
}
