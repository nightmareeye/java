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
	public static void main(String[] args) {
		pyram();
		change();
		System.out.print(mid());
	}
}
