package Seat;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class SeatBtn extends JButton implements ActionListener{
	String user;
	int rt;//�����ð�, Remaining time
	boolean isUsing;//������ΰ� true -> ����� / false -> ��뤤��
	boolean age; //�̼����� true -> ���� / false -> ����
	SeatBtn(int nume){
		super("�¼���ȣ : "+nume);
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
			//������ �¼��� ���� ������� ��� -> �޴��ֹ� or �ð��߰�
			
		}else if(!this.isUsing) {
			//������ �¼��� ������� �ƴ� ��� -> �ű� ����� �v��
			this.isUsing = true;
		}
	}
	
}
