package window;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;

public class PiButton1 extends JButton{

	Font schrift = new Font("Monospaced", Font.BOLD, 45);
	
	public PiButton1() {
		setText("Play");
		setFont(schrift);
		setOpaque(false);
		setContentAreaFilled(false);
		setBorderPainted(false);
	}

}
