package String;
import java.util.*;
public class PrintSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     String str=sc.next();
     for(int i=1;i<=str.length();i++) {
    	 for(int j=i;j<=str.length();j++) {
    		 int k=j-i;
    		 System.out.println(str.substring(k,j));
    	 }
     }
	}

}
