package restuarent;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.Color;

import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Bkash {

	private JFrame frame;
	private JTextField textField;


	public Bkash() {
		initialize();
	}
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 497, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 480, 460);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblEnterTransectionId = new JLabel("Enter Transection ID:");
		lblEnterTransectionId.setFont(new Font("Algerian", Font.BOLD | Font.ITALIC, 13));
		lblEnterTransectionId.setBounds(37, 132, 197, 29);
		panel.add(lblEnterTransectionId);
		
		textField = new JTextField();
		textField.setBounds(37, 172, 368, 29);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnVerify = new JButton("VERIFY");
		btnVerify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Last_page lp =new Last_page();
			}
		});
		btnVerify.setBackground(Color.CYAN);
		btnVerify.setForeground(Color.BLUE);
		btnVerify.setFont(new Font("Algerian", Font.BOLD | Font.ITALIC, 13));
		btnVerify.setBounds(316, 254, 89, 23);
		panel.add(btnVerify);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Bkash.class.getResource("/Resource/bksh.jpg")));
		label.setBounds(0, 0, 480, 460);
		panel.add(label);
	}

}
