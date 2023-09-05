package Assignment7;
import java.util.*;
public class StockSpan {
	public static void stock(int arr[],int n) {
		int pge[]=new int [n];
		Stack<Integer> st=new Stack<>();
		st.push(0);
		pge[0]=1;
		for(int i=1;i<arr.length;i++) {
			while(!st.isEmpty()&& arr[i]>arr[st.peek()]) {
				st.pop();
			}
			if(st.isEmpty()) {
				pge[i]=i+1;
			}
			else {
				pge[i]=i-st.peek();
			}
			st.push(i);
		}
		
		for(int i=0;i<pge.length;i++) {
			System.out.print(pge[i]+" ");
		}
		System.out.println("END");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++) {
    	  arr[i]=sc.nextInt();
      }
      stock(arr,n);
	}

}
