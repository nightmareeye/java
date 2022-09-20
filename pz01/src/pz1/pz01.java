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
		return mid;
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
		double[] a,b,c;
		a=new double[]{10e20, 1223, 10e18, 10e15, 3, -10e12};
		b=new double[]{10e20, 2, -10e22, 10e13, 2111, 10e16};
		//c=new double[3];
		// Индексная переменная:
		int k;
		// Переменная для записи скалярного произведения:
		double s=0;
		//System.out.print("Произведение векторов:\n[a.b]=<");
		// Вычисление и вывод на экран результата:
		for(k=0;k<6;k++){
			s+=a[k]*b[k];
			//c[k]=a[(k+1)%3]*b[(k+2)%3]-a[(k+2)%3]*b[(k+1)%3];
			//System.out.print(c[k]+(k!=2?";":">\n"));
		}
			System.out.println("a.b="+s);
	}
	
	public static void main(String[] args) {
		pyram();
		change();
		System.out.println(mid());
		table();
		scalar();
		System.out.print(10e10);
	}
}
