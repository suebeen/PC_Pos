package Manager;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;

public class Setting extends JDialog implements ActionListener{
	JButton SalesBtn;
	JButton AccountBtn;
	Frame frame;//메인 프레임
	
	public Setting(Frame frame){
		super(frame,"관리",true);
		this.frame = frame;
		Toolkit kit = this.getToolkit();
		Dimension sc = kit.getScreenSize();
		int scH = sc.height;
		int scW = sc.width;
		this.setLocation(scW/2-100,scH/2-50);
		this.setSize(200,100);
		init();
		this.setVisible(true);
	}

	private void init() {
		// TODO Auto-generated method stub
		this.setLayout(new FlowLayout());
		SalesBtn = new JButton("정 산");
		SalesBtn.addActionListener(this);
		
		AccountBtn = new JButton("회원정보");
		AccountBtn.addActionListener(this);
		
		this.add(SalesBtn);
		this.add(AccountBtn);
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==SalesBtn)
			new Sales(frame);
		else if(e.getSource()==AccountBtn) {

		}
	}
}
