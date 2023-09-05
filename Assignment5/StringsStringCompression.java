package Assignment5;
import java.util.*;
public class StringsStringCompression {
 public static void StringStringCompression(String str) {
	  String ans="";
	  char ch=str.charAt(0);
	  int count=1;
	  for(int i=1;i<str.length();i++) {
		  char curr=str.charAt(i);
		  if(ch==curr) {
			  count++;
		  }else {
			  if(count==1) {
				  ans=ans+ch;
				  ch=curr;
				  count=1;
			  }
			  else {
				  ans=ans+ch+count;
					 ch=curr;
					 count=1;
			  }
		  }
	  }
	  if(count==1) {
		  ans=ans+str.charAt(str.length()-1);
	  }
	  else {
		  ans=ans+str.charAt(str.length()-1)+count;
	  }
	   
	  System.out.println(ans);
    
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
      String str=sc.next();
      StringStringCompression(str);
	}

}
