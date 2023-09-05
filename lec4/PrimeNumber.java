package lec4;
import java.util.*;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int count=0;
      for(int i=2;i<n;i++) {
    	  if(n%i==0) {
    		  count++;
    		  break;
    	  }
      }
      if(count==1) {
    	  System.out.println("number is not prime");
      }
      else {
    	  System.out.println("number is prime");
      }
	}

}
