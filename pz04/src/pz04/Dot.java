package pz04;

import java.io.Serializable;

interface IDrawable{
	String draw();
}

public class Dot implements IDrawable, Serializable {
	public double x, y;
	
	public String draw() {
		return "Point";
	}
	
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
	
	public static boolean equals(Dot a, Dot b) {
		return (a.x==b.x)&&(a.y==b.y);
	}
}
