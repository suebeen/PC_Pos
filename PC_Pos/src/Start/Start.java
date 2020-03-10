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
	static boolean success = false;
	
	public Start(Seat[] seat) {
		this.seat = seat;
		setTitle("이용시작");
		Toolkit kit = this.getToolkit();
		Dimension sc = kit.getScreenSize();
		int scH = sc.height;
		int scW = sc.width;
		this.setSize(500, 200);
		this.setLocation(scW/2-250,  scH/2-100); 
		
		btnPanel.setBackground(Color.white);
		btnPanel.setPreferredSize(new Dimension(500,200));	
		
		btn1 = new JButton("회원 ");
		btn1.setBackground(Color.green);
		btn1.setForeground(Color.WHITE);
		btn1.setFont(new Font("SansSerif",Font.BOLD,18));
		btn1.setPreferredSize(new Dimension(150,150));
		btn1.addActionListener(this);

		btn2 = new JButton("비회원 ");
		btn2.setBackground(Color.orange);
		btn2.setForeground(Color.WHITE);
		btn2.setFont(new Font("SansSerif",Font.BOLD,18));
		btn2.setPreferredSize(new Dimension(150,150));
		btn2.addActionListener(this);
		
		btn3 = new JButton("회원가입 ");
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
		
		//회원으로 시간추가
		if(e.getSource() == btn1) {	
			boolean isMember = false;
			String ID = JOptionPane.showInputDialog("ID를 입력하세요.");
			isMember = Searching(ID);
			if(isMember) {
				new Seating(temp,seat);
				if(success) {
					success = false;
					int result = JOptionPane.showConfirmDialog(null, "잔여시간: "+temp.getRestTime()+"분 , 충전하시겠습니까?", "충전여부", JOptionPane.YES_NO_OPTION); 
					if(result == JOptionPane.YES_OPTION) {
						new AddTime(temp);
					}
				}
			}
			else {
				JOptionPane.showMessageDialog(null, "회원정보가 없습니다.", "Message", JOptionPane.ERROR_MESSAGE);
				new Start(seat);
			}
			
		//비회원으로 시간추가
		}else if(e.getSource() == btn2) {
			Person nonMember;
			StringBuilder sb = new StringBuilder();
			sb.append("비회원");
			sb.append(NonMemberList.List.size()+1);
			nonMember = new Person(sb.toString(),0);
			NonMemberList.List.add(nonMember);
			new Seating(nonMember,seat);
			if(success) new AddTime(nonMember);
			
			//회원가입
		}else if(e.getSource() == btn3) {
			new SignUp(seat);
		}
	}
	

}
