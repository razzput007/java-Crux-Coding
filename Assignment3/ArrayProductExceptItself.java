package Assignment3;
import java.util.*;
public class ArrayProductExceptItself {
	public static int[] productArray(int arr[]) {
		int n=arr.length;
		int left[]=new int[n];
		   left[0]=1;
		for(int i=1;i<n;i++) {
			left[i]=left[i-1]*arr[i-1];
		}
		int right[]=new int[n];
		right[n-1]=1;
		for(int i=n-2;i>=0;i--) {
			right[i]=right[i+1]*arr[i+1];
		}
		for(int i=0;i<n;i++) {
			arr[i]=right[i]*left[i];
		}
		return arr;
	}
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		productArray(arr);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
