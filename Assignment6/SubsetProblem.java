package Assignment6;
import java.util.*;
public class SubsetProblem {
	public static void subset(int arr[],int currSum,int item,int i,String ans) {
     if(i==arr.length) {
    	 if(currSum==item) {
    		 System.out.println(ans+"  ");
    	 }
    	 return;
     }
		subset(arr,currSum+arr[i],item,i+1,ans+arr[i]+" ");
		subset(arr,currSum,item,i+1,ans);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++) {
    	arr[i]=sc.nextInt();
    }
     
      int item=sc.nextInt();
      String ans="";
      subset(arr,0,0,item,ans);
	}

}
