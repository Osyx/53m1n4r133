package integration;

class Garagedoor {
	private boolean open = false;
	
	Garagedoor(){
		
	}
	
	void closeDoor(){
		open = false;
		System.out.println("Debug: Door open = " + open);
	}
	
	void openGarageDoor(){
		open = true;
		System.out.println("Debug: Door open = " + open);
	}
	
	boolean getCurrentState(){
		return open;
	}
}
