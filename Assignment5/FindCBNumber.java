package Assignment5;
import java.util.*;
public class FindCBNumber {
	public static int printString(String str) {
		int count =0;
		boolean []visited=new boolean[str.length()];
		for(int len=1;len<=str.length();len++) {
			for(int j=len;j<=str.length();j++) {
				int i=j-len;
				String s=str.substring(i,j);
				long n=Long.parseLong(s);
				if(isCBNumber(n)==true && isVisited(visited,i,j)==true) {
					count ++;
					for(int k=0;k<j;k++) {
						visited[k]=true;
					}
				}
			}
		}
		return count ;
	}
	public static boolean isVisited(boolean []visited, int i ,int j) {
	  for( ;i<visited.length;i++) {
		  if(visited[i]==true) {
			  return false;
		  }
	  }
	  return true;
	}
	public static boolean isCBNumber(long n) {
		if(n==0 || n==1) {
			return false;
		}
		int arr[]= {2,3,5,7,11,13,17,19,23,29};
		for(int i=0;i<arr.length;i++) {
			if(n==arr[i]) {
				return true;
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(n%arr[i]==0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      String str=sc.next();
      printString(str);
	}

}
