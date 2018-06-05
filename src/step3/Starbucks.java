package step3;
import java.util.Scanner;

public class Starbucks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int totalPrice =0;
		
		while(true) {
			System.out.println(
					  "0.종료\n "
					+ "1.아메리카노3000\n"
					+ " 2.라떼3500\n"
					+ " 3.카푸치노4000\n");
			System.out.println("무엇을 도와드릴까요?");
			int what = sc.nextInt();
			
			int count, price = 0;
			String result = "";
			
			int[] prices = { 3000, 3500,  4000 };
			String[] menu = {"아메리카노", "라떼", "카푸치노"};
			
			switch(what) {
			case 0: System.out.printf("금액 : %d", totalPrice); 
				return;
			case 1: 
				System.out.println("몇잔 드릴까요?");
				count = sc.nextInt();
				result = menu[0]+count+"잔";  
				price = count*prices[0];
				totalPrice += price;
				
				break;
			case 2:
				System.out.println("몇잔 드릴까요?");
				count = sc.nextInt();
				result = menu[1]+ count +"잔";
				price = count * prices[1];
				totalPrice += price;
				break;
			case 3:
				System.out.println("몇잔 드릴까요?");
				count = sc.nextInt();
				result =menu[2]+count+"잔";
				price = count * prices[2];
				totalPrice += price;
				break;
		
			default:
				
				System.out.println("잘못입력하셨습니다.");
				break;
			
			}
			
			
			
		}
	
	}

}
