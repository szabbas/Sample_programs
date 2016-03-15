package sample_program;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloTest {

	@Test
	public void test() {
		Sumofnumbers obj=new Sumofnumbers();
		int result=obj.add(10, 20);
		assertEquals(30, result);
	}

}
