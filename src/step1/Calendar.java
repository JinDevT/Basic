package step1;
import java.util.Scanner;
public class Calendar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("1.종료 2.시작");
			switch(scanner.nextInt()) {
			case 1: System.out.println("종료되었습니다."); return;
			case 2: System.out.println("월을 입력하세요.");
				int month = scanner.nextInt();
				String day = " ";
				switch(month) {
				case 1: case 3: case 5:  case 7: case 8: case 10: case 12:
				day="31";
				break;
				case 4: case 6: case 9: case 11:
				day="30";
				break;
				case 2:
				day="28";
				break;
				default: day="다시입력해주세요.";
				break;
				}
				System.out.println(day);
				break;
			default:
				System.out.println("에러");
				break;
			}
		}
		
		
	}

}
