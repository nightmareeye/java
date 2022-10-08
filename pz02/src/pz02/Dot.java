package pz02;

public class Dot {
	public int x, y;
	
	public Dot() {
		x=0;
		y=0;
	}
	public Dot(int xx, int yy) {
		x=xx;
		y=yy;
	}
	
	public String toString() { 
		return "dot with coords: ("+x+","+y+")";
	}
	
	public boolean equals(Dot a, Dot b) {
		if((a.x==b.x)&&(a.y==b.y)) return true;
		else return false;
	}
}
