package Assignment3;
import java.util.*;
public class TripletSum {
	
	public static void TripletSum(int []arr,int n,int target) {
		for(int i=0;i<n-2;i++) {
			for(int j=i+1;j<n-1;j++) {
				
				for(int k=j+1;k<n;k++) {
					int sum2=arr[i]+arr[j]+arr[k];
					if(sum2==target)
						System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
					}
				}
			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int target=sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
	    Arrays.sort(arr);
		TripletSum(arr,n,target);
		
		
	}

}
