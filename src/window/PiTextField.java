package window;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;


public class PiTextField extends JTextField{

	Font schrift = new Font("Monospaced", Font.BOLD, 100);
    
	public PiTextField() {
		setFont(schrift);
		setVisible(true);
		//setBackground(Color.LIGHT_GRAY);
		setOpaque(false);
	}
	
}

