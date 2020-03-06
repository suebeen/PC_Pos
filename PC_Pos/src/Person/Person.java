package Person;

public class Person {

	protected String ID;	//ID
	protected Integer restTime;	//잔여시간
	protected double saleRatio;	//할인률
	
	//constructor
	public Person() {};
	public Person(String ID,Integer restTime) {
		this.ID = ID;
		this.restTime = restTime;
		this.saleRatio = 0.0;
	}
	public Person(Integer restTime) {//DB에서 불러오기
		this.restTime = restTime;
	}
	
	//method
	public void PersonInfo() {
		System.out.println(ID+"(비회원)");
		System.out.println("남은 시간: "+restTime);
	}
		
	//getter & setter
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public Integer getRestTime() {
		return restTime;
	}
	public void setRestTime(int restTime) {
		this.restTime = restTime;
	}
	public double getSaleRatio() {
		return saleRatio;
	}
	public void setSaleRatio(double saleRatio) {
		this.saleRatio = saleRatio;
	}
	
	
}
