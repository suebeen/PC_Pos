package Person;

public class Member extends Person{
	
<<<<<<< HEAD
	String name;	//�̸�
	String birth;	//�������
	int totalTime;	//�����ð�
	String grade;	//���
	boolean isAdult;	//�̼�����Ȯ��(01������ͼ���)
=======
	protected String name;	//�̸�
	protected String birth;	//�������
	protected int totalTime;	//�����ð�
	protected String grade;	//���
	protected boolean isAdult;	//�̼�����Ȯ��(01������ͼ���)
>>>>>>> suebeen
	
	//constructor
	public Member() {	//default
		super();
	}
	
	public Member(String name, String birth, String id) {	//ȸ������
		super();
		this.name = name;
		this.birth = birth;
		this.ID = id;
		grade = "SILVER";
		isAdult = IsAdult(birth);
	}
	
	//method
	public boolean IsAdult(String birth) {
		if(birth.charAt(0)=='0'&&birth.charAt(1)>='1') {
			return false;
		}
		else return true;
	}
	
	public void checkGrade(int time) {
		if(time<300 && time>=100 && grade !="GOLD") upgrade();
		if(time>=300 && grade != "DIAMOND") upgrade();
	}
	
	public void upgrade() {
		if(grade == "SILVER") {
			this.grade = "GOLD";
			this.saleRatio = 0.1;
		}
		else if(grade == "GOLD") {
			this.grade = "DIAMOND";
			this.saleRatio = 0.2;
		}
	}
	
	@Override
	public void PersonInfo() {
		System.out.println(name);
		System.out.println("���� �ð�: "+restTime);
		if(isAdult == false) System.out.println("�̼������Դϴ�.");
	}
	
	//getter & setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public int getTotalTime() {
		return totalTime;
	}

	public void setTotalTime(int totalTime) {
		this.totalTime = totalTime;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public boolean isAdult() {
		return isAdult;
	}

	public void setAdult(boolean isAdult) {
		this.isAdult = isAdult;
	}

	//��������?
	
	
}
