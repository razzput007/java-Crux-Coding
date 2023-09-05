package Assignment3;
import java.util.*;
public class ArraySumPair {
	public static void PairSum(int arr[],int n,int m) {
		n=arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				int sum=arr[i]+arr[j];
				if(sum==m) {
					System.out.println(arr[i]+" and "+arr[j]);
				}
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	      int n=sc.nextInt();
	      int arr[]=new int [n];
	      for(int i=0;i<arr.length;i++) {
	    	  arr[i]=sc.nextInt();
	      }
	      Arrays.sort(arr);
	      int m=sc.nextInt();
	      PairSum(arr,n,m);
	      
	}

}
