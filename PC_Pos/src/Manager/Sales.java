package Manager;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Sales extends JDialog{
	public static String Cash;
	public static String Card;
	
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
		System.out.println(Cash);
	}
	private void init() {
		// TODO Auto-generated method stub
		Area = new JTextArea("++++++++++++++++++++++++++++++++++++++++++++++++++++"+'\n');
		Area.setEditable(false);
		
		///////////
		ArrayList<String[]> temp11 = new ArrayList<>();
		ArrayList<String[]> temp22 = new ArrayList<>();
		ArrayList<String[]> temp33 = new ArrayList<>();
		String[] temp1 = {"���1","2500"};
		String[] temp2 = {"���2","2500"};
		String[] temp3 = {"���3","2500"};
		String[] temp4 = {"���4","2500"};
		String[] temp5 = {"���5","2500"};
		String[] temp6 = {"���6","2500"};
		temp11.add(temp1);
		temp11.add(temp2);
		temp22.add(temp3);
		temp22.add(temp4);
		temp33.add(temp5);
		temp33.add(temp6);
		
		addArea(temp11,Area,"ī��");
		addArea(temp22,Area,"����");
		addArea(temp33,Area,"����Ʈ");
		//////////
	
		
		this.add(new JScrollPane(Area));
	}

	//Cash�迭 {���ų���, ����, �ݾ�}
	//��{���, 5, 8000��}
	//��{5�ð�, 2, 5000��}
	void addArea(ArrayList<String[]> object,JTextArea Area,String type) {
		// ����Ʈ�� TextArea�� ������ִ� �޼ҵ�
		// (����Ʈ, ��µ� JTextArea)		
		int TotalRow = object.size();// ��ü ��	
		Area.append(type+'\n');
		for (int i = 0; i < TotalRow; i++) {
			for (int j = 0; j < object.get(i).length; j++) {
				Area.append(object.get(i)[j]);
			}
			Area.append(""+'\n');
		}		
		Area.append("++++++++++++++++++++++++++++++++++++++++++++++++++++"+'\n');
	}

}
