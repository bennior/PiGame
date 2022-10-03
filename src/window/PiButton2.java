package window;

import java.awt.Font;

import javax.swing.JButton;

public class PiButton2 extends JButton{
	
	Font schrift = new Font("Monospaced", Font.BOLD, 45);

	public PiButton2() {
		setText("Number");
		setFont(schrift);
		setOpaque(false);
		setContentAreaFilled(false);
		setBorderPainted(false);
	}
}
