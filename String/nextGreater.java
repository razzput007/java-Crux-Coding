package String;
import java.util.*;
public class nextGreater {
	public static void nge(int arr[]) {
		int ans[]=new int[arr.length];
		int n=arr.length;
		Stack<Integer>st=new Stack<>();
		st.push(arr[n-1]);
		ans[n-1]=-1;
		for(int i=arr.length-2;i>=0;i--) {
			while(!st.isEmpty()&&arr[i]>=st.peek()) {
				st.pop();
			}
			if(st.isEmpty()) {
				ans[i]=-1;
			}
			else {
				ans[i]=st.peek();
		}
			st.push(arr[i]);
		}
		for(int i=0;i<ans.length;i++) {
      	  System.out.println(ans[i]);
        }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int arr[]= {11,9,13,21,3};
          nge(arr);
          
         
	}

}
