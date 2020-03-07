package Start;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Manager.*;
import Person.*;

//아직 미완성^^
public class Pay extends JFrame{
	
	JPanel btnPanel = new JPanel();
	JButton btn1,btn2;
	
	public Pay(int money,Person man,boolean isTime) {
		
		if(isTime) {
			PayMoney((int) (money*(1-man.getSaleRatio())));
		}
		else {
			PayMoney(money);
		}
	}
	
	public void PayMoney(int money) {
		
		setTitle("결제");
		this.setSize(500, 150);
		this.setLocation(500, 300); 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		btn1 = new JButton("카드");
		btn1.setFont(new Font("SansSerif",Font.BOLD,10));
		btn1.setPreferredSize(new Dimension(80,80));
		btn2 = new JButton("현금");
		btn2.setFont(new Font("SansSerif",Font.BOLD,10));
		btn2.setPreferredSize(new Dimension(80,80));
		
		btnPanel.setBackground(Color.white);
		btnPanel.add(btn1);
		btnPanel.add(btn2);
		this.setVisible(true);
	}
}
