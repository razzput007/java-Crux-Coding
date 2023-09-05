package Assignment3;
import java.util.*;
public class MaximumSumSubarray {
	public static int maxsum(int arr[]) {
		int n=arr.length;
		int res=arr[0];
		int maxsum=arr[0];
		for(int i=1;i<n;i++) {
			maxsum=Math.max(maxsum+arr[i], arr[i]);
			res=Math.max(res,maxsum);
		}
		return res;
	}
	public static int maxCircularSum(int arr[]) {
		int n=arr.length;
		int result=maxsum(arr);
		if(result<0) {
			return result;
		}
		int arrsum=0;
		for(int i=0;i<n;i++) {
			arrsum+=arr[i];
			arr[i]=-arr[i];
		}
		int maxcircular=arrsum+result;
		int results=Math.max(maxcircular,result);
		return results;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(maxCircularSum(arr));
		}
	}

}
