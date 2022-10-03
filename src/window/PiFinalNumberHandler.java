package window;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class PiFinalNumberHandler implements KeyListener{

	JTextField start;
	JTextField end;
	PiCheckBoxListener cb;
	JCheckBox jcb;
	public static int e = 1001;
	public static String endString;
	String str = PiStartingNumberHandler.startString;
	

	
	PiFinalNumberHandler(JTextField start, JTextField end, PiCheckBoxListener cb, JCheckBox jcb) {
		this.start = start;
		this.end = end;
		this.cb = cb;
		this.jcb = jcb;
	}
	
	@Override
	public void keyPressed(KeyEvent k) {
	
	}

	@Override
	public void keyReleased(KeyEvent v) {
		
		
		endString = end.getText();
		str = start.getText();

		
			
			if(end.getText().isEmpty() == false && start.getText().isEmpty() == false) {
				e = Integer.parseInt(endString);
				PiStartingNumberHandler.s = Integer.parseInt(str);
				PiCheckBoxListener.empty = false;

				if(PiStartingNumberHandler.s <= e) {
					PiCheckBoxListener.higher = false;

					if(PiStartingNumberHandler.s == 1) {
						PiGame.a = PiStartingNumberHandler.s - 1;
						PiGame.b = PiStartingNumberHandler.s - 1;
						PiGame.f = e + 1;
					}
					else {
						PiGame.a = PiStartingNumberHandler.s;
						PiGame.b = PiStartingNumberHandler.s;
						PiGame.f = e + 1;
					}
					if(jcb.isSelected() == true) {
					cb.checkCheckbox();
					}
						}
				else {
					if(start.getText().isEmpty() == false && end.getText().isEmpty() == false) {
						PiCheckBoxListener.higher = true;
					} 
				}
				
					} 
			else {
				
			if(end.getText().isEmpty() == true || start.getText().isEmpty() == true) {
				PiCheckBoxListener.empty = true;
			}
			}
		}

		
	@Override
	public void keyTyped(KeyEvent arg0) {
		
	}

}
