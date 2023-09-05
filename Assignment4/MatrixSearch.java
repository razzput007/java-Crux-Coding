package Assignment4;
import java.util.*;
public class MatrixSearch {
 public static int matrixsearch(int arr[][],int target) {
	 int n=0;
	 int m=arr[0].length-1;
	 while(n<arr.length && m>0) {
	 if(arr[n][m]==target) {
		 return 1;
	 }
	 else if(arr[n][m]<target){
		 n++;
	 }
	 else {
		 m--;
	 }
   }
	 return 0;
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
	      int target=sc.nextInt();
	      matrixsearch(arr,target);
	}

}
