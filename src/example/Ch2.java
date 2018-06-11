package example;
import java.util.Scanner;
public class Ch2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("첫번째 계산할 값");
		int num1 = scanner.nextInt();
		System.out.printf("두번째 계산할 값");
		int num2 = scanner.nextInt();
		System.out.printf("세번째 계산할 값");
		int num3 = scanner.nextInt();
		System.out.printf("네번째 계산할 값");
		int num4 = scanner.nextInt();
	
		 int sum = num1 + num2 + num3 + num4;
		 
		 System.out.printf("%d+%d+%d+%d = %d",num1,num2,num3,num4,sum);
	
	}

}
