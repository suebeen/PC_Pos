package Person;

import java.util.ArrayList;

public class MemberList {
	//��� ��� ����Ʈ ���� ��������ϴ�~~~
	public static ArrayList<Member> List;
	public MemberList(){
		List = new ArrayList<>();
		DefaultMemberList();
	}
	void DefaultMemberList(){
		//DIAMOND
		List.add(new Member("������","010-7354-5754","19960509","DiAMOND",10,500));
		List.add(new Member("�����","1111","19970509","DiAMOND",0,600));
		List.add(new Member("�̴���","2222","19980509","DiAMOND",30,700));
		List.add(new Member("�ڴ���","3333","19990509","DiAMOND",40,800));
		List.add(new Member("�ִ���","4444","20000509","DiAMOND",5,1000));
		List.add(new Member("������","5555","20010509","DiAMOND",10,500));
		List.add(new Member("��Ƽ�����","6666","19960509","DiAMOND",15,600));
		List.add(new Member("������","7777","20020509","DiAMOND",20,700));
		List.add(new Member("ȫ����","8888","20030509","DiAMOND",8,800));
		List.add(new Member("ǥ����","9999","19800509","DiAMOND",9,900));
		
		//GOLD
		List.add(new Member("�ڼ���","111","19960509","GOLD",10,100));
		List.add(new Member("�����","222","19970509","GOLD",20,110));
		List.add(new Member("�̼���","333","19980509","GOLD",30,120));
		List.add(new Member("�ּ���","444","19990509","GOLD",40,130));
		List.add(new Member("ȫ����","555","20000509","GOLD",50,140));
		List.add(new Member("clap��","666","20010509","GOLD",11,150));
		List.add(new Member("�ڼ�bean","777","20020509","GOLD",12,160));
		List.add(new Member("������","888","20030509","GOLD",13,170));
		List.add(new Member("�ּ���","999","20020509","GOLD",14,180));
		List.add(new Member("park����","000","20010509","GOLD",15,190));
		List.add(new Member("�������","112","19900509","GOLD",16,200));
		List.add(new Member("�������","113","19910509","GOLD",17,210));
		List.add(new Member("������","114","19920509","GOLD",18,220));
		List.add(new Member("a����","115","19930509","GOLD",19,230));
		List.add(new Member("b����","116","19940509","GOLD",20,240));
		List.add(new Member("c����","117","19950509","GOLD",5,250));
		List.add(new Member("d����","118","19960509","GOLD",6,260));
		List.add(new Member("e����","119","19970509","GOLD",7,270));
		List.add(new Member("f����","110","19980509","GOLD",8,280));
		
		//SILVER
		List.add(new Member("���Ѽ�","11","19970509","SILVER",8,50));
		List.add(new Member("���Ѽ�","12","19980509","SILVER",9,51));
		List.add(new Member("���Ѽ�","13","19990509","SILVER",10,52));
		List.add(new Member("���Ѽ�","14","20000509","SILVER",10,53));
		List.add(new Member("���Ѽ�","15","20000509","SILVER",11,54));
		List.add(new Member("���Ѽ�","16","20010509","SILVER",11,55));
		List.add(new Member("���Ѽ�","17","20010509","SILVER",11,56));
		List.add(new Member("ȫ�Ѽ�","18","20020509","SILVER",2,57));
		List.add(new Member("���Ѽ�","19","20020509","SILVER",2,58));
		List.add(new Member("��one��","20","20030509","SILVER",3,59));
		List.add(new Member("�����","21","20030509","SILVER",5,60));
		List.add(new Member("�����","22","20040509","SILVER",10,61));
		List.add(new Member("�ƿ��","23","20030509","SILVER",11,62));
		List.add(new Member("���ļ�","24","20040509","SILVER",20,63));
		List.add(new Member("���Ѽ�","25","20040509","SILVER",22,64));
		List.add(new Member("���Ѽ�","26","20050509","SILVER",22,65));
		List.add(new Member("�ּּ�","27","20020509","SILVER",30,66));
		List.add(new Member("�����Ƽ�","28","20020509","SILVER",8,10));
		List.add(new Member("�����","29","20040509","SILVER",8,21));
		List.add(new Member("CPA��","30","20030509","SILVER",10,22));
		List.add(new Member("�濵��","31","20050509","SILVER",21,23));
		List.add(new Member("�İ���","32","20060509","SILVER",22,24));
		List.add(new Member("�����","33","20060509","SILVER",22,24));
		List.add(new Member("���Ѽ�","34","20030509","SILVER",15,24));
		List.add(new Member("���Ѽ�","35","20050509","SILVER",15,20));
		List.add(new Member("���Ѽ�","36","20060509","SILVER",10,25));
		List.add(new Member("���Ѽ�","37","20080509","SILVER",8,20));
		List.add(new Member("���Ѽ�","38","20080509","SILVER",9,25));
		List.add(new Member("���Ѽ�","39","20080509","SILVER",9,26));
		List.add(new Member("�Ѽּ�","40","20010509","SILVER",2,21));
		List.add(new Member("�ڹټ�","41","20020509","SILVER",3,22));
		List.add(new Member("C+��","42","20020509","SILVER",12,20));
		List.add(new Member("������","43","19980509","SILVER",30,80));
		List.add(new Member("������","44","19950509","SILVER",20,83));
		List.add(new Member("������","45","19960509","SILVER",51,83));
		List.add(new Member("å���","46","19970509","SILVER",23,85));
		List.add(new Member("���ڼ�","47","19980509","SILVER",31,85));
		List.add(new Member("�����","48","19990509","SILVER",30,85));
		List.add(new Member("�Ź߼�","49","19910509","SILVER",55,81));
		List.add(new Member("Ƽ���","50","19920509","SILVER",54,80));
	}
}
