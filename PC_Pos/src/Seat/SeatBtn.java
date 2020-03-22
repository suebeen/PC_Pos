
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

import Person.Member;
import Person.Person;

public class SeatBtn extends JDialog implements ActionListener{
	//버튼 클릭시 출력되는 화면
	Person cus;
	boolean isUsing;//사용중인가 true -> 사용중 / false -> 사용ㄴㄴ
	
	public SeatBtn(Frame frame, Integer num,Person cus){
		super(frame,num.toString()+"번 좌석",true);
		if(cus != null&&cus.getRestTime()!=0)
			this.cus = cus;
		this.isUsing =true;//디폴트는 사용안하는 중
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
			if (cus != null && cus.getRestTime() != 0)
				if (cus instanceof Member) {//회원인 경우에만 이름과 미성년자에 변수 출력하게 했음.
					Member tempMem = (Member) cus;
					this.add(new JLabel("<html>이름 : " + tempMem.getName() + "<br/>남은시간 : " + cus.getRestTime()
							+ "<br/>미성년자 : " + tempMem.getBirth() + "</html>"));
				} else {
					this.add(new JLabel("<html>이름 : "+"비회원"+"<br/>남은시간 : "+cus.getRestTime()+"<br/>미성년자 : "+"알수없음"+"</html>"));
				}
			else
				this.add(new JLabel("<html>===============사 용 가 능================<br/><br/></html>"));
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
