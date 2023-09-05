package assignment2;
import java.util.*;
public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
        int b=sc.nextInt();
        if(a==0) {
        	System.out.println(b);
        }
        if(b==0) {
        	System.out.println(a);
        }
        while(a!=b) {
        	if(a>b) {
        		a=a-b;
        	}
        	else {
        		b=b-a;
        	}
        }
        System.out.println(b);
	}

}
