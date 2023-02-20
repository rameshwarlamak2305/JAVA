package Interview;

public class ArrayAsending {

	public static void main(String[] args) {
		int arr[]=new int[] {7,6,5,4,3,2,1};
		int temp=0;
		System.out.print("elements of original array");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i] +" ");
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
			}
		System.out.println("elements of sorted array");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] +" ");
		}

	}

}
