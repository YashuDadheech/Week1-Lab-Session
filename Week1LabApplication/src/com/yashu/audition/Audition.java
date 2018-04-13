package com.yashu.audition;

import java.util.Random;
import java.util.Scanner;

public class Audition {

	private static Scanner input;
	private static int countPerformer;
	private static int countDancer;
	private static int countVocalist;
	private static int totalParticipant;
	private static int auditionCandidate;
	private static int totalCount;

	public static void main(String[] args) {
		Random ran = new Random();
		input = new Scanner(System.in);
		while (totalParticipant != 7) {
			System.out.println("No. of Participants in audition?");
			System.out.println("You have to enter 7 for audition participants");
			totalParticipant = input.nextInt();
		}
		if ((totalParticipant == 7)) {

			totalCount = countPerformer + countDancer + countVocalist;
			while (totalCount < 7) {
				int[] performerType = { 0, 1, 2 };
				System.out.println("Enter performer type Candidate for Audition between (0 - 2)");
				System.out.println(" 0 - Performer , 1 - Dancer , 2 - Vocalist");
				auditionCandidate = input.nextInt();

				if (auditionCandidate == performerType[0] && countPerformer <= 3) {
					int id = ran.nextInt();
					System.out.println("Performer id is" + id + " - performer");
					countPerformer++;
					System.out.println("performer count" + countPerformer);
				} else if (auditionCandidate == performerType[1] && countDancer <= 1) {
					int id = ran.nextInt();
					System.out.println("dancer id is" + "tap - " + id + " - performer");
					countDancer++;
					System.out.println("dancer count" + countDancer);
				} else if (auditionCandidate == performerType[2] && countVocalist != 1) {
					int id = ran.nextInt();
					System.out.println("Enter volume range for vocalist");
					int volumeRange = input.nextInt();
					System.out.println("Enter a key for vocalist between A - Z");
					String vocalistKey = input.next();
					System.out.println(
							"I sing in the key of - " + vocalistKey + "- at the volume" + volumeRange + "-" + id);
					countVocalist++;
					System.out.println("vocalist count" + countVocalist);
				}

				totalCount = countPerformer + countDancer + countVocalist;
				System.out.println("Total count " + totalCount);

				if (countPerformer == 4) {
					System.out.println("Performers are enough for audition ");
				}

				if (countDancer == 2) {
					System.out.println("Dancers are enough for audition ");
				}

				if (countVocalist == 1) {
					System.out.println("Vocalists are enough for audition ");
				}

				if (totalCount == 7) {
					System.out.println("Audition is done");
				}

			}
		}

	}

}
