package Start;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import Person.*;

//��ȸ��+ȸ�� ����Ʈ�� �Ű������� �޾ƾ��� 

public class Start extends JFrame implements ActionListener{
	
	JPanel btnPanel = new JPanel();
	JButton btn1,btn2,btn3;
	Person temp = new Person();

	public Start() {
		setTitle("�̿����");
		this.setSize(500, 200);
		this.setLocation(500, 300); 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		btnPanel.setBackground(Color.white);
		btnPanel.setPreferredSize(new Dimension(500,200));	
		
		btn1 = new JButton("ȸ�� ");
		btn1.setBackground(Color.green);
		btn1.setForeground(Color.WHITE);
		btn1.setFont(new Font("SansSerif",Font.BOLD,10));
		btn1.setPreferredSize(new Dimension(100,100));
		btn1.addActionListener(this);

		btn2 = new JButton("��ȸ�� ");
		btn2.setBackground(Color.orange);
		btn2.setForeground(Color.WHITE);
		btn2.setFont(new Font("SansSerif",Font.BOLD,10));
		btn2.setPreferredSize(new Dimension(100,100));
		btn2.addActionListener(this);
		
		btn3 = new JButton("ȸ������ ");
		btn3.setBackground(Color.red);
		btn3.setForeground(Color.WHITE);
		btn3.setFont(new Font("SansSerif",Font.BOLD,10));
		btn3.setPreferredSize(new Dimension(100,100));
		btn3.addActionListener(this);
		
		btnPanel.add(btn1);
		btnPanel.add(btn2);
		btnPanel.add(btn3);
		btnPanel.setLayout(new FlowLayout());
		this.add(btnPanel,BorderLayout.EAST);	
		this.setVisible(true);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		dispose();
		
		//ȸ������ �ð��߰�
		if(e.getSource() == btn1) {	
			boolean isMember = false;
			String ID = JOptionPane.showInputDialog("ID�� �Է��ϼ���.");
			
			//ID��+isMember�ٲ��ֱ�
			
			if(isMember) {
				new AddTime(temp);
			}
			else {
				JOptionPane.showMessageDialog(null, "ȸ�������� �����ϴ�.", "Message", JOptionPane.ERROR_MESSAGE);
				new Start();
			}
			
		//��ȸ������ �ð��߰�
		}else if(e.getSource() == btn2) {
			
			//��ȸ�� ���̵� ����,list�� �߰�
			
			temp.setID("123456789");
			new AddTime(temp);
			
		//ȸ������
		}else if(e.getSource() == btn3) {
			new SignUp();
		}
	}

}
