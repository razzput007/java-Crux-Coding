package assignment2;
import java.util.*;

public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  	
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int item=sc.nextInt();
      int count=0;
      while(n!=0) {
    	  int rem=n%10;
    	  if(rem==item) {
    		  count++;
    	  }
    	  
    	  n=n/10;
    	 
      }
      System.out.print(count);
    
	}

}
