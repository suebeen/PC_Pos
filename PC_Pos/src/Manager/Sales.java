package Manager;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Sales extends JDialog{
	public static int Cash, Card, Hour, Noodle, Cheez, Rice, Ricecake, Pika, Beverage;
	
	JTextArea Area;
	public Sales() {
		
	}
	public Sales(Frame frame){
		super(frame,"�� ��",true);
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
		
		Area = new JTextArea("++++++++++++++++++++++++++++++++++++++++++++++++++++"+'\n');
		Area.setEditable(false);
		
		Area.append("���� �Ѿ� : "+Cash+"��"+'\n');
		Area.append("ī�� �Ѿ� : "+Card+"��"+'\n');
		Area.append("��ü �ð� : "+Hour+"��"+'\n');
		Area.append("++++++++++++++++++++++++++++++++++++++++++++++++++++"+'\n');
		Area.append("��� ���� : "+Noodle*1000+"��"+'\n');
		Area.append("���� ���� : "+(Cheez*500+Rice*1000+Ricecake*500)+"��"+'\n');
		Area.append("������ ��ī�� ���� : "+Pika*1500+"��"+'\n');
		Area.append("���� ���� : "+Beverage*2000+"��"+'\n');
		Area.append("���� ���� �Ѿ� : "+(Noodle*1000+Cheez*500+Rice*1000+Ricecake*500+Pika*1500+Beverage*2000)+"��"+'\n');
		Area.append("++++++++++++++++++++++++++++++++++++++++++++++++++++"+'\n');
		
		
		this.add(new JScrollPane(Area));
	}

}
