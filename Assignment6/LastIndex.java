package Assignment6;
import java.util.*;
public class LastIndex {
	public static int lastindex(int arr[],int i,int item) {
		if(i==-1) {
			return -1;
		}
		if(arr[i]==item) {
			return i;
		}
		int LI=lastindex(arr,i-1,item);
		return LI;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	     int n=sc.nextInt();
	     int arr[]=new int [n];
	     for(int i=0;i<n;i++) {
	    	 arr[i]=sc.nextInt();
	     }
	     int item=sc.nextInt();
	     System.out.println(lastindex(arr,n-1,item));
	}

}
