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
		super(frame,"매 출",true);
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
		
		Area.append("현금 총액 : "+Cash+"원"+'\n');
		Area.append("카드 총액 : "+Card+"원"+'\n');
		Area.append("전체 시간 : "+Hour+"원"+'\n');
		Area.append("++++++++++++++++++++++++++++++++++++++++++++++++++++"+'\n');
		Area.append("라면 매출 : "+Noodle*1000+"원"+'\n');
		Area.append("토핑 매출 : "+(Cheez*500+Rice*1000+Ricecake*500)+"원"+'\n');
		Area.append("박지성 피카츄 매출 : "+Pika*1500+"원"+'\n');
		Area.append("음료 매출 : "+Beverage*2000+"원"+'\n');
		Area.append("음식 매출 총액 : "+(Noodle*1000+Cheez*500+Rice*1000+Ricecake*500+Pika*1500+Beverage*2000)+"원"+'\n');
		Area.append("++++++++++++++++++++++++++++++++++++++++++++++++++++"+'\n');
		
		
		this.add(new JScrollPane(Area));
	}

}
