package example;
import java.util.Scanner;
public class Ch2_1 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	 System.out.printf("첫번째 계산할 값을 입력하세요.");
	 int num = scanner.nextInt();
	 System.out.printf("두번쨰 계산할 값을 입력하세요.");
	 int num2 = scanner.nextInt();
	 System.out.printf("<1>덧셈 <2>뺄셈 <3>곱셈 <4>나눗셈");
	 int op = scanner.nextInt();
	 int num3 =0;
	 String result ="";
	 
	 if(op==1) {
		 num3 = num+num2;
	 }else if(op==2) {
		 num3 = num-num2;
	 }else if(op==3) {
		 num3 = num*num2;
	 }else if(op==4) {
		 num3 = num/num2;
	 }else {
		System.out.printf("잘못입력하셨습닌다.");
	 }
	 System.out.println(num3);
	 
	}

}
