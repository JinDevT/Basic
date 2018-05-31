package step2;
import java.util.Scanner;
/**
 1부터 10까지 합을 구하시오
 출력 1+2+3+...+10=55 입니다.
 * */
public class EvenSum {
	public static void main(String[] args) {
		System.out.println("1부터 10까지의 합을 구하시오.");
		
		int sum=0;
		String result = " ";
		
		for(int i= 1; i <11; i++) {
			sum+=i;
		}
		System.out.print("1부터 10까지의 합은"+sum+"입니다");
		
	}

}


