package restuarent;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Card_payment {

	private JFrame frame;
	private JTextField id_field;
	private JPasswordField password;
	public Card_payment() {
		initialize();
		frame.setVisible(true);
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
		
		JLabel Number = new JLabel("Account Number:");
		Number.setForeground(Color.ORANGE);
		Number.setBounds(10, 212, 135, 18);
		Number.setFont(new Font("Algerian", Font.BOLD | Font.ITALIC, 13));
		Number.setBackground(Color.PINK);
		panel.add(Number);
		
		id_field = new JTextField();
		id_field.setFont(new Font("Algerian", Font.BOLD | Font.ITALIC, 13));
		id_field.setBounds(151, 211, 319, 33);
		panel.add(id_field);
		id_field.setColumns(10);
		
		JLabel Passwrd = new JLabel("Password:");
		Passwrd.setFont(new Font("Algerian", Font.BOLD | Font.ITALIC, 13));
		Passwrd.setBackground(Color.PINK);
		Passwrd.setForeground(Color.ORANGE);
		Passwrd.setBounds(10, 270, 90, 14);
		panel.add(Passwrd);
		
		password = new JPasswordField();
		password.setBounds(126, 267, 344, 27);
		panel.add(password);
		
		
		JButton confirm = new JButton("CONFIRM");
		confirm.setBackground(Color.LIGHT_GRAY);
		confirm.setIcon(new ImageIcon(Card_payment.class.getResource("/Resource/confirm.jpg")));
		confirm.setFont(new Font("Algerian", Font.BOLD | Font.ITALIC, 13));
		confirm.setBounds(139, 339, 147, 40);
		panel.add(confirm);
		confirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					BufferedReader read =new BufferedReader(new FileReader(new File("/J:/T@RiK's Project/Restuarent_management/id.txt")));
					
					while(read.readLine()!=null){
						String r = read.readLine();
						StringTokenizer b = new StringTokenizer(r,"$");
						String id= id_field.getText();
						String pwd = new String(password.getPassword());
						
						String token = b.nextToken();
					
						token.trim();
						id.trim();
						pwd.trim();
						if(id.equals(token))
						{
							token =  b.nextToken();
							token.trim();
						
							if(pwd.equals(token)){
			
								frame.setVisible(false);
								Last_page lp =new Last_page();
							}
						}
					}
				} catch (FileNotFoundException e1) {
					
				} catch (IOException e1) {
					
					
					
				}
				
			
			}
		});
		
		
		JButton Retry = new JButton("Retry");
		Retry.setIcon(new ImageIcon(Card_payment.class.getResource("/Resource/retry.jpg")));
		Retry.setSelectedIcon(null);
		Retry.setFont(new Font("Algerian", Font.BOLD | Font.ITALIC, 13));
		Retry.setBounds(296, 339, 135, 40);
		panel.add(Retry);
		
		
		
		JLabel label = new JLabel("");
		label.setForeground(Color.ORANGE);
		label.setIcon(new ImageIcon(Card_payment.class.getResource("/Resource/login_background.jpg")));
		label.setBounds(0, 0, 480, 460);
		panel.add(label);
	}
	
}
