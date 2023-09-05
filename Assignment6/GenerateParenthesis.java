package Assignment6;
import java.util.*;
public class GenerateParenthesis {
	public static void generate(int n,int open,int close,String ans) {
		if(open==n && close==n) {
			System.out.println(ans+" ");
			return;
		}
     if(open<n) {
    	generate(n,open+1,close,ans+"("); 
     }
     if(close<open) {
    	 generate(n,open,close+1,ans+")");
     }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
      String ans="";
     generate(n,0,0,ans);
	}

}
