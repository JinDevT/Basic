package step2;

import java.util.Scanner;

public class GradeReport {
	public static int[] input(Scanner scanner) {
		int[] result = new int[3];
		System.out.println("국어 점수? ");
		int kor = scanner.nextInt();
		System.out.println("영어 점수? ");
		int eng = scanner.nextInt();
		System.out.println("수학 점수? ");
		int math = scanner.nextInt();

		result[0] = kor;
		result[1] = eng;
		result[2] = math;

		return result;

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("1.종료 2.실행");

			switch (scanner.nextInt()) {
			case 1:
				System.out.println("종료합니다.");
				return;
			case 2:
				int kor = 0, eng = 0, math = 0, avg = 0, sum = 0;
				String name = "";
				System.out.println("이름을 입력하세요");
				name = scanner.next();

				int[] arr = input(scanner);
				kor = arr[0];
				eng = arr[1];
				math = arr[2];
				sum = kor + eng + math;
				avg = (kor + eng + math) / 3;

				/*
				 * System.out.println("이름을 입력하세요."); String name = scanner.next();
				 * System.out.println("국어 점수? "); int kor = scanner.nextInt();
				 * System.out.println("영어 점수? "); int eng = scanner.nextInt();
				 * System.out.println("수학 점수? "); int math = scanner.nextInt(); int sum = kor +
				 * eng + math;
				 */
				// System.out.println("합계 : "+sum);
				String grade = " ";
				switch (avg) {
				case 10:
				case 9:
					grade = "A";
					break;
				case 8:
					grade = "B";
					break;
				case 7:
					grade = "C";
					break;
				case 6:
					grade = "D";
					break;
				case 5:
					grade = "F";
					break;
				default:
					grade = "E";
					break;
				}
				System.out.println("***************************");
				System.out.println("| 이름 | 총점 | 평균 | 등급 |");
				System.out.println("---------------------------");
				System.out.println("|"+name +   "|" + sum +   "|" + avg +   "|" + grade +   "|");
				break;
				
			default:
				System.out.println("잘못입력하셨습니다.");
				break;
			}

		}

	}

}
