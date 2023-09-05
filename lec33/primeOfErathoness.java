package lec33;
import java.util.*;
public class primeOfErathoness {
	public static void f1(int n) {
		boolean prime[]=new boolean[n+1];
		for(int i=2;i<prime.length;i++) {
			prime[i]=true;
		}
		
		for(int i=2;i*i<prime.length;i++) {
			if(prime[i]==true) {
				for(int j=2;i*j<prime.length;j++) {
					prime[i*j]=false;
				}
			}
		}
		for(int i=2;i<prime.length;i++) {
			if(prime[i]==true) {
				System.out.print(i+" ");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		f1(n);

	}

}
