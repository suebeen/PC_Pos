package Start;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import Manager.Sales;
import Person.*;

//카드or현금 선택시 안넘어감
public class Pay extends JFrame implements ActionListener{
	
	JLabel info,cost;
	JPanel btnPanel = new JPanel();
	JButton btn1,btn2;
	Integer money;
	//time
	public Pay(int m,Person user) {
		money = m;
		
		setTitle("결제");
		this.setSize(300, 250);
		this.setLocation(600, 300); 
		
		info = new JLabel(user.getID()+" 님");
		info.setFont(new Font("SansSerif",Font.BOLD,15));
		info.setPreferredSize(new Dimension(200,30));
		cost = new JLabel("결제금액은 "+money.toString()+" 원 입니다.");
		cost.setFont(new Font("SansSerif",Font.BOLD,15));
		cost.setPreferredSize(new Dimension(200,40));
		btn1 = new JButton("카드");
		btn1.setFont(new Font("SansSerif",Font.BOLD,18));
		btn1.setPreferredSize(new Dimension(80,80));
		btn1.addActionListener(this);
		btn2 = new JButton("현금");
		btn2.setFont(new Font("SansSerif",Font.BOLD,18));
		btn2.setPreferredSize(new Dimension(80,80));
		btn2.addActionListener(this);
		
		btnPanel.setBackground(Color.white);
		btnPanel.add(info,null);
		btnPanel.add(cost,null);
		btnPanel.add(btn1);
		btnPanel.add(btn2);
		btnPanel.setLayout(new FlowLayout());
		this.add(btnPanel,null);
		this.setVisible(true);
	}
	//menu
	public Pay(int m) {
		money = m;
		
		setTitle("결제");
		this.setSize(300, 250);
		this.setLocation(600, 300); 
		
		info = new JLabel();
		info.setPreferredSize(new Dimension(200,30));
		cost = new JLabel("결제금액은 "+money.toString()+" 원 입니다.");
		cost.setFont(new Font("SansSerif",Font.BOLD,15));
		cost.setPreferredSize(new Dimension(200,40));
		btn1 = new JButton("카드");
		btn1.setFont(new Font("SansSerif",Font.BOLD,18));
		btn1.setPreferredSize(new Dimension(80,80));
		btn1.addActionListener(this);
		btn2 = new JButton("현금");
		btn2.setFont(new Font("SansSerif",Font.BOLD,18));
		btn2.setPreferredSize(new Dimension(80,80));
		btn2.addActionListener(this);
		btnPanel.setBackground(Color.white);
		btnPanel.add(info,null);
		btnPanel.add(cost,null);
		btnPanel.add(btn1);
		btnPanel.add(btn2);
		btnPanel.setLayout(new FlowLayout());
		this.add(btnPanel,null);
		this.setVisible(true);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == btn1) {
			Sales.Card += money;
			JOptionPane.showMessageDialog(null, "카드 결제 되었습니다.", "Message", JOptionPane.INFORMATION_MESSAGE); 
			dispose();
		}else if(e.getSource() == btn2) {
			Sales.Cash += money;
			JOptionPane.showMessageDialog(null, "현금 결제 되었습니다.", "Message", JOptionPane.INFORMATION_MESSAGE); 
			dispose();
		}
	}
}
