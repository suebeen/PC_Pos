package Person;

public class Member extends Person{
	
<<<<<<< HEAD
	String name;	//이름
	String birth;	//생년월일
	int totalTime;	//누적시간
	String grade;	//등급
	boolean isAdult;	//미성년자확인(01년생부터성인)
=======
	protected String name;	//이름
	protected String birth;	//생년월일
	protected int totalTime;	//누적시간
	protected String grade;	//등급
	protected boolean isAdult;	//미성년자확인(01년생부터성인)
>>>>>>> suebeen
	
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

	//생일쿠폰?
	
	
}
