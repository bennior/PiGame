package window;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class PiImagePanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private Image backgroundImage = new ImageIcon(this.getClass().getResource("/window/background.jpg")).getImage();
 
	  public PiImagePanel() throws IOException {

	  }

	  public void paintComponent(Graphics g) {
	    super.paintComponent(g);

	    // Draw the background image.
	    g.drawImage(backgroundImage, 0, 0, this);
	    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	    setBounds(0,0,screenSize.width, screenSize.height);
	  }
	  
	  public static void main(String[] args) throws IOException
	  {
		    new PiImagePanel().setVisible(true);
	  }
	  
	  
	  
	}

