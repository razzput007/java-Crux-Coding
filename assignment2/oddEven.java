package assignment2;
import java.util.*;
public class oddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
       
        while(t-->0) {
        	int n=sc.nextInt();
        	 int sum=0;
             int sum1=0;
        	while(n!=0) {
        	   int rem=n%10;
        	   if(rem%2!=0) {
        		  sum+=rem; 
        	   }
        	   else {
        		   sum1+=rem;
        	   }
        	   n=n/10;
        	 
        	}
        	if(sum%3==0) {
        		System.out.println("YES");
        		
        	}
        	else if( sum1%4==0) {
        		System.out.println("YES");
        	}
        	else {
        		System.out.println("NO");
        	}
      
	}

}
}
