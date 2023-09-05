package Lec1;
import java.util.*;

public class pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int row=1;
     int star=n;
     while(row<=n) {
    	 //star
    	 int i=1;
    	 while(i<=star) {
    		 System.out.print("* ");
    		 i++;
    	 }
    	 row++;
    	 
    	 System.out.println(" ");
     }
	}

}
