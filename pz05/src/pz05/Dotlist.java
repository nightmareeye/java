package pz05;

import java.util.ArrayList;

public class Dotlist {
	public ArrayList<Dot> Dotlist;
	int min=5;
	int max=20;
	
	public Dotlist() {
		Dotlist = new ArrayList<Dot>();
		int size = (int)(Math.random()*(max-min) + min);
		for(int i=0; i<size;i++)
			Dotlist.add(new Dot((int)(Math.random()*(10-(-10)) -10), (int)(Math.random()*(10-(-10)) -10)));
	}
	public Dotlist(int new_min, int new_max) {
		Dotlist = new ArrayList<Dot>();
		min = new_min;
		max = new_max;
		int size = (int)(Math.random()*(max-min) + min);
		for(int i=0; i<size;i++)
			Dotlist.add(new Dot((int)(Math.random()*(10-(-10)) -10), (int)(Math.random()*(10-(-10)) -10)));
	}
	public int getHash() {
		return this.hashCode();
	}
}
