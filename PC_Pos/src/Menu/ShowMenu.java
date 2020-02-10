package Menu;

import java.awt.*;

import javax.swing.*;

public class ShowMenu extends JFrame{
	//메뉴전체출력(메인,토핑)
	//선택한 메뉴 list<String>로 저장
	//결제버튼 누르면 list를 매개변수로 PayMenu
	int scH,scW;
	public ShowMenu(){
		super("메뉴");
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