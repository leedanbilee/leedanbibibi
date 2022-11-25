package Day11;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarEx2 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();

		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONDAY) + 1);
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"); // hh : 12시기준, HH: 24시 기준
		String today = sdf.format(cal.getTime());
		System.out.println(today);

		// 10분 후
		cal.add(Calendar.MINUTE, 10);
		String after10Min = sdf.format(cal.getTime());
		System.out.println(after10Min);

		// 1시간 후
		cal.add(Calendar.HOUR, 1);
		String after1Hour = sdf.format(cal.getTime());
		System.out.println(after1Hour);

		// 1일 후
		cal.add(Calendar.DAY_OF_MONTH, 1);
		String after1Day = sdf.format(cal.getTime());
		System.out.println(after1Day);

		// 이번주 로또 추첨일시??
		// 매일 6시부터 24시까지 판매
		// 추첨일(토요일)에는 오후 8시에 판매 마감
		// 추첨일 오후 8시부터 다음날(일요일) 오전 6시까지 판매 정지

		// 조건
		// 일요일 오전 6시 ~ 토요일 오후 8시 : 이번주 토요일 9시 추첨일시
		// 구입요일, 구입 시간
		Calendar lottoCal = Calendar.getInstance(); // 현재 시간
		
		// 2일후 - 일요일 오전 11시
		lottoCal.add(Calendar.DAY_OF_MONTH, 2);
		
		// 일요일(1) ~ 토요일(7)
		int 요일 = lottoCal.get(Calendar.DAY_OF_WEEK);
		int 시간 = lottoCal.get(Calendar.HOUR);
		int ampm = lottoCal.get(Calendar.AM_PM);
		String todayOfWeek = "";
		
		switch (요일) {
		case 1: todayOfWeek = "일"; break;
		case 2: todayOfWeek = "월"; break;
		case 3: todayOfWeek = "화"; break;
		case 4: todayOfWeek = "수"; break;
		case 5: todayOfWeek = "목"; break;
		case 6: todayOfWeek = "금"; break;
		case 7: todayOfWeek = "토"; break;
		}
		System.out.println(요일);
		System.out.println(시간);
		System.out.println(ampm);			// 0 : 오전, 1 : 오후
		System.out.println(todayOfWeek);
		
		lottoCal.set(Calendar.AM_PM, 1);	// 오후
		lottoCal.set(Calendar.HOUR, 9);		// 9시
		lottoCal.set(Calendar.MINUTE,0);
		lottoCal.set(Calendar.SECOND,0);
		boolean buyYn = false;
		// 1. 토요일이면서, 오후 8시 이후 	- 구입 불가 
		if( todayOfWeek.equals("토") && 시간 >= 8 && ampm == 1 ) {
			System.out.println("구입불가");
		}
		// 2. 일요일이면서, 오전 6시 이전 	- 구입 불가
		else if( todayOfWeek.equals("일") && 시간 <6 && ampm == 0 ) {
			System.out.println("구입불가");
		}
		
		// 3. 일요일이면서, 오전 6시 이후 	- 다음주 토요일 오후 9시 추첨일
		else if( todayOfWeek.equals("일") && 시간 >=6 && ampm == 0 ) {
			lottoCal.set(Calendar.DATE, 6);		// 6일후
			buyYn = true;
		}
		
		// 4. 그 외, 					- 이번주 토요일 오후 9시 추첨일			
		else {
			// 월 -> 토 : 2 -> 7 : 5
			// 화 -> 토 : 3 -> 7 : 4
			// ...
			// 요일 : 2 3 4 5 6 7
			// 차이 : 5 4 3 2 1 0 = 7 - 요일 
			lottoCal.set(Calendar.DATE, 7-요일);		// 6일후
			buyYn = true;
		}
		String 추첨일 = sdf.format(lottoCal.getTime());
		System.out.println(추첨일);
		
	}
}
