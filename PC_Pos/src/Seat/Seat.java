package Seat;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;

import Person.Member;
import Person.Person;

public class Seat extends JButton implements Runnable {
	// Ȩȭ�� ��ư Ŭ����
	int number;
	boolean isUse;
	Person cus;
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

	public void setCus_Num(Person cus1, int number1, boolean isUse1) {//�մ� �Է� �� �θ���.
		//�մ�, �¼���ȣ, �����
		cus = cus1;
		number = number1;
		isUse = isUse1;
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
		Person cus;

		SeatActionListener(JFrame frame, int i) {
			number = i + 1;
			this.frame = frame;
		}
		void setcus(Person cus2) {
			this.cus = cus2;
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
			
			if(cus.getID().charAt(0)=='��') this.setText("<html>ID : " + cus.getID() + "<br/>�����ð� : " + cus.getRestTime() + "��</html>");
			else {
				Member temp = (Member)cus;
				this.setText("<html>ID : " + temp.getID() + "<br/>�����ð� : " + temp.getRestTime() + "��<br/>�̼��� : " + temp.getBirth() + "</html>");
			}
			
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
	
	public Person getCus() {
		return cus;
	}

	public int getNumber() {
		return number;
	}
	public boolean getIsUse() {
		return isUse;
	}
}
