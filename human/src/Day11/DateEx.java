package Day11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) throws ParseException {
		// Date 객체는 시스템에서 현재 날짜를 가져온 정보를 가지고있다.
		Date now = new Date();
		System.out.println("now : " + now);
		
		String daterStr = now.toString();
		System.out.println("Date 문자열 기본 포맷: " + daterStr);
		
		//내가 원하는 방식으로 바꾸고싶을때
		String dateFormat = "yyyy년 MM월 dd일 hh시 mm분 ss초" ;
		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
		String nowStr = sdf.format(now);
		System.out.println(nowStr);
		
		String dateFormat2 = "yyyy/MM/dd hh:mm:ss";
		SimpleDateFormat sdf2 = new SimpleDateFormat(dateFormat2);
		String nowStr2 = sdf2.format(now);
		System.out.println(nowStr2);
		
		String day1 = "2022/11/25";
		String day2 = "2022/12/05";
		
		Date date1 = new SimpleDateFormat("yyyy/MM/dd").parse(day1);
		Date date2 = new SimpleDateFormat("yyyy/MM/dd").parse(day2);
		
		long gapDays = (date2.getTime() - date1.getTime()) / (1000*60*60*24);
		long gapHours = (date2.getTime() - date1.getTime()) / (1000*60*60);
		long gapMin = (date2.getTime() - date1.getTime()) / (1000*60);
		long gapSec = (date2.getTime() - date1.getTime()) / (1000);
		
		
		
		System.out.println("1970/01/01 00:00:00 00ms ~ date1까지");
		System.out.println(date1.getTime());
		System.out.println(date1.getTime() / 1000);
		System.out.println(date1.getTime() / 1000 / 60);
		System.out.println(date1.getTime() / 1000 / 60 / 60);
		System.out.println(date1.getTime() / 1000 / 60 / 60 / 24);

		System.out.println("1970/01/01 00:00:00 00ms ~ date2까지");
		System.out.println(date1.getTime());
		System.out.println(date1.getTime() / 1000);
		System.out.println(date1.getTime() / 1000 / 60);
		System.out.println(date1.getTime() / 1000 / 60 / 60);
		System.out.println(date1.getTime() / 1000 / 60 / 60 / 24);
		
		System.out.println("시험 D-day : " + gapDays);
		System.out.println("시험 D-hours : " + gapHours);
		System.out.println("시험 D-min : " + gapMin);
		System.out.println("시험 D-sec : " + gapSec);
		
		// Date 객체의 getXXX()메소드는 deprecated
		// --> 날짜의 년/월/일을 추출하는 기능은 Calendar 클래스에서 다룬다
		System.out.println("today (년) : " + date1.getYear());
		
		
		// 년/월/일은 Calendar로 추출
		// Date를 Calendar로 변환하여 년/월/일을 추출
		Calendar calendar = Calendar.getInstance();
		//Calendar객체.setTime(Date객체)
		calendar.setTime(date1);
		
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int day = calendar.get(Calendar.DAY_OF_MONTH);

		System.out.println("today (년) : " + year);
		System.out.println("today (월) : " + month);
		System.out.println("today (일) : " + day);
		
		// 2022/11/25 : 5일 후 
		// 2022/11/25 : 10일 후 
		// 2022/11/25 : 100일 후 
		System.out.println( date1.getTime() );
		
		int dayTime = ( 1000*60*60*24 );
		int day5Timevalue = 5 * dayTime;
		int day10Timevalue = 10 * dayTime;
		int day20Timevalue = 20 * dayTime;
		
		// 5일후
		Date after5Days = new Date();
		after5Days.setTime(date1.getTime() + day5Timevalue);
		String after5DaysStr = sdf.format(after5Days);
		System.out.println(after5DaysStr);

		// 10일후
		Date after10Days = new Date();
		after10Days.setTime(date1.getTime() + day10Timevalue);
		String after10DaysStr = sdf.format(after10Days);
		System.out.println(after10DaysStr);
		
		// 20일후
		Date after20Days = new Date();
		after20Days.setTime(date1.getTime() + day20Timevalue);
		String after20DaysStr = sdf.format(after20Days);
		System.out.println(after20DaysStr);
				
		// 100일후는 올바르지 않은 결과가 나온다.
		// 날짜를 계산하는 경우는 Calendar 클래스를 사용할 것을 권장
		// 100일후
		
		
		
		
		
		
		
		
		
	}
}
