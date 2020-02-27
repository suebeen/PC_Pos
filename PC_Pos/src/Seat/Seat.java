package Seat;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Person.Member;

public class Seat extends JButton implements Runnable {
	// Seat버튼 클릭 시, 출력되는 화면 클래스
	int number;
	boolean isUse;
	Member cus;
	int spenttime;//시간
	Thread thread;
	Calendar cal;//현재시간
	int starttime;

	public Seat(String str, int i, JFrame frame) {
		super(str);
		number = i;
		this.setBackground(Color.black);
		this.addActionListener(new SeatActionListener(frame, i));
	}

	public void setCus_Num(Member cus, int number, boolean isUse) {//손님 입력 시 부른다.
		this.cus = cus;
		this.number = number;
		this.isUse = isUse;
		if (isUse) {
			this.setLabel("<html>ID : " + cus.getID() + "<br/>남은시간 : " + (cus.getRestTime()-this.spenttime) + "<br/>미성년 : "
					+ cus.getBirth() + "</html>");
			this.setBackground(Color.WHITE);
		}
		if(this.spenttime == cus.getRestTime()) {//여기에 추가
			this.isUse=false;
			
		}
		Calendar cal = Calendar.getInstance();
		int starttime = cal.get(Calendar.MINUTE);
		if(thread == null) {
			thread = new Thread(this);
			thread.start();
		}
	}

	class SeatActionListener implements ActionListener {
		int number;
		JFrame frame;

		SeatActionListener(JFrame frame, int i) {
			number = i + 1;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			new SeatBtn(frame, number);
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		while(true) {
			Calendar cal = Calendar.getInstance();
			int now = cal.get(Calendar.MINUTE);
			spenttime = starttime - now;
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public Member getCus() {
		return cus;
	}

	public int getNumber() {
		return number;
	}
}
