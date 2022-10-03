package window;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import javax.swing.text.PlainDocument;
import javax.swing.text.DocumentFilter.FilterBypass;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JCheckBox;

public class PiWindowBuilder {

	JFrame frame;
	Font schriftSmall = new Font("Monospaced", Font.BOLD, 80);
	Font schriftSmaller = new Font("Monospaced", Font.BOLD, 60);
	Font schrift = new Font("Monospaced", Font.BOLD, 30);
	Font schriftinput = new Font("Monospaced", Font.BOLD, 13);
	Font schrifttf = new Font("Monospaced", Font.BOLD, 37);

	
	  //Create the application.
	  //@wbp.parser.entryPoint
	 
	public PiWindowBuilder() throws IOException {
		
		frame = new PiFrame();
		
		JButton btnNewButton = new PiButton1();
		JTextArea textArea = new PiTextArea();
		JTextField textField = new PiTextField();
		JButton btnNewButton_1 = new PiButton2();
		JLabel lblNewLabel_1 = new JLabel("");
		JLabel lblNewLabel_2 = new JLabel("");

		//scrollPane
		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setBounds(1000, 1000, 375, 220); //270, 250, 360, 220
		scrollPane.setOpaque(false);
		scrollPane.getViewport().setOpaque(false);
		//textField
		textField.setBounds(415, 350, 70, 90);
		 PlainDocument doc = (PlainDocument) textField.getDocument();
	      doc.setDocumentFilter(new DocumentFilter() {
	         private boolean isValid(String testText) {
	            if (testText.length() > 1) {
	               return false;
	            }
	            if (testText.isEmpty()) {
	               return true;
	            }
	            int intValue = 0;
	            try {
	               intValue = Integer.parseInt(testText.trim());
	            } catch (NumberFormatException e) {
	               return false;
	            }
	            if (intValue < 0 || intValue > 9) {
	               return false;
	            }
	            return true; 
	         }
	         @Override
	         public void insertString(FilterBypass fb, int offset, String text,
	               AttributeSet attr) throws BadLocationException {
	            StringBuilder sb = new StringBuilder();
	            sb.append(fb.getDocument().getText(0, fb.getDocument().getLength()));
	            sb.insert(offset, text);
	            if (isValid(sb.toString())) {
	               super.insertString(fb, offset, text, attr);
	            }
	         }
	         @Override
	         public void replace(FilterBypass fb, int offset, int length,
	               String text, AttributeSet attrs) throws BadLocationException {
	            StringBuilder sb = new StringBuilder();
	            sb.append(fb.getDocument().getText(0, fb.getDocument().getLength()));
	            int end = offset + length;
	            sb.replace(offset, end, text);
	            if (isValid(sb.toString())) {
	               super.replace(fb, offset, length, text, attrs);
	            }
	         }
	         @Override
	         public void remove(FilterBypass fb, int offset, int length)
	               throws BadLocationException {
	            StringBuilder sb = new StringBuilder();
	            sb.append(fb.getDocument().getText(0, fb.getDocument().getLength()));
	            int end = offset + length;
	            sb.delete(offset, end);
	            if (isValid(sb.toString())) {
	               super.remove(fb, offset, length);
	            }
	         }
	      });
		//JButton1
		btnNewButton.setBounds(100 , 600, 300, 100);
		//JButton2
		btnNewButton_1.setBounds(500 , 600, 300, 100);
		//JLabel
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(schriftSmall);
		lblNewLabel.setBounds(352, 350, 59, 90);
		//2.JLabel
		lblNewLabel_1.setBounds(305, 364, 50, 62);
		lblNewLabel_1.setFont(schriftSmaller);
		//JLabel Trys
		lblNewLabel_2.setBounds(629, 57, 203, 76);
		lblNewLabel_2.setFont(schrift);
		//PiImagePanel
		PiImagePanel backgroundImgPanel = new PiImagePanel();
		backgroundImgPanel.setVisible(true);
		backgroundImgPanel.setBounds(0, 0, 900, 900);
		
		//TextField starting number
		JTextField textField_1 = new JTextField();
		textField_1.setBounds(1000, 1000, 120, 36);
		textField_1.setColumns(10);
		textField_1.setFont(schrifttf);
		 PlainDocument doc0 = (PlainDocument) textField_1.getDocument();
	      doc0.setDocumentFilter(new DocumentFilter() {
	         private boolean isValid(String testText) {
	            if (testText.length() > 4) {
	               return false;
	            }
	            if (testText.isEmpty()) {
	               return true;
	            }
	            int intValue = 0;
	            try {
	               intValue = Integer.parseInt(testText.trim());
	            } catch (NumberFormatException e) {
	               return false;
	            }
	            if (intValue < 1 || intValue > 1000) {
	               return false;
	            }
	            return true; 
	         }
	         @Override
	         public void insertString(FilterBypass fb, int offset, String text,
	               AttributeSet attr) throws BadLocationException {
	            StringBuilder sb = new StringBuilder();
	            sb.append(fb.getDocument().getText(0, fb.getDocument().getLength()));
	            sb.insert(offset, text);
	            if (isValid(sb.toString())) {
	               super.insertString(fb, offset, text, attr);
	            }
	         }
	         @Override
	         public void replace(FilterBypass fb, int offset, int length,
	               String text, AttributeSet attrs) throws BadLocationException {
	            StringBuilder sb = new StringBuilder();
	            sb.append(fb.getDocument().getText(0, fb.getDocument().getLength()));
	            int end = offset + length;
	            sb.replace(offset, end, text);
	            if (isValid(sb.toString())) {
	               super.replace(fb, offset, length, text, attrs);
	            }
	         }
	         @Override
	         public void remove(FilterBypass fb, int offset, int length)
	               throws BadLocationException {
	            StringBuilder sb = new StringBuilder();
	            sb.append(fb.getDocument().getText(0, fb.getDocument().getLength()));
	            int end = offset + length;
	            sb.delete(offset, end);
	            if (isValid(sb.toString())) {
	               super.remove(fb, offset, length);
	            }
	         }
	      });
		//Label starting number
		JLabel lblNewLabel_3 = new JLabel("Starting number");
		lblNewLabel_3.setBounds(1000, 1000, 120, 34);
		lblNewLabel_3.setFont(schriftinput);
		
		//TextField final number
		JTextField textField_2 = new JTextField();
		textField_2.setBounds(1000, 1000, 120, 36);
		textField_2.setColumns(10);
		textField_2.setFont(schrifttf);
		PlainDocument doc1 = (PlainDocument) textField_2.getDocument();
	      doc1.setDocumentFilter(new DocumentFilter() {
	         private boolean isValid(String testText) {
	            if (testText.length() > 4) {
	               return false;
	            }
	            if (testText.isEmpty()) {
	               return true;
	            }
	            int intValue = 0;
	            try {
	               intValue = Integer.parseInt(testText.trim());
	            } catch (NumberFormatException e) {
	               return false;
	            }
	            if (intValue < 1 || intValue > 1000) {
	               return false;
	            }
	            return true; 
	         }
	         @Override
	         public void insertString(FilterBypass fb, int offset, String text,
	               AttributeSet attr) throws BadLocationException {
	            StringBuilder sb = new StringBuilder();
	            sb.append(fb.getDocument().getText(0, fb.getDocument().getLength()));
	            sb.insert(offset, text);
	            if (isValid(sb.toString())) {
	               super.insertString(fb, offset, text, attr);
	            }
	         }
	         @Override
	         public void replace(FilterBypass fb, int offset, int length,
	               String text, AttributeSet attrs) throws BadLocationException {
	            StringBuilder sb = new StringBuilder();
	            sb.append(fb.getDocument().getText(0, fb.getDocument().getLength()));
	            int end = offset + length;
	            sb.replace(offset, end, text);
	            if (isValid(sb.toString())) {
	               super.replace(fb, offset, length, text, attrs);
	            }
	         }
	         @Override
	         public void remove(FilterBypass fb, int offset, int length)
	               throws BadLocationException {
	            StringBuilder sb = new StringBuilder();
	            sb.append(fb.getDocument().getText(0, fb.getDocument().getLength()));
	            int end = offset + length;
	            sb.delete(offset, end);
	            if (isValid(sb.toString())) {
	               super.remove(fb, offset, length);
	            }
	         }
	      });
		//Label final number
		JLabel lblNewLabel_4 = new JLabel("Final number");
		lblNewLabel_4.setBounds(1000, 1000, 120, 34);
		lblNewLabel_4.setFont(schriftinput);

		
		//CheckBox
		JCheckBox chckbxNewCheckBox = new JCheckBox("Show selected Numbers");
		chckbxNewCheckBox.setBounds(1000, 1000, 0, 0);
		chckbxNewCheckBox.setFont(schriftinput);
		chckbxNewCheckBox.setOpaque(false);

		
		//JFrame
		PiCheckBoxListener cblistener = new PiCheckBoxListener(textArea, scrollPane, textField_1, textField_2, frame);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btnNewButton);
		frame.getContentPane().add(btnNewButton_1);
		frame.getContentPane().add(textField);
		frame.getContentPane().setBackground(Color.GREEN);
		frame.getContentPane().add(lblNewLabel);
		frame.getContentPane().add(lblNewLabel_1);
		frame.getContentPane().add(lblNewLabel_2);
		frame.getContentPane().add(scrollPane);
		frame.getContentPane().add(textField_1);
		frame.getContentPane().add(textField_2);
		frame.getContentPane().add(lblNewLabel_3);
		frame.getContentPane().add(lblNewLabel_4);
		frame.getContentPane().add(chckbxNewCheckBox);
		frame.getContentPane().add(backgroundImgPanel);
		textField.addKeyListener(new PiGame(textField, lblNewLabel, lblNewLabel_1, frame, lblNewLabel_2, textArea));
		btnNewButton.addActionListener(new PlayListener(textField, lblNewLabel, lblNewLabel_1, lblNewLabel_2, scrollPane, lblNewLabel_3, textField_1, lblNewLabel_4, textField_2, chckbxNewCheckBox));
		btnNewButton_1.addActionListener(new NumberListener(textField, lblNewLabel, lblNewLabel_1, lblNewLabel_2, scrollPane, lblNewLabel_3, textField_1, lblNewLabel_4, textField_2, chckbxNewCheckBox, textArea));
		chckbxNewCheckBox.addItemListener(cblistener);
		textField_1.addKeyListener(new PiStartingNumberHandler(textField_1, textField_2, cblistener, chckbxNewCheckBox));
		textField_2.addKeyListener(new PiFinalNumberHandler(textField_1, textField_2, cblistener, chckbxNewCheckBox));

		

		initialize();
	}

	
	 //Initialize the contents of the frame.
	 //@wbp.parser.entryPoint
	 
	private void initialize() {
		
	}
}
