package Assignment3;
import java.util.*;
public class Nobita {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      int count1=0;
      while(t-->0) {
    	  int t1=sc.nextInt();
    	  int t2=sc.nextInt();
    	  int t3=sc.nextInt();
    	  int count=0;
    	  if(t1>0) {
    		  count++;
    	  }
    	  if(t2>0) {
    		  count++;
    	  }
    	  if(t3>0) {
    		  count++;
    	  }
    	  if(count>=2) {
    		  count1 ++;
    	  }
    	
    	  
      }
      System.out.println(count1);
     
	}

}
