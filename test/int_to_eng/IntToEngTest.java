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
	@Test
	public void testOnes() {
		String expected = "eight";
		String actual = IntToEng.ones(8);
		assertThat(actual, equalTo(expected));
		
	}
	@Test
	public void testTens() {
		String expected = "eighty";
		String actual = IntToEng.tens(8);
		assertThat(actual, equalTo(expected));
		
	}
	@Test
	public void testTeens() {
		String expected = "nineteen";
		String actual = IntToEng.teens(19);
		assertThat(actual, equalTo(expected));
		
	}
	@Test
	public void test40() {
		String expected = "forty";
		String actual = IntToEng.translateEng(40);
		assertThat(actual, equalTo(expected));
		
	}
	@Test
	public void test322() {
		String expected = "three hundred twenty two";
		String actual = IntToEng.translateEng(322);
		assertThat(actual, equalTo(expected));
		
	}
	
}
