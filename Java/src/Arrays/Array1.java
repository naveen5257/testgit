package Arrays;

public class Array1 {
public static void main(String[] args) {
	int[] a;  // array declaration
	//for(int i=1;i<=10;i++) {
	int [] b=new int[10];
	System.out.println(b.getClass().getName());
	//}
	//int[] i=new int[-5]; 
	// negative Array size exception exception we are getting only at the run time.
	int[] c=new int['a'];
	System.out.println(c);
	//int[] d=new int[2147483648];// this is out of range
	int[] d=new int[2147483647];
	System.out.println(d);
}
}
