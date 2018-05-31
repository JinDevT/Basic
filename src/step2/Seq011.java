package step2;
/**
 [수열011] 1-2+3-4+5-6...-100 = -50합계
 */
 
public class Seq011 {
	public static void main(String[] args) {
		System.out.println("수열 합계를 구하시오.");
		int sum = 0;
		String result = "";
		for(int i=1; i<=100; i++) {
			if(i%2!=0) {
				sum+=i;
				result+=i+"-";
			}else{
				sum-=i;
				result+=(i==100)?i+"=":i+"+";
			}
			
		}
		System.out.println(result+sum);
	
			
			
	}
}
