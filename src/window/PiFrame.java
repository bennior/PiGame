package window;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class PiFrame extends JFrame{
	
	Image image = new ImageIcon(this.getClass().getResource("/window/pi.png")).getImage();
	ImageIcon img = new ImageIcon(image);
	
	public PiFrame() {
		setTitle("Pi");
		setSize(900, 900);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		setIconImage(img.getImage());
		setVisible(true);
	}
}
