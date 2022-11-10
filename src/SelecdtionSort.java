import java.util.*;
public class SelecdtionSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		n=sc.nextInt();
		int[] arr=new int[n];
		
		System.out.println("Enter array elements: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++) {
			int min=arr[i];
			int index=0;
			for(int j=i+1;j<arr.length;j++) {
				if(min>arr[j]) {
					min=arr[j];
					index=j;
				}
			}
			if(index!=0) {
			arr[index]=arr[i];
			arr[i]=min;
			}	
			
		}
		System.out.println("After sorting of array: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
