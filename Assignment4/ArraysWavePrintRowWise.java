package Assignment4;
import java.util.*;
public class ArraysWavePrintRowWise {
 public static void waveprint(int arr[][]) {
	 int n=arr.length;
	 int m=arr[0].length;
	for(int i=0;i<n;i++) {
		if(i%2==0) {
			for(int j=0;j<m;j++) {
				System.out.print(arr[i][j]+",");
			}
		}
		else {
			for(int j=m-1;j>=0;j--) {
				System.out.print(arr[i][j]+",");
			}
		}
	}
	System.out.print("End");
	
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int row=sc.nextInt();
      int col=sc.nextInt();
      int arr[][]=new int[row][col];
      for(int i=0;i<arr.length;i++) {
    	  for(int j=0;j<arr[0].length;j++) {
    		  arr[i][j]=sc.nextInt();
    	  }
    	  System.out.println();
      }
      waveprint(arr);
      
	}

}
