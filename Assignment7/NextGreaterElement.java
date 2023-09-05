package Assignment7;
import java.util.*;
public class NextGreaterElement {
	public static void NextGreater(int arr[],int n) {
		int nge[]=new int[n];
		Stack<Integer> st=new Stack<>();
		st.push(arr[n-1]);
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);

		int t = scn.nextInt();

		while (t--> 0) {
			int n = scn.nextInt();
			int[] arr = new int[n];

			for (int i = 0; i < arr.length; i++) {
				arr[i] = scn.nextInt();
			}
			NextGreater(arr,n);
		}
	}

}
