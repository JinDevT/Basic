package step1;
import java.util.Scanner;
/**
* 프로그램을 하나 개발해야 합니다.
* 교수가 주민번호를 입력하면 해당 학생이 남자인지,
   여자인지, 외국인인지
* 자동 으로 출력해 주는 프로그램을 만들어 달랍니다.
* 오더는 다음과 같이 화면에 출력하라고 합니다.
* 홍길동 : 800101 -1234567 : 남
* 입력값은 이름과 주민번호이고 남은 자동으로
출력되는 값입니다.
* 현행법상 1, 3으로 시작되면 남자, 
2, 4로 시작되면  여자, 
5,6 이면 외국인
* 교수가 실수로 0,7,8,9 로 시작 주민번호를 입력하면
     * "다시 입력하세요" 라고 알려주시길 바랍니다. 
 * */
public class CheckGender {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("1.실행 2.종료");
			int flag = scanner.nextInt();
		switch(flag) {
		case 1:
		System.out.println("이름을 입력하시오 ");
		String name = scanner.next();
		System.out.println("주민번호를 입력하시오 ");
		String num = scanner.next();
		char ch=num.charAt(7);
		if(ch=='0'||ch=='7'||ch=='8'||ch=='9'){
			System.out.println("다시 입력하세요");
			return ;
		}
		String gender = " ";
		switch(ch){
		case '1': case '3':
			gender = "남자";
			break;
		case '2': case '4':
			gender = "여자";
			break;
		case '5': case '6':
			gender = "외국인";
			break;
		default:
			break;
		}

		System.out.println(name+" : "+num+" : "+gender);
		break;
		
		case 2:
			System.out.println("종료합니다.");
			return;
			}
		}
	}
}
