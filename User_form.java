package restuarent;



import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.StringTokenizer;

import javax.swing.JFormattedTextField;

public class User_form {
	
	private String status;
	private JFrame onlne_order;
	private JTextField usrnm;
	private JTextField cntct;
	private JTextField vill;
	private JTextField AREA;
	private JTextField cty;
	public User_form(String status) {
		this.status = status;
		initialize();
		onlne_order.setVisible(true);
	}
	private void initialize() {
		onlne_order = new JFrame();
		onlne_order.setBounds(100, 100, 497, 500);
		onlne_order.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		onlne_order.getContentPane().setLayout(null);
		
		JLabel username = new JLabel("username:");
		username.setFont(new Font("Algerian", Font.BOLD | Font.ITALIC, 13));
		username.setBounds(37, 67, 100, 30);
		onlne_order.getContentPane().add(username);
		
		usrnm = new JTextField();
		usrnm.setBounds(121, 72, 324, 20);
		onlne_order.getContentPane().add(usrnm);
		usrnm.setColumns(10);
		
		
		JLabel cntctnmb = new JLabel("contact number:");
		cntctnmb.setFont(new Font("Algerian", Font.BOLD | Font.ITALIC, 13));
		cntctnmb.setBounds(37, 128, 161, 30);
		onlne_order.getContentPane().add(cntctnmb);
		
		cntct = new JTextField();
		cntct.setBounds(173, 133, 272, 20);
		onlne_order.getContentPane().add(cntct);
		cntct.setColumns(10);
		
		
		JLabel Addres = new JLabel("ADRESS:\r\n");
		Addres.setFont(new Font("Algerian", Font.BOLD | Font.ITALIC, 13));
		Addres.setBounds(37, 169, 100, 30);
		onlne_order.getContentPane().add(Addres);
		
		JLabel vi = new JLabel("House No.:");
		vi.setFont(new Font("Algerian", Font.ITALIC, 13));
		vi.setBounds(36, 210, 138, 20);
		onlne_order.getContentPane().add(vi);
		
		vill = new JTextField();
		vill.setBounds(104, 210, 341, 20);
		onlne_order.getContentPane().add(vill);
		vill.setColumns(10);
		 
		
		JLabel than = new JLabel("Village/AREA:");
		than.setFont(new Font("Algerian", Font.ITALIC, 13));
		than.setBounds(37, 241, 125, 20);
		onlne_order.getContentPane().add(than);
		
		AREA = new JTextField();
		AREA.setBounds(138, 241, 307, 20);
		onlne_order.getContentPane().add(AREA);
		AREA.setColumns(10);
		
		
		
		JLabel ct = new JLabel("CITY:");
		ct.setFont(new Font("Algerian", Font.ITALIC, 13));
		ct.setBounds(37, 272, 46, 20);
		onlne_order.getContentPane().add(ct);
		
		cty = new JTextField();
		cty.setBounds(75, 272, 370, 20);
		onlne_order.getContentPane().add(cty);
		cty.setColumns(10);
		
		JButton cnfrm = new JButton("CONFIRM");
		cnfrm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				write_data();
				onlne_order.setVisible(false);
				Food_item p = new Food_item(status);
			
			}
		});
		cnfrm.setBackground(Color.PINK);
		cnfrm.setIcon(new ImageIcon(User_form.class.getResource("/Resource/confirm.png")));
		cnfrm.setFont(new Font("Algerian", Font.BOLD | Font.ITALIC, 13));
		cnfrm.setBounds(138, 320, 138, 40);
		onlne_order.getContentPane().add(cnfrm);
		
		JButton reset = new JButton("RESET");
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				User_form p = new User_form(status);
			}
		});
		reset.setBackground(Color.PINK);
		reset.setIcon(new ImageIcon(User_form.class.getResource("/Resource/reset.png")));
		reset.setFont(new Font("Algerian", Font.BOLD | Font.ITALIC, 13));
		reset.setBounds(286, 320, 159, 40);
		onlne_order.getContentPane().add(reset);
		
		JLabel bckgrnd = new JLabel("");
		bckgrnd.setIcon(new ImageIcon(User_form.class.getResource("/Resource/2nd_img.jpg")));
		bckgrnd.setBounds(0, 0, 480, 460);
		onlne_order.getContentPane().add(bckgrnd);
		
		
		
	}
	void write_data() 
	{
		String u = usrnm.getText();
		String v = cntct.getText();
		String w = AREA.getText();
		String x =cty.getText();
		
		
		String s = status+"$"+u+"$"+v+"$"+w+"$"+x;
		File nf = new File("/J:/T@RiK's Project/Restuarent_management/locatn.txt");
		BufferedWriter bw = null;
		FileWriter fw = null;

		try {
			fw = new FileWriter(nf,true);
			bw = new BufferedWriter(fw);
			bw.write(s);
			bw.newLine();
			bw.close();

		} catch (Exception e) {

			onlne_order.setVisible(false);
			Food_item p = new Food_item(status);

		}
	}
}
