package Person;

import java.util.ArrayList;

public class NonMemberList {
	public static ArrayList<Person> List;
	public NonMemberList(){
		List = new ArrayList<>();
		DefaultNonMemberList();
	}
	void DefaultNonMemberList(){
		List.add(new Person("ºñÈ¸¿ø1",0));
	}
}
