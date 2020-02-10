package Person;

public class Diamond extends Member{

	//constructor
	public Diamond() {
		super();
		grade = "DIAMOND";
		super.saleRatio = 0.2;
	};
	
	public Diamond(String name, String birth, String id) {
		super(name,birth,id);
		grade = "DIAMOND";
		isAdult = IsAdult(birth);
	}
	
}
