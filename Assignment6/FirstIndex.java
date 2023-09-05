package Assignment6;
import java.util.*;
public class FirstIndex {
	public static int firstindex(int arr[],int i,int item) {
		if(arr.length==i) {
			return -1;
		}
		if(arr[i]==item) {
			return i;
		}
		int FI=firstindex(arr,i+1,item);
		
		return FI;
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
     
      System.out.println( firstindex(arr,0,item));
	}

}
