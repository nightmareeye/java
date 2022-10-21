package pz02;

public class pz02 {
	public static void main(String[] args) {
		Dot[] dotArray = {new Dot(1,2), new Dot(1.4, 2.1), new Dot(-2.1, -2)};
		for(int i=0; i<3; i++)
			System.out.println(dotArray[i].toString());
		Circle[] CircleArr = {new Circle(new Dot(2,0), 1),
							  new Circle(new Dot(1.6,2), 2),
							  new Circle(new Dot(-1.2,-2), 2.5)};
		for(int i=0; i<3; i++)
			System.out.println(CircleArr[i].toString());
	}

}
