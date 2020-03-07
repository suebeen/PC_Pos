package Start;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import Person.Person;

public class AddTime extends JFrame implements ActionListener{

	JPanel btnPanel = new JPanel();
	JButton[] btn = new JButton[5];
	int time;
	Person man;
	
	public AddTime(Person m) {
		man = m;
		setTime();
	}
	
	public void payment() {
		new Pay(time*1000,man,true);
	}
	
	public void setTime() {
		setTitle("�ð�����");
		this.setSize(500, 150);
		this.setLocation(500, 300); 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		btn[0] = new JButton("1�ð�");
		btn[1] = new JButton("2�ð� ");
		btn[2] = new JButton("3�ð� ");
		btn[3] = new JButton("5�ð� ");
		btn[4] = new JButton("10�ð� ");
		
		for(int i=0;i<btn.length;i++) {
			btn[i].setFont(new Font("SansSerif",Font.BOLD,10));
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
		if(e.getSource() == btn[0]) time=1;
		else if(e.getSource() == btn[1]) time=2;
		else if(e.getSource() == btn[2]) time=3;
		else if(e.getSource() == btn[3]) time=5;
		else if(e.getSource() == btn[4]) time=10;
		payment();
	}
}
