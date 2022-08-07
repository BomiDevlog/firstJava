package day11;
import java.util.*;
/*TreeSet
 * - 추가된 데이터들이 정렬된다.
 * - 데이터 중복을 허용하지 않는다.
 * - 내부적으로 이진 트리를 사용해 데이터를 저장하고 꺼낸다.
 * (정렬되어 자료정리되기에 검색에 유용)
 */
public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<String> tree=new TreeSet<>();
		tree.add("홍길동");
		tree.add("강감찬");
		tree.add("김철수");
		tree.add("이순신");
		tree.add("정약용");
		tree.add("홍길동");//카운트되지않음 = 데이터중복 허용하지않음.
		
		System.out.println("tree.size(): "+tree.size());
		
		//확장 for문으로 출력하기
		for(String s:tree)//저장된유형의 변수 : 자료변수
			System.out.println(s); //가나다 순으로 출력됨

	}

}
