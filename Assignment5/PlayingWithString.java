package Assignment5;
import java.util.*;
public class PlayingWithString {
public static int playingwithstring(String str) {
	int ans=0;
	int count=0;
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u') {
			count++;
		}
		else {
			ans=Math.max(count,ans);
			count=0;
		}
	}
	return Math.max(count, ans);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      String str=sc.next();
      System.out.println(playingwithstring(str));
	}

}
