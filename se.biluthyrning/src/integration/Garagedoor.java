package integration;

class Garagedoor {
	private boolean open = false;
	
	private void setOpen(boolean open) {
		this.open = open;
	}

	Garagedoor(){
		
	}
	
	void closeDoor(){
		setOpen(false);
		System.out.println("Debug: Door open = " + getCurrentState());
	}
	
	void openGarageDoor(){
		setOpen(true);
		System.out.println("Debug: Door open = " + getCurrentState());
	}
	
	boolean getCurrentState(){
		return open;
	}
}
