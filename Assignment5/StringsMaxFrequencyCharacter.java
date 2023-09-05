package Assignment5;
import java.util.*;
public class StringsMaxFrequencyCharacter {
	public static Character f2(String str) {
		char []arr=str.toCharArray();
		Arrays.sort(arr);;
		String str1=new String(arr);
	    char ans=' ';
		int count=1;
		int max_count=0;
		for(int i=1;i<=str1.length();i++) {
			if( i==str1.length()|| str1.charAt(i)!=str1.charAt(i-1)) {
				if(max_count<count) {
					max_count=count;
					ans=str1.charAt(i-1);
				}
				count=1;
			}
			else {
				count++;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	     String str=sc.next();
	     System.out.println(f2(str));
	}

}
