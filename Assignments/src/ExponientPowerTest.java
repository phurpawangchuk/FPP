import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExponientPowerTest {
	ExponientPower ob = new ExponientPower();
	@Test
	void test() {
		double input = ob.power(2.0, 3);
		double output = 8.0;
		assertEquals(input, output);
	}

}
