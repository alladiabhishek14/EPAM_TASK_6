package com.epam.task.epam_task_6;

import static org.junit.Assert.*;

import org.junit.Test;

public class RemoveATest {


	@Test
	public void test1() {
		RemoveA charA=new RemoveA();
		String res=charA.remove("ABCD");
		assertEquals("BCD",res);
	}
	@Test
	public void test2() {
		RemoveA charA=new RemoveA();
		String res=charA.remove("AACD");
		assertEquals("CD",res);
	}
	@Test
	public void test3() {
		RemoveA charA=new RemoveA();
		String res=charA.remove("BBAA");
		assertEquals("BBAA",res);
	}
	@Test
	public void test4() {
		RemoveA charA=new RemoveA();
		String res=charA.remove("AABAA");
		assertEquals("BAA",res);
	}


}
