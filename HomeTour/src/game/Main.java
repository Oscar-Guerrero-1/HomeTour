package game;
// This is where the game-loop will go, where we'll display a prompt, collect input, and parse that input

import java.util.Scanner;
import fixtures.*;

public class Main {
	
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// set up Room manager
		RoomManager rm = new RoomManager();
		rm.init();
		
		// set current room to the starting room
		Room currentRoom = rm.startingRoom;
		
		boolean quit = false;
		
		while (!quit){
		
			System.out.println("The room you are in is " + currentRoom);
			
			System.out.println("\nWhere do you want to go? South, North, East, or West?"+
			"\nOr do you want to quit? ");
			
			String input = scan.nextLine();
			
			// .trim() makes sure there is no white space.
			if(input.trim().toLowerCase().equals("quit")) {
				quit = true;
				continue;
			}
			
			Room nextRoom = null;
			
			if(input.trim().toLowerCase().equals("south")) {
				nextRoom = currentRoom.getSouthExit();
			}else if (input.trim().toLowerCase().equals("north")) {
				nextRoom = currentRoom.getNorthExit();
			}else if (input.trim().toLowerCase().equals("west")) {
				nextRoom = currentRoom.getWestExit();
			}else if (input.trim().toLowerCase().equals("east")) {
				nextRoom = currentRoom.getEastExit();
			}
			
			if (nextRoom != null) {
				currentRoom = nextRoom;
			}
		}
		/*
		//Collect input
		collectInput();
		//Process input as a command
		
		//Print output of command
		parse(collectInput(),newPlayer);
		
		*/
	}
	
	/*
	// method will print a prompt to the console for the player's current room
	private static void printRoom(Player player) {

		RoomManager rm = new RoomManager();
		rm.init();
		// set current room to the starting room
		Room currentRoom = rm.startingRoom;
		System.out.println("The room you are in is the " + currentRoom);
		
	}
	
	// this method will use a Scanner object to collect console input from the user, 
	 // and then will divide that input into a target and action part
	// This method will break the input into a String[], and return that.
	private static String collectInput() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Where would you like to go? ");
		String input = scan.nextLine();
		
		
		String[] command = new String[] {input};
		
		//System.out.println(java.util.Arrays.toString(command));
		
		scan.close();
		
		return command;
		
	}
	
	
	// method will take the output of the collectInput() method and a player object, and will resolve that command
	private static void parse(String[] command, Player player) {
	
		
		Room nextRoom = null;
		switch(command.toString().toLowerCase()) {
		case "north":
			nextRoom = player.currentRoom.getLeftExit();
			break;
		case "south":
			
			break;
		case "east":
			
			break;
		case "west":
			
		break;
		default:
			System.out.println("Error"); 
		} // end switch()
		}*/
}

	

