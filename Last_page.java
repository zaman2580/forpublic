package restuarent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Last_page {

	private JFrame end;

	public Last_page() {
		initialize();
		end.setVisible(true);
	}

	private void initialize() {
		end = new JFrame();
		end.setBounds(100, 100, 497, 500);
		end.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		end.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 480, 460);
		end.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnReview = new JButton("Review");
		btnReview.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Review_page rp = new Review_page();
				rp.initialize();
				rp.review_frame.setVisible(true);
			}
		});
		btnReview.setForeground(Color.PINK);
		btnReview.setBackground(Color.GREEN);
		btnReview.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD | Font.ITALIC, 16));
		btnReview.setBounds(300, 339, 104, 36);
		panel.add(btnReview);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(Last_page.class.getResource("/Resource/Thank_You.png")));
		label_1.setBounds(0, 0, 480, 201);
		panel.add(label_1);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 480, 460);
		label.setIcon(new ImageIcon(Last_page.class.getResource("/Resource/final_page.jpg")));
		panel.add(label);
	}

}
