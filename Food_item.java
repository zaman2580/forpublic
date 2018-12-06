package restuarent;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JCheckBox;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JTextField;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

import java.io.BufferedWriter;

import java.io.FileWriter;


import javax.swing.ImageIcon;

public class Food_item {

	public String status;
	private JFrame item;
	private JTextField Pizzat;
	private JTextField Burgert;
	private JTextField Sandwicht;
	private JTextField ChickenFryt;
	private JTextField Noodlest;
	private JTextField Lassit;
	private JTextField Colddrinkst;
	private JTextField Watert;
	private int bill = 0;
	private int total_bill = 0;
	public Food_item(String status) {
		this.status = status;
		initialize();
		item.setVisible(true);
	}
	private void initialize() {
		item = new JFrame();
		item.setBounds(100, 100, 497, 500);
		item.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		item.getContentPane().setLayout(null);
		
		JPanel itempanel = new JPanel();
		itempanel.setBounds(0, 0, 481, 461);
		item.getContentPane().add(itempanel);
		itempanel.setLayout(null);
		
		JCheckBox Pizza = new JCheckBox("1. PIZZA(100 Taka)");
		Pizza.setFont(new Font("Algerian", Font.BOLD | Font.ITALIC, 13));
		Pizza.setBounds(40, 91, 178, 23);
		itempanel.add(Pizza);
		
		JCheckBox Burger = new JCheckBox("2.Burger(80 Taka)");
		Burger.setFont(new Font("Algerian", Font.BOLD | Font.ITALIC, 13));
		Burger.setBounds(40, 117, 178, 23);
		itempanel.add(Burger);
		
		JCheckBox Sandwich = new JCheckBox("3.Sandwich(60 taka)");
		Sandwich.setFont(new Font("Algerian", Font.BOLD | Font.ITALIC, 13));
		Sandwich.setBounds(40, 143, 200, 23);
		itempanel.add(Sandwich);
		
		JCheckBox ChickenFry = new JCheckBox("4.Chicken Fry(90 taka)");
		ChickenFry.setFont(new Font("Algerian", Font.BOLD | Font.ITALIC, 13));
		ChickenFry.setBounds(40, 169, 213, 23);
		itempanel.add(ChickenFry);
		
		JCheckBox Noodles = new JCheckBox("5.Noodles(70 taka)");
		Noodles.setFont(new Font("Algerian", Font.BOLD | Font.ITALIC, 13));
		Noodles.setBounds(40, 195, 178, 23);
		itempanel.add(Noodles);
		
		JCheckBox Lassi = new JCheckBox("6.Lassi(80 taka)");
		Lassi.setFont(new Font("Algerian", Font.BOLD | Font.ITALIC, 13));
		Lassi.setBounds(40, 221, 163, 23);
		itempanel.add(Lassi);
		
		JCheckBox Colddrinks = new JCheckBox("7.Cold Drinks(20 taka)");
		Colddrinks.setFont(new Font("Algerian", Font.BOLD | Font.ITALIC, 13));
		Colddrinks.setBounds(40, 247, 213, 23);
		itempanel.add(Colddrinks);
		
		JCheckBox Water = new JCheckBox("8.Water(15 taka)");
		Water.setFont(new Font("Algerian", Font.BOLD | Font.ITALIC, 13));
		Water.setBounds(40, 273, 178, 23);
		itempanel.add(Water);
		
		JLabel Amount = new JLabel("Amount(only number):");
		Amount.setFont(new Font("Algerian", Font.BOLD | Font.ITALIC, 13));
		Amount.setBounds(219, 46, 192, 30);
		itempanel.add(Amount);
		
		Pizzat = new JTextField();
		Pizzat.setBounds(307, 92, 86, 20);
		itempanel.add(Pizzat);
		Pizzat.setColumns(10);
		
		Burgert = new JTextField();
		Burgert.setColumns(10);
		Burgert.setBounds(307, 118, 86, 20);
		itempanel.add(Burgert);
		
		Sandwicht = new JTextField();
		Sandwicht.setColumns(10);
		Sandwicht.setBounds(307, 144, 86, 20);
		itempanel.add(Sandwicht);
		
		ChickenFryt = new JTextField();
		ChickenFryt.setColumns(10);
		ChickenFryt.setBounds(307, 170, 86, 20);
		itempanel.add(ChickenFryt);
		
		Noodlest = new JTextField();
		Noodlest.setColumns(10);
		Noodlest.setBounds(307, 196, 86, 20);
		itempanel.add(Noodlest);
		
		Lassit = new JTextField();
		Lassit.setColumns(10);
		Lassit.setBounds(307, 222, 86, 20);
		itempanel.add(Lassit);
		
		Colddrinkst = new JTextField();
		Colddrinkst.setColumns(10);
		Colddrinkst.setBounds(307, 248, 86, 20);
		itempanel.add(Colddrinkst);
		
		Watert = new JTextField();
		Watert.setColumns(10);
		Watert.setBounds(307, 274, 86, 20);
		itempanel.add(Watert);
		
		JButton PlaceOrder = new JButton("Place Order");
		PlaceOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				total_bill = handlecheckbox(Pizza, Burger, Sandwich, ChickenFry, Noodles, Lassi, Colddrinks, Water);
				if(total_bill == 0)
				{
					item.setVisible(false);
					Food_item p = new Food_item(status);
				}
				else
				{
					item.setVisible(false);
					bill_processing b = new bill_processing(bill);
				}
			}
		});
		PlaceOrder.setForeground(Color.LIGHT_GRAY);
		PlaceOrder.setBackground(Color.BLUE);
		PlaceOrder.setFont(new Font("Algerian", Font.BOLD | Font.ITALIC, 13));
		PlaceOrder.setBounds(152, 340, 131, 40);
		itempanel.add(PlaceOrder);
		
		JButton Refresh = new JButton("Refresh");
		Refresh.setForeground(Color.LIGHT_GRAY);
		Refresh.setBackground(Color.BLUE);
		Refresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				item.setVisible(false);
				Food_item p = new Food_item(status);
			}
		});
		Refresh.setFont(new Font("Algerian", Font.BOLD | Font.ITALIC, 13));
		Refresh.setBounds(293, 340, 100, 40);
		itempanel.add(Refresh);
		
		JLabel lblOrder = new JLabel("ORDER");
		lblOrder.setForeground(Color.BLUE);
		lblOrder.setFont(new Font("Algerian", Font.BOLD | Font.ITALIC, 20));
		lblOrder.setBounds(40, 11, 114, 40);
		itempanel.add(lblOrder);
		
		JLabel order_background = new JLabel("");
		order_background.setIcon(new ImageIcon(Food_item.class.getResource("/Resource/item.jpg")));
		order_background.setBounds(0, 0, 480, 460);
		itempanel.add(order_background);
		
	}
	
	private int handlecheckbox(JCheckBox Pizza,JCheckBox Burger,JCheckBox Sandwich,JCheckBox ChickenFry,JCheckBox Noodles,JCheckBox Lassi,JCheckBox Colddrinks,JCheckBox Water)
	{
		int count = 0;
		write(status+"&");
		bill = 0;
		total_bill = 0;
		if(Pizza.isSelected())
		{
			int p = Integer.parseInt(Pizzat.getText());
			bill = bill + p*100 ;
			String order ="Pizza"+"&"+p+"&";
			count++;
			write(order);
		}
		if(Burger.isSelected())
		{
			int p = Integer.parseInt(Burgert.getText());
			bill = bill + p*80 ;
			String order = "Burger"+"&"+p+"&";
			count++;
			write(order);
		}
		if(Sandwich.isSelected())
		{
			int p = Integer.parseInt(Sandwicht.getText());
			bill = bill + p*60 ;
			String order ="Sandwich"+"&"+p+"&";
			count++;
			write(order);
		}
		if(ChickenFry.isSelected())
		{
			int p = Integer.parseInt(ChickenFryt.getText());
			bill = bill + p*90 ;
			String order = "Burger"+"&"+p+"&";
			count++;
			write(order);
		}
		if(Noodles.isSelected())
		{
			int p = Integer.parseInt(Noodlest.getText());
			bill = bill + p*70 ;
			count++;
			String order ="Noodles"+"&"+p+"&";
			write(order);
		}
		if(Lassi.isSelected())
		{
			int p = Integer.parseInt(Lassit.getText());
			bill = bill + p*80 ;
			String order = "Lassi"+"&"+p+"&";
			count++;
			write(order);
		}
		if(Colddrinks.isSelected())
		{
			int p = Integer.parseInt(Colddrinkst.getText());
			bill = bill + p*20 ;
			String order = "Colddrinkst"+"&"+p+"&";
			count++;
			write(order);
	
		}
		if(Water.isSelected())
		{
			int p = Integer.parseInt(Watert.getText());
			bill = bill + p*15 ;
			String order = "Water"+"&"+p+"&";
			count++;
			write(order);
			
		}
		if(count!= 0)
		{
			write("0");
		}
		else
		{
			item.setVisible(false);
			Food_item p = new Food_item(status);
		}
		return bill;
	}

	void write(String s) 
	{
	
		try {
			BufferedWriter bw = null;
			FileWriter fw = new FileWriter("/J:/T@RiK's Project/Restuarent_management/item.txt",true);
		bw = new BufferedWriter(fw);
		bw.write(s);
		bw.close();
		
		} catch (Exception e) {

			item.setVisible(false);
			Food_item p = new Food_item(status);

		}
	}
}
