package Person;

public class Person {

<<<<<<< HEAD
	String ID;	//ID
	int restTime;	//ÀÜ¿©½Ã°£
	double saleRatio;	//ÇÒÀÎ·ü
=======
	protected String ID;	//ID
	protected int restTime;	//ÀÜ¿©½Ã°£
	protected double saleRatio;	//ÇÒÀÎ·ü
	
	//constructor
	public Person() {};
	public Person(String ID,int restTime) {
		this.ID = ID;
		this.restTime = restTime;
		this.saleRatio = 0.0;
	}
	
	//method
	public void PersonInfo() {
		System.out.println(ID+"(ºñÈ¸¿ø)");
		System.out.println("³²Àº ½Ã°£: "+restTime);
	}
		
	//getter & setter
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public int getRestTime() {
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
	
	
>>>>>>> suebeen
}
