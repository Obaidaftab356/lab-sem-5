package LAB11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class factorialtest {

	@Test
	void test() {
		JUnitTesting obj=new JUnitTesting();
		int output=obj.factorial(4);
		assertEquals(24, output);
	}


}
