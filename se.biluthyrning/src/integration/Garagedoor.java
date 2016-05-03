package integration;

class Garagedoor {
	private boolean open = false;
	
	Garagedoor(){
		this.open = open;
	}
	
	void closeDoor(){
		open = false;
	}
	
	void openGarageDoor(){
		open = true;
	}
	
	boolean getCurrentState(){
		return open;
	}
}
