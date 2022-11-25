package Day11;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class DateTimeOperationEx {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		
		System.out.println("현재 시간 : " + now);
		
		LocalDateTime targetTime = now.plusYears(1)
										.plusMonths(1)
										.plusDays(1)
										.plusMinutes(1)
										.minusHours(1)
										.minusSeconds(1);
		
		System.out.println("변경 시간 : " + targetTime);
	
		targetTime = now.withYear(2002)
						.withMonth(8)
						.withDayOfMonth(7)
						.withHour(2)
						.withMinute(30)
						.withSecond(50);
	
		System.out.println("태어난 시간 : "  + targetTime);
	
		// 년도
		targetTime = now.with(TemporalAdjusters.firstDayOfYear());
		System.out.println("올해의 첫 날 : " + targetTime);
		
		targetTime = now.with(TemporalAdjusters.lastDayOfYear());
		System.out.println("올해의 마지막 날 : " + targetTime);
		
		targetTime = now.with(TemporalAdjusters.firstDayOfNextYear());
		System.out.println("다음해 첫 날 : " + targetTime);
		
		targetTime = now.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("이번달의 첫 날 : " + targetTime);
		
		targetTime = now.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println("이번달의 마지막 날 : " + targetTime);

		targetTime = now.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
		System.out.println("이번달의 첫번쨰 월요일: " + targetTime);
		
		targetTime = now.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
		System.out.println("다음 토요일 : " + targetTime);
		
		targetTime = now.with(TemporalAdjusters.previous(DayOfWeek.SUNDAY));
		System.out.println("지난 일요일 : " + targetTime);
		
		
		
	}
}
