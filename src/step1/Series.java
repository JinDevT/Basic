package step1;
import java.util.Scanner;
public class Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while(true){
			System.out.println("1.종료 2.실행");
			int sum = 0;
			String result = " ";
			switch(scanner.nextInt()){
				case 1:System.out.println("종료되었습니다.");return;
				case 2:
				System.out.println("첫번 째 값을 입력하시오.");
				int num1 = scanner.nextInt();
				System.out.println("두번 째 값을 입력하시오.");
				int num2 = scanner.nextInt();
				int start,end = 0;
				if(num1 > num2){
					start = num2;
					end = num1;
					}else{
					start = num1;
					end = num2;
					}
					for(int i =start; i<=end; i++){
						sum+=i;
						if(i==end){
							result +=i+"=";
						}else{
							result += i+"+";
						}
				}
				System.out.println(result+sum);
				break;
				default:
					System.out.println("잘못입력하셨습니다.");
					break;
			}
			
		}
	}

}
