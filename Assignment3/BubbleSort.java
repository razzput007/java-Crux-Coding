package Assignment3;
import java.util.*;
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int [n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
        for(int i=0;i<arr.length-1;i++) {
        	for(int j=0;j<arr.length-i;j++) {
        		if(arr[i]>arr[i+1]) {
        			int temp=arr[i];
        			arr[i]=arr[i+1];
        			arr[i+1]=temp;
        		}
        	}
        }
        for(int i=0;i<arr.length;i++) {
        	System.out.print(arr[i]+" ");
        }
	}

}
