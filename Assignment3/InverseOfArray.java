package Assignment3;
import java.util.*;
public class InverseOfArray {
	 public static int[] inverse(int[] a) {
		    int[] inv = new int[a.length];

		    for (int i = 0; i < a.length; i++) {
		      int val = a[i];
		      inv[val] = i;
		    }

		    return inv;
		  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		 int[] inv = inverse(arr);
		    Dispaly(inv);

	}

	public static void Dispaly(int[] arr) {

		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i]+" ");
		}

	
	}

}
