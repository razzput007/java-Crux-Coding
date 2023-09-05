package Assignment5;
import java.util.*;
public class CanYouReadthis {
	public static void printString(String str) {
		String ans="";
		ans+=str.charAt(0);
		for(int i=1;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='A'&& ch<='Z') {
				System.out.println(ans);
				ans="";
				ans+=ch;
			}
			else {
				ans+=ch;
			}
		}
		System.out.println(ans);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
          printString(str);
	}

}
