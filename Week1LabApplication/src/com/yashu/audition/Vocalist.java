package com.yashu.audition;

import java.security.SecureRandom;

public class Vocalist {

	private int Id;

	private String key;

	private int randomNo;

	public int getId() {
		return Id;
	}

	public void setId(int Id) {
		this.Id = Id;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public void setRandomVocalistId() {
		SecureRandom random = new SecureRandom();
		randomNo = random.nextInt();
		while (randomNo < 0) {

			randomNo = 1 + random.nextInt();
			Id = randomNo;

		}

		Id = 1 + randomNo;
	}

}
