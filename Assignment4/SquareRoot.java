package Assignment4;
import java.util.*;
public class SquareRoot {

	public static int squareroot(int a) {
		int x=0;
		int low=0;
		int high=a;
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(mid*mid<=a) {
				x=mid;
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		return x;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int ans=squareroot(a);
		System.out.println(ans);

	}

}
