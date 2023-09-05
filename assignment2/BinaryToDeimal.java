package assignment2;
import java.util.*;
public class BinaryToDeimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     double sum=0;
     double count=0;
     while(n!=0) {
    	 int rem=n%10;
    	 double a=Math.pow(2, count);
    	 sum=sum+rem*a;
    	
    	 count++;
    	 n=n/10;
     }
     System.out.print((int)sum);
	}

}
