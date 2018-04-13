package com.yashu.audition;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AuditionApplication {

	private static Scanner input;
	private static List<Performer> performers = new ArrayList<Performer>();
	private static List<Dancer> dancers = new ArrayList<Dancer>();
	private static List<Vocalist> vocalists = new ArrayList<Vocalist>();
	private static String inputPerformerType;
	private static int volume;

	// private static final String SENTINAL = "#";
	public static void main(String[] args) {

		// create a Scanner object to obtain input from the command window
		input = new Scanner(System.in);

		// Call method to get input for Performer Type
		inputPerformerType();

	}

	private static void inputPerformerType() {

		System.out.println("Enter the type of performer");
		System.out.println("Ctrl - Z to stop putting input if you want to terminate");

	//	while()
		inputPerformerType = input.next();
		/*
		 * while (!inputPerformerType.equals(SENTINAL)) {
		 * System.out.println("inside while"); inputPerformerType = input.next(); }
		 */

		pickAndDisplayPerformerType(inputPerformerType);

	}

	private static void pickAndDisplayPerformerType(String performerType) {
		if (PerformerType.PERFORMER.getValue().equals(performerType)) {
			int[] countArray;
			
			performers = definePerformerObjects();
			
			/*if(performers.size()==4)
			{
				for(Performer performer : performers) {
					
				}
			}*/

			System.out.println(performers.get(0).getPerformerId() + " - Performer");

		} else if (PerformerType.DANCER.getValue().equals(performerType)) {

			dancers = defineDancerObjects();

			System.out.println(dancers.get(0).getStyle() + "\t" + dancers.get(0).getId() + " - Dancer");

		} else if (PerformerType.VOCALIST.getValue().equals(performerType)) {

			vocalists = defineVocalistObjects();

			System.out.println("I sing in the key of - " + vocalists.get(0).getKey() + "- at the volume " + volume + "-"
					+ vocalists.get(0).getId() + " - Vocalist");

		} else {
			System.out.println("Enter the Correct type of performer");
			// performerType = inputPerformerType();

		}

	}

	private static List<Performer> definePerformerObjects() {
		// Define performer objects
		// List<Performer> auditionSelectedPerformer;
		// int count = 0;
		Performer[] performerArray = new Performer[4];
		for (int i = 0; i < performerArray.length; i++) {
			Performer performer = new Performer();
			performers.add(performer);
		}

		for (Performer performer : performers) {
			performer.setRandomPerformId();
		}

		return performers;

	}

	// Define Dancer Objects

	private static List<Dancer> defineDancerObjects() {
		Dancer[] dancerArray = new Dancer[2];
		for (int i = 0; i < dancerArray.length; i++) {
			Dancer dancer = new Dancer();
			dancers.add(dancer);
		}
		for (Dancer dancer : dancers) {
			//dancer.setRandomDancerId();
			dancer.setStyle("tap");
		}
		return dancers;
	}

	private static List<Vocalist> defineVocalistObjects() {
		// Define Vocalist Object
		Vocalist[] vocalistArray = new Vocalist[1];
		for (int i = 0; i < vocalistArray.length; i++) {
			Vocalist vocalist = new Vocalist();
			vocalists.add(vocalist);
		}

		System.out.println("Enter a volume range between 1 - 10");
		volume = input.nextInt();
		System.out.println("Enter a key from A-Z");
		String key = input.next();

		for (Vocalist vocalist : vocalists) {
			vocalist.setRandomVocalistId();
			vocalist.setKey(key);

		}
		return vocalists;
	}

}