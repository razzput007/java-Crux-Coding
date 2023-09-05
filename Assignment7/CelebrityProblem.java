package Assignment7;
import java.util.*;
public class CelebrityProblem {
	public static void celebrity(int arr[][],int n) {
		Stack<Integer> st=new Stack<>();
		for(int i=0;i<n;i++) {
			st.push(i);	
		}
		while(st.size()>1) {
			int a=st.pop();
			int b=st.pop();
			if(arr[a][b]==1) {
				st.push(b);
			}
			else {
				st.push(a);
			}
		}
		int cand=st.pop();
		for(int i=0;i<n;i++) {
			if(i==cand) {
				continue;
			}
			if(arr[cand][i]==1 || arr[i][cand]==0) {
				System.out.println("No Celebrity");
			}
		}
		System.out.println(cand);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int arr[][]=new int[n][n];
     for(int i=0;i<arr.length;i++) {
    	 for(int j=0;j<arr[0].length;j++) {
    		 arr[i][j]=sc.nextInt();
    	 }
     }
       celebrity(arr,n);
	}

}
