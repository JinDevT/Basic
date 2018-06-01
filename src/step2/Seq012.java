package step2;
import java.util.Scanner;
public class Seq012 {
	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("0.종료 1.홀수의 합 2.짝수의 합");
			
			switch(scanner.nextInt()) {
			case 0: System.out.println("종료되었습니다.");return;
			case 1:
				int start=0, end=0, Odd=0;
				int counttotal=0;
				String result="";
				System.out.println("첫번 째 숫자를 입력해주세요.");
				int num = scanner.nextInt();
				System.out.println("두번 째 숫자를 입력해주세요.");
				int num2 =scanner.nextInt();
				
				end=(num>num2)?num:num2;
				start=(num>num2)?num2:num;
				
				for(int i = start; i<=end; i++) {
					if(i%2!=0) {
						Odd = i++;
					}
					
				}
				counttotal = Odd;
				Odd=0;
				for(int i = start; i<=end; i++) {
					if(i%2!=0) {
						Odd+=i;
					if(i==counttotal) {
						result+=i+"=";
					}else {
						result+=i+"+";
					}
				}
			}
				System.out.println(result+Odd);
				break;
				
			case 2:
				 start=0; end=0; Odd=0; counttotal=0;
				 result = "";
				System.out.println("첫번 째 숫자를 입력하시오.");
				 num = scanner.nextInt();
				System.out.println("두번 째 숫자를 입력하시오.");
				num2 = scanner.nextInt();
				
				end=(num>num2)?num:num2;
				start=(num>num2)?num:num2;
				
				for(int i = start; i<=end; i++) {
					if(i%2==0) {
						Odd++;
					}
				}
				counttotal = Odd;
				Odd = 0;
				for(int i = start; i<=end; i++) {
					if(i%2==0) {
						Odd+=i;
						if(i==counttotal) {
							result=i+"=";
						}else {
							result=i+"+";
						}
					}

				}
				System.out.println(result+Odd);
				break;	
				
				default:
					System.out.println("에러입니다.");
					break;
			}
		}

	}

}
