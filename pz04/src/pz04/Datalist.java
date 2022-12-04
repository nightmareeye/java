package pz04;

import java.io.Serializable;
import java.util.ArrayList;

public class Datalist implements Serializable{
	
	private static final long serialVersionUID = 1L;
	public ArrayList<Dot> Dotlist;
	public ArrayList<Circle> Circlelist;
	
	public Datalist() {
		Dotlist = new ArrayList<Dot>();
		Circlelist  = new ArrayList<Circle>();
	}
	
	public void addToList(Dot tochka) {
		Dotlist.add(tochka);
	}
	
	public void addToList(Circle krug) {
		Circlelist.add(krug);
	}
	
	@Override
	public String toString() {
		return toStringDots() + "\n" + toStringCircles();
	}
	
	public String toStringDots() {
		String result = "";
		for(Dot i : Dotlist) {
			result+=i.toString()+"\n";
		}
		return result;
	}
	
	public String toStringCircles() {
		String result = "";
		for(Circle i : Circlelist) {
			result+=i.toString()+"\n";
		}
		return result;

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
	
	public void printIncDots() {
		for(Dot i : sortIncDot()) {
			System.out.println(i.toString());
		}
	}
	
	public ArrayList<Dot> sortIncDot(){
		Dot temp;
		ArrayList<Dot> out = new ArrayList<Dot>();
		for (int i=0; i< Dotlist.size(); i++) {
			for (int j=0; j< Dotlist.size(); j++) {
				if(Dotlist.get(j).x>Dotlist.get(i).x) {
					temp = Dotlist.get(i);
					Dotlist.set(i, Dotlist.get(j));
					Dotlist.set(j, temp);
				}
			}
		}
		for (int i=0; i< Dotlist.size(); i++) {
			out.add(Dotlist.get(i));
		}
		return out;
	}
	public void printDecDots() {
		for(Dot i : sortDecDot()) {
			System.out.println(i.toString());
		}
	}
	
	public ArrayList<Dot> sortDecDot(){
		Dot temp;
		ArrayList<Dot> out = new ArrayList<Dot>();
		for (int i=0; i< Dotlist.size(); i++) {
			for (int j=0; j< Dotlist.size(); j++) {
				if(Dotlist.get(j).x<Dotlist.get(i).x) {
					temp = Dotlist.get(i);
					Dotlist.set(i, Dotlist.get(j));
					Dotlist.set(j, temp);
				}
			}
		}
		for (int i=0; i< Dotlist.size(); i++) {
			out.add(Dotlist.get(i));
		}
		return out;
	}
	
	public void printIncCircle() {
		for(Circle i : sortIncCircle()) {
			System.out.println(i.toString());
		}
	}
	
	public ArrayList<Circle> sortIncCircle(){
		Circle temp;
		ArrayList<Circle> out = new ArrayList<Circle>();
		for (int i=0; i< Circlelist.size(); i++) {
			for (int j=0; j< Circlelist.size(); j++) {
				if(Circlelist.get(j).point.x>Circlelist.get(i).point.x) {
					temp = Circlelist.get(i);
					Circlelist.set(i, Circlelist.get(j));
					Circlelist.set(j, temp);
				}
			}
		}
		for (int i=0; i< Circlelist.size(); i++) {
			out.add(Circlelist.get(i));
		}
		return out;
	}
	public void printDecCircle() {
		for(Circle i : sortDecCircle()) {
			System.out.println(i.toString());
		}
	}
	
	public ArrayList<Circle> sortDecCircle(){
		Circle temp;
		ArrayList<Circle> out = new ArrayList<Circle>();
		for (int i=0; i< Circlelist.size(); i++) {
			for (int j=0; j< Circlelist.size(); j++) {
				if(Circlelist.get(j).point.x<Circlelist.get(i).point.x) {
					temp = Circlelist.get(i);
					Circlelist.set(i, Circlelist.get(j));
					Circlelist.set(j, temp);
				}
			}
		}
		for (int i=0; i< Circlelist.size(); i++) {
			out.add(Circlelist.get(i));
		}
		return out;
	}
}