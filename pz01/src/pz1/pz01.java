package pz1;

public class pz01 {
	
	public static void pyram() {
		for(int i=0; i<5; i++) {
			for(int k=0; k<9-2*i;k++) {
				System.out.print(" ");
			}
			for(int j = 0; j<1+i*2;j++) {
				System.out.print(j+1 +" ");
			}
			System.out.print("\n");
		}
	}
	
	public static void change() {
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
		return mid/20;
	}
	
	public static void table() {
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
		
	}
	
	public static void scalar() {
		double[] a,b;
		a=new double[]{10e20, 1223, 10e18, 10e15, 3, -10e12};
		b=new double[]{10e20, 2, -10e22, 10e13, 2111, 10e16};
		int k;
		double s=0;
		for(k=0;k<6;k++){
			s+=a[k]*b[k];
		}
			System.out.println("a.b="+s);
	}
	
	public static void sys(double a, double b, double c,double d,double e,double f) {
		double x = (e/f - c/b)/(a/b - d/f);
		double y = -a/b*x - c/b;
		System.out.print("x = "+x + " y = "+y);
	}
	
	public static void main(String[] args) {
		pyram();
		change();
		System.out.println(mid());
		table();
		scalar();
		sys(2,4,6,1,3,7);
	}
}
