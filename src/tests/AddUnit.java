package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddUnit {

	@Test
	public void test() {
		UnitTesting unitTesting = new UnitTesting();
		int obj_f=unitTesting.add(4,6);
		assertEquals(10, obj_f);
	}

}
