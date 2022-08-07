package day11;
import java.util.*;
public class HashSetTest2 {

	public static void main(String[] args) {
		//Member 객체 3개 생성해서 HashSet에 저장하세요
		Member m1=new Member("홍길동", 22);
		Member m2=new Member("김원빈", 23);
		Member m3=new Member("이선미",24);
		Member m4=new Member("홍길동", 22);
		Member m5=new Member("홍길동", 33);
		//String, int 등에서 중복 저장을 막지만
		//직접 만든 도메인 객체에서는 이름 나이 같아도 인식을 못해서 별개의 정보로 카운트된다!!
		
		//오버라이딩하고나선 중복인식을 막는다
		
		Set<Member> set=new HashSet<>();
		set.add(m1);
		set.add(m2);
		set.add(m3);
		set.add(m4);
		set.add(m5);
		System.out.println("set.size(): "+set.size());
		
		//iterator() 메서드로 저장된 회원들의 정보를 출력하세요
		Iterator <Member> it=set.iterator();

		for(int i=1;it.hasNext();i++) {
			Member user=it.next();
			System.out.println(i+": "+user.name+", "+user.age+"세");
		} 
		
		System.out.println("m1.hashCode(): "+m1.hashCode());
		System.out.println("m1.hashCode(): "+m4.hashCode()); //해쉬코드가 같으니 해쉬코드를 이용해 중복정보를 막을 것
		System.out.println("m1.hashCode(): "+m2.hashCode());

	}

}
