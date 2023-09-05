package Assignment5;
import java.util.*;
public class LongestSubstring {
	public  static void longestKSubstr(String s, int k)
	    {
	 
	        int n = s.length();
	        int answer = -1;
	        for (int i = 0; i < n; i++) {
	            for (int j = i + 1; j <= n; j++) {
	                HashSet<Character> distinct
	                    = new HashSet<Character>();
	                for (int x = i; x < j; x++) {
	                    distinct.add(s.charAt(x));
	                }
	                if (distinct.size() == k) {
	                    answer = Math.max(answer, j - i);
	                }
	            }
	        }
	 
	        System.out.println(answer);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t-->0) {
    	 String str=sc.next();
    	 int k=sc.nextInt();
    	 longestKSubstr(str,k);
      }
	}

}
