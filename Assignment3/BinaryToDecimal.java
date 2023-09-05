package Assignment3;
import java.util.*;
public class BinaryToDecimal {
	public static int binarytodecimal(int n) {
		int i=0;
		int res=0;
		while(n!=0) {
			int rem=n%10;
			if(rem==1 || rem==0) {
				 res=res+rem*(int)Math.pow(2.0, i);
			}
			i++;
			n=n/10;
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t-->0) {
    	  int n=sc.nextInt();
    	  System.out.println(binarytodecimal(n));
      }
	}

}
