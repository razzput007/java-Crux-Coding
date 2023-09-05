package Assignment7;
import java.util.*;
public class Histogram {
	public static int[] rightMin(int arr[],int n) {
		int rb[]=new int [n];
		Stack<Integer> st=new Stack<>();
		st.push(arr.length-1);
		rb[arr.length-1]=arr.length;
		for(int i=n-2;i>=0;i--) {
			while(!st.isEmpty()&& arr[i]<=arr[st.peek()]) {
				st.pop();
			}
			if(st.isEmpty()) {
			   rb[i]=arr.length;
			   }
			else {
			 rb[i]=st.peek();	
			}
			st.push(i);
		}
		return rb;
	}
	public static int[] leftMin(int arr[],int n) {
		int lb[]=new int[n];
		Stack<Integer> st=new Stack<>();
		st.push(0);
		lb[0]=-1;
		for(int i=1;i<arr.length;i++) {
			while(!st.isEmpty() && arr[i]<arr[st.peek()]) {
				st.pop();
			}
			if(st.isEmpty()) {
				lb[i]=-1;
			}
			else {
				lb[i]=st.peek();
			}
			st.push(i);
		}
		return lb;
	}
	public static int histogram(int arr[],int n) {
		int arr1[]=rightMin(arr,n);
		int arr2[]=leftMin(arr,n);
		int maxArea=0;
		for(int i=0;i<n;i++) {
			int width=arr1[i]-arr2[i]-1;
			int area=arr[i]*width;
			maxArea=Math.max(area, maxArea);
		}
		return maxArea;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++) {
    	  arr[i]=sc.nextInt();
      }
      System.out.println(histogram(arr,n));
	}

}
