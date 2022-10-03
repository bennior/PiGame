package window;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PiGame implements KeyListener{
	
	JTextField jtf;
	JLabel jl;
	JLabel jl1;
	JLabel jltrys;
	JFrame jf;
	JTextArea jta;
	
	public static int a = 0;
	public static int b = 0;
	public static int f = 1001;
	String digits = " 31415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679821480865132823066470938446095505822317253594081284811174502841027019385211055596446229489549303819644288109756659334461284756482337867831652712019091456485669234603486104543266482133936072602491412737245870066063155881748815209209628292540917153643678925903600113305305488204665213841469519415116094330572703657595919530921861173819326117931051185480744623799627495673518857527248912279381830119491298336733624406566430860213949463952247371907021798609437027705392171762931767523846748184676694051320005681271452635608277857713427577896091736371787214684409012249534301465495853710507922796892589235420199561121290219608640344181598136297747713099605187072113499999983729780499510597317328160963185950244594553469083026425223082533446850352619311881710100031378387528865875332083814206171776691473035982534904287554687311595628638823537875937519577818577805321712268066130019278766111959092164201989";	
	int fails = 0;
	PiMusic sf = new PiMusic();
	boolean focus;

	
	PiGame(JTextField jtf, JLabel jl, JLabel jl1, JFrame jf, JLabel jltrys, JTextArea jta) {
		this.jtf = jtf;
		this.jl = jl;
		this.jl1 = jl1;
		this.jf = jf;
		this.jltrys = jltrys;
		this.jta = jta;
		jltrys.setText("Fails: " + fails);
		}

	@Override
	public void keyPressed(KeyEvent e1) {
		
	}
	@Override
	public void keyReleased(KeyEvent e2) {
		char input = e2.getKeyChar();

		 int inputInt = Integer.parseInt(String.valueOf(input));
		 String pi = "31415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679821480865132823066470938446095505822317253594081284811174502841027019385211055596446229489549303819644288109756659334461284756482337867831652712019091456485669234603486104543266482133936072602491412737245870066063155881748815209209628292540917153643678925903600113305305488204665213841469519415116094330572703657595919530921861173819326117931051185480744623799627495673518857527248912279381830119491298336733624406566430860213949463952247371907021798609437027705392171762931767523846748184676694051320005681271452635608277857713427577896091736371787214684409012249534301465495853710507922796892589235420199561121290219608640344181598136297747713099605187072113499999983729780499510597317328160963185950244594553469083026425223082533446850352619311881710100031378387528865875332083814206171776691473035982534904287554687311595628638823537875937519577818577805321712268066130019278766111959092164201989";	
		 String compareFactor = pi.substring(a, a + 1);
		 String secondlbl = digits.substring(b, b + 1);
		 int compareFactorInt = Integer.parseInt(compareFactor);
		 
		 if(inputInt == compareFactorInt) {
			 jl.setText(compareFactor);
			 jl1.setText(secondlbl);
			 a++;
			 b++;
			 jtf.setText("");
			 
			}
			else {
				/*
				if(PiDigitRangeListener.sta == 1) {
					PiGame.a = PiDigitRangeListener.sta - 1;
					PiGame.b = PiDigitRangeListener.sta - 1;
					PiGame.f = PiDigitRangeListener.en + 1;
				}else {
				PiGame.a = PiDigitRangeListener.sta;
				PiGame.b = PiDigitRangeListener.sta;
				PiGame.f = PiDigitRangeListener.en + 1;
				}
				*/
				if(PiStartingNumberHandler.s == 1) {
					PiGame.a = PiStartingNumberHandler.s - 1;
					PiGame.b = PiStartingNumberHandler.s - 1;
					PiGame.f = PiFinalNumberHandler.e + 1;
				}else {
				PiGame.a = PiStartingNumberHandler.s;
				PiGame.b = PiStartingNumberHandler.s;
				PiGame.f = PiFinalNumberHandler.e + 1;
				}
				fails++;
				jltrys.setText("Fails: " + fails);
				jtf.setText("");
				jl.setText("");
				jl1.setText("");
				sf.playSound("/window/errorsound.wav");
			}
		 
		 
		 if(a == f) {
			 sf.playSound("/window/winsound.wav");
			 int answer = JOptionPane.showConfirmDialog(jf, "Fails: " + fails + "! Do you want to play again?", "Congratulations", JOptionPane.YES_NO_OPTION);
			 /*
			 if(PiDigitRangeListener.sta == 1) {
					PiGame.a = PiDigitRangeListener.sta - 1;
					PiGame.b = PiDigitRangeListener.sta - 1;
					PiGame.f = PiDigitRangeListener.en + 1;
				}else {
				PiGame.a = PiDigitRangeListener.sta;
				PiGame.b = PiDigitRangeListener.sta;
				PiGame.f = PiDigitRangeListener.en + 1;
				}
				*/
			 if(PiStartingNumberHandler.s == 1) {
					PiGame.a = PiStartingNumberHandler.s - 1;
					PiGame.b = PiStartingNumberHandler.s - 1;
					PiGame.f = PiFinalNumberHandler.e + 1;
				}else {
				PiGame.a = PiStartingNumberHandler.s;
				PiGame.b = PiStartingNumberHandler.s;
				PiGame.f = PiFinalNumberHandler.e + 1;
				}
		 if(answer == JOptionPane.YES_OPTION) {
			  jtf.setText("");
			  jl.setText("");
			  jl1.setText("");
			  fails = 0;
			  jltrys.setText("Fails: " + fails);
		 }
		 else {
			 jf.dispose();
		 } 
		 }
	}
	@Override
	public void keyTyped(KeyEvent e3) {
		
		
		
			
			
				
				
			}
			 
		
	
}
