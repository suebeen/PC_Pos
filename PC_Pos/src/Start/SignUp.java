package Start;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import Person.*;

//Ȯ�� �ȳѾ�� ��������....

public class SignUp extends JFrame implements ActionListener{
	
	JPanel btnPanel = new JPanel();
	JTextField id,name,birth;
	JLabel ID,�̸�,�������;
	JButton ok = new JButton("Ȯ��");
	
	public SignUp() {
		setTitle("ȸ������"); 
		this.setSize(300, 180);
		this.setLocation(600, 300); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		Container c = getContentPane(); 
		c.setLayout(new FlowLayout());
		ID = new JLabel(" ID            ");
		�̸� = new JLabel("�̸�         ");
		������� = new JLabel("�������  ");
		id = new JTextField(null, 20);
		name = new JTextField(null, 20);
		birth = new JTextField(null, 20);
		c.add(ID);
		c.add(id); 
		c.add(�̸�); 
		c.add(name); 
		c.add(�������); 
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
