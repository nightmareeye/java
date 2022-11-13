package pz1;

public class pz01 {
	
	public static String pyram() {
		String out = "";
		out += "Pyramidka:" +"\n";
		for(int i=0; i<5; i++) {
			for(int k=0; k<9-2*i;k++) {
				out+=" ";
			}
			for(int j = 0; j<1+i*2;j++) {
				out+=j+1 +" ";
			}
			out+="\n";
		}
		return out;
	}
	
	public static int[] change() {
		System.out.println("Changing places:");
		int[] a = new int[25];
		for(int i=0; i<25;i++) {
			a[i]=i+1;
			System.out.print(a[i] + " ");
		}
		int temp = a[0];
		a[0]=a[24];
		a[24]=temp;
		System.out.print("\n");
		for(int i=0; i<25;i++) {
		
			System.out.print(a[i] + " ");
		}
		System.out.print("\n");
		return a;
	}
	
	public static int mid(int num) {
		int[] a= new int[num];
		for(int i=0; i<num;i++) {
			a[i]=i+1;
			System.out.print(a[i] + " ");
		}
		System.out.print("\n");
		int mid=0;
		for(int i=0; i<num;i++) {
			mid += a[i];
		}
		System.out.println("Mid of array: " + mid/num);
		return mid/num;
	}
	
	public static int[][] table() {
		int[][] a = new int[3][5];
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<5; j++) {
				a[i][j]=(int)(10*Math.random()%(10));
			}
		}
		
		return a;
	}
	
	public static double scalar() {
		double[] a,b;
		a=new double[]{10e20, 1223, 10e18, 10e15, 3, 10e-12};
		b=new double[]{10e20, 2, 10e-22, 10e13, 2111, 10e16};
		int k;
		double s=0;
		for(k=0;k<6;k++){
			s+=a[k]*b[k];
		}
		System.out.println("a.b="+s);
		return s;
	}
	
	public static boolean del(int num) {
		System.out.println("What if "+num+" divides by 4? ");
		boolean x;
		int num1 = num;
		while(num1>0) {
			num1 = num1 -4;
		}
		if (num1==0) {
			x=true;
			System.out.println(num+" divides by 4");
		}
		else {
			x=false;
			System.out.println(num+" doesn't divide by 4");
		}
		return x;
	}
	
	public static double[] sys(double a, double b, double c,double d,double e,double f) {
		double x = ((e*c - f*b)/(b*d - e*a));
		double y = -((f+d*x)/e);
		System.out.println("The problem: ");
		System.out.println(a+"*x + " +b+"*y + "+ c+" = 0");
		System.out.println(d+"*x + " +e+"*y + "+ f+" = 0");
		System.out.println("Solutinon: ");
		System.out.println("x = "+x + " y = "+y);
		double[] out= {x,y};
		return out;
	}
	
	public static void main(String[] args) {
		String pyramida = pyram();
		System.out.println(pyramida);
		System.out.println("------------------");
		change();
		System.out.println("------------------");
		mid(20);
		System.out.println("------------------");
		int[][] p = table();
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<5; j++) {
				System.out.print(p[i][j] + "  ");
			}
			System.out.print("\n");
		}
		System.out.println("------------------");
		scalar();
		System.out.println("------------------");
		sys(2,4,6,1,3,7);		
		System.out.println("------------------");
		del(7);
	}
}
