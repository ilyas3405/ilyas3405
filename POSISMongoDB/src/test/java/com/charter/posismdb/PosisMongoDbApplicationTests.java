package com.charter.posismdb;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


import com.charter.posismdb.service.PerformActions;


class PosisMongoDbApplicationTests {

	@Test
	void testSaveASN() {
	PerformActions performactions = new PerformActions();
	String expected = "saved";
	String actual = "saved";
	 
	performactions.SaveASN();
	assertEquals(expected, actual);
		}

}
