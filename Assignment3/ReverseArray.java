package Assignment3;

import java.util.Scanner;

public class ReverseArray {
	public static void reverseArray(int arr[], int n) {
		n=arr.length;
		for(int i=n-1;i>=0;i--) {
			System.out.println(arr[i]);
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
	      reverseArray(arr,n);
	}

}
