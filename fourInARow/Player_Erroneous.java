package com.btpn.course.week2.fourInARow;
import java.util.Scanner;

public class Player_Erroneous {
	private String[] playerNames = new String[4];
	private int maxPlayers = 4;
	private int minPlayers = 2;
	private int totalPlayers = 0;
	private Scanner scanner = new Scanner(System.in);
	
	//Constructor with formal parameters to construct Player objects - name and number
			public Player_Erroneous(String initName, int initPlayerNumber) {
				String name = initName;
				int playerNumber = initPlayerNumber;
			}
	//Default constructor - used for enabling access to methods independent of players. Verified.
			public Player_Erroneous() {	
			}
			
	//Method to quickly print. Verified.
	public void print(String stringToPrint) {
		System.out.println(stringToPrint);
	}
	
	//Method to inquire how many players. Validates responses to be 2-4.
	public void howMany() {
		print("This game requires 2-4 players. Enter how many people are playing: ");
		totalPlayers = scanner.nextInt();
		if (totalPlayers < minPlayers) {
			print("You've specified too few players.");
			howMany();
		}
		else if (totalPlayers > 4) {
			print("You've specified too many players.");
			howMany();
		} else {
			print("You've chosen to play with " + totalPlayers + "players.");
		}	
	}
	
	
		
	//Method to gather player names. **May need to verify that playerIndex updates with increments of playerNum
	public void enterPlayerNames() {
		String dummyVariable = scanner.nextLine();
		for (int playerNum = 1, playerIndex = playerNum -1; playerIndex < totalPlayers; playerNum++) {
			print("Enter the name of Player" + playerNum);
			playerNames[playerIndex] = scanner.nextLine();
			}
		}
	
	//Method to verify no duplicates exists
	public void dupeCheck() {
		for(int playerIndex = 0; playerIndex < totalPlayers -1; playerIndex++) {
			int nextPlayerIndex = playerIndex +1;
			if (playerNames[playerIndex].equalsIgnoreCase(playerNames[nextPlayerIndex])) {
				print("Player " + nextPlayerIndex +1 + " is a duplicate. Please enter a new name: ");
				playerNames[nextPlayerIndex] = scanner.nextLine();
				playerIndex--; //Re-checks if current name is a duplicate
			} else if (nextPlayerIndex < totalPlayers -1) {
				nextPlayerIndex++;
			}	
		}
	}
	
	//Method to return player name based on their player number.
	public String getName(int playerNumber) {
		try {
			return playerNames[playerNumber -1];
		} catch (Exception e) {
			return "Error - No player exists with that number.";
		}
	}
	
	//Method to return player number based on their name.
	public int getNumber (String playerName) {
		int index;
		for (index = 0; index < totalPlayers; index++) {
			if (playerNames[index].equalsIgnoreCase(playerName)) {
				return index +1;
			}
		}
		return -1;
	}
	
	//Method to inquire which column player wishes to place token in.
	public int makeMove() {
		print("Which column would you like to place your token in?: ");
		int tokenPlacement = scanner.nextInt();
		return tokenPlacement;
	}
}


/* 
Want player names -> String array?

Want to ensure 2-4 players -> If < 2 || if > 4
	true -> re-run player names
	false -> Continue

Want to validate duplicates -> for loop on string array?
	Dupe -> Re-enter dupe player name
		Update player in array
		



*/