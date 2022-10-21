package pz02;

public class Dot {
	public double x, y;
	
	public Dot() {
		x=0;
		y=0;
	}
	public Dot(double xx, double yy) {
		x=xx;
		y=yy;
	}
	
	public String toString() { 
		return "("+x+","+y+")";
	}
	
	public boolean equals(Dot a, Dot b) {
		return (a.x==b.x)&&(a.y==b.y);
	}
}
