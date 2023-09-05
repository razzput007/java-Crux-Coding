package assignment2;
import java.util.*;

public class SumofOddAndEvenPlacedDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sumEven=0;
		int sumOdd=0;
		int count=1;
		while(n!=0) {
			if(count%2==0) {
				sumEven +=n%10;
			}
			else {
				sumOdd +=n%10;
			}
			n=n/10;
			count ++;
			
		}
		System.out.println(sumEven);
		System.out.println(sumOdd);

	}

}
