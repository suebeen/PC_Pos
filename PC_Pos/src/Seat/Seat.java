package Seat;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;

import Person.Member;

public class Seat extends JButton implements Runnable {
	// Seat��ư Ŭ�� ��, ��µǴ� ȭ�� Ŭ����
	int number;
	boolean isUse;
	Member cus;
	int spenttime;//�ð�
	Thread thread;
	Calendar cal;//����ð�
	int starttime;
	int timeflag;
	SeatActionListener temp;

	public Seat(String str, int i, JFrame frame) {
		super(str);
		number = i;
		this.setBackground(Color.black);
		temp = new SeatActionListener(frame,i);
		this.addActionListener(temp);
	}

	public void setCus_Num(Member cus, int number, boolean isUse) {//�մ� �Է� �� �θ���.
		//�մ�, �¼���ȣ, �����
		this.cus = cus;
		this.number = number;
		this.isUse = isUse;
		temp.setcus(cus);
		this.setBackground(Color.WHITE);
		Calendar cal1 = Calendar.getInstance();
		starttime = cal1.get(Calendar.MINUTE);
		if(thread == null) {
			thread = new Thread(this);
			thread.start();
		}
	}

	class SeatActionListener implements ActionListener {
		int number;
		JFrame frame;
		Member cus;

		SeatActionListener(JFrame frame, int i) {
			number = i + 1;
			this.frame = frame;
		}
		void setcus(Member cus) {
			this.cus = cus;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			new SeatBtn(frame, number,cus);

		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		while(true) {
			Calendar cal = Calendar.getInstance();
			int now = cal.get(Calendar.MINUTE);
			spenttime = now-starttime;
			if(timeflag != spenttime) {
				cus.setRestTime(cus.getRestTime()+timeflag);
				timeflag = spenttime;
				cus.setRestTime(cus.getRestTime() - this.spenttime);
			}
			this.setText("<html>ID : " + cus.getID() + "<br/>�����ð� : " + cus.getRestTime()
					+ "��<br/>�̼��� : " + cus.getBirth() + "</html>");
			if(cus.getRestTime()==0) {
				this.isUse=false;
				this.setLabel("��밡��");
				this.setBackground(Color.black);
				break;
			}
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
