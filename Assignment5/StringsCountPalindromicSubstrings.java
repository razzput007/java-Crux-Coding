package Assignment5;
import java.util.*;
public class StringsCountPalindromicSubstrings {
	public static int f1(String str) {
		int count=0;
		for(int i=0;i<str.length();i++) {
			String str1="";
			for(int j=i;j<str.length();j++) {
				str1+=str.charAt(j);
				//System.out.println(str1);
				if(ispalindrome(str1)) {
					count++;
				}
			}
			
		}
		
		return count;
	}
	public static boolean ispalindrome(String str) {
		String ans="";
		for(int i=str.length()-1;i>=0;i--) {
			ans+=str.charAt(i);
		}
		if(str.equals(ans)) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	     String str=sc.next();
	     System.out.println(f1(str));

	}

}
