package step3;
import javax.swing.JOptionPane;
public class ArrayTest2 {
	public static int getTotal(String[] score) {
		int total=Integer.parseInt(score[1]) //국영수의 합계가 total에 저장된다.
				+Integer.parseInt(score[2])
				+Integer.parseInt(score[3]);
		
		
			return total;
	}
	public static String[] getGrade(int total) { //int total값을 받음.(합계를 받는다.)
		String[] result = new String[3]; //길이가 3인 result 배열 선언.
		result[0]=String.valueOf(total); //result값이 String형이기 때문에 String형으로 캐스팅 한다. result[0]배열은 합계를 의미힌다.
		result[1]=String.valueOf(Integer.parseInt(result[0])/3); //평균값을 구해 result[1]에 할당한다. result[0]을 정수인 3과 나눠야 하기 떄문에 result[0]만 int형으로 캐스팅한다.
		
		switch(Integer.parseInt(result[1])/10) { //등급을 구한다.
		case 10: case 9: result[2] = "A"; break;
		case 8: result[2] = "B"; break;
		case 7: result[2] = "C"; break;
		case 6: result[2] = "D"; break;
		case 5: result[2] = "E"; break;
		default: result[2] = "F"; break;
		
		
		}
		return result; //result값을 반환한다.
		
	}
	public static void main(String[] args) {
		String students[] = new String[3]; //길이가 3인 String형태인 students 배열을 이니셜라이징함.
		int count=0;
		while(true) {
			String menu =JOptionPane.showInputDialog("0.종료 1.성적입력 2.전체보기");
			
			switch(menu) {
			case "0": return;
			case "1":
				String score=JOptionPane.showInputDialog("이름/국어/수학/영어/"); // 화면에 보여줌.
				String[] arr = score.split("/"); // / 단위로 쪼개어 String 배열에 넣음.
				String[] arr1 = getGrade(getTotal(arr));//먼저 getTotal을 찾아감 -> 다시 getGrade를 찾아감.
				String student =arr[0]+"/"+arr[1]+"/"+arr[2]+"/"+arr[3]+"/"+arr1[0]+"/"+arr1[1]+"/"+arr1[2];
				//arr[0]~arr[3] : 이름/국어/수학/영어 , arr1[0]~arr1[2] : 총점/평균/등급
				 students[count]= student; //count 는 1씩 증가하고 0~2까지 저장한다.
				count++; //1씩 증가한다.
				
				break;
			case "2":
				String result = "이름/국어/수학/영어/총점/합계/등급\n";
				for(int i=0; i<students.length; i++) {
					result += students[i]+"\n";
				}
				JOptionPane.showMessageDialog(null, result);
				
				break;
				
				default: JOptionPane.showMessageDialog(null,"EEROR");
			
				
			}
		}
		
	}

}
