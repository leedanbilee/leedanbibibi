package Day13.Ex01_Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
	Map
	: 키(key), 값(value)이 쌍으로 구성되어있는 컬렉션
	key는 중복되지 않는다
	
	객체추가
	- put(key,value)		: 주어진 키로 값을 추가
							- 중복된 키에 추가하면, 마지막에 추가한 값이 저장된다.
	
	객체 검색
	- contains(key)			: 키가 존재하는지 여부
	- containValue(value)	: 값이 존재하는지 여부
	- get(key)				: 키에 해당하는 값을 반환
	- isEmpty()
	- size()
	- keyset()				: 모든 키를 set 객체로 반환
	- values()				: 모든 값을 collection으로 반환
	
	객체 삭제
	- remove(key)			: 키에 해당하는 값을 삭제
	- clear()				: 모든 요소 삭제

 */
public class MapEx {
	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("RM", 90);
		map.put("진", 100);
		map.put("슈가", 80);
		map.put("제이홉", 70);
		map.put("지민", 60);
		map.put("뷔", 50);
		map.put("정국", 95);
		
		System.out.println("총 객체 수 : " + map.size());
		System.out.println();
		System.out.println("지민의 코딩성적 : " + map.get("지민"));

		// 모든 키를 가져온다 : keySet()
		Set<String> keySet = map.keySet();
		
		for(String key : keySet) {
			Integer value = map.get(key);
			System.out.println(key+ ":" + value);
		}
		System.out.println();
		
		map.remove("지민");
		System.out.println("총 객체 수 : " + map.size());
		
		// Iterator 를 이용한 반복
		// map.entrySet()		: iterator()메소드를 갖는 Set객체를 반환한다.
		// entrySet.iterator()	: Map 컬렉션을 순차 검색할 수 있는 Iterator 객체를 가져온다.
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String,Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();				// 키
			Integer value = entry.getValue();			// 값
			System.out.println(key + " : " + value);
			
		}
		map.clear();
		System.out.println("총 객체 수 : " + map.size());
		System.out.println("empty 여부 : " + map.isEmpty());
		
	}
}
