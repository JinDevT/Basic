package step1;
import java.util.Scanner;
public class BMI {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true){
			System.out.println("1.실행 2.종료");
			int flag = scanner.nextInt();
			
			switch(flag){
			case 1:
			System.out.println("몸무게 입력: ");
			double weight = scanner.nextInt();
			System.out.println("키 입력: ");
			double height = scanner.nextInt();
			height/=100;
			double bmi = (weight/(height*height));
			String result = " ";
			
			if(bmi<18.5){
			result ="저체충";
			
			}else if(bmi>18.5 && bmi<23){
			result = "정상";
			
			}else if(bmi>23 && bmi<25){
			result ="비만 전단계";
		
			}else if(bmi>25 && bmi<30){
			result="1단계 비만";
			
			}else if(bmi>30 && bmi<35){
			result="2단계 비만";
			
			}else{
			result="3단계 비만";
		}
			
		System.out.println("BMI : "+bmi+"단계: "+result+"입니다");
		break;
 		case 2:
 			System.out.println("종료합니다.");
 			return;
 		}
			
		}
	}

}
