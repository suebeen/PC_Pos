package Person;

public class Member extends Person{
	
	String name;	//�̸�
	String birth;	//�������
	int totalTime;	//�����ð�
	String grade;	//���
	boolean isAdult;	//�̼�����Ȯ��(01������ͼ���)
	
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
