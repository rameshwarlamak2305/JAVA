package test;

public class MatrixMul {

	public static void main(String[] args) {
		
		int a1[][]= {{1,1},{2,2}};
		int a2[][]= {{1,1},{2,2}};
		
		int res[][]=new int[2][2];
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				res[i][j]=0;
				for(int k=0;k<2;k++) {
					res[i][j]+=a1[i][k]*a2[k][j];
				}
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
	}

}
