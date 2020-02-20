package Menu;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ShowMenu extends JFrame{
	//메뉴전체출력(메인,토핑)
	//선택한 메뉴 list<String>로 저장
	//결제버튼 누르면 list를 매개변수로 PayMenu
	int scH,scW;
	JPanel totalPanel, totalPanel1;
	DefaultTableModel model;
	Integer totalcost;
	public ShowMenu(){
		super("메뉴");
		Toolkit kit = this.getToolkit();
		Dimension sc = kit.getScreenSize();
		scH = sc.height;
		scW = sc.width;
		this.setLocation(scW/6,scH/6);
		this.setSize(scW-scW/3,scH-scH/3);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.setLayout(new FlowLayout());
		
		totalPanel = new JPanel();
		totalPanel.setLayout(new FlowLayout());
		menu(new noodle(1000,"신라면",true),"photo/라면.png");
		menu(new jisung_park(1500,"박지성피카츄",false),"photo/박지성피카츄.jpg");
		menu(new beverage(2000,"닥터페퍼",false),"photo/음료.jpg");
		menufeild();		
		this.add(totalPanel,BorderLayout.CENTER);
		this.add(totalPanel1,BorderLayout.EAST);
		this.setVisible(true);
	}
	
	private void menufeild() {//메뉴 누르면 메뉴가 쌓임
		// TODO Auto-generated method stub
		totalPanel1 = new JPanel();
		totalPanel1.setPreferredSize(new Dimension(500,scH-scH/3));
		//totalPanel1.setLayout(new FlowLayout());
		String[] colNames = new String[] {"음식 명","갯 수","가 격"};
		JLabel title = new JLabel("장바구니");
		totalPanel1.add(title,BorderLayout.NORTH);
		
		model = new DefaultTableModel(colNames,0);
		JTable table = new JTable(model);
		totalPanel1.add(new JScrollPane(table),BorderLayout.CENTER);
		
		JLabel totallabel = new JLabel(totalcost.toString());
		JButton buy = new JButton("구매하기");
		buy.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
			}
			
		});
		totalPanel1.add(buy,BorderLayout.SOUTH);
	}
	
	private void menu(Food food, String photo) {//매뉴를 추가
		// TODO Auto-generated method stub
		JPanel menu = new JPanel();
		menu.setPreferredSize(new Dimension(scW/8,scH-scH/3));
		menu.setBackground(Color.black);
		menu.setLayout(new FlowLayout());
		
		JLabel foodPhoto = new JLabel(new ImageIcon(photo));//음식 사진 레이블
		foodPhoto.setPreferredSize(new Dimension(scW/8,scH-scH/3-200));
		menu.add(foodPhoto);
		
		JLabel foodname = new JLabel(food.name);//메뉴 명 레이블
		foodname.setHorizontalAlignment(JLabel.CENTER);
		foodname.setPreferredSize(new Dimension(scW/8,40));
		menu.add(foodname);
		
		JButton addfood = new JButton("추가");
		addfood.setPreferredSize(new Dimension(scW/8,100));
		addfood.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				model.addRow(new Object[] {food.name,"1",food.cost});
				totalcost += food.cost;
			}
			
		});
		menu.add(addfood);		
		totalPanel.add(menu);
		
	}


}