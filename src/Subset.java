import java.util.*;
public class Subset {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,k;
		n=sc.nextInt();
		k=sc.nextInt();
		int[] arr1=new int[n];
		int[] arr2=new int[k];
		System.out.println("Enter first array elements: ");
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter second array elements: ");
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=sc.nextInt();
		}
		boolean flag=false;
		for(int i=0;i<arr1.length;i++) {
			int temp=1;
			if(arr1[i]==arr2[0]) {
				int index=i+1;
				for(int j=1;j<arr2.length;j++) {
					if(arr2[j]==arr1[index++])
					{
						temp++;
					}
					else {
						break;
					}
				}
			}
			if(temp==arr2.length) {
				flag=true;
			}
			}
		if(flag) {
			System.out.println("Array2 is subset of array1");
		}
		else {
			System.out.println("Array2 is not subset of array1");
		}

}
}
