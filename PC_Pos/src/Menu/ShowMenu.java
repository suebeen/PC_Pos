package Menu;

import java.awt.*;

import javax.swing.*;

public class ShowMenu extends JFrame{
	//�޴���ü���(����,����)
	//������ �޴� list<String>�� ����
	//������ư ������ list�� �Ű������� PayMenu
	int scH,scW;
	public ShowMenu(){
		super("�޴�");
		Toolkit kit = this.getToolkit();
		Dimension sc = kit.getScreenSize();
		scH = sc.height;
		scW = sc.width;
		this.setLocation(scW/6,scH/6);
		this.setSize(scW-scW/3,scH-scH/3);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		menuImg();
		this.setVisible(true);
	}
	private void menuImg() {
		// TODO Auto-generated method stub
		JPanel food = new JPanel();
		
		
	}


}