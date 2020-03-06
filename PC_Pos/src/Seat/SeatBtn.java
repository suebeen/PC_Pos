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

public class SeatBtn extends JDialog implements ActionListener{
	//Ȩȭ�鿡�� ��ư �̹��� ���� Ŭ����
	Member cus;
	boolean isUsing;//������ΰ� true -> ����� / false -> ��뤤��
	
	public SeatBtn(Frame frame, Integer num,Member cus){
		super(frame,num.toString()+"�� �¼�",true);
		if(cus != null&&cus.getRestTime()!=0)
			this.cus = cus;
		this.isUsing =true;//����Ʈ�� �����ϴ� ��
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
			if(cus != null&&cus.getRestTime()!=0) 
				this.add(new JLabel("<html>�̸� : "+cus.getName()+"<br/>�����ð� : "+cus.getRestTime()+"<br/>�̼����� : "+cus.getBirth()+"</html>"));
			else
				this.add(new JLabel("<html>===============�� �� �� ��================<br/><br/></html>"));
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
