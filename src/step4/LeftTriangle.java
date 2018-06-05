package step4;

public class LeftTriangle {
	public static void main(String[] args) {
		int[][] mat = new int[5][5];
		int k =0;
		for(int i =0; i<5; i++) {
			for(int j=0; j<=i; j++) {
				k++; 
				mat[i][j]=k;
				
				System.out.print(k);
			}
			System.out.println();
		}

	}

}
