package Assignment5;
import java.util.*;
public class StringToggle {
public static String Toggle(String str) {
	String ans="";
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		if(Character.isUpperCase(ch)) {
			ans+=Character.toLowerCase(ch);
		}
		else {
			ans+=Character.toUpperCase(ch);
		}
	}
	
	return ans;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       String str=sc.next();
       
       System.out.println(Toggle(str));
	}

}
