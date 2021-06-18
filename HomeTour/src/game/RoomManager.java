package game;

import fixtures.Room;
//This class will be responsible for "loading" our rooms into memory. 
public class RoomManager {

	// the room a player starts in
	Room startingRoom;
	
	//all the rooms in the house
	Room[] rooms;
	
	public void init() {
	    Room foyer = new Room(
			"The Foyer",
			" a small foyer",
			"The small entryway of a neo-colonial house. A dining room is open to the south, where a large table can be seen. "
			+ "\nTo The west is the Kitchen with an old fashioned stove. A large Television can be seen to the east.");
	    
	    Room dr = new Room("Dining Room", " a small Dining Room",
	    		"A large table is at the center of the Dining Room." + "\nTo the North is the Foyer. "
	    				+ "To The west is the Kitchen." + "\nTo the east is the Living Room with a relatively large TV.");
		
	    Room kit = new Room("Kitchen", " a cozy kitchen" , "An old fashioned stove can be seen next to the sink."
	    + "\nTo The east is the Dinning Room. To the North is the Foyer.");
	    
	    Room lr = new Room("Living Room", " a comfortable Living Room",
	    		"A large flat screen TV is at the center of the Room." + " \nTo the west is the Dinning Room. "
	    				+ "To the North is the Foyer.");	
	    
	    rooms = new Room[4];
		rooms[0] = foyer;
		rooms[1] = dr;
		rooms[2] = kit;
		rooms[3] = lr;
		
		foyer.setSouthExit(dr);
		dr.setNorthExit(foyer);
		dr.setEastExit(lr);
		dr.setWestExit(kit);
		
		foyer.setEastExit(lr);
		foyer.setWestExit(kit);
		lr.setNorthExit(foyer);
		lr.setWestExit(dr);
		kit.setEastExit(dr);
		kit.setNorthExit(foyer);
		
		
		this.startingRoom = foyer;
	        
	}
	
}
