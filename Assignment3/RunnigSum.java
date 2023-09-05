package Assignment3;
import java.util.*;
public class RunnigSum {
	public static void runningsum(int arr[]) {
		int n=arr.length;
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=arr[i];
			System.out.print(sum+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++) {
    	  arr[i]=sc.nextInt();
      }
         runningsum(arr);
      
	}

}
