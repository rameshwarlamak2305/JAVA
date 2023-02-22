package test;

public class MatrixAdd {
	public static void main(String[] args) {
		
		int num1[][]= {{1,2,3},{1,2,3},{1,2,3}};
		int num2[][]= {{1,2,3},{1,2,3},{1,2,3}};
		
		int res[][]=new int[3][3];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				
				res[i][j]=num1[i][j]+num2[i][j];
				System.out.print(res[i][j]+" ");		
				}
			System.out.println();
		}
		
	}

}
