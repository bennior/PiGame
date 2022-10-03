package window;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class NumberListener implements ActionListener{
	
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
	
	NumberListener(JTextField jtf, JLabel jl, JLabel jl1, JLabel jltrys, JScrollPane jsp, JLabel start, JTextField start1, JLabel end, JTextField end1, JCheckBox jcb, JTextArea jta) {
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
		this.jta = jta;
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
		jtf.setBounds(1000, 1000, 0, 0);
		jl.setBounds(1000, 1000, 0, 0);
		jl1.setBounds(1000, 1000, 0, 0);
		jltrys.setBounds(1000, 1000, 0, 0);
		if(jcb.isSelected() == true) {
		if(PiGame.f - PiGame.a < 121 && PiGame.a != 0) {
			
			jsp.setBounds(270, 250, 360, 220);
		}
		//Make JScrollPane larger for all amounts that are scrollable
		else {
			jsp.setBounds(270, 250, 375, 220);
		}
		//Because of the 3.1 you need to lower the limit, because the amount is earlier scrollable (1 and 100 -> 101 - 0 = 101 -> not scrollable, 6 rows)
		if(PiGame.a == 0 && PiGame.f - PiGame.a < 102) {
			jsp.setBounds(270, 250, 360, 220);
		}
		} else {
			jta.setText(PiTextArea.pi);
			jsp.setBounds(270, 250, 375, 220);		
		}
		jl.setText("");
		jtf.setText("");
		jl1.setText("");
		end1.setBounds(692, 350, 120, 36);
		end.setBounds(692, 319, 120, 34);
		start1.setBounds(692, 273, 120, 36);
		start.setBounds(692, 240, 120, 34);
		jcb.setBounds(687, 405, 233, 36);	
		jta.setCaretPosition(0);
		}
}
