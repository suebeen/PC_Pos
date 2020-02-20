package Menu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class ShowMenu extends JFrame{
	//�޴���ü���(����,����)
	//������ �޴� list<String>�� ����
	//������ư ������ list�� �Ű������� PayMenu
	int scH,scW;
	JPanel totalPanel, totalPanel1;
	DefaultTableModel model;
	Integer totalcost;
	JTextField totallabel;

	public ShowMenu(){
		super("�޴�");
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
		menu(new noodle(1000,"�Ŷ��",true),"photo/���.png");
		menu(new jisung_park(1500,"��������ī��",false),"photo/��������ī��.jpg");
		menu(new beverage(2000,"��������",false),"photo/����.jpg");
		menufeild();
		this.add(totalPanel,BorderLayout.CENTER);
		this.add(totalPanel1,BorderLayout.EAST);
		this.setVisible(true);
	}
	
	private void menufeild() {//�޴� ������ �޴��� ����
		// TODO Auto-generated method stub
		totalPanel1 = new JPanel();
		totalPanel1.setPreferredSize(new Dimension(500,scH-scH/3));
		//totalPanel1.setLayout(new FlowLayout());
		String[] colNames = new String[] {"���� ��","�� ��","�� ��","����"};
		JLabel title = new JLabel("��ٱ���");
		totalPanel1.add(title,BorderLayout.NORTH);
		
		model = new DefaultTableModel(colNames,0);
		JTable table = new JTable(model);
		totalPanel1.add(new JScrollPane(table),BorderLayout.CENTER);
		totallabel = new JTextField("  �Ѿ�    ");

		JButton buy = new JButton("�����ϱ�");
		buy.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
			}
			
		});
		totalPanel1.add(buy,BorderLayout.SOUTH);
		totalPanel1.add(totallabel);
	}
	
	private void menu(Food food, String photo) {//�Ŵ��� �߰�
		// TODO Auto-generated method stub
		JPanel menu = new JPanel();
		menu.setPreferredSize(new Dimension(scW/8,scH-scH/3));
		menu.setBackground(Color.black);
		menu.setLayout(new FlowLayout());
		
		JLabel foodPhoto = new JLabel(new ImageIcon(photo));//���� ���� ���̺�
		foodPhoto.setPreferredSize(new Dimension(scW/8,scH-scH/3-200));
		menu.add(foodPhoto);
		
		JLabel foodname = new JLabel(food.name);//�޴� �� ���̺�
		foodname.setHorizontalAlignment(JLabel.CENTER);
		foodname.setPreferredSize(new Dimension(scW/8,40));
		menu.add(foodname);
		
		JButton addfood = new JButton("�߰�");
		addfood.setPreferredSize(new Dimension(scW/8,100));
		totalcost = 0;
		
		addfood.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if(food.istopping) {
					int result = JOptionPane.showConfirmDialog(null, "������ �߰��Ͻðڽ��ϱ�? 1000��");
					if(result == JOptionPane.YES_OPTION) {
						totalcost += 1000;
						food.toppingchoice = true;
					}
				}
				if(food.toppingchoice) {
					model.addRow(new Object[] {food.name,"1",food.cost,"����"});
					food.toppingchoice = false;
				}else 
					model.addRow(new Object[] {food.name,"1",food.cost,"����"});
				

				totalcost += food.cost;
				
				totallabel.setText(totalcost.toString());
				totallabel.repaint();
			}
			
		});
		menu.add(addfood);		
		totalPanel.add(menu);
		
	}


}