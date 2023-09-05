package Assignment3;
import java.util.*;
public class Watermelon {
  public static void weight(int n) {
	  if(n==2 || n==1) {
		  System.out.println("NO");
	  }
	  
	  else if(n%2==0 && n>2) {
		 System.out.println("YES");
	  }
	  else {
		  System.out.println("NO");
	  }
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       weight(n);
	}

}

