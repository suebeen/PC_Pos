import java.util.ArrayList;
import java.util.List;

import End.End;
import Home.*;
import Person.Member;

public class Main {

	public static void main(String[] args) {
		new DB();
		List<Member> temp = new ArrayList<>();
		temp.add(new Member("�ڼ���","010-1234-1234","19960509","silver",10,10));
		temp.add(new Member("����","010-1234-1234","19960509","silver",10,10));
		new End(temp);
		//�̰� �ȴٸ� ���� ����~~!~!~!~!
	}

}
