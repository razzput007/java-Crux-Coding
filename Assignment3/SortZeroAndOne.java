package Assignment3;

import java.util.Scanner;

public class SortZeroAndOne {
	public static void sort(int arr[],int n) {
		n=arr.length;
		int count=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==0) {
				count ++;
			}
		}
		for(int i=0;i<count;i++) {
			arr[i]=0;
		}
		for(int i=count;i<n;i++) {
			arr[i]=1;
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
	      sort(arr,n);
	      for(int i=0;i<n;i++) {
	    	  System.out.print(arr[i]+" ");
	      }

	}

}
