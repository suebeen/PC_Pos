package Start;
import java.util.Scanner;
import Person.*;

public class SignUp{
	
	Scanner s = new Scanner(System.in);
	
	public Member SignUP() {
		
		String name = s.next();
		String birth = s.next();
		String id = s.next();
		Member newMember = new Member(name,birth,id);
		//����Ʈ�� �̾��ֱ� 
		System.out.println("ȸ������ ����!");
		return newMember;
		
	}
}
