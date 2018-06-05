package step3;
import javax.swing.JOptionPane;
public class RPSgame {
	public static void main(String[] args) {
		
		while(true) {
		int win=0, lose=0, draw=0;
			
		int user=	Integer.parseInt(JOptionPane.showInputDialog("uer :가위(0) 바위(1) 보(2) 중 하나를 고르시오."));
			
			for(int i=0;i<=1; i++ ) {
				int com =(int)(Math.random());
				if(com!=0 && com!=1 && com!=2) {
					i--;
				}
			}
		
		
			//int flag = user - com; 
			String result = "";
			switch(user ){
			case -1: case 2:
				JOptionPane.showMessageDialog(null, "com이 이겼습니다.");
				break;
			case 1: case -2:
				JOptionPane.showMessageDialog(null, "user가 이겼습니다.");
				break;
			case 0:
				JOptionPane.showMessageDialog(null, "비겼습니다.");
				break;
			
			
			
			}

		
		}
	}

}
