package Start;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

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
	boolean success = false;
	
	public Start(Seat[] seat) {
		this.seat = seat;
		setTitle("�̿����");
		this.setSize(500, 200);
		this.setLocation(500, 300); 
		
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
	
	public void Seating(Person user,Seat[] seat) {
		
		JFrame seatFrame = new JFrame();
		seatFrame.setTitle("�ڸ�����");
		seatFrame.setSize(300, 600);
		seatFrame.setLocation(600, 150); 
		
		for(int i=0;i<seats.length;i++) {
			Integer index = i+1;
			seats[i] = new JButton(index.toString());
			if(seat[i].getIsUse()) seats[i].setBackground(Color.red);
			else seats[i].setBackground(Color.green);
			seats[i].setFont(new Font("SansSerif",Font.BOLD,10));
			seats[i].setPreferredSize(new Dimension(50,50));
			seats[i].addActionListener(this);
			seatFrame.add(seats[i]);
		}
		seatFrame.setLayout(new FlowLayout());
		seatFrame.setBackground(Color.white);
		seatFrame.setVisible(true);
	}
	
	public void SignUp() {
		//ȸ������ �ٲ������
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
				Seating(temp,seat);
				if(success) {
					int result = JOptionPane.showConfirmDialog(null, "�ܿ��ð�: "+temp.getRestTime()+"�� , �����Ͻðڽ��ϱ�?", "��������", JOptionPane.YES_NO_OPTION); 
					if(result == JOptionPane.YES_OPTION) new AddTime(temp);
				}
			}
			else {
				JOptionPane.showMessageDialog(null, "ȸ�������� �����ϴ�.", "Message", JOptionPane.ERROR_MESSAGE);
				new Start(seat);
			}
			
		//��ȸ������ �ð��߰�
		}else if(e.getSource() == btn2) {
			
			StringBuilder sb = new StringBuilder();
			sb.append("��ȸ��");
			sb.append(NonMemberList.List.size()+1);
			temp.setID(sb.toString());
			NonMemberList.List.add(temp);
			Seating(temp,seat);
			if(success) new AddTime(temp);
			
		//ȸ������
		}else if(e.getSource() == btn3) {
			SignUp();
			Seating(temp,seat);
			if(success) new AddTime(temp);
		}
	}

}
