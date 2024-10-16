package LAB11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class eventest {

	@Test
	void test() {
		JUnitTesting obj=new JUnitTesting();
		boolean output=obj.isEven(5);
		assertEquals(false, output);
	}

}
