package Start;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import Person.*;
import Person.MemberList;

public class Start extends JFrame implements ActionListener{
	
	JPanel btnPanel = new JPanel();
	JButton btn1,btn2,btn3;
	Person temp = new Person();
	
	public Start() {
		setTitle("이용시작");
		this.setSize(500, 200);
		this.setLocation(500, 300); 
		
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
	
	public boolean Search(String ID) {
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
			isMember = Search(ID);
			if(isMember) {
				JOptionPane.showMessageDialog(null, "회원검색 성공!", "Message", JOptionPane.INFORMATION_MESSAGE);
				new AddTime(temp);
			}
			else {
				JOptionPane.showMessageDialog(null, "회원정보가 없습니다.", "Message", JOptionPane.ERROR_MESSAGE);
				new Start();
			}
			
		//비회원으로 시간추가
		}else if(e.getSource() == btn2) {
			
			StringBuilder sb = new StringBuilder();
			sb.append("비회원");
			sb.append(NonMemberList.List.size()+1);
			temp.setID(sb.toString());
			NonMemberList.List.add(temp);
			new AddTime(temp);
		//회원가입
		}else if(e.getSource() == btn3) {
			new SignUp();
		}
	}

}
