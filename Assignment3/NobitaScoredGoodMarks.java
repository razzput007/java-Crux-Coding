package Assignment3;
import java.util.*;
public class NobitaScoredGoodMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     int t=sc.nextInt();
     while(t-->0) {
    	 int m=sc.nextInt();
    	 int n=sc.nextInt();
    	 int rem=m%n;
    	 System.out.println(Math.min(rem,n-rem));
     }
	}

}
