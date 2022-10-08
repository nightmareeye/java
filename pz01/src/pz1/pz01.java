package pz1;

public class pz01 {
	
	public static void pyram() {
		System.out.println("Pyramidka:");
		for(int i=0; i<5; i++) {
			for(int k=0; k<9-2*i;k++) {
				System.out.print(" ");
			}
			for(int j = 0; j<1+i*2;j++) {
				System.out.print(j+1 +" ");
			}
			System.out.print("\n");
		}
		System.out.println("------------------");
	}
	
	public static void change() {
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
		System.out.println("------------------");
	}
	
	public static int mid() {
		int[] a= new int[20];
		for(int i=0; i<20;i++) {
			a[i]=i+1;
			System.out.print(a[i] + " ");
		}
		System.out.print("\n");
		int mid=0;
		for(int i=0; i<20;i++) {
			mid += a[i];
		}
		System.out.println("Mid of array: " + mid/20);
		System.out.println("------------------");
		return mid/20;
	}
	
	public static void table() {
		System.out.println("Random table: ");
		int[][] a = new int[3][5];
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<5; j++) {
				a[i][j]=(int)(10*Math.random()%(10));
			}
		}
		
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<5; j++) {
				System.out.print(a[i][j] + "  ");
			}
			System.out.print("\n");
		}
		System.out.println("------------------");
	}
	
	public static void scalar() {
		double[] a,b;
		a=new double[]{10e20, 1223, 10e18, 10e15, 3, 10e-12};
		b=new double[]{10e20, 2, 10e-22, 10e13, 2111, 10e16};
		int k;
		double s=0;
		for(k=0;k<6;k++){
			s+=a[k]*b[k];
		}
		System.out.println("a.b="+s);
		System.out.println("------------------");
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
		System.out.println("------------------");
		return x;
	}
	
	public static void sys(double a, double b, double c,double d,double e,double f) {
		double x = (e/f - c/b)/(a/b - d/f);
		double y = -a/b*x - c/b;
		System.out.println("The problem: ");
		System.out.println(a+"*x + " +b+"*y + "+ c+" = 0");
		System.out.println(d+"*x + " +e+"*y + "+ f+" = 0");
		System.out.println("Solutinon: ");
		System.out.println("x = "+x + " y = "+y);
		System.out.println("------------------");
	}
	
	public static void main(String[] args) {
		pyram();
		change();
		mid();
		table();
		scalar();
		sys(2,4,6,1,3,7);
		del(7);
	}
}
