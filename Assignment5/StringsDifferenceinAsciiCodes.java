package Assignment5;
import java.util.*;
public class StringsDifferenceinAsciiCodes {
public static String f2(String str) {
	String ans="";
	char y=str.charAt(0);
	for(int i=1;i<str.length();i++) {
		char ch=str.charAt(i);
		int x=ch-y;
		//System.out.println(x);
		ans=ans+y+x;
		y=ch;
		//System.out.println(y);
	}
	ans=ans+str.charAt(str.length()-1);
	return ans;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     String str=sc.next();
     System.out.println(f2(str));
	}

}
