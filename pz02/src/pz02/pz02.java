package pz02;

public class pz02 {
	public static void main(String[] args) {
		Dot[] dotArray = {new Dot(1,2), new Dot(1.4, 2.1), new Dot(-2.1, -2)};
		Circle[] CircleArr = {new Circle(new Dot(2,0), 1),
							  new Circle(new Dot(1.6,2), 2),
							  new Circle(new Dot(-1.2,-2), 2.5)};
		IDrawable[] risunki = {CircleArr[0], CircleArr[1], CircleArr[2],
				dotArray[0],dotArray[1],dotArray[2]};
		
		for(Dot i: dotArray)
			System.out.println(i.toString());
		for(Circle i: CircleArr)
			System.out.println(i.toString());
		for(IDrawable i: risunki)
			System.out.println(i.draw());
	
	}

}
