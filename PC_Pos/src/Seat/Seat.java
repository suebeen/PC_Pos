package Seat;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import Person.Member;

public class Seat extends JButton{
	//좌석출력 5X10
	//현재사용자 list<Customer>
	int number;
	Member cus;

	public Seat(String str,int i,JFrame frame) {
		super(str);
		number = i;
		this.setBackground(Color.black);
		this.addActionListener(new SeatActionListener(frame,i));
	}
	
	class SeatActionListener implements ActionListener{
		int number;
		JFrame frame;
		SeatActionListener(JFrame frame,int i){
			number = i+1;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			new SeatBtn(frame,number);
		}
	}
}
