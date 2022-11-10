import java.util.*;
public class Duplicate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		n=sc.nextInt();
		int[] arr=new int[n];
		int[] res=new int[n];
		System.out.println("Enter array elements: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int k=0;
		
		System.out.print("Duplicate eledments in the array: ");
		for(int i=0;i<arr.length;i++) {
			boolean flag=true;
			for(int j=0;j<res.length;j++) {
				if(arr[i]==res[j]) {
					flag=false;
					break;
				}
			}
				if(flag) {					
					res[k++]=arr[i];
				}
			
		}
		for(int i=0;i<k;i++) {
			System.out.print(res[i]+" ");
		}
		

	}

}
