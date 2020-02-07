package Seat;
import Person.*;

public class Seat {
	//좌석출력 5X10
	//현재사용자 list<Customer>
	int num;
	Member cus;

	public Seat() {
		Seat[][] seat = new Seat[5][10];
		for(int i=0;i<5;i++) {
			for(int j=0;j<10;j++) {
				seat[i][j].num = i*10+(j+1);
			}
		}
	}
	
	public void showSeat() {
		System.out.println(num);
		System.out.println(cus);
	}
}
