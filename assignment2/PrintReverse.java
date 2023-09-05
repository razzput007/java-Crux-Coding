package assignment2;
import java.util.*;
public class PrintReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
     
      while(n!=0) {
    	  int rev=0;
    	  int rem=n%10;
    	   rev=rev*10+rem;
    	   System.out.print(rev);
    	   n=n/10;
      }
	}

}
