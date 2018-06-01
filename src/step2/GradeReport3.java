package step2;

import java.util.Scanner;

public class GradeReport3 {
	public static String input(Scanner scanner) {
		String result = " ";
		int sum = 0;
		System.out.println("국어 점수? ");
		int kor = scanner.nextInt();
		System.out.println("영어 점수? ");
		int eng = scanner.nextInt();
		System.out.println("수학 점수? ");
		int math = scanner.nextInt();
		result =kor+" "+math+" "+eng;
	
		

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
				String arr = input(scanner);
				String[] result= arr.split(" ");
				//result=arr.split(" ");
				
				kor = Integer.parseInt(result[0]);
				math = Integer.parseInt(result[1]);
				eng = Integer.parseInt(result[2]);
				
				
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
