package edu.uprm.cse.datastructures.bag;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class DynamicBagTest {
	Bag<Integer> M = new DynamicBag<Integer>();
	Bag<Integer> B = new DynamicBag<Integer>();
	Bag<Integer> B2 = new DynamicBag<Integer>();
	@Before
	public void setUp() throws Exception {

		//Bag M
		M.add(1);M.add(4);M.add(5);M.add(4);M.add(11);M.add(4);M.add(0);M.add(1);
		//Bag B
		B.add(1);B.add(8);B.add(1);B.add(4);
		//Bag B2
		B2.add(1);B2.add(4);B2.add(1);B2.add(11);

	}

	@Test
	public void testBagAnalizer() {
		//TEST #1
		List<Integer>result1 = new ArrayList<Integer>();
		result1.add(2);result1.add(0);result1.add(2);result1.add(3);
		List<Integer> lol = M.bagAnalizer(B);
		assertTrue(lol.equals(result1));
		//TEST #2
		List<Integer>result2 = new ArrayList<Integer>();
		result2.add(2);result2.add(3);result2.add(2);result2.add(1);
		List<Integer> lol2 = M.bagAnalizer(B2);
		assertTrue(lol2.equals(result2));
		//TEST #3
		List<Integer>result3 = new ArrayList<Integer>();
		result3.add(2);result3.add(1);result3.add(2);result3.add(0);
		List<Integer> lol3 = B.bagAnalizer(B2);
		assertTrue(lol3.equals(result3));
		//TEST #4
		List<Integer>result4 = new ArrayList<Integer>();
		result4.add(2);result4.add(1);result4.add(0);result4.add(1);result4.add(0);result4.add(1);result4.add(0);result4.add(2);
		List<Integer> lol4 = B.bagAnalizer(M);
		assertTrue(lol4.equals(result4));
	}

}
