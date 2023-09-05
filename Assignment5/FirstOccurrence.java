package Assignment5;
import java.util.*;
public class FirstOccurrence {
public static void firstOcuu(String str) {
	int count =0;
	char res=' ';
   for(char ch: str.toCharArray()) {
	   if(str.indexOf(ch)==str.lastIndexOf(ch)) {
		  // System.out.println(ch);
		   res=ch;
		   count++;
		 //  System.out.println(count);
		   break;
	   }
   }
   if(count==1) {
	   System.out.println(res);
   }
   else {
	   System.out.println(-1);
   }
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t-->0) {
    	  String str=sc.next();
          firstOcuu(str); 
      }
     
	}

}
