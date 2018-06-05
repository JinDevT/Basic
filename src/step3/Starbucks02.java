package step3;
import javax.swing.JOptionPane;
public class Starbucks02 {
	
	public static void main(String[] args) {
		int totalPrice =0;
		String result = "";
		while(true) {
			String option = JOptionPane.showInputDialog("0.주문완료\n "
					+ "1.아메리카노3000\n"
					+ " 2.라떼3500\n"
					+ " 3.카푸치노4000\n");
			
			String count= "";
			int price = 0;
			int[] prices = {3000, 3500, 4000};
			String[] menu = {"아메리카노", "라떼", "카푸치노"}; 
			switch(option) {
			case "0": 
				String total = JOptionPane.showInputDialog("금액  " + totalPrice);
				return;
			case "1": 
				count =JOptionPane.showInputDialog("몇 잔 드릴까요?");
				JOptionPane.showMessageDialog(null, count+"잔을 선택하셨습니다.");
				
				result = menu[0]+count+"잔";
				price =(Integer.parseInt(count))*prices[0];
				totalPrice += price;
				result = "결제금액 : "+totalPrice;
				
				break;
			case "2":
				count = JOptionPane.showInputDialog("몇잔 드릴까요?");
				JOptionPane.showMessageDialog(null, count);
				
				result = menu[1]+ count +"잔";
				price =(Integer.parseInt(count))* prices[1];
				totalPrice += price;
				result = "결제금액 : "+totalPrice;
				break;
			case "3":
				count = JOptionPane.showInputDialog("몇잔 드릴까요?");
				JOptionPane.showMessageDialog(null, count);
				
				result =menu[2]+count+"잔";
				price =(Integer.parseInt(count))* prices[2];
				totalPrice += price;
				result = "결제금액 : "+totalPrice;
				break;
		
			default:
				
				String error = JOptionPane.showInputDialog("잘못입력하셨습니다.");
				JOptionPane.showMessageDialog(null, error);
				break;
			
			}
			
			
			
		}
	
	}

}
