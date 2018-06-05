package step3;
import javax.swing.JOptionPane;
public class ArrayTest {
	public static int getTotal(String[] scores) {
		int total = 0;
		
		return total =
				Integer.parseInt(scores[1])
				+Integer.parseInt(scores[2])
				+Integer.parseInt(scores[3]);
			
		
		
		
	}
	public static String[] getGrade(int total) {
		String[] result = new String[3];
		result[0] = String.valueOf(total); // 합계
		result[1] = String.valueOf(total/3); // 평균
		switch(Integer.parseInt(result[1])/10) { //등급
		
		case 10: case 9: result[2]="A"; break;
		case 8: result[2]="B"; break;
		case 7: result[2]="C"; break;
		case 6: result[2]="D"; break;
		case 5: result[2]="E"; break;
		default: result[2]="F"; break;
		
		}
		
		return result;
		
	}
	public static void main(String[] args) {
		String[] students = new String[3];
		int count=0;
		while(true) {
			String menu = JOptionPane.showInputDialog("0.종료 1.성적입력 2.전체보기 3.순위보기");
			switch(menu) {
			case "0": return;
			case "1":
				String score = JOptionPane.showInputDialog("이름/국어/영어/수학 ");
				String[] arr = score.split("/"); 
				String[] arr1 = getGrade(getTotal(arr));				
				String student =  arr[0] + "/" + arr[1] +  "/" + arr[2] + "/" + arr[3] + "/" + arr1[0]+ "/" + arr1[1] +"/" + arr1[2] +"\n";
				students[count] = student;
				count++;
				break;
			case "2":
				String result= "이름 /국어 /영어 /수학 /총점 /평균 /등급/순위/\n";
				for(int i=0; i<students.length; i++) {
					result+=students[i]+"\n";
				}
				JOptionPane.showMessageDialog(null, result);
				break;
			case "3":
				String[] rank = new String[3]; 
				String[] temp = students[0].split("/");
				int a = Integer.parseInt(temp[4]);
				temp = students[1].split("\\|");
				int b = Integer.parseInt(temp[4]);
				temp = students[2].split("\\|");
				int c = Integer.parseInt(temp[4]);
				if(a>b && a>c) {
					if(b>c) {
						rank[0]=students[0];
						rank[1]=students[1];
						rank[2]=students[2];//a>b>c
					}else {
						rank[0]=students[0];
						rank[1]=students[2];
						rank[2]=students[1];
					} 
				}else if(b>c) {
					if(a>c) {
						rank[0]=students[1];
						rank[1]=students[0];
						rank[2]=students[2];
					}else {
						rank[0]=students[1];
						rank[1]=students[2];
						rank[2]=students[0];
					}
				}else if(c>b) {
					if(a>b) {
						rank[0]=students[2];
						rank[1]=students[0];
						rank[2]=students[1];
						
					}
				}
				break;
			default: break;
			}
		}
	}

}
