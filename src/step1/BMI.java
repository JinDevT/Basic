package step1;
import java.util.Scanner;
/**
몸무게랑 키를 입력받습니다.
18.5 미만이면 저체중, 
18.5∼23은 정상,
23~25이면 '비만 전단계'[5],
25∼30은 '1단계 비만', 
30∼35는 '2단계 비만' , 
35 이상이면 '3단계 비만
 * */
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
