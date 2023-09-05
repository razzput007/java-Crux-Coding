package Assignment6;
import java.util.*;
public class Subsequence {
	public static void printSubsequence(String ques,String ans) {
		if(ques.length()==0) {
			System.out.println(ans+" ");
			return;
		}
		char ch=ques.charAt(0);
		printSubsequence(ques.substring(1),ans);
		printSubsequence(ques.substring(1),ans+ch);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String ques=sc.next();
		printSubsequence(ques,"");

	}

}
