package step1;
import java.util.Scanner;
public class GradeReport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름 ?");
		String name = scanner.next();
		System.out.println("국어 점수? ");
		int kor = scanner.nextInt();
		System.out.println("영어 점수? ");
		int eng = scanner.nextInt();
		System.out.println("수학 점수? ");
		int math = scanner.nextInt();
		int sum = kor + eng + math;
		System.out.println("합계 : "+sum);
		
		int avg = (sum)/3;
		String grade = " ";

		switch(avg){
		case 10: 
		case 9:
			grade="A";
			break;
		case 8:
			grade="B";
			break;
		case 7:
			grade="C";
			break;
		case 6:
			grade="D";
			break;
		case 5:
			grade="F";
			break;
		default:
			grade="E";
			break;
	}


		System.out.println(name+"[평균]" +avg+ "[학점]" +grade);
	}

}
