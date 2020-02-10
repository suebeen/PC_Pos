package Person;

public class Silver extends Member{

	//constructor
	public Silver() {
		super();
		grade = "SILVER";
	};
	
	public Silver(String name, String birth, String id) {
		super(name,birth,id);
		grade = "SILVER";
		isAdult = IsAdult(birth);
	}
	
}
