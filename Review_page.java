package restuarent;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JButton;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.Color;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Review_page {

	public JFrame review_frame;
	private JTextPane review;
	public void initialize() {
		review_frame = new JFrame();
		review_frame.setBounds(100, 100, 497, 500);
		review_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		review_frame.getContentPane().setLayout(null);
		
	    review = new JTextPane();
		review.setBounds(22, 89, 437, 301);
		review_frame.getContentPane().add(review);
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				get_review();
				Review_page rp = new Review_page();
				rp.initialize();
				rp.review_frame.setVisible(true);
			}
		});
		btnSubmit.setFont(new Font("Algerian", Font.BOLD | Font.ITALIC, 15));
		btnSubmit.setBounds(309, 401, 145, 37);
		review_frame.getContentPane().add(btnSubmit);
		
		JLabel lblEnterYourOpinioncomplain = new JLabel("Enter Your Opinion,Complain and Review");
		lblEnterYourOpinioncomplain.setForeground(Color.CYAN);
		lblEnterYourOpinioncomplain.setFont(new Font("Algerian", Font.BOLD | Font.ITALIC, 13));
		lblEnterYourOpinioncomplain.setBounds(22, 55, 338, 23);
		review_frame.getContentPane().add(lblEnterYourOpinioncomplain);
		
		JLabel label = new JLabel("");
		label.setForeground(Color.CYAN);
		label.setIcon(new ImageIcon(Review_page.class.getResource("/Resource/review_background.jpg")));
		label.setBounds(0, 0, 480, 460);
		review_frame.getContentPane().add(label);
	}
	private void get_review(){
		String r = review.getText();
		try {
			  FileWriter fWriter = new FileWriter("/J:/T@RiK's Project/Restuarent_management/reviwe.txt");
			  BufferedWriter writer = new BufferedWriter(fWriter);
	          writer.write(r);
	          writer.newLine();
	          writer.newLine();
	          writer.newLine();
	          writer.close();
	        } catch (Exception e) {
	        	
	        }
		}
		
}
