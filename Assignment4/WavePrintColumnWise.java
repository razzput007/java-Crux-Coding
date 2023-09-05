package Assignment4;
import java.util.*;

public class WavePrintColumnWise {
	public static void wavePrintColumnWise(int arr[][]) {
		int m=arr.length;
		int n=arr[0].length;
		for(int i=0;i<n;i++) {
			if(i%2==0) {
				for(int j=0;j<m;j++) {
					System.out.print(arr[j][i]+"");
				}
			}
			else {
				for(int j=m-1;j>=0;j--) {
					System.out.print(arr[j][i]+"");
				}
			}
		
		}
		System.out.println("END");
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
      wavePrintColumnWise(arr);
	}

}
