package Start;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import Manager.Sales;
import Person.*;
import Seat.Seat;

//ī��or���� ���ý� �ȳѾ
public class Pay extends JFrame{
	
	JLabel info,cost;
	JPanel btnPanel = new JPanel();
	JButton btn1,btn2;
	Integer money;
	//time
	public Pay(int m,Person user) {
		money = m;
		
		setTitle("����");
		this.setSize(300, 250);
		this.setLocation(600, 300); 
		
		info = new JLabel(user.getID()+" ��");
		info.setFont(new Font("SansSerif",Font.BOLD,15));
		info.setPreferredSize(new Dimension(200,30));
		cost = new JLabel("�����ݾ��� "+money.toString()+" �� �Դϴ�.");
		cost.setFont(new Font("SansSerif",Font.BOLD,15));
		cost.setPreferredSize(new Dimension(200,40));
		btn1 = new JButton("ī��");
		btn1.setFont(new Font("SansSerif",Font.BOLD,18));
		btn1.setPreferredSize(new Dimension(80,80));
		btn1.addActionListener(new timeActionListener(user));
		btn2 = new JButton("����");
		btn2.setFont(new Font("SansSerif",Font.BOLD,18));
		btn2.setPreferredSize(new Dimension(80,80));
		btn2.addActionListener(new timeActionListener(user));
		
		btnPanel.setBackground(Color.white);
		btnPanel.add(info,null);
		btnPanel.add(cost,null);
		btnPanel.add(btn1);
		btnPanel.add(btn2);
		btnPanel.setLayout(new FlowLayout());
		this.add(btnPanel,null);
		this.setVisible(true);
	}
	
	class timeActionListener implements ActionListener {
		
		Person user = new Person();
		
		timeActionListener(Person user) {
			this.user = user;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == btn1) {
				Sales.Card += money*(1-user.getSaleRatio());
				Sales.Hour += money/1000;
				user.setRestTime(user.getRestTime()+money/1000);
				if(user.getID().charAt(0)!='��') {
					changeTotalTime((Member)user);
				}
				JOptionPane.showMessageDialog(null, "ī�� ���� �Ǿ����ϴ�.", "Message", JOptionPane.INFORMATION_MESSAGE); 
				dispose();
				if(user.getRestTime()!=0) startMessage();
			}else if(e.getSource() == btn2) {
				Sales.Cash += money*(1-user.getSaleRatio());
				Sales.Hour += money/1000;
				user.setRestTime(user.getRestTime()+money/1000);
				if(user.getID().charAt(0)!='��') {
					changeTotalTime((Member)user);
				}
				JOptionPane.showMessageDialog(null, "���� ���� �Ǿ����ϴ�.", "Message", JOptionPane.INFORMATION_MESSAGE); 
				dispose();
				if(user.getRestTime()!=0) startMessage();
			}
		}
		
	}
	//menu
	public Pay(int m) {
		money = m;
		
		setTitle("����");
		this.setSize(300, 250);
		this.setLocation(600, 300); 
		
		info = new JLabel();
		info.setPreferredSize(new Dimension(200,30));
		cost = new JLabel("�����ݾ��� "+money.toString()+" �� �Դϴ�.");
		cost.setFont(new Font("SansSerif",Font.BOLD,15));
		cost.setPreferredSize(new Dimension(200,40));
		btn1 = new JButton("ī��");
		btn1.setFont(new Font("SansSerif",Font.BOLD,18));
		btn1.setPreferredSize(new Dimension(80,80));
		btn1.addActionListener(new menuActionListener());
		btn2 = new JButton("����");
		btn2.setFont(new Font("SansSerif",Font.BOLD,18));
		btn2.setPreferredSize(new Dimension(80,80));
		btn2.addActionListener(new menuActionListener());
		btnPanel.setBackground(Color.white);
		btnPanel.add(info,null);
		btnPanel.add(cost,null);
		btnPanel.add(btn1);
		btnPanel.add(btn2);
		btnPanel.setLayout(new FlowLayout());
		this.add(btnPanel,null);
		this.setVisible(true);
		
	}
	
	class menuActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			//���� �߰��������
			if(e.getSource() == btn1) {
				Sales.Card += money;
				JOptionPane.showMessageDialog(null, "ī�� ���� �Ǿ����ϴ�.", "Message", JOptionPane.INFORMATION_MESSAGE); 
				dispose();
			}else if(e.getSource() == btn2) {
				Sales.Cash += money;
				JOptionPane.showMessageDialog(null, "���� ���� �Ǿ����ϴ�.", "Message", JOptionPane.INFORMATION_MESSAGE); 
				dispose();
			}
		}
	}
	public void startMessage() {
		JOptionPane.showMessageDialog(null, "�̿��� �����մϴ�.", "Message", JOptionPane.INFORMATION_MESSAGE); 
	}
	
	public void changeTotalTime(Member user) {
		user.setTotalTime(user.getTotalTime()+money/1000);
	}
}
