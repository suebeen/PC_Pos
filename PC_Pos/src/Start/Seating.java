package Start;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import Person.Member;
import Person.Person;
import Seat.Seat;

public class Seating extends JFrame{

	JButton[] seats = new JButton[50];
	
	public Seating(Person user,Seat[] seat) {
		Toolkit kit = this.getToolkit();
		Dimension sc = kit.getScreenSize();
		int scH = sc.height;
		int scW = sc.width;
		setTitle("자리선택");
		setSize(300, 600);
		setLocation(scW/2-150, scH/2-300); 
		
		for(int i=0;i<seats.length;i++) {
			Integer index = i+1;
			seats[i] = new JButton(index.toString());
			if(seat[i].getIsUse()) seats[i].setBackground(Color.red);
			else seats[i].setBackground(Color.green);
			seats[i].setFont(new Font("SansSerif",Font.BOLD,10));
			seats[i].setPreferredSize(new Dimension(50,50));
			seats[i].addActionListener(new myActionListener(seat,user));
			this.add(seats[i]);
		}
		this.setLayout(new FlowLayout());
		this.setBackground(Color.white);
		this.setVisible(true);
	}
	class myActionListener implements ActionListener {
		Seat[] seat = new Seat[50];;
		Person user = new Person();
		
		myActionListener(Seat[] seat,Person user){
			this.seat = seat;
			this.user = user;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			dispose();
			for(int j=0;j<seats.length;j++) {
				if(e.getSource()==seats[j]&&!seat[j].getIsUse()) {
					seat[j].setCus_Num(user, j, true);
					user.setUse(true);
					new AddTime(user);
				}
			}
		}
		
	}
	
}
