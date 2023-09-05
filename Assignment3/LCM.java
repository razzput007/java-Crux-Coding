package Assignment3;
import java.util.*;
public class LCM {
	public static int gcd(int a,int b) {
		return b==0?a:gcd(b,a%b);
	}
	public static int lcm(int arr[],int ind) {
		if(ind==arr.length-1) {
			return arr[ind];
		}
		int a=arr[ind];
		int b=lcm(arr,ind+1);
		return (a*b/gcd(a,b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int arr[]={12,15,9,10,6,3};
      
      System.out.println(lcm(arr,0));
	}

}
