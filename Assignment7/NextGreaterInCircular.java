package Assignment7;
import java.util.*;
public class NextGreaterInCircular {
	public static void nextGreater(int arr[],int n) {
		int nge[]=new int[n];
		Stack<Integer> st=new Stack<>();
		for(int i=2*n;i>=0;i--) {
			while(!st.isEmpty() && arr[i%n]>=st.peek()) {
				st.pop();
			}
			if(i<n) {
				if(st.isEmpty()) {
					nge[i]=-1;
				}
				else {
					nge[i]=st.peek();
				}
			}
			
			st.push(arr[i%n]);
		}
		for(int i=0;i<nge.length;i++) {
	      	  System.out.println(nge[i]);
	        }
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);

			int n = scn.nextInt();
			int[] arr = new int[n];

			for (int i = 0; i < arr.length; i++) {
				arr[i] = scn.nextInt();
			}
			nextGreater(arr,n);
		

	}

}
