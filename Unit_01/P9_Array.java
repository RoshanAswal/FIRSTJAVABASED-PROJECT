package Unit_01;
import java.util.Scanner;
public class P9_Array {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 4, 6, 2, 3 };
		QuestionsOnArray obj = new QuestionsOnArray();
		obj.sortAnArray(array);
		obj.findTheDuplicateElements(array);
		obj.findSecondLargestAndSecondSmallestElement(array);
		obj.leftRotationInAnArray(array);
		obj.removeElementInArray(array); // (Optional)
	}
}
class QuestionsOnArray {
	void sortAnArray(int[] arr) {
		int l=arr.length;
		for(int i=0;i<l;i++) {
			int min=arr[i],ind=i;
			for(int j=i+1;j<l;j++) {
				if(arr[j]<min) {
					min=arr[j];
					ind=j;
				}
			}
			int temp=arr[ind];
			arr[ind]=arr[i];
			arr[i]=temp;
		}
		for(int i=0;i<l;i++)
			System.out.print(arr[i]+" ");
		System.out.println("");
	}
	void findTheDuplicateElements(int[] arr) {
		int l=arr.length-1;
		for(int i=0;i<l;i++) {
			if(arr[i]==arr[i+1]) {
				System.out.print(arr[i]+" ");
				while(i<l && arr[i]==arr[i+1])i++;
			}
		}
		System.out.println("");
	}
	void findSecondLargestAndSecondSmallestElement(int[] arr) {
		System.out.println("Second largest - "+arr[arr.length-2]);
		System.out.println("Second smallest - "+arr[1]);
	}
	void leftRotationInAnArray(int[] arr) {
		int l=arr.length-1;
		int temp=arr[0];
		for(int i=0;i<l;i++)
			arr[i]=arr[i+1];
		arr[l]=temp;
		for(int i=0;i<=l;i++)
			System.out.print(arr[i]+" ");
		System.out.println("");
	}
	void removeElementInArray(int[] arr) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the index of element to remove");
		int k=sc.nextInt();
		for(int i=k;i<arr.length-1;i++)
			arr[i]=arr[i+1];
		for(int i=0;i<arr.length-1;i++)
			System.out.print(arr[i]+" ");
	}

}







