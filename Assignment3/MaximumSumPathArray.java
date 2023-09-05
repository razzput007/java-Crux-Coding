package Assignment3;
import java.util.*;
public class MaximumSumPathArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     int t=sc.nextInt();
     int n=sc.nextInt();
     int m=sc.nextInt();
     int arr[]=new int[n];
     int brr[]=new int [m];
     for(int i=0;i<arr.length;i++) {
    	 arr[i]=sc.nextInt();
    	
     }
     for(int i=0;i<brr.length;i++) {
    	 brr[i]=sc.nextInt();
     }
     while(t-->0) {
    	 int i=0,j=0;
    	 long s1=0,s2=0;
    	 long res=0;
    	 while(i<n && j<m) {
    		 if(arr[i]<brr[j]) {
    			 s1+=arr[i];
    			 i++;
    		 }
    		 else if(arr[i]>brr[j]) {
    			 s2+=brr[j];
    			 j++;
    		 }
    		 else {
    			 res+=Math.max(s1, s2)+arr[i];
    			 i++;
    			 j++;
    			 s1=0;
    			 s2=0;
    		 }
    	 }
    	 while(i<n) {
    		 s1+=arr[i];
    		 i++;
    	 }
    	 while(j<m) {
    		 s2+=brr[j];
    		 j++;
    	 }
    	 System.out.println((int)(Math.max(s1, s2)+res));
     }
	}

}
