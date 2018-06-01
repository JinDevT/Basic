package step2;

/**
*[수열012] 홀수짝수의 합계
* */
import java.util.Scanner;

public class Seq012_2 {
	public static int[] input(Scanner scanner) {
		int[] result = new int[2]; 
		System.out.println("첫번 째 숫자를 입력해주세요.");
		int num = scanner.nextInt();
		System.out.println("두번 째 숫자를 입력해주세요.");
		int num2 = scanner.nextInt();
		int start = 0, end = 0;
		end = (num > num2) ? num : num2;
		start = (num > num2) ? num2 : num;

		result[0] = start;
		result[1] = end;
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("0.종료 1.홀수의 합 2.짝수의 합");
			String result = "";
			switch (scanner.nextInt()) {
			case 0:
				System.out.println("종료되었습니다.");
				return;
			case 1:
				//input(scanner);
				int start = 0, end = 0, odd = 0, sum=0;
				int counttotal = 0;
				int[] arr= input(scanner);
				start = arr[0];
				end = arr[1];
				for (int i = start; i <= end; i++) {
					if (i % 2 != 0) {
						odd = i++;
					}

				}
				counttotal = odd;
				odd = 0;
				for (int i = start; i <= end; i++) {
					if (i % 2 != 0) {
						odd += i;
						if (i == counttotal) {
							result += i + "=";
						} else {
							result += i + "+";
						}
					}
				}
				System.out.println(result + odd);
				break;
			case 2:
				start = 0; end = 0;odd = 0;counttotal=0; sum=0;
				int[] arr2 = input(scanner);
				start = arr2[0];
				end = arr2[1];
				result = "";
				for (int i = start; i <= end; i++) {
					if (i % 2 == 0) {
						odd++;
					}
				}
				counttotal = odd;
				odd = 0;
				for (int i = start; i <= end; i++) {
					if (i % 2 == 0) {
						sum += i;
						if (sum == counttotal) {
							result += i + "=";
						} else {
							result += i + "+";
						}
					}

				}
				System.out.println(result + odd);
				break;

			default:
				System.out.println("에러입니다.");
				break;
			}
		}
	}
}
