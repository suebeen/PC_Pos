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

//Ȯ�� �ȳѾ�� ��������....

public class SignUp extends JFrame implements ActionListener{
	
	JPanel btnPanel = new JPanel();
	JTextField id,name,birth;
	JLabel ID,�̸�,�������;
	JButton ok;
	
	public SignUp() {
		setTitle("ȸ������"); 
		this.setSize(300, 180);
		this.setLocation(600, 300); 
		
		ID = new JLabel(" ID            ");
		�̸� = new JLabel("�̸�         ");
		������� = new JLabel("�������  ");
		id = new JTextField(null, 20);
		name = new JTextField(null, 20);
		birth = new JTextField(null, 20);
		ok = new JButton("Ȯ��");
		btnPanel.setLayout(new FlowLayout());
		btnPanel.add(ID); btnPanel.add(id); 
		btnPanel.add(�̸�); btnPanel.add(name); 
		btnPanel.add(�������); btnPanel.add(birth); 
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
			// �ڸ�����
			
			//==========================================
			new AddTime(man);
		}
		
	}

	
}
