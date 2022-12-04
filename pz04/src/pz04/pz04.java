package pz04;

import java.io.*;
import java.util.Scanner;

public class pz04 {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Datalist list;
	       
	    ObjectInputStream objectInputStream = new ObjectInputStream(
	         new FileInputStream("datalist.out"));
	    list = (Datalist) objectInputStream.readObject();
	        objectInputStream.close();
		
		while(true) {
			
			System.out.println("Выберите опцию:");
			System.out.println("1. Добавить точку");
			System.out.println("2. Добавить окружность");
			System.out.println("3. Вывести все точки на экран");
			System.out.println("4. Вывести все окружности на экран");
			System.out.println("5. Вывести все точки в файл");
			System.out.println("6. Вывести все окружности в файл");
			System.out.println("7. Удалить точку из списка");
			System.out.println("8. Удалить окружность из списка");
			System.out.println("9. Вывод точек, находящихся внутри окружности");
			System.out.println("0. Выйти");
			
			String s;
			Scanner scan = new Scanner(System.in);
			s = scan.next();
			int i;
			i=Integer.parseInt(s);
			if (i<0 || i>9) {
				System.out.println("Неправильная опция!");
				continue;
			}
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
				switch(j) {
				case 1:
					System.out.print(list.toStringDots());
					break;
				case 2:
					list.printIncDots();
					break;
				case 3:
					list.printDecDots();
					break;
				}
				break;
			case 4:
				System.out.println("Выберите опцию:");
				System.out.println("1. Стандартный вид");
				System.out.println("2. По возрастанию");
				System.out.println("3. По убыванию");
				int jj;
				s = scan.next();
				jj = Integer.parseInt(s);
				switch(jj) {
				case 1:
					System.out.print(list.toStringCircles());
					break;
				case 2:
					list.printIncCircle();
					break;
				case 3:
					list.printDecCircle();
					break;
				}
				break;
			case 5:
				System.out.println("Выберите опцию:");
				System.out.println("1. Стандартный вид");
				System.out.println("2. По возрастанию");
				System.out.println("3. По убыванию");
				int jo;
				s = scan.next();
				jo = Integer.parseInt(s);
				switch(jo) {
				case 1:
					System.out.println("Введите имя файла:");
					s = scan.next();	
					File inputFile = new File(s);
					if(inputFile.createNewFile()) {
						
					}
					else {
						System.out.println("Файл уже существует! Выберите опцию:");
						System.out.println("1. Записать в конец файла");
						System.out.println("2. Перезаписать файл");
						System.out.println("3. Вернуться назад");
						int jofile;
						s = scan.next();
						jofile = Integer.parseInt(s);
						if (i<1 || i>3) {
							System.out.println("Неправильная опция!");
							continue;
						}
						switch(jofile) {
						case 1:
							break;
						case 2:
							break;
						case 3:
							break;
						}

					}
					
					
					System.out.print(list.toStringDots());
					break;
				case 2:
					list.printIncDots();
					break;
				case 3:
					list.printDecDots();
					break;
				}
				break;
			case 6:
				System.out.println("Выберите опцию:");
				System.out.println("1. Стандартный вид");
				System.out.println("2. По возрастанию");
				System.out.println("3. По убыванию");
				int jjo;
				s = scan.next();
				jjo = Integer.parseInt(s);
				switch(jjo) {
				case 1:
					System.out.print(list.toStringCircles());
					break;
				case 2: 
					list.printIncCircle();
					break;
				case 3:
					list.printDecCircle();
					break;
				}
				break;
			case 7:
				int dotInd;
				System.out.println("Введите индекс точки для удаления");
				s = scan.next();
				dotInd = Integer.parseInt(s);
				if(dotInd < list.Dotlist.size())
					list.rmFromDotList(dotInd);
				else
					System.out.println("Точка с таким индексом не существует!");
				break;
			case 8:
				int circleInd;
				System.out.println("Введите индекс окружности для удаления");
				s = scan.next();
				circleInd = Integer.parseInt(s);
				if(circleInd < list.Circlelist.size())
					list.rmFromCircleList(circleInd);
				else
					System.out.println("Окружность с таким индексом не существует!");
				break;
			case 9:
				list.printInsideDots();
				break;
			case 0:
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(
		                new FileOutputStream("datalist.out"));
		        objectOutputStream.writeObject(list);
		        objectOutputStream.close();
				System.exit(0);
			}
				
		}
	}
}
