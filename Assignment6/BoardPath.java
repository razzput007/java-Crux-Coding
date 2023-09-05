package Assignment6;
import java.util.*;
public class BoardPath {
	static int count;
	public static void boardpath(int n,int m,int curr,String ans) {
		
		if(curr==n) {
			System.out.println(ans+" ");
			count++;
			return;
		}
		if(curr>n) {
			return;
		}
		
		for(int i=1;i<=m;i++) {
			boardpath(n,m,curr+i,ans+i);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int m=sc.nextInt();
       String ans="";
       boardpath(n,m,0,ans);
       System.out.println(count);
	}

}
