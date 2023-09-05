package Assignment3;
import java.util.*;
public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
	      int count1=0,count2=0;
	      int ele1=Integer.MIN_VALUE;
	      int ele2=Integer.MIN_VALUE;
	      Arrays.sort(arr);
	      for(int i = 0; i < n; i++) {
	    	  
	    	  if(arr[i]==ele2) {
	        	   count2++;
	           }
	         else  if(arr[i]==ele1) {
        	   
        	   count1++;
           }
          
           else if(count1==0){
        	   ele1=arr[i];
        	   count1=1;
           }
           else if(count2==0) {
        	   ele2=arr[i];
        	   count2=1;
           }
           else {
        	   count1--;
        	   count2--;
           }
	      }
	     int s1=0,s2=0;
	     for(int i=0;i<arr.length;i++) {
	    	 if(ele1==arr[i]) {
	    		 s1++;
	    	 }
	    	 else if(ele2==arr[i]) {
	    		 s2++;
	    	 }
	     }
	     if(s1>n/3) {
	    	 System.out.print(ele1+" ");
	     }
	     if(s2>ele2) {
	    	 System.out.println(ele2);
	     }
         
	}

}
