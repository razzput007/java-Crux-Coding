package Assignment5;
import java.util.*;
class Comp implements Comparator<String>{
	
	Comp(){}
	
	@Override
	public int compare(String a, String b) {
		String X=a+b;
		String Y=b+a;
		
		int camp=X.compareTo(Y);
		return (-1)*camp;
	}
}
public class FormlargestNumber {
	public static String Largest(String []str) {
		Arrays.sort(str,new Comp());
		String ans="";
		for(int i=0;i<str.length;i++) {
			ans+=str[i];
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			String str[]=new String[n];
			for(int i=0;i<str.length;i++) {
				str[i]=sc.next();
			}
			System.out.println(Largest(str));
		}

	}

}
