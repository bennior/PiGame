package window;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PiCheckBoxListener implements ItemListener{
	
	JTextArea jta;
	JScrollPane jsp;
	JTextField start;
	JTextField end;
	JFrame frame;
	String pi = PiTextArea.pi;
	String digits = "31415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679821480865132823066470938446095505822317253594081284811174502841027019385211055596446229489549303819644288109756659334461284756482337867831652712019091456485669234603486104543266482133936072602491412737245870066063155881748815209209628292540917153643678925903600113305305488204665213841469519415116094330572703657595919530921861173819326117931051185480744623799627495673518857527248912279381830119491298336733624406566430860213949463952247371907021798609437027705392171762931767523846748184676694051320005681271452635608277857713427577896091736371787214684409012249534301465495853710507922796892589235420199561121290219608640344181598136297747713099605187072113499999983729780499510597317328160963185950244594553469083026425223082533446850352619311881710100031378387528865875332083814206171776691473035982534904287554687311595628638823537875937519577818577805321712268066130019278766111959092164201989";	
	String x = "3.                      ";
	public static boolean empty = false;
	public static boolean higher = false;

	PiCheckBoxListener(JTextArea jta, JScrollPane jsp, JTextField start, JTextField end, JFrame frame) {
		this.jta = jta;
		this.jsp = jsp;
		this.start = start;
		this.end = end;
		this.frame = frame;
	}
	
	public void checkCheckbox() {
		//Calculation to give values of digits
		if(PiStartingNumberHandler.s == 1) {
			PiGame.a = PiStartingNumberHandler.s - 1;
			PiGame.b = PiStartingNumberHandler.s - 1;
			PiGame.f = PiFinalNumberHandler.e + 1;
		}else {
		PiGame.a = PiStartingNumberHandler.s;
		PiGame.b = PiStartingNumberHandler.s;
		PiGame.f = PiFinalNumberHandler.e + 1;
		}
		//Initialization
		int b = 0;
		StringBuilder sb = new StringBuilder();
		String s;
		
		if(start.getText().isEmpty() == true && end.getText().isEmpty() == true) {
			JOptionPane.showMessageDialog(frame, "You are not allowed to leave both textfields empty!", "Error", JOptionPane.ERROR_MESSAGE);
			 PiGame.a = 0;
			 PiGame.b = 0;
			 PiGame.f = 1001;
			 PiStartingNumberHandler.s = 0;
			 PiFinalNumberHandler.e = 1001;
			 start.setText("");
			 end.setText("");
			 empty = false;
			 higher = false;
			 jta.setCaretPosition(0);
		}
		
		if(empty == true) {
			 JOptionPane.showMessageDialog(frame, "You are not allowed to leave one textfield empty!", "Error", JOptionPane.ERROR_MESSAGE);
			 PiGame.a = 0;
			 PiGame.b = 0;
			 PiGame.f = 1001;
			 PiStartingNumberHandler.s = 0;
			 PiFinalNumberHandler.e = 1001;
			 start.setText("");
			 end.setText("");
			 empty = false;
			 higher = false;
			 jta.setCaretPosition(0);
			 
		}
		if(higher == true) {
			 jta.setText(pi);
			 JOptionPane.showMessageDialog(frame, "The starting number has to be lower than the final number!", "Error", JOptionPane.ERROR_MESSAGE);
			 PiGame.a = 0;
			 PiGame.b = 0;
			 PiGame.f = 1001;
			 PiStartingNumberHandler.s = 0;
			 PiFinalNumberHandler.e = 1001;
			 start.setText("");
			 end.setText("");
			 empty = false;
			 higher = false;
			 jta.setCaretPosition(0);
		}
		
		//To make JScrollPane smaller for all amounts that are not scrollable -> to not see the spaces after the digits (ex. 201 and 320 -> 321 - 201 = 120 -> not scrollable, 6 rows)
		if(PiGame.f - PiGame.a < 121 && PiGame.a != 0) {
			
			jsp.setBounds(270, 250, 360, 220);
		}
		//Make JScrollPane larger for all amounts that are scrollable
		else {
			jsp.setBounds(270, 250, 375, 220);
		}
		
		
		//Because of the 3.1 you need to lower the limit, because the amount is earlier scrollable (1 and 100 -> 101 - 0 = 101 -> not scrollable, 6 rows)
		if(PiGame.a == 0 && PiGame.f - PiGame.a < 102) {
			jsp.setBounds(270, 250, 360, 220);
		}
	
		//marker
		
		//Creation of text in TextField
		int a = PiGame.a - 1;    

			for(int i = PiGame.a; i < PiGame.f; i++) { 
				//if starting number = 1 append 3.1
					if(i == 0) {    
					sb.append(x);
					a++;
					}
					else {
					sb.append(digits.substring(i, i + 1));
					b++;
					a++;
					if(b % 5 == 0 && a + 1 < PiGame.f) {
						sb.append(" ");
					}
					}

		}
		s = sb.toString();
		jta.setText(s);
		jta.setCaretPosition(0);
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {

		if(e.getStateChange() == ItemEvent.SELECTED) {
			
			checkCheckbox();
		//2. marker		
		}
		else {
			jta.setText(pi);
			jsp.setBounds(270, 250, 375, 220);
			jta.setCaretPosition(0);
		}
	}

}
