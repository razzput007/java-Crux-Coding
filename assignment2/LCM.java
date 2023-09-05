package assignment2;
import java.util.*;

public class LCM {
	public static int  gcd(int a,int b) {
		while(a!=b) {
			if(a>b) {
				a=a-b;
			}
			else {
				b=b-a;
			}
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int lcm=a*b/gcd(a,b);
		System.out.println(lcm);

	}

}
