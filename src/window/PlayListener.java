package window;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PlayListener implements ActionListener{
	
	PiMusic sf = new PiMusic();
	JScrollPane jsp;
	JTextField jtf;
	JLabel jl;
	JLabel jl1;
	JLabel jltrys;
	JLabel start;
	JTextField start1;
	JLabel end;
	JTextField end1;
	JCheckBox jcb;
	JTextArea jta;
	
	PlayListener(JTextField jtf, JLabel jl, JLabel jl1, JLabel jltrys, JScrollPane jsp, JLabel start, JTextField start1, JLabel end, JTextField end1, JCheckBox jcb) {
		this.jtf = jtf;
		this.jl = jl;
		this.jl1 = jl1;
		this.jltrys = jltrys;
		this.jsp = jsp;
		this.start = start;
		this.start1 = start1;
		this.end = end;
		this.end1 = end1;
		this.jcb = jcb;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
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
		sf.playSound("sound.wav");
		jtf.setBounds(415, 350, 70, 90);
		jl.setBounds(355, 357, 60, 76);
		jl1.setBounds(305, 364, 50, 62);
		jltrys.setBounds(629, 57, 203, 76);
		if(PiGame.f - PiGame.a < 121 && PiGame.a != 0) {
			
			jsp.setBounds(1000, 1000, 360, 220);
		}
		//Make JScrollPane larger for all amounts that are scrollable
		else {
			jsp.setBounds(1000, 1000, 375, 220);
		}
		
		
		//Because of the 3.1 you need to lower the limit, because the amount is earlier scrollable (1 and 100 -> 101 - 0 = 101 -> not scrollable, 6 rows)
		if(PiGame.a == 0 && PiGame.f - PiGame.a < 102) {
			jsp.setBounds(1000, 1000, 360, 220);
		}
		if(start1.getText().isEmpty() == true && end1.getText().isEmpty() == true) {
			 PiGame.a = 0;
			 PiGame.b = 0;
			 PiGame.f = 1001;
			 PiStartingNumberHandler.s = 0;
			 PiFinalNumberHandler.e = 1001;
			 start1.setText("");
			 end1.setText("");
			 PiCheckBoxListener.empty = false;
			 PiCheckBoxListener.higher = false;
		}
		
		if(PiCheckBoxListener.empty == true) {
			 PiGame.a = 0;
			 PiGame.b = 0;
			 PiGame.f = 1001;
			 PiStartingNumberHandler.s = 0;
			 PiFinalNumberHandler.e = 1001;
			 start1.setText("");
			 end1.setText("");
			 PiCheckBoxListener.empty = false;
			 PiCheckBoxListener.higher = false;
			 
		}
		if(PiCheckBoxListener.higher == true) {
			 PiGame.a = 0;
			 PiGame.b = 0;
			 PiGame.f = 1001;
			 PiStartingNumberHandler.s = 0;
			 PiFinalNumberHandler.e = 1001;
			 start1.setText("");
			 end1.setText("");
			 PiCheckBoxListener.empty = false;
			 PiCheckBoxListener.higher = false;
		}
		jl.setText("");
		jtf.setText("");
		jl1.setText("");
		start.setBounds(1000, 1000, 0, 0);
		start1.setBounds(1000, 1000, 0, 0);
		end.setBounds(1000, 1000, 0, 0);
		end1.setBounds(1000, 1000, 0, 0);
		jcb.setBounds(1000, 1000, 0, 0);
	}
	
	 

}
