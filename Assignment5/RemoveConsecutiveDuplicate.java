package Assignment5;
import java.util.*;
public class RemoveConsecutiveDuplicate {

	public static String remove(String str) {
		int i=0;
        int j=0;
        String ans="";
		while(j<str.length()) {
			if(str.charAt(i)==str.charAt(j)) {
				j++;
			}
			else {
				ans+=str.charAt(i);
				i=j;
				
			}
		}

	ans+=str.charAt(str.length()-1);
		
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		
		System.out.println(remove(str));

	}

}
