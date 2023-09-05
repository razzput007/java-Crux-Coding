package Lec1;
import java.util.*;
public class pattern7a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		while(row<=n) {
			int i=1;
			 
			while(i<=n) {
				if(row==1 || row==n || i==1 || i==n) {
				System.out.print("* ");
				
			}
				else {
					System.out.print("  ");
				}
				i++;
		}
			
			row++;
			
			System.out.println();
		}

	}

}
