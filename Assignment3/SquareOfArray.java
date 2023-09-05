package Assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class SquareOfArray {
	public static void square(int arr[], int n) {
		n=arr.length;
		for(int i=0;i<n;i++) {
		   arr[i]=arr[i]*arr[i];
			
		}
		Arrays.sort(arr);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	      int n=sc.nextInt();
	      int arr[]=new int [n];
	      for(int i=0;i<arr.length;i++) {
	    	  arr[i]=sc.nextInt();
	      }
	     square(arr,n);
	     for(int i=0;i<n;i++) {
	    	 System.out.println(arr[i]);
	     }
	    
	     
	}

}
