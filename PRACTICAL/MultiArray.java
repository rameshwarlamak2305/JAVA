package test;

public class MultiArray{
	
	static void showArray() {
		//declare, initilize
		int arr1[][]= {{9,8,9,6},{4,2,8},{5,4,2}};
		//print 
		for(int i=0;i<3;i++) {
				for (int j=0;j<3;j++) {
						System.out.print(arr1[i][j]+"  ");
						
					}
				System.out.println();
		}

		
	}

	public static void main(String[] args) {
		 showArray();
		
	}

}