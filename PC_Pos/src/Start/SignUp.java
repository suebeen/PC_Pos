package Start;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Person.Member;
import Person.MemberList;
import Person.Person;
import Seat.Seat;

public class SignUp extends JFrame{
	
	SignUp(Seat[] seat) {
		setTitle("회원가입");
		Toolkit kit = this.getToolkit();
		Dimension sc = kit.getScreenSize();
		int scH = sc.height;
		int scW = sc.width;
		setSize(300, 180);
		setLocation(scW/2-150, scH/2-90); 
		
		JTextField id,name,birth;
		JLabel ID,이름,생년월일;
		JButton ok;
		ID = new JLabel(" ID            ");
		이름 = new JLabel("이름         ");
		생년월일 = new JLabel("생년월일  ");
		id = new JTextField(null, 20);
		name = new JTextField(null, 20);
		birth = new JTextField(null, 20);
		ok = new JButton("확인");
	
		ok.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				if(e.getSource() == ok) {
					dispose();
					Member NEW = new Member(name.getText(),birth.getText(),id.getText());
					NEW.setRestTime(0);
					MemberList.List.add(NEW);
					if(NEW.getID()!=null) new Seating((Person)NEW,seat);
				}
			}
		});
		this.setLayout(new FlowLayout());
		this.add(ID); this.add(id); 
		this.add(이름); this.add(name); 
		this.add(생년월일); this.add(birth); 
		this.add(ok);
		
		this.setLayout(new FlowLayout());
		this.setBackground(Color.white);
		this.setVisible(true);
	}
}
