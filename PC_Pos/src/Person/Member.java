package Person;

public class Member extends Person{
	
	protected String name;	//�̸�
	protected String birth;	//�������
	protected Integer totalTime;	//�����ð�
	protected String grade;	//���
	protected boolean isAdult;	//�̼�����Ȯ��(01������ͼ���)
	
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
	
	public Member(String name,  String id, String birth,String grade,int rT,int tT) {//DB���� �ҷ�����
		super(rT);
		this.name=name;
		this.birth=birth;
		this.grade = grade;
		this.ID=id;
		this.totalTime=tT;
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

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "�̸� : "+this.name+" ���̵� : "+this.ID+" ��� : "+this.grade+" �����ð� : "+this.restTime+" �����ð� : "+this.totalTime+'\n';
	}

	
	
	
}
