package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import test.ex3;

public class ex3Test {
	@Test
	public void test1() {
		int[] values = {-999,1};
        int min = 0;
        int max = 1;
        int result = test.ex3.average(values, min, max);
        assertEquals(-999, result);
	}
	
	@Test
	public void test2() {
		int[] values = {2,0};
        int min = 1;
        int max = 3;
        int result = test.ex3.average(values, min, max);
        assertEquals(2, result);
	}
	
	@Test
	public void test3() {
		int[] values = {2,5};
        int min = 0;
        int max = 1;
        int result = test.ex3.average(values, min, max);
        assertEquals(-999, result);
	}
}
