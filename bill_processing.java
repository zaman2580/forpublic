package restuarent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

import javax.swing.JLabel;


public class bill_processing {
	public int bill;
	private JFrame bill_process;

	public bill_processing(int bill) {
		this.bill = bill;
		initialize();
		bill_process.setVisible(true);
	}
	private void initialize() {
		bill_process = new JFrame();
		bill_process.setBounds(100, 100, 497, 500);
		bill_process.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bill_process.getContentPane().setLayout(null);
		
		JButton pay_with_card = new JButton("Pay with  card");
		pay_with_card.setForeground(Color.GREEN);
		pay_with_card.setBackground(Color.BLUE);
		pay_with_card.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				bill_process.setVisible(false);
				Card_payment window = new Card_payment();
			}
		});
		pay_with_card.setFont(new Font("Algerian", Font.BOLD | Font.ITALIC, 13));
		pay_with_card.setIcon(new ImageIcon(bill_processing.class.getResource("/Resource/card_logo.png")));
		pay_with_card.setSelectedIcon(new ImageIcon(bill_processing.class.getResource("/Resource/card_logo.png")));
		pay_with_card.setBounds(150, 262, 210, 43);
		bill_process.getContentPane().add(pay_with_card);
		
		JButton pay_with_bkash = new JButton("Pay with  bkash");
		pay_with_bkash.setBackground(Color.BLUE);
		pay_with_bkash.setForeground(Color.GREEN);
		pay_with_bkash.setFont(new Font("Algerian", Font.BOLD | Font.ITALIC, 13));
		pay_with_bkash.setIcon(new ImageIcon(bill_processing.class.getResource("/Resource/bkash_logo.jpg")));
		pay_with_bkash.setSelectedIcon(null);
		pay_with_bkash.setBounds(150, 316, 210, 43);
		bill_process.getContentPane().add(pay_with_bkash);
		
		JLabel lblYourTotalBill =   new JLabel("YOUR TOTAL BILL IS:   "+ bill);
		lblYourTotalBill.setFont(new Font("Algerian", Font.BOLD | Font.ITALIC, 13));
		lblYourTotalBill.setForeground(Color.BLACK);
		lblYourTotalBill.setBackground(Color.CYAN);
		lblYourTotalBill.setBounds(44, 103, 405, 52);
		bill_process.getContentPane().add(lblYourTotalBill);
		
		JLabel bill_show = new JLabel("");
		bill_show.setFont(new Font("Algerian", Font.BOLD | Font.ITALIC, 13));
		bill_show.setForeground(Color.BLACK);
		bill_show.setBackground(Color.CYAN);
		bill_show.setIcon(new ImageIcon(bill_processing.class.getResource("/Resource/background_payment.jpg")));
		bill_show.setBounds(0, 0, 480, 460);
		bill_process.getContentPane().add(bill_show);
	}
}
