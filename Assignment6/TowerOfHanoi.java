package Assignment6;
import java.util.*;
public class TowerOfHanoi {
	public static void toh(int n,String s,String s1,String s2) {
		if(n==0) {
			return;
		}
		toh(n-1,s,s2,s1);
		System.out.println("Moving ring "+n+"from "+s+" to "+s1);
		toh(n-1,s2,s1,s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=sc.next();
		String s1=sc.next();
		String s2=sc.next();
		toh(n,s,s1,s2);

	}

}
