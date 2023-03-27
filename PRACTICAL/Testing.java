import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Testing {

	@Test
	void test() {
		Operation x=new Operation();
		int result=x.sum(1, 5);
		assertEquals(6,result,"values not same");

}
	@Test
	void test1() {
		Operation y=new Operation();
		int result=y.sum(1, 5);
		assertEquals(5,result,"values not same");
	}
	
	@Test
	void test2() {
		Operation z=new Operation();
		int smaller=z.smallerBetweenThree(12, 30, 6);
		assertEquals(6, smaller);
	}
	@Test
	void test3() {
		String str="mom";
		Operation op= new Operation();
		String result=op.reverseString(str);
		assertEquals(str, result,"values not same");
		
	}
	@Test
	void test10() {
		String str="man";
		Operation op= new Operation();
		String result=op.reverseString(str);
		assertEquals(str, result,"values not same");
		
	}

	@Test
	void test4() {
		int [] a1= {1,2,3,4};
		int [] a2= {1,2,3,4};
		assertArrayEquals(a1,a2);
	}
	@Test
	void test5() {
		String st="abc";
		assertNull(st,"values not null");
	}
	@Test
	void test6() {
		String st=null;
		assertNull(st,"values not null");
	}
	@Test
	void test7() {
		Operation o=new Operation();
		assertNotNull(o);
	}
	@Test
	void test8()
	{
		assertTrue(23<9,()->"ram");
	}
	@Test
	void test9() {
		
		assertFalse(false,"ram");
	}
	@Test
	void test11() {
		int exp[]= {2,4,6,8,10,12,14,16,18,20};
		Operation op= new Operation();
		int actualResult[]=op.table(2);
		assertArrayEquals(exp, actualResult);
		
	}
	@Test
	void test12() {
		int exp[]= {2,4,6,8,10,12,14,16,18,20};
		Operation op= new Operation();
		int actualResult[]=op.table(3);
		assertArrayEquals(exp, actualResult);
		
	}


	
}
