package window;

import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PiStartingNumberHandler implements KeyListener{

	JTextField start;
	JTextField end;
	PiCheckBoxListener cb;
	JCheckBox jcb;
	public static int s = 0;
	public static String startString;
	String en = PiFinalNumberHandler.endString;
	
	PiStartingNumberHandler(JTextField start, JTextField end, PiCheckBoxListener cb, JCheckBox jcb) {
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
		
		startString = start.getText();
		en = end.getText();
		
		
		
		
		if(start.getText().isEmpty() == false && end.getText().isEmpty() == false) {
			s = Integer.parseInt(startString);
			PiFinalNumberHandler.e = Integer.parseInt(en);
			PiCheckBoxListener.empty = false;
			
			if(s <= PiFinalNumberHandler.e) {
				PiCheckBoxListener.higher = false;
				
				if(s == 1) {
					PiGame.a = s - 1;
					PiGame.b = s - 1;
					PiGame.f = PiFinalNumberHandler.e + 1;
				}
				else {
					PiGame.a = s;
					PiGame.b = s;
					PiGame.f = PiFinalNumberHandler.e + 1;
				}
				//hier: Methode ausführen
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
