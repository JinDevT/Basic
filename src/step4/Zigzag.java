package step4;

public class Zigzag {

	public static void main(String[] args) {
		int[][] mar = new int[5][5];
		int k =0; 
		for(int i =0; i<5; i++) {
			if(i%2!=0) {
				for(int j =4; j>=0; j--) {
					k++; 
					mar[i][j]=k;
				}
			}else {
				for(int j =0; j<=4; j++) {
					k++;
					mar[i][j]=k;
				}
			}
		}
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.printf("%d.",mar[i][j]);
			}
		System.out.printf("\n");
		}
	}
}
