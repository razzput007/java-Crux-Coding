package Assignment4;

import java.util.Scanner;

public class Rotateimage {
	public static void reverse(int arr[][]) {
		int n=arr.length;
		int m=arr[0].length;
		for(int i=0;i<n;i++) {
			int start=0;
			int end=arr[0].length-1;
			while(start<=end) {
				int temp=arr[i][start];
				arr[i][start]=arr[start][end];
				arr[start][end]=temp;
				start++;
				end--;
			}
		}
	}
	public static void transpose(int arr[][]) {
		int n=arr.length;
		int m=arr[0].length;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<m;j++) {
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	      int m=sc.nextInt();
	      int n=sc.nextInt();
	      int arr[][]=new int [m][n];
	      for(int i=0;i<arr.length;i++) {
	    	  for(int j=0;j<arr[0].length;j++) {
	    		 arr[i][j]=sc.nextInt();
	    	  }
	      }
	      reverse(arr);
	      transpose(arr);
	}

}
