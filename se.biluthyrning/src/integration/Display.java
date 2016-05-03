package integration;

class Display {
  private int currentNumber = 0;
  
  Display(){
	  this.currentNumber = currentNumber;
  }
  
  void displayNextNumber(){
	  if (++currentNumber > 999)
		  currentNumber = 0;
	  currentNumber++;
  }
}
