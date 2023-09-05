package assignment2;
import java.util.*;
public class Chewwbacca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
       
        for(int i=0;i<str.length();i++) {
        	 char ch=str.charAt(i);
        	if(str.charAt(0)=='9') {
        		i++;
        	}
        	if(str.charAt(i)<'5') {
        		str.charAt(i)='9'-ch;
        	}
        }
	}

}
