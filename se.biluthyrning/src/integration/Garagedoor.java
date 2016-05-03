package integration;

class Garagedoor {
	private boolean open = false;
	
	Garagedoor(){
		
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
