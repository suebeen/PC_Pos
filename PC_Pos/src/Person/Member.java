package Person;

public class Member extends Person{
	
	protected String name;	//이름
	protected String birth;	//생년월일
	protected Integer totalTime;	//누적시간
	protected String grade;	//등급
	protected boolean isAdult;	//미성년자확인(01년생부터성인)
	
	//constructor
	public Member() {	//default
		super();
	}
	
	public Member(String name, String birth, String id) {	//회원가입
		super();
		this.name = name;
		this.birth = birth;
		this.ID = id;
		grade = "SILVER";
		isAdult = IsAdult(birth);
	}
	
	public Member(String name,  String id, String birth,String grade,int rT,int tT) {//DB에서 불러오기
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
		System.out.println("남은 시간: "+restTime);
		if(isAdult == false) System.out.println("미성년자입니다.");
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
		return "이름 : "+this.name+" 아이디 : "+this.ID+" 등급 : "+this.grade+" 남은시간 : "+this.restTime+" 누적시간 : "+this.totalTime+'\n';
	}

	
	
	
}
