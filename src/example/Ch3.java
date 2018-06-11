package example;
import java.util.Scanner;
public class Ch3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 수를 입력하시오.");
		int num1 = sc.nextInt();
		System.out.println("연산자를 입력하시오.");
		String op = sc.next();
		System.out.println("두번째 수를 입력하시오.");
		int num2 = sc.nextInt();
		String result = "";
		
		if(op.equals("*")) {
			result =String.valueOf(num1 * num2); 
			
			System.out.println(num1+op+num2+"="+result);
		}else {
			result="잘못입력";
			
		}
			System.out.println(result);
		
		
		
		
		
	}

}
