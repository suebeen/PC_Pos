package Person;

public class Person {

	protected String ID;	//ID
	protected Integer restTime;	//�ܿ��ð�
	protected double saleRatio;	//���η�
	protected boolean use = false;
	
	//constructor
	public Person() {};
	public Person(String ID,Integer restTime) {
		this.ID = ID;
		this.restTime = restTime;
		this.saleRatio = 0.0;
	}
	public Person(Integer restTime) {//DB���� �ҷ�����
		this.restTime = restTime;
	}
	
	//method
	public void PersonInfo() {
		System.out.println(ID+"(��ȸ��)");
		System.out.println("���� �ð�: "+restTime);
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
	public boolean getUse() {
		return use;
	}
	public void setUse(boolean use) {
		this.use = use;
	}
	
	
}
