package ie.setu.Lab3aq1;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Clock {

	public static void main(String[] args) {
		//create a time object
		Calendar cal = Calendar.getInstance();
		Time t = new Time (cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE));
		
		for(int i = 0; i < 60; i++) {
			t.tick();
			System.out.println(t.toString());
			try {
				TimeUnit.SECONDS.sleep(1);
			}
			catch (Exception e) {
				System.out.println("error");
			}
		}
	}

}
