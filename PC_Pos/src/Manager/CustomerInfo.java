package Manager;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Person.Member;
import Person.MemberList;

public class CustomerInfo extends JDialog{
	JTable Area;
	DefaultTableModel model;
	
	public CustomerInfo(Frame frame) {
		// TODO Auto-generated constructor stub
		super(frame,"회원정보",true);
		Toolkit kit = this.getToolkit();
		Dimension sc = kit.getScreenSize();
		int scH = sc.height;
		int scW = sc.width;
		this.setLocation(scW/2-200,scH/2-300);
		this.setSize(400,600);
		init();
		this.setVisible(true);
	}

	private void init() {
		// TODO Auto-generated method stub
		String[] colNames = new String[] {"이름","아이디","등급","잔여시간","누적시간"};
		model = new DefaultTableModel(colNames,0);
		Area = new JTable(model);
		
		for(int i =0;i<MemberList.List.size();i++) {
			Member temp = MemberList.List.get(i);
			model.addRow(new Object[] {temp.getName(),temp.getID(),temp.getGrade(),temp.getRestTime(),temp.getTotalTime()});
		}
		
		this.add(new JScrollPane(Area));
	}
}
