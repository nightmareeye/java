package pz03;

import java.util.ArrayList;

public class datalist {
	public ArrayList<Dot> Dotlist = new ArrayList<Dot>();
	public ArrayList<Circle> Circlelist = new ArrayList<Circle>();
	
	public void addToList(Dot tochka) {
		Dotlist.add(tochka);
	}
	
	public void addToList(Circle krug) {
		Circlelist.add(krug);
	}
	
	public void printDots() {
		for(Dot i : Dotlist) {
			System.out.println(i.toString());
		}
	}
	
	public void printCircles() {
		for(Circle i : Circlelist) {
			System.out.println(i.toString());
		}
	}
	
	public void rmFromDotList(int index) {
		Dotlist.remove(index);
	}
	
	public void rmFromCircleList(int index) {
		Circlelist.remove(index);
	}
	
	public void printInsideDots() {
		for(Dot j : Dotlist) {
			for(Circle i : Circlelist) {
				if (i.contains(j)==true)
					System.out.println(j.toString());
			}
		}
	}
}
