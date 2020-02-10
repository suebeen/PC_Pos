package Home;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.*;

public class ShowHome extends JFrame implements ActionListener, Runnable{
	JLabel time;
	Thread thread;
	JButton btn1;
	JButton btn2;
	JButton btn3;
	JButton btn4;
	JButton[] seat = new JButton[50];
	int screenH, screenW;
	public ShowHome(){
		super("PC_cafe");
		Toolkit kit = this.getToolkit();
		Dimension screen = kit.getScreenSize();
		screenH = screen.height;
		screenW = screen.width;
		this.setLocation(0, 0);
		this.setSize(screenW, screenH);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		homebtn();
		homeseats();
		this.setVisible(true);
	}

	public void homeseats() {
		// TODO Auto-generated method stub
		JPanel seatPanel = new JPanel();
		seatPanel.setLayout(new GridLayout(10,5,5,5));
		seatPanel.setPreferredSize(new Dimension(screenW-screenW/5,screenH));
		seatPanel.setBackground(Color.black);
		
		for(int i=0;i<seat.length;i++) {
			seat[i] = new JButton("test");
			seat[i].setBackground(Color.black);
			seatPanel.add(seat[i]);
		}
		
		
		
		
		this.add(seatPanel);
	}

	public void homebtn() {
		// TODO Auto-generated method stub
		JPanel totalPanel = new JPanel();
		JPanel btnPanel = new JPanel();
		JPanel timePanel = new JPanel();

		btnPanel.setBackground(Color.black);
		btnPanel.setLayout(new GridLayout(0,1,10,20));
		btnPanel.setPreferredSize(new Dimension(screenW/5,screenH-screenH/6));	
		
		time = new JLabel();
		time.setSize(screenW/5, 100);
		time.setFont(new Font("SansSerif",Font.BOLD,17));
		time.setForeground(Color.WHITE);
		if(thread == null) {
			thread = new Thread(this);
			thread.start();
		}
		timePanel.setBackground(Color.black);
		timePanel.setPreferredSize(new Dimension(250,30));
		timePanel.add(time);
		
		btn1 = new JButton("������ ");
		btn1.setFont(new Font("SansSerif",Font.BOLD,40));
		btn1.setPreferredSize(new Dimension(screenW/5,screenH/5));
		btn1.addActionListener(this);
		btnPanel.add(btn1);
				
		btn2 = new JButton("�޴��ֹ�");
		btn2.setFont(new Font("SansSerif",Font.BOLD,40));
		btn2.setPreferredSize(new Dimension(screenW/5,screenH/5));
		btn2.addActionListener(this);
		btnPanel.add(btn2);
		
		btn3 = new JButton("�������");
		btn3.setFont(new Font("SansSerif",Font.BOLD,40));
		btn3.setPreferredSize(new Dimension(screenW/5,screenH/5));
		btn3.addActionListener(this);
		btnPanel.add(btn3);	
		
		btn4 = new JButton("����");
		btn4.setFont(new Font("SansSerif",Font.BOLD,40));
		btn4.setPreferredSize(new Dimension(screenW/5,screenH/5));
		btn4.addActionListener(this);
		btnPanel.add(btn4);
		
		totalPanel.setBackground(Color.black);
		totalPanel.setPreferredSize(new Dimension(screenW/5,screenW));
		totalPanel.setLayout(new FlowLayout());
		totalPanel.add(timePanel);
		totalPanel.add(btnPanel);
		this.add(totalPanel,BorderLayout.EAST);		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == btn1) {
			System.out.println("test");
		}else if(e.getSource() == btn2) {
			
		}else if(e.getSource() == btn3) {
			
		}else if(e.getSource() == btn4){
			
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			Calendar cal = Calendar.getInstance();
			String now = cal.get(Calendar.YEAR)+"�� "+
					(cal.get(Calendar.MONTH)+1)+"�� "+cal.get(Calendar.DATE)+"�� "+
					cal.get(Calendar.HOUR)+"�� "+cal.get(Calendar.MINUTE)+"�� "+cal.get(Calendar.SECOND)+"�� ";
			time.setText(now);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
