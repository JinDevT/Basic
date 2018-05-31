package step2;
import java.util.Scanner;
public class Seq012 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("0.종료 1.홀수의 합 2.짝수의 합" );
			
			switch(scanner.nextInt()) {
			case 0: System.out.println("종료"); return;
			case 1:
				System.out.println("첫번 째 숫자를 입력하시오.");
				int num = scanner.nextInt();
				System.out.println("두번 째 숫자를 입력하시오.");
				int num2 = scanner.nextInt();
				int start,end = 0;
				String result = " ";
				int Odd = 0;
				
				end=(num>num2)?num:num2;
				start=(num>num2)?num2:num;
				
				for(int i=start; i<=end; i++) {
					if(i%2!=0) {
					Odd+=i;
					result+=(i==end-1)?i+"=":i+"+";
				}
				
			}
				System.out.println(result+Odd);
				break;
			case 2:
				System.out.println("첫번 째 숫자를 입력하시오.");
				int num3 = scanner.nextInt();
				System.out.println("두번 째 숫자를 입력하시오.");
				int num4 = scanner.nextInt();
				int start2, end2 = 0;
				String result2 = " ";
				int Even = 0;
				
				end2=(num3>num4)?num3:num4;
				start2=(num3>num4)?num4:num3;
				
				for(int i=start2; i<=end2; i++) {
					if(i%2==0) {
						Even+=i;
						result2+=(i==end2-1)?i+"=":i+"-";
					}
				}
				System.out.println(result2 + Even);
				break;
			default :
				System.out.println("잘못입력하셨씁니다.");
				break;
			}
		}

	}

}
