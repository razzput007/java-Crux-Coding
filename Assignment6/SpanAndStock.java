package Assignment6;
import java.util.*;
public class SpanAndStock {
	public static int[] stock(int arr[]) {
		int ans[]=new int [arr.length];
		Stack<Integer> st=new Stack<>();
		st.push(0);
		ans[0]=1;
		for(int i=2;i<arr.length;i++) {
			while(!st.isEmpty()&&st.peek()<arr[i]) {
				st.pop();
			}
			if(st.isEmpty()) {
				ans[i]=i+1;
			}
			else {
				ans[i]=i-st.peek()
;			}
			st.push(i);
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[]= {30,35,40,38,35};
		stock(arr);
       
	}

}
