package Seat;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;

public class SeatBtn extends JDialog implements ActionListener{
	//홈화면에서 버튼 이미지 설정 클래스
	String user;
	int rt;//남은시간, Remaining time
	boolean isUsing;//사용중인가 true -> 사용중 / false -> 사용ㄴㄴ
	boolean age; //미성년자 true -> 으른 / false -> 꼬마
	public SeatBtn(Frame frame, Integer num){
		super(frame,num.toString()+"번 좌석",true);
		this.user = null;
		this.rt = 0;
		this.isUsing =true;
		Toolkit kit = this.getToolkit();
		Dimension sc = kit.getScreenSize();
		int scH = sc.height;
		int scW = sc.width;
		this.setLocation(scW/2-150,scH/2-75);
		this.setSize(300,150);
		init();
		this.setVisible(true);
	}
	
	private void init() {
		// TODO Auto-generated method stub
		if(isUsing) {
			this.setLayout(new GridLayout(0,1));
			this.add(new JLabel("<html>이름 : "+this.user+"<br/>남은시간 : "+this.rt+"<br/>미성년자 : "+this.age+"</html>"));

			JButton btn = new JButton("확인");
			btn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					dispose();
				}
				
			});
			this.add(btn);
		}else {
			
		}
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
