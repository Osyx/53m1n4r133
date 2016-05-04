package integration;

class Display {
  private int currentNumber = 0;
  
  Display(){
	  
  }
  
  void displayNextNumber(){
	  if (++currentNumber > 999)
		  currentNumber = 1;
	  System.out.println("Debug: Current number: " + currentNumber);
  }
} 