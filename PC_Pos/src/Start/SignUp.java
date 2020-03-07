package Start;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import Person.*;

//확인 안넘어가는 오류있음....

public class SignUp extends JFrame implements ActionListener{
	
	JPanel btnPanel = new JPanel();
	JTextField id,name,birth;
	JLabel ID,이름,생년월일;
	JButton ok = new JButton("확인");
	
	public SignUp() {
		setTitle("회원가입"); 
		this.setSize(300, 180);
		this.setLocation(600, 300); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		Container c = getContentPane(); 
		c.setLayout(new FlowLayout());
		ID = new JLabel(" ID            ");
		이름 = new JLabel("이름         ");
		생년월일 = new JLabel("생년월일  ");
		id = new JTextField(null, 20);
		name = new JTextField(null, 20);
		birth = new JTextField(null, 20);
		c.add(ID);
		c.add(id); 
		c.add(이름); 
		c.add(name); 
		c.add(생년월일); 
		c.add(birth); 
		c.add(ok);
		btnPanel.setBackground(Color.white);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		dispose();
		if(e.getSource() == ok) {
			
			Member man = new Member(name.getText(),birth.getText(),id.getText());
			new AddTime(man);
		}
		
	}

	
}
