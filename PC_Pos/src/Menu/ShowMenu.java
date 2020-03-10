package Menu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.HashSet;
import java.util.Set;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import Manager.Sales;
import Start.Pay;

public class ShowMenu extends JFrame{
	//메뉴전체출력(메인,토핑)
	//선택한 메뉴 list<String>로 저장
	//결제버튼 누르면 list를 매개변수로 PayMenu
	int scH,scW;
	JPanel totalPanel, totalPanel1;
	DefaultTableModel model;
	Integer totalcost;
	JTextField totallabel;
	Integer Cheez, Rice, Ricecake;

	public ShowMenu(){
		super("메뉴");
		Toolkit kit = this.getToolkit();
		Dimension sc = kit.getScreenSize();
		scH = sc.height;
		scW = sc.width;
		this.setLocation(scW/6,scH/6);
		this.setSize(scW-scW/3,scH-scH/3);
		
		totalPanel = new JPanel();
		totalPanel.setLayout(new FlowLayout());
		menu(new noodle(1000,"신라면",true),"photo/라면.png",this);
		menu(new jisung_park(1500,"박지성피카츄",false),"photo/박지성피카츄.jpg",this);
		menu(new beverage(2000,"닥터페퍼",false),"photo/음료.jpg",this);
		menufeild();
		this.add(totalPanel,BorderLayout.CENTER);
		this.add(totalPanel1,BorderLayout.EAST);
		this.setVisible(true);
	}
	
	private void menufeild() {//메뉴 누르면 메뉴가 쌓임
		// TODO Auto-generated method stub
		totalPanel1 = new JPanel();
		totalPanel1.setPreferredSize(new Dimension(500,scH-scH/3));
		String[] colNames = new String[] {"음식 명","갯 수","가 격","토핑"};
		JLabel title = new JLabel("장바구니");
		totalPanel1.add(title,BorderLayout.NORTH);
		
		model = new DefaultTableModel(colNames,0);
		JTable table = new JTable(model);
		totalPanel1.add(new JScrollPane(table),BorderLayout.CENTER);
		totallabel = new JTextField("  총액    ");

		JButton buy = new JButton("구매하기");//결재 버튼
		buy.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Integer temp = new Integer(totallabel.getText());
				new Pay(temp);
				dispose();
			}
			
		});
		totalPanel1.add(buy,BorderLayout.SOUTH);
		totalPanel1.add(totallabel);
	}
	
	private void menu(Food food, String photo,JFrame frame) {//매뉴를 추가
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
		totalcost = 0;
		
		addfood.addActionListener(new ActionListener() {
			topping tempo;
			int toppingcost;
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				food.toSales();//Sales로 구매내역 보내기
				
				if(food.istopping) {//토핑이 있을 경우
					tempo = new topping(frame);//토핑 다이알로그 실행
					toppingcost+=tempo.total;
					if(!tempo.temp.isEmpty()) 
						food.toppingchoice = true;
				}
				for(int i=0;i<model.getRowCount();i++) {
					if(model.getValueAt(i, 0).equals(food.name)&&!food.toppingchoice) {
						Object t = model.getValueAt(i, 3);
						if (t.equals(false)) {
							model.removeRow(i);
							food.count++;
							break;
						}
					}
				}

				if(food.toppingchoice) {
					model.addRow(new Object[] {food.name,1,food.cost+toppingcost,tempo.temp});
					food.toppingchoice = false;
				}else 
					model.addRow(new Object[] {food.name,food.count+1,food.cost,food.toppingchoice});
				

				totalcost += food.cost+toppingcost;
				
				toppingcost = 0;
				totallabel.setText(totalcost.toString());
				totallabel.repaint();
			}
			
		});
		menu.add(addfood);		
		totalPanel.add(menu);
		
	}
	class topping extends JDialog  implements ItemListener{
		JCheckBox cheez,rice,cake;
		Set<String> temp = new HashSet<>();//토핑 목록
		int total;
		topping(JFrame frame){
			super(frame,"토핑",true);
			Toolkit kit = this.getToolkit();
			Dimension sc = kit.getScreenSize();
			scH = sc.height;
			scW = sc.width;
			this.setLocation(scW/2-150,scH/2-75);
			this.setSize(300,150);

			this.setLayout(new FlowLayout());
			JLabel title = new JLabel("                             토핑 목록                                ");
			this.add(title,BorderLayout.NORTH);
			JPanel list = new JPanel();
			
			cheez = new JCheckBox("치즈, 500원");
			rice = new JCheckBox("밥, 1000원");
			cake = new JCheckBox("떡, 500원");
			cheez.addItemListener(this);
			rice.addItemListener(this);
			cake.addItemListener(this);

			list.add(cheez);
			list.add(rice);
			list.add(cake);
			
			this.add(list,BorderLayout.CENTER);
			JButton btn = new JButton("확인");
			btn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					dispose();
				}
				
			});
			this.add(btn,BorderLayout.SOUTH);
			
			this.setVisible(true);
		}
		@Override
		public void itemStateChanged(ItemEvent e){
			// TODO Auto-generated method stub
			if(e.getStateChange()==ItemEvent.SELECTED){
				if(e.getItem() == cheez) {
					total+=500;
					temp.add("치즈");
					Sales.Cheez++;
				}else if(e.getItem()==rice){
					total += 1000;
					temp.add("밥");
					Sales.Rice++;
				}else {
					total += 500;
					temp.add("떡");
					Sales.Ricecake++;
				}
			}else if(e.getStateChange()==ItemEvent.DESELECTED) {
				if(e.getItem() == cheez) {
					total-=500;
					temp.remove("치즈");
					Sales.Cheez--;
				}else if(e.getItem()==rice){
					total -= 1000;
					temp.remove("밥");
					Sales.Rice--;
				}else {
					total -= 500;
					temp.remove("떡");
					Sales.Ricecake--;
				}
			}
		}
	}

}