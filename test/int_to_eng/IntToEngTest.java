package int_to_eng;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class IntToEngTest {

	@Test
	public void test1() {
		String expected = "one";
		String actual = IntToEng.translateEng(1);
		assertThat(actual, equalTo(expected));
		
		
	}
	@Test
	public void test21() {
		String expected = "twenty one";
		String actual = IntToEng.translateEng(21);
		assertThat(actual, equalTo(expected));
		
	}
}
