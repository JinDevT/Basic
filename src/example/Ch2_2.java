package example;
import java.util.Scanner;
public class Ch2_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요");
		int num = scanner.nextInt();
		System.out.println("+ - * / % ==>");
		String op = scanner.next();
		System.out.println("두번째 숫자를 입력하세요.");
		int num2 = scanner.nextInt();
		
		int result = 0;
		
		if(op.equals("+")) {
			result = num + num2;
		}else if(op.equals("-")) {
			result = num - num2;
		}else if(op.equals("*")) {
			result = num * num2;
		}else if(op.equals("/")) {
			if(num2==0) {
				System.out.println("0으로 나눌수 없습니다."); 
				return;
			}else {
				result = num/num2;
			}
			
		}else if(op.equals("%")){
			result = num % num2;
		}else {
			System.out.println("다시입력하세요"); return;
		}
	
		System.out.println(num+op+num2+"="+result);


	}

}
