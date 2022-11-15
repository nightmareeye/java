package pz03;

public class Circle implements IDrawable {

	public Dot point;
	public double rad;
	
	public String draw() {
		return "Circle";
	}
	
	public Circle() {
		point = new Dot(0,0);
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
	
	public static Boolean equals(Circle c1, Circle c2){
		return (c1.point.x==c2.point.x)&&(c1.point.y==c2.point.y)&&(c1.rad==c2.rad);
	}
	
	public Boolean contains(Dot exmp) {
		return (Math.pow((Math.pow((exmp.x-point.x),2)+Math.pow((exmp.y-point.y),2)),0.5)<=rad);
			
		
	}
}
