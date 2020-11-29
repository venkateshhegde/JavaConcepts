package org.slearning.localtime;

import static org.junit.jupiter.api.Assertions.*;

import java.time.ZoneId;
import java.time.ZoneOffset;

import org.junit.jupiter.api.Test;


class LocalTimeTests {

	@Test
	void testTime() {
		assertEquals(true, new LocalTimeLearning().getCurrTime().
				toInstant(ZoneOffset.UTC).toEpochMilli()
				>0);
		
	}

}
