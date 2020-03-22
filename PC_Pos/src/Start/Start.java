package Start;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Person.Member;
import Person.MemberList;
import Person.NonMemberList;
import Person.Person;
import Seat.Seat;

public class Start extends JFrame implements ActionListener{
	
	JPanel btnPanel = new JPanel();
	JButton btn1,btn2,btn3;
	JButton[] seats = new JButton[50];
	Person temp = new Person();
	Seat[] seat;
	
	public Start(Seat[] seat) {
		this.seat = seat;
		setTitle("�̿����");
		Toolkit kit = this.getToolkit();
		Dimension sc = kit.getScreenSize();
		int scH = sc.height;
		int scW = sc.width;
		this.setSize(500, 200);
		this.setLocation(scW/2-250,  scH/2-100); 
		
		btnPanel.setBackground(Color.white);
		btnPanel.setPreferredSize(new Dimension(500,200));	
		
		btn1 = new JButton("ȸ�� ");
		btn1.setBackground(Color.green);
		btn1.setForeground(Color.WHITE);
		btn1.setFont(new Font("SansSerif",Font.BOLD,18));
		btn1.setPreferredSize(new Dimension(150,150));
		btn1.addActionListener(this);

		btn2 = new JButton("��ȸ�� ");
		btn2.setBackground(Color.orange);
		btn2.setForeground(Color.WHITE);
		btn2.setFont(new Font("SansSerif",Font.BOLD,18));
		btn2.setPreferredSize(new Dimension(150,150));
		btn2.addActionListener(this);
		
		btn3 = new JButton("ȸ������ ");
		btn3.setBackground(Color.red);
		btn3.setForeground(Color.WHITE);
		btn3.setFont(new Font("SansSerif",Font.BOLD,18));
		btn3.setPreferredSize(new Dimension(150,150));
		btn3.addActionListener(this);
		
		btnPanel.add(btn1);
		btnPanel.add(btn2);
		btnPanel.add(btn3);
		btnPanel.setLayout(new FlowLayout());
		this.add(btnPanel,null);	
		this.setVisible(true);
	}
	
	public boolean Searching(String ID) {
		for(int i=0;i<MemberList.List.size();i++) {
			if(MemberList.List.get(i).getID().equals(ID)) {
				temp = MemberList.List.get(i);
				return true;
			}
		}
		return false;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		dispose();
		
		//ȸ������ �ð��߰�
		if(e.getSource() == btn1) {	
			boolean isMember = false;
			String ID = JOptionPane.showInputDialog("ID�� �Է��ϼ���.");
			isMember = Searching(ID);
			if(isMember) {
				if(temp.getUse()) {
					JOptionPane.showMessageDialog(null, "�̹� ������Դϴ�.", "Message", JOptionPane.INFORMATION_MESSAGE); 
				}else {
					JOptionPane.showMessageDialog(null, "�ܿ��ð�:" +temp.getRestTime()+"��", "Message", JOptionPane.INFORMATION_MESSAGE);
					new Seating(temp,seat,true);
				}
			}
			else {
				JOptionPane.showMessageDialog(null, "ȸ�������� �����ϴ�.", "Message", JOptionPane.ERROR_MESSAGE);
				new Start(seat);
			}
			
		//��ȸ������ �ð��߰�
		}else if(e.getSource() == btn2) {
			Person nonMember;
			StringBuilder sb = new StringBuilder();
			sb.append("��ȸ��");
			sb.append(NonMemberList.List.size()+1);
			nonMember = new Person(sb.toString(),0);
			NonMemberList.List.add(nonMember);
			new Seating(nonMember,seat,false);
			//ȸ������
		}else if(e.getSource() == btn3) {
			new SignUp(seat);
		}
	}
	

}
