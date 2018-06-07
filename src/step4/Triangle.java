package step4;

public class Triangle {

	public static void main(String[] args) {
		int[][] mat = new int[7][4];
		int k=0;
		for(int j=0; j<4; j++) {
			for(int i=3-j; i<=3+j; i++) {
				k++;
				mat[i][j]=k;
			}
		}
		for(int i=0; i<7; i++) {
			for(int j=0; j<4; j++) {
				System.out.printf("%d.",mat[i][j]);
			}
			System.out.printf("\n");
		}
		

	}

}
