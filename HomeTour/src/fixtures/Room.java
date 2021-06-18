package fixtures;

// This class represents a room in the house. It will extend Fixture and will inherit the descriptive properties
public class Room extends Fixture {
	
	
	// the rooms adjacent to this one
	public Room[] exits = new Room[4];
	
	
	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		this.exits = new Room[4]; // size of 4
	}
	
	public String toString() {
		return this.getName() + this.getShortDescription() + "\n" + this.getLongDescription() ;
	}
	

	public Room getSouthExit() {
		return exits[1];
	}
	
	public Room getNorthExit() {
		return exits[0];
	}
	
	public void setSouthExit(Room exit) {
		exits[1] = exit;
	}
	
	public void setNorthExit(Room exit) {
		exits[0] = exit;
	}
	
	public Room getWestExit() {
		return exits[2];
	}
	
	public Room getEastExit() {
		return exits[3];
	}
	
	public void setWestExit(Room exit) {
		exits[2] = exit;
	}
	
	public void setEastExit(Room exit) {
		exits[3] = exit;
	}
	
	
	
  
}
