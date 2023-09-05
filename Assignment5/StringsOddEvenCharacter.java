package Assignment5;
import java.util.*;
public class StringsOddEvenCharacter {
public static String f1(String str) {
	String ans="";
	for(int i=0;i<str.length();i++){
		char ch=str.charAt(i);
		if(i%2!=0) {
			ch--;
		}
		else {
			ch++;
		}
		ans+=ch;
		 
	}
	return ans;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      String str=sc.next();
      System.out.println(f1(str));
	}

}
