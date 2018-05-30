package step1;
import java.util.Scanner;
public class HowMuch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("얼마에요?");
		int price = scanner.nextInt();
		System.out.println(price+"원 입니다.");
		System.out.println("몇개 드릴까요?");
		int num = scanner.nextInt();
		System.out.println(num+"개 주세요.");
		int sum = price * num;
		System.out.println("총 금액은" +sum+"원 입니다.");
		System.out.println("비싸요 깍아주세요.");
		System.out.println("몇 퍼센트 DC할께요?");
		int sale = scanner.nextInt();

		String result="안팔아요";
		
		if(sale<10){
		result = "할인된 금액은"+sum*(100-sale)/100 + "원 입니다.";
	}
		System.out.println(result);
	}

}
