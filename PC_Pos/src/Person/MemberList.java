package Person;

import java.util.ArrayList;

public class MemberList {
	//대신 멤버 리스트 새로 만들었습니다~~~
	public static ArrayList<Member> List;
	public MemberList(){
		List = new ArrayList<>();
		DefaultMemberList();
	}
	void DefaultMemberList(){
		//DIAMOND
		List.add(new Member("정덕수","010-7354-5754","19960509","DiAMOND",10,500));
		List.add(new Member("김덕수","1111","19970509","DiAMOND",0,600));
		List.add(new Member("이덕수","2222","19980509","DiAMOND",30,700));
		List.add(new Member("박덕수","3333","19990509","DiAMOND",40,800));
		List.add(new Member("최덕수","4444","20000509","DiAMOND",5,1000));
		List.add(new Member("조덕수","5555","20010509","DiAMOND",10,500));
		List.add(new Member("스티븐덕수","6666","19960509","DiAMOND",15,600));
		List.add(new Member("나덕수","7777","20020509","DiAMOND",20,700));
		List.add(new Member("홍덕수","8888","20030509","DiAMOND",8,800));
		List.add(new Member("표덕수","9999","19800509","DiAMOND",9,900));
		
		//GOLD
		List.add(new Member("박수빈","111","19960509","GOLD",10,100));
		List.add(new Member("김수빈","222","19970509","GOLD",20,110));
		List.add(new Member("이수빈","333","19980509","GOLD",30,120));
		List.add(new Member("최수빈","444","19990509","GOLD",40,130));
		List.add(new Member("홍수빈","555","20000509","GOLD",50,140));
		List.add(new Member("clap빈","666","20010509","GOLD",11,150));
		List.add(new Member("박수bean","777","20020509","GOLD",12,160));
		List.add(new Member("조수빈","888","20030509","GOLD",13,170));
		List.add(new Member("최수빈","999","20020509","GOLD",14,180));
		List.add(new Member("park수빈","000","20010509","GOLD",15,190));
		List.add(new Member("선우수빈","112","19900509","GOLD",16,200));
		List.add(new Member("독고수빈","113","19910509","GOLD",17,210));
		List.add(new Member("리수빈","114","19920509","GOLD",18,220));
		List.add(new Member("a수빈","115","19930509","GOLD",19,230));
		List.add(new Member("b수빈","116","19940509","GOLD",20,240));
		List.add(new Member("c수빈","117","19950509","GOLD",5,250));
		List.add(new Member("d수빈","118","19960509","GOLD",6,260));
		List.add(new Member("e수빈","119","19970509","GOLD",7,270));
		List.add(new Member("f수빈","110","19980509","GOLD",8,280));
		
		//SILVER
		List.add(new Member("장한솔","11","19970509","SILVER",8,50));
		List.add(new Member("김한솔","12","19980509","SILVER",9,51));
		List.add(new Member("이한솔","13","19990509","SILVER",10,52));
		List.add(new Member("박한솔","14","20000509","SILVER",10,53));
		List.add(new Member("최한솔","15","20000509","SILVER",11,54));
		List.add(new Member("정한솔","16","20010509","SILVER",11,55));
		List.add(new Member("조한솔","17","20010509","SILVER",11,56));
		List.add(new Member("홍한솔","18","20020509","SILVER",2,57));
		List.add(new Member("못한솔","19","20020509","SILVER",2,58));
		List.add(new Member("장one솔","20","20030509","SILVER",3,59));
		List.add(new Member("독고솔","21","20030509","SILVER",5,60));
		List.add(new Member("선우솔","22","20040509","SILVER",10,61));
		List.add(new Member("아우솔","23","20030509","SILVER",11,62));
		List.add(new Member("미파솔","24","20040509","SILVER",20,63));
		List.add(new Member("유한솔","25","20040509","SILVER",22,64));
		List.add(new Member("상한솔","26","20050509","SILVER",22,65));
		List.add(new Member("솔솔솔","27","20020509","SILVER",30,66));
		List.add(new Member("마리아솔","28","20020509","SILVER",8,10));
		List.add(new Member("진상솔","29","20040509","SILVER",8,21));
		List.add(new Member("CPA솔","30","20030509","SILVER",10,22));
		List.add(new Member("경영솔","31","20050509","SILVER",21,23));
		List.add(new Member("컴공솔","32","20060509","SILVER",22,24));
		List.add(new Member("재수솔","33","20060509","SILVER",22,24));
		List.add(new Member("강한솔","34","20030509","SILVER",15,24));
		List.add(new Member("약한솔","35","20050509","SILVER",15,20));
		List.add(new Member("무한솔","36","20060509","SILVER",10,25));
		List.add(new Member("금한솔","37","20080509","SILVER",8,20));
		List.add(new Member("배한솔","38","20080509","SILVER",9,25));
		List.add(new Member("솔한솔","39","20080509","SILVER",9,26));
		List.add(new Member("한솔솔","40","20010509","SILVER",2,21));
		List.add(new Member("자바솔","41","20020509","SILVER",3,22));
		List.add(new Member("C+솔","42","20020509","SILVER",12,20));
		List.add(new Member("웹프솔","43","19980509","SILVER",30,80));
		List.add(new Member("모프솔","44","19950509","SILVER",20,83));
		List.add(new Member("시프솔","45","19960509","SILVER",51,83));
		List.add(new Member("책상솔","46","19970509","SILVER",23,85));
		List.add(new Member("의자솔","47","19980509","SILVER",31,85));
		List.add(new Member("가방솔","48","19990509","SILVER",30,85));
		List.add(new Member("신발솔","49","19910509","SILVER",55,81));
		List.add(new Member("티비솔","50","19920509","SILVER",54,80));
	}
}
