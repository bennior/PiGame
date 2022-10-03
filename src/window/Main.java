package window;

import java.awt.EventQueue;

public class Main {

	public static void main(String[] args) {
	
		
 	//launch the PiWindowBuilder
 	EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				PiWindowBuilder window = new PiWindowBuilder();
				window.frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	});
	}
}