package com.ellucian.task1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

@SuppressWarnings("unused")
public class PlayerSortWithScore {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of players:");

		int number = sc.nextInt(); // scanning the no of players

		Players[] players = new Players[number]; // initializing an array to hold the name and runs

		for (int i = 0; i < number; i++) { // iterating no of players

			System.out.println("Enter the name and score of player" + i + ":");

			players[i] = new Players(sc.next(), sc.nextInt());

		}
		sc.close();

		sortScoreAndName(players);

	}

	public static void sortScoreAndName(Players[] players) {

		PlayersComparator comparator = new PlayersComparator();

		Arrays.sort(players, comparator);

		for (int i = 0; i < players.length; i++) {

			System.out.printf("%s %s\n", players[i].getName(), players[i].getScore());

		}

	}

}
