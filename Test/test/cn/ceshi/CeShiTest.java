package cn.ceshi;

import static org.junit.Assert.*;

import org.junit.Test;

public class CeShiTest {

	@Test
	public void testAdd() {
		assertEquals(3, new CeShi().add(1,2));
	}

	@Test
	public void testJian() {
		assertEquals(3, new CeShi().jian(5,2));
	}

	@Test
	public void testCheng() {
		assertEquals(3, new CeShi().cheng(1,3));
	}

	@Test
	public void testChu() {
		assertEquals(2, new CeShi().chu(4,2));
	}

}
