package test;

public class FibonacciExample{
	public static void main(String[] args) {
	

	 int x=0;
	 int y=1;
	 int i=0;
	 while (i<10) {
		int z= x+y;
	 System.out.print(z+" , ");
	 x=y;
	 y=z;
	 i++;
	 
	 }
	 }
	 
}
