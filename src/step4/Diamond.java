package step4;
public class Diamond {
	public static void main(String[] args) {
		int[][] mar = new int[5][5];
		int k=0;
		for(int i=0; i<5; i++) {
			if(i<3) {
				for(int j=2-i; j<=2+i; j++) {
					k++;
					mar[i][j]=k;
				}
			}else if(i==3) {
				for(int j=1; j<=3; j++) {
					k++;
					mar[i][j]=k;
				}
			}else {
				for(int j=2; j<=2; j++) {
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
