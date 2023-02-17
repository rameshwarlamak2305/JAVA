package test;

public class SingleArray {
	//array in method 
	static void showarray() {
		int arr1[]= {1,2,3,5,6,7};
		for (int a :arr1) {
		System.out.print(" "+a);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showarray();
		int myarray[]=new int[4];//declaration & instantiation
		myarray[0]=78;//initialization
		myarray[1]=97;
		myarray[2]=76;
		myarray[3]=30;
		//System.out.println(myarray[3]);//value at index 3
		//traversing an array
		for(int i=0;i<myarray.length;i++) {//length of array 
			System.out.println(myarray[i]);
			
		}
		float num[]= {3.3f,5.5f,8.3f,9.8f};//declaration,instantiating and initialization
		//print num array
		//for(int j=0;j<num.length;j++) {//length of array 
			//System.out.print(num[j]);

		//}
		//holds an array element in a variable then execute body of loop
		for(float j:num) {//for each loop  
			System.out.println(j +" ");
		}


	}

}