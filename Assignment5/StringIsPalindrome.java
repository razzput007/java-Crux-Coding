package Assignment5;
import java.util.*;
public class StringIsPalindrome {
	public static boolean f1(String str) {
		String ans="";
		for(int i=str.length()-1;i>=0;i--) {
			ans+=str.charAt(i);
		}

		if(str.equals(ans)) {
			return true;
		}else {
			return false;
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		String str=sc.next();
		System.out.println(f1(str));

	}

}
