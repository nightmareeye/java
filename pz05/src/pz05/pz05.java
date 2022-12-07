package pz05;

import java.io.IOException;

public class pz05 {
	public static void main(String[] args) throws IOException {
		Dotlist first = new Dotlist();
		Dotlist second = new Dotlist(1,30);
		System.out.println(first.getHash());
		System.out.println(second.getHash());
		System.out.println(first.Dotlist.size());
		System.out.println(second.Dotlist.size());
		for(int i=0; i<first.Dotlist.size();i++) {
			System.out.println(first.Dotlist.get(i).toString());
		}
		for(int i=0; i<second.Dotlist.size();i++) {
			System.out.println(second.Dotlist.get(i).toString());
		}
	}
}
