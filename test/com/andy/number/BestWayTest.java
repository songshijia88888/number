package com.andy.number;

import org.junit.*;

public class BestWayTest {
	@Test
	public void stopPathTest(){
		BestWay bw = new BestWay();
		bw.stopPath(0, 0, bw.getTarget().length - 1);
	}
}
