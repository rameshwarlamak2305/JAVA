package Interview;

public class ReverseArray {

	public static void main(String[] args) {
		int arr[]= new int[] {1,2,3};
		
		System.out.println("length of array is" +arr.length);
		
		System.out.println("Array in reverse order");
		
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i] +" ");
		}
	}

}
