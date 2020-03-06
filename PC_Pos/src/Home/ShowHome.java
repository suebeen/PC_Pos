package Home;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.*;

import Manager.Setting;
import Menu.ShowMenu;
import Person.Member;
import Person.MemberList;
import Seat.Seat;
import Start.Start;

public class ShowHome extends JFrame implements ActionListener, Runnable{
	JLabel time;
	Thread thread;
	JButton btn1;
	JButton btn2;
	JButton btn3;
	JButton btn4;
	Seat[] seat = new Seat[50];
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
		new MemberList();
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
			seat[i] = new Seat("사용가능",i,this);
			seatPanel.add(seat[i]);
		}
		//=========================================
		// test
		
		seat[10].setCus_Num(MemberList.List.get(0),10, true);
		//==========================================
		
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
		
		btn1 = new JButton("사용시작 ");
		btn1.setFont(new Font("SansSerif",Font.BOLD,40));
		btn1.setPreferredSize(new Dimension(screenW/5,screenH/5));
		btn1.addActionListener(this);
		btnPanel.add(btn1);
				
		btn2 = new JButton("메뉴주문");
		btn2.setFont(new Font("SansSerif",Font.BOLD,40));
		btn2.setPreferredSize(new Dimension(screenW/5,screenH/5));
		btn2.addActionListener(this);
		btnPanel.add(btn2);
		
		btn3 = new JButton("사용종료");
		btn3.setFont(new Font("SansSerif",Font.BOLD,40));
		btn3.setPreferredSize(new Dimension(screenW/5,screenH/5));
		btn3.addActionListener(this);
		btnPanel.add(btn3);	
		
		btn4 = new JButton("관리");
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
			new Start();
		}else if(e.getSource() == btn2) {
			new ShowMenu();
		}else if(e.getSource() == btn3) {

		}else if(e.getSource() == btn4){
			new Setting(this);
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			Calendar cal = Calendar.getInstance();
			String now = cal.get(Calendar.YEAR)+"년 "+
					(cal.get(Calendar.MONTH)+1)+"월 "+cal.get(Calendar.DATE)+"일 "+
					cal.get(Calendar.HOUR)+"시 "+cal.get(Calendar.MINUTE)+"분 "+cal.get(Calendar.SECOND)+"초 ";
			time.setText(now);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
