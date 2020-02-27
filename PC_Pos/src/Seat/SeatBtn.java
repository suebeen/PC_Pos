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
	//Ȩȭ�鿡�� ��ư �̹��� ���� Ŭ����
	String user;
	int rt;//�����ð�, Remaining time
	boolean isUsing;//������ΰ� true -> ����� / false -> ��뤤��
	boolean age; //�̼����� true -> ���� / false -> ����
	public SeatBtn(Frame frame, Integer num){
		super(frame,num.toString()+"�� �¼�",true);
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
			this.add(new JLabel("<html>�̸� : "+this.user+"<br/>�����ð� : "+this.rt+"<br/>�̼����� : "+this.age+"</html>"));

			JButton btn = new JButton("Ȯ��");
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
			//������ �¼��� ���� ������� ��� -> �޴��ֹ� or �ð��߰�
			
		}else if(!this.isUsing) {
			//������ �¼��� ������� �ƴ� ��� -> �ű� ����� �v��
			this.isUsing = true;
		}
	}
	
}
