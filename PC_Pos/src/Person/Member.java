package Person;

public class Member{
	
	String name;	//�̸�
	String ID;	//ID(��ȭ��ȣ)
	String birth;	//�������
	int totalTime;	//�����ð�
	int restTime;	//�ܿ��ð�
	String grade;	//���
	boolean isAdult;	//�̼�����Ȯ��(01������ͼ���)
	double saleRatio;	//���η�
	
	//constructor
	public Member() {	//default
		grade = "SILVER";
	}
	
	public Member(String name, String birth, String id) {	//ȸ������
		this.name = name;
		this.birth = birth;
		this.ID = id;
		grade = "SILVER";
		if(birth.charAt(0)==0 && (int)birth.charAt(1)>1) isAdult = false;
		else isAdult = true;
	}
	
	
	//��������?
	
	
}
