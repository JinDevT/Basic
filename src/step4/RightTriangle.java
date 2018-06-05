package step4;

public class RightTriangle {
	public static void main(String[] args) {
		int[][] mat = new int[5][5];
		int k =0;
		for(int i=0; i<5; i++) {
			for(int j=4-i; j<=4; j++) {
				k++;
				mat[i][j]=k;
			}
		}
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++ ) {
				System.out.print(mat[i][j]);
			}
			System.out.println();
		} 
	}

}
