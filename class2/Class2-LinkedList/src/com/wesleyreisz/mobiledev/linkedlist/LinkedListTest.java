package com.wesleyreisz.mobiledev.linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {

	@Test
	public void test() {
		MyNodeList list = new MyNodeList();
		list.add("wes");
		list.add("justin");
		list.add("kim");
		list.add("tyler");
		list.add("leanne");
		Assert.assertEquals("wes justin kim tyler leanne " , list.print());
	}
}
