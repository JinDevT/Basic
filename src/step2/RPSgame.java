package step2;
import java.util.Scanner;
public class RPSgame {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.가위(R) 2.바위(S) 3.보(P) 중 하나를 고르시오.");
		String a = scanner.next();
		System.out.println("1.가위(R) 2.바위(S) 3.보(P) 중 하나를 고르시오.");
		String b = scanner.next();

		String result = "b가 이겼습니다.";

		if(a.equals(b)){ 
			result="a와 b는 비겼습니다.";
		}else if(a.equals("R") && b.equals("P") ||
				 a.equals("S") && b.equals("R") ||
				 a.equals("P") && b.equals("S")){
			result="a가 이겼습니다.";
		}
			System.out.println(result);
		
	}

}
