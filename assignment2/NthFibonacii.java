package assignment2;
import java.util.*;
public class NthFibonacii {
	public static int fibonacii(int n) {
		int a=0;
		int b=1;
		int sum;
		int i=2;
		if(n==0) {
			return a;
		}
		while(i<=n) {
			sum=a+b;
	 		a=b;
			b=sum;
			i++;
		}
		return b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=fibonacii(n);
       System.out.println(c);
	}

}
