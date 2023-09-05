package Assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class MaxValue {
	public static void maximum(int arr[],int n) {
		n=arr.length;
		int max=arr[0];
		for(int i=0;i<n;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println(max);
		
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
	      maximum(arr,n);
	}

}
