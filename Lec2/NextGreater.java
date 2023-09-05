package Lec2;
import java.util.*;


public class NextGreater{
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int t = scn.nextInt();

		while (t > 0) {
			int n = scn.nextInt();
			int[] arr = new int[n];

			for (int i = 0; i < arr.length; i++)
				arr[i] = scn.nextInt();

			nextLarger(arr);

			t--;
		}

	}

	// Function to print Next Greater Element for each element of the array
	public static void nextLarger(int[] arr) {
		int n=arr.length;
		int nge[]=new int[n];
		Stack<Integer> st=new Stack<>();
		st.push(n-1);
		 nge[n-1]=-1;
		for(int i=n-2;i>=0;i--) {
			while(!st.isEmpty() && arr[i]>st.peek()) {
				st.pop();
			}
			if(st.isEmpty()) {
            nge[i]=-1;
			}
			else {
				nge[i]=st.peek();
			}
			st.push(arr[i]);
		}
		for(int i=0;i<nge.length;i++) {
	      	  System.out.println(arr[i]+","+nge[i]);
	        }

	}
}

