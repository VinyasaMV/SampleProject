package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class SquareUnit {

	@Test
	public void test() {
	UnitTesting unitTesting = new UnitTesting();
	int obj_f=unitTesting.square(4);
	assertEquals(16, obj_f);
	}

}
