package Assignment3;
import java.util.*;
public class ArrayLinearSearch {
  public static int LinearSearch(int arr[],int n,int m) {
	      n=arr.length;
	     for(int i=0;i<n;i++) {
	    	 if(arr[i]==m) {
	    		 return i;
	    	 }
	    	 
	    	 
	     }
	     return -1;
	    
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int [n];
      for(int i=0;i<arr.length;i++) {
    	  arr[i]=sc.nextInt();
      }
      int m=sc.nextInt();
      System.out.println(LinearSearch(arr,n,m));
	}

}
