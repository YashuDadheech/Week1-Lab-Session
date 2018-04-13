/**
 * 
 */
package com.yashu.audition;

import java.security.SecureRandom;

/**
 * @author SFMOOCuser
 *
 */
public class Performer {

	private int performerId;
	private int randomNo;
	public int getPerformerId() {
		return performerId;
	}

	public void setPerformerId(int performerId) {
		this.performerId = performerId;
	}

	public void setRandomPerformId() {
		SecureRandom random = new SecureRandom();
		randomNo = random.nextInt();
		while (randomNo < 0) {

			randomNo = 1 + random.nextInt();
			performerId = randomNo;

		}

		performerId = 1 + randomNo;
	}
}
