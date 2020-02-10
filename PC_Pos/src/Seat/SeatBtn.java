package Seat;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class SeatBtn extends JButton implements ActionListener{
	String user;
	int rt;//남은시간, Remaining time
	boolean isUsing;//사용중인가 true -> 사용중 / false -> 사용ㄴㄴ
	boolean age; //미성년자 true -> 으른 / false -> 꼬마
	SeatBtn(int nume){
		super("좌석번호 : "+nume);
		this.user = null;
		this.rt = 0;
		this.isUsing =false;
	}
	
	public boolean isAge() {
		return age;
	}
	public void setAge(boolean age) {
		this.age = age;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public int getRt() {
		return rt;
	}
	public void setRt(int rt) {
		this.rt = rt;
	}
	public boolean isUsing() {
		return isUsing;
	}
	public void setUsing(boolean isUsing) {
		this.isUsing = isUsing;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(this.isUsing) {
			//선택한 좌석이 현재 사용중일 경우 -> 메뉴주문 or 시간추가
			
		}else if(!this.isUsing) {
			//선택한 좌석이 사용중이 아닐 경우 -> 신규 사용자 틍록
			this.isUsing = true;
		}
	}
	
}
