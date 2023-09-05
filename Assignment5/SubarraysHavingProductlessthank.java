package Assignment5;
import java.util.*;
public class SubarraysHavingProductlessthank {

	public static int Subarray(int arr[],int k) {
		int i=0;
		int j=0;
		int p=1;
		int count=0;
		while(j<arr.length) {
			 p*=arr[j];
			 while(p>=k && i<=j) {
				 p/=arr[i];
				 i++;
			 }
			 count+=(j-i+1);
			j++;
			
		}
		
		return count;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int k=sc.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<n;i++) {
    	   arr[i]=sc.nextInt();
       }
       System.out.println(Subarray(arr,k));
	}

}
