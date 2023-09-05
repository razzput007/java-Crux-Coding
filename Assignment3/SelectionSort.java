package Assignment3;
import java.util.*;
public class SelectionSort {
	public static void sort(int arr[],int n) {
		  for(int i=0;i<n;i++){

	           int min = i;

	           for(int j=i+1;j<n;j++){

	               if(arr[j] < arr[min]){

	                   min = j;

	               }

	           }

	           int temp = arr[min];

	           arr[min] = arr[i];

	           arr[i] = temp;

	       }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		sort(arr,n);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
