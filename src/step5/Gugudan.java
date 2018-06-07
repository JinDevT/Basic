package step5;

public class Gugudan {
	public static void main(String[] args) {
		//int[] gob =[8][4];
		int dan = 0;
		for(int j=0; j<=9; j++) {
			for(int i=1; i<=9; i++){
				dan = i * j;
				System.out.printf("%d * %d = %d\n", i,j,dan);
			}
		}
		
	}
}

