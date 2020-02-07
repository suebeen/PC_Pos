package Person;

public class Member{
	
	String name;	//이름
	String ID;	//ID(전화번호)
	String birth;	//생년월일
	int totalTime;	//누적시간
	int restTime;	//잔여시간
	String grade;	//등급
	boolean isAdult;	//미성년자확인(01년생부터성인)
	double saleRatio;	//할인률
	
	//constructor
	public Member() {	//default
		grade = "SILVER";
	}
	
	public Member(String name, String birth, String id) {	//회원가입
		this.name = name;
		this.birth = birth;
		this.ID = id;
		grade = "SILVER";
		if(birth.charAt(0)==0 && (int)birth.charAt(1)>1) isAdult = false;
		else isAdult = true;
	}
	
	
	//생일쿠폰?
	
	
}
