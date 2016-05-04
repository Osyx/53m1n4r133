package startup;

import view.View;
import controller.Controller;
import integration.*;
import dbHandler.RegistryCreator;

public class Main {
	public static void main(String[] args){
		RegistryCreator registryCreator = new RegistryCreator();
		Printer printer = new Printer();
		Garage garage = new Garage();
		Controller controller = new Controller(registryCreator, printer, garage);
		View view = new View(controller);
		
		
		while(true)
			view.doSomething();
		
	}
}
