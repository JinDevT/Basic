package step2;
/**
* 기사시험문제: [수열010]
* 1+2+3+...+100 까지의 합계 변형된 요구사항: 정수를 입력받아 두 수 사이의 합을 구하는 프로그램을
* 구현하시오 출력 : 1+2+3+...+10=55
 * */
import java.util.Scanner;
public class Seq010 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("1.종료 2.시작");
			
			switch(scanner.nextInt()) {
			case 1: System.out.println("종료합니다.");return;
			case 2: System.out.println("시작합니다.");
			int start,end = 0;
			int sum = 0;
			String result = " ";
				System.out.println("첫번 째 숫자를 입력하시오.");
				int num1 = scanner.nextInt();
				System.out.println("두번 째 숫자를 입력하시오.");
				int num2 = scanner.nextInt();
				
				end=(num1>num2)?num1:num2;
				start=(num1>num2)?num2:num1;

				for(int i= start ; i<=end; i++) {
					sum+=i;

					result+=(i==end)?i+"=":i+"+";
				}
				System.out.println(result+sum); break;
			default: System.out.println("에러"); break;
			}
		
		
		}
	}
}


