package Person;

public class Person {

<<<<<<< HEAD
	String ID;	//ID
	int restTime;	//�ܿ��ð�
	double saleRatio;	//���η�
=======
	protected String ID;	//ID
	protected int restTime;	//�ܿ��ð�
	protected double saleRatio;	//���η�
	
	//constructor
	public Person() {};
	public Person(String ID,int restTime) {
		this.ID = ID;
		this.restTime = restTime;
		this.saleRatio = 0.0;
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
