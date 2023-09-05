package Assignment6;
import java.util.*;
public class CoinToss {
	public static int coin(int n,String ans) {
		if(n==0) {
			System.out.println(ans+" ");
			return 1;
		}
		int x=coin(n-1,ans+"H");
		int y=coin(n-1,ans+"T");
		return x+y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      String ans="";
      System.out.println(coin(n,ans));
	}

}
