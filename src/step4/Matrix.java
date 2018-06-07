package step4;

import java.awt.JobAttributes;

import javax.swing.JOptionPane;
enum Butt {
	EXIT,
	LEFT_TRIANGLE,
	RIGHT_TRIANGLE,
	ZIGZAG,
	DIAMOND,
	SANDGLASS,
	TRIANGLE;
}

	
public class Matrix {
	public static void main(String[] args) {
		
		Butt[] buttons = {
				Butt.EXIT,
				Butt.LEFT_TRIANGLE,
				Butt.RIGHT_TRIANGLE,
				Butt.ZIGZAG,
				Butt.DIAMOND,
				Butt.SANDGLASS,
				Butt.TRIANGLE
		};
		while(true) {
			Butt select = (Butt)JOptionPane.showInputDialog(
					null, //frame
					"MATRIX PAGE", //frame title
					"SELECT MATRIX MENU", //order
					JOptionPane.QUESTION_MESSAGE, //type
					null, //icon
					buttons, // Array of choices
					buttons[1]); //default
					
		switch (select) {
		case EXIT:return;
		case LEFT_TRIANGLE: 
			JOptionPane.showMessageDialog(null,LeftTriangle());
			break;
		case RIGHT_TRIANGLE: 
			JOptionPane.showMessageDialog(null, RightTriangle());
			break;
		case ZIGZAG:
			JOptionPane.showMessageDialog(null, Zigzag());
			break;
		case DIAMOND:
			JOptionPane.showMessageDialog(null, Diamond());
			break;
		case SANDGLASS:
			JOptionPane.showMessageDialog(null, SandGlass());
			break;
		case TRIANGLE: 
			JOptionPane.showMessageDialog(null, Triangle());
			break;
		default: 
			break;
			
		}
      }
	}
	public static String LeftTriangle() {
		int[][] mat = new int[5][5];
		int k =0;
		for(int i =0; i<5; i++) {
			for(int j=0; j<=i; j++) {
				k++; 
				mat[i][j]=k;
			}
		}
		String result = "";
		for(int i=0; i<5; i++) {
			for(int j =0; j<5; j++) {
				result += mat[i][j]+"/";
				
			}
			result += "\n";
		}
		return result;
	}
	public static String RightTriangle() {
		int[][] mat = new int[5][5];
		int k =0;
		for(int i=0; i<5; i++) {
			for(int j=4-i; j<=4; j++) {
				k++;
				mat[i][j]=k;
			}
		}
		String result ="";
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++ ) {
				result += mat[i][j]+"/";
			}
			result +="\n";
		} 
		
		return result;
	}
	public static String Zigzag() {
		int[][] mar = new int[5][5];
		int k =0; 
		for(int i =0; i<5; i++) {
			if(i%2!=0) {
				for(int j =4; j>=0; j--) {
					k++; 
					mar[i][j]=k;
				}
			}else {
				for(int j =0; j<=4; j++) {
					k++;
					mar[i][j]=k;
				}
			}
		}
		String result = "";
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				result += mar[i][j]+"/";
			}
			result += "\n";
		}
		return result;
	}
	public static String Diamond() {

		return "";
	}
	public static String SandGlass() {
		
		return "";
	}
	public static String Triangle() {
		
		return "";
	}
}


