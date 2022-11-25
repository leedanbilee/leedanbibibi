package Day10.Ex05_UserDefineException;

public class Storage {

	// 창고에 보관한 물건 개수
	private int count;
	// 물건 최대 20개 보관 가능
	final static int MAX_COUNT = 20 ;

	// 생성자
	public Storage() {
	
	}
	
	// 입고
	// void :  반환타입이 없음
	// return 키워드를 안써줘도 됨.
	// void를 쓰지 않으려면 int를 쓰고 ----> return (int)값이 반드시 있어야 함.
	public void in(int count) throws StorageOverflowException {
		if(this.count + count > MAX_COUNT) {
			// 강제 예외 발생 (throw)
			throw new StorageOverflowException("입고 불가");
		}
		this.count += count;
	}
	
	// 출고
	public void out(int count) throws StorageOverflowException {
		if(this.count - count < 0) {
			throw new StorageOverflowException("출고 불가");
		}
		
		
		this.count -= count;
	}
	
}
