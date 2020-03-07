package Start;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import Person.*;

//비회원+회원 리스트를 매개변수로 받아야함 

public class Start extends JFrame implements ActionListener{
	
	JPanel btnPanel = new JPanel();
	JButton btn1,btn2,btn3;
	Person temp = new Person();

	public Start() {
		setTitle("이용시작");
		this.setSize(500, 200);
		this.setLocation(500, 300); 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		btnPanel.setBackground(Color.white);
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
		dispose();
		
		//회원으로 시간추가
		if(e.getSource() == btn1) {	
			boolean isMember = false;
			String ID = JOptionPane.showInputDialog("ID를 입력하세요.");
			
			//ID비교+isMember바꿔주기
			
			if(isMember) {
				new AddTime(temp);
			}
			else {
				JOptionPane.showMessageDialog(null, "회원정보가 없습니다.", "Message", JOptionPane.ERROR_MESSAGE);
				new Start();
			}
			
		//비회원으로 시간추가
		}else if(e.getSource() == btn2) {
			
			//비회원 아이디 설정,list에 추가
			
			temp.setID("123456789");
			new AddTime(temp);
			
		//회원가입
		}else if(e.getSource() == btn3) {
			new SignUp();
		}
	}

}
