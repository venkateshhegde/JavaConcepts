package org.slearning.localtime;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class LocalTimeLearning {

	public static void main(String[] args) {
		LocalTimeLearning l = new LocalTimeLearning();
		System.out.println(l.getCurrTime());
	}
	
	public LocalDateTime getCurrTime()
	{
		return LocalDateTime.now(ZoneId.of("GMT"));
	}
}
