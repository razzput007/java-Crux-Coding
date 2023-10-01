package Lec50;
import java.util.*;
public class CarsClient {

	public static void main(String[] args) {
		Cars [] arr=new Cars[5];
		arr[0]=new Cars(50,"White",5000);
		arr[1]=new Cars(70,"Black",2000);
		arr[2]=new Cars(60,"Brown",4000);
		arr[3]=new Cars(60,"Brown",9000);
		arr[4]=new Cars(80,"Red",8000);
		
		Arrays.sort(arr,new Comparator<Cars>() {
			public int compare(Cars o1,Cars o2) {
				//return o1.speed-o2.speed;
				if(o1.speed==o2.speed) {
					return o1.Color.compareTo(o2.Color);
				}
				else if(o1.Color.equals(o2.Color)) {
					return o1.speed-o2.speed;
				}
				else {
					return o1.speed-o2.speed;
				}
			}
		} );
		Display(arr);
	}
	
	public static<T> void Display(T [] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static <T>void sort(T[] arr,Comparator<T> camp) {
		for(int turn=1;turn<arr.length;turn++) {
			for(int i=0;i<arr.length-turn;i++) {
				if(camp.compare(arr[i], arr[i+1])>0) {
					T temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
		}
		
		
	}

}
