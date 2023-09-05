package Assignment7;
import java.util.*;
public class LLOdd {
	public static void odd() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
      LinkedList ll=new LinkedList<>();
      while(n>0) {
    	  ll.add(sc.nextInt());
    	  n--;
      }
     // System.out.println(ll);
      for(int i=0;i<ll.size();i++) {
    	  System.out.print(ll.get(i)+" ");
      }
	}

}
