package Person;

public class Gold extends Member{

	//constructor
	public Gold() {
		super();
		grade = "GOLD";
		super.saleRatio = 0.1;
	};
	
	public Gold(String name, String birth, String id) {
		super(name,birth,id);
		grade = "GOLD";
		isAdult = IsAdult(birth);
	}
}
