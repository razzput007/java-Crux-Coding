package Lec2;
import java.util.*;

public class pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rows=1;
		int star=n/2+1;
		int space=-1;
		while(rows<=n) {
			//star
			int i=1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			//space
			int j=1;
			while(j<=space) {
				System.out.print("  ");
				j++;
			}
			//star
			int k=1;
			if(rows==1 || rows==n) {
				k=2;
			}
			while(k<=star) {
				System.out.print("* ");
				k++;
			}
			if(rows<=n/2) {
				star--;
				space +=2;
			}
			else {
				star++;
				space-=2;
			}
			rows++;
			System.out.println();
		}

	} 

}
