package com.yashu.audition;

import java.security.SecureRandom;
import java.util.Random;

public class Dancer {

	private int Id;
	private String Style;
	private int randomNo;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getStyle() {
		return Style;
	}

	public void setStyle(String style) {
		Style = style;
	}

	public void setRandomDancerId() {
		SecureRandom random = new SecureRandom();
		randomNo = random.nextInt();
		while (randomNo < 0) {

			randomNo = 1 + random.nextInt();
			Id = randomNo;

		}

		Id = 1 + randomNo;
		
	}

}
