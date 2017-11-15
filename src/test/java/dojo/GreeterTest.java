package dojo;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.joda.time.LocalTime;
import org.junit.Test;

public class GreeterTest {
	
	private Greeter greeter = new Greeter();

	@Test
	public void greeterSaysHello() {
		assertThat(greeter.sayHello(), containsString("Hello"));
	}

	@Test
	public void greeter2() {
		LocalTime currentTime = new LocalTime();
		assertThat(currentTime.toString(), containsString("16:"));
	}

}
