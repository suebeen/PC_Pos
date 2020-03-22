package Start;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import Person.Person;
import Seat.Seat;

public class AddTime extends JFrame implements ActionListener{

	JPanel btnPanel = new JPanel();
	JButton[] btn = new JButton[5];
	int time;
	Person user;

	
	public AddTime(Person user) {
		this.user = user;
		setTime();

	}
	
	public void payment() {
		new Pay(time*1000,user);
	}
	
	public void setTime() {
		setTitle("�ð�����");
		Toolkit kit = this.getToolkit();
		Dimension sc = kit.getScreenSize();
		int scH = sc.height;
		int scW = sc.width;
		this.setSize(500, 150);
		this.setLocation(scW/2-250,scH/2-75);

		btn[0] = new JButton("�߰�x");
		btn[1] = new JButton("1�� ");
		btn[2] = new JButton("3�� ");
		btn[3] = new JButton("5�� ");
		btn[4] = new JButton("10�� ");
		
		for(int i=0;i<btn.length;i++) {
			btn[i].setFont(new Font("SansSerif",Font.BOLD,12));
			btn[i].setPreferredSize(new Dimension(80,80));
			btn[i].addActionListener(this);
			btnPanel.add(btn[i]);
		}
		
		btnPanel.setBackground(Color.white);
		this.add(btnPanel,null);	
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		dispose();
		if(e.getSource() == btn[0]) time=0;
		else if(e.getSource() == btn[1]) time=1;
		else if(e.getSource() == btn[2]) time=3;
		else if(e.getSource() == btn[3]) time=5;
		else if(e.getSource() == btn[4]) time=10;
		if(time!=0) {payment();
		}else if(user.getRestTime()>0){
			JOptionPane.showMessageDialog(null, "�̿��� �����մϴ�.", "Message", JOptionPane.INFORMATION_MESSAGE); 
		}else if(user.getRestTime()<=0){
			JOptionPane.showMessageDialog(null, "�ð��� �߰��ϼ���.", "Message", JOptionPane.INFORMATION_MESSAGE); 
			new AddTime(user);
		}
	}
}
