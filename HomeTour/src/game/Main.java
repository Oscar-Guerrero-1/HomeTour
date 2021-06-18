package game;
// This is where the game-loop will go, where we'll display a prompt, collect input, and parse that input
// This is the  Minimum Viable Product (MVP) of the HomeTour Project
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
			
			/*
			switch(input.trim().toLowerCase()) {
			
			case "south" :{
				nextRoom = currentRoom.getSouthExit();
				currentRoom = nextRoom;
				break;
				}
			
			case "north":{
				nextRoom = currentRoom.getNorthExit();
				currentRoom = nextRoom;
				break;
				}
			
			case "west" :{
				nextRoom = currentRoom.getWestExit();
				currentRoom = nextRoom;
				break;
				}
			
			case "east" :{
				nextRoom = currentRoom.getEastExit();
				currentRoom = nextRoom;
				break;
				}
			
			default:{
				System.out.println("Please enter a valid direction.");
				break;
				}
			} // end switch (x)
			*/
						
		}
	}
	
}

	

