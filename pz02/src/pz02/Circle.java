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
	
	public double square(){
		return 3.14*3.14*rad;
	}
	
	public String toString() {
		 return "Circle with center ("+point.x+","+point.y+") with radius "+rad;
	}
	
	public Boolean equals(Circle c1, Circle c2){
		if ((c1.point.x==c2.point.x)&&(c1.point.y==c2.point.y)&&(c1.rad==c2.rad)) return true;
		else return false;
	}
}
