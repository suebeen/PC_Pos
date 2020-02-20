package Start;
import java.awt.*;
import javax.swing.*;
import Person.*;


public class Start extends JFrame implements ActionListener{
	
	JPanel btnPanel = new JPanel();
	JButton btn1;
	JButton btn2;
	JButton btn3;
	Person temp = new Person();
	
	public Start() {
		
		ShowStart();
		
		//좌석선택
		//좌석반환
		//payTime
		
	}
	
	public void ShowStart() {
		
		setTitle("이용시작");
		this.setSize(500, 200);
		this.setLocation(500, 100); 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		btnPanel.setBackground(Color.white);
		btnPanel.setLayout(new GridLayout(3,1,10,20));
		btnPanel.setPreferredSize(new Dimension(500,200));	
		
		btn1 = new JButton("회원 ");
		btn1.setBackground(Color.green);
		btn1.setForeground(Color.WHITE);
		btn1.setFont(new Font("SansSerif",Font.BOLD,10));
		btn1.setPreferredSize(new Dimension(100,100));
		btn1.addActionListener(this);

		btn2 = new JButton("비회원 ");
		btn2.setBackground(Color.orange);
		btn2.setForeground(Color.WHITE);
		btn2.setFont(new Font("SansSerif",Font.BOLD,10));
		btn2.setPreferredSize(new Dimension(100,100));
		btn2.addActionListener(this);
		
		btn3 = new JButton("회원가입 ");
		btn3.setBackground(Color.red);
		btn3.setForeground(Color.WHITE);
		btn3.setFont(new Font("SansSerif",Font.BOLD,10));
		btn3.setPreferredSize(new Dimension(100,100));
		btn3.addActionListener(this);
		
		btnPanel.add(btn1);
		btnPanel.add(btn2);
		btnPanel.add(btn3);
		btnPanel.setLayout(new FlowLayout());
		this.add(btnPanel,BorderLayout.EAST);	
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == btn1) {
			Search sc = new Search();
			temp = sc.Searching();

		}else if(e.getSource() == btn2) {
			temp.setID("123456789");
		
		}else if(e.getSource() == btn3) {
			SignUp su = new SignUp();
			temp = su.SignUP();
		}
	}

}
