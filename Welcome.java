package restuarent;


import javax.swing.JFrame;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JWindow;
import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Welcome {

	private JFrame welcome_frame;
	private static void splash_screen(){
		JWindow window = new JWindow();
		window.getContentPane();
		JLabel label = new JLabel("",new ImageIcon((Welcome.class.getResource("/Resource/loading2.gif"))),SwingConstants.CENTER);
		label.setBounds(0, 0, 360, 240);
		window.getContentPane().add(label);
		window.setBounds(450, 300, 360, 240);
		window.setVisible(true);
		try{
			Thread.sleep(5000);
		}catch(InterruptedException e){}
		
		window.dispose();
		return;
	}
	
	public static void main(String[] args) {	
		            splash_screen();
					Welcome window = new Welcome();
					window.welcome_frame.setVisible(true);


	}
	public Welcome() {
		initialize();
	}
	private void initialize() {
		welcome_frame = new JFrame();
		welcome_frame.setBackground(new Color(240, 240, 240));
		welcome_frame.setBounds(100, 100, 497, 500);
		welcome_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		welcome_frame.getContentPane().setLayout(null);
		
		JPanel welcome = new JPanel();
		welcome.setBackground(new Color(240, 240, 240));
		welcome.setBounds(0, 0, 488, 460);
		welcome_frame.getContentPane().add(welcome);
		welcome.setLayout(null);
		
		JLabel banner = new JLabel("");
		banner.setBounds(28, 11, 425, 118);
		banner.setForeground(new Color(0, 0, 0));
		banner.setIcon(new ImageIcon(Welcome.class.getResource("/Resource/images-picsay.jpg")));
		welcome.add(banner);
		
		JButton Restuarent = new JButton("RESTUARENT");
		Restuarent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				welcome_frame.setVisible(false);
				Food_item n = new Food_item("restuarent");
			}
		});
		Restuarent.setBackground(Color.CYAN);
		Restuarent.setIcon(new ImageIcon(Welcome.class.getResource("/Resource/restaurant.png")));
		Restuarent.setFont(new Font("Algerian", Font.BOLD | Font.ITALIC, 13));
		Restuarent.setBounds(263, 343, 190, 40);
		welcome.add(Restuarent);
		
		JButton online_button = new JButton("ONLINE");
		online_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				welcome_frame.setVisible(false);
				User_form n = new User_form("online");
			}
		});
		online_button.setBackground(Color.CYAN);
		online_button.setForeground(Color.BLACK);
		online_button.setIcon(new ImageIcon(Welcome.class.getResource("/Resource/shopping_cart_icon.png")));
		online_button.setFont(new Font("Algerian", Font.BOLD | Font.ITALIC, 13));
		online_button.setBounds(45, 343, 190, 40);
		welcome.add(online_button);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Welcome.class.getResource("/Resource/home.jpg")));
		label.setBounds(0, 0, 480, 460);
		welcome.add(label);
	}
}
