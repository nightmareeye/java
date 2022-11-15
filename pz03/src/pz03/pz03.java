package pz03;

import java.io.*;
import java.util.Collections;
import java.util.Scanner;

public class pz03 {
	
	public static void main(String[] args) throws IOException {
		Datalist list = new Datalist();
		while(true) {
			
			System.out.println("Выберите опцию:");
			System.out.println("1. Добавить точку");
			System.out.println("2. Добавить окружность");
			System.out.println("3. Вывести все точки");
			System.out.println("4. Вывести все окружности");
			System.out.println("5. Удалить точку из списка");
			System.out.println("6. Удалить окружность из списка");
			System.out.println("7. Вывод точек, находящихся внутри окружности");
			System.out.println("8. Выйти");
			
			String s;
			//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			Scanner scan = new Scanner(System.in);
			s = scan.next();
			int i;
			i=Integer.parseInt(s);
			
			switch (i) {
			case 1:
				double x,y;
				System.out.println("Введите Х:");
				s = scan.next();
				x = Double.parseDouble(s);
				System.out.println("Введите У:");
				s = scan.next();
				y = Double.parseDouble(s);
				list.addToList(new Dot(x,y));
				System.out.println("Добавлена точка с координатами ("+x+","+y+")");
				break;
			case 2:
				int radius;
				double xx,yy;
				System.out.println("Введите Х:");
				s = scan.next();
				xx = Double.parseDouble(s);
				System.out.println("Введите У:");
				s = scan.next();
				yy = Double.parseDouble(s);
				System.out.println("Введите радиус:");
				s = scan.next();
				radius = Integer.parseInt(s);
				list.addToList(new Circle(new Dot(xx,yy),radius));
				System.out.println("Добавлена окружность с центром в ("+xx+","+yy+"), c радиусом "+ radius);
				break;			
			case 3:
				System.out.println("Выберите опцию:");
				System.out.println("1. Стандартный вид");
				System.out.println("2. По возрастанию");
				System.out.println("3. По убыванию");
				int j;
				s = scan.next();
				j = Integer.parseInt(s);
				switch(i) {
				case 1:
					list.printDots();
				case 2:
					
				}
				
				
				list.printDots();
				break;
			case 4:
				list.printCircles();
				break;
			case 5:
				int dotInd;
				System.out.println("Введите индекс точки для удаления");
				s = scan.next();
				dotInd = Integer.parseInt(s);
				list.rmFromDotList(dotInd);
				break;
			case 6:
				int circleInd;
				System.out.println("Введите индекс окружности для удаления");
				s = scan.next();
				circleInd = Integer.parseInt(s);
				list.rmFromCircleList(circleInd);
				break;
			case 7:
				list.printInsideDots();
				break;
			case 8:
				System.exit(0);
			}
				
		}
	}
}
