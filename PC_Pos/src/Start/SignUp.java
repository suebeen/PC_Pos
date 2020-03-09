package Start;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Person.*;

//확인 안넘어가는 오류있음....

public class SignUp extends JFrame implements ActionListener{
	
	JPanel btnPanel = new JPanel();
	JTextField id,name,birth;
	JLabel ID,이름,생년월일;
	JButton ok;
	
	public SignUp() {
		setTitle("회원가입"); 
		this.setSize(300, 180);
		this.setLocation(600, 300); 
		
		ID = new JLabel(" ID            ");
		이름 = new JLabel("이름         ");
		생년월일 = new JLabel("생년월일  ");
		id = new JTextField(null, 20);
		name = new JTextField(null, 20);
		birth = new JTextField(null, 20);
		ok = new JButton("확인");
		btnPanel.setLayout(new FlowLayout());
		btnPanel.add(ID); btnPanel.add(id); 
		btnPanel.add(이름); btnPanel.add(name); 
		btnPanel.add(생년월일); btnPanel.add(birth); 
		btnPanel.add(ok);
		
		btnPanel.setBackground(Color.white);
		btnPanel.setLayout(new FlowLayout());
		this.add(btnPanel,null);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		dispose();
		if(e.getSource() == ok) {
			Member man = new Member(name.getText(),birth.getText(),id.getText());
			//=========================================
			// 자리선택
			
			//==========================================
			new AddTime(man);
		}
		
	}

	
}
