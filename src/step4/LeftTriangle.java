package step4;

public class LeftTriangle {
	public static void main(String[] args) {
		int[][] mat = new int[5][5];
		int k =0;
		for(int i =0; i<5; i++) {
			for(int j=0; j<=i; j++) {
				k++; 
				mat[i][j]=k;
			}
		}
		for(int i=0; i<5; i++) {
			for(int j =0; j<5; j++) {
				System.out.printf("%d.",mat[i][j]);
			}
			System.out.printf("\n");
		}

	}

}
