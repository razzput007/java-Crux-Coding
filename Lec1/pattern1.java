package Lec1;
import java.util.*;
public class pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int row=1;
     int star=1;
     while(row<=n) {
    	 //star
    	 int i=1;
    	 while(i<=star) {
    		 System.out.print("* ");
    		 i++;
    	 }
    	 row++;
    	 star++;
    	 System.out.println();
     }
     
     }

}
