package view;
import controller.Controller;

public class View {
	
	Controller controller;
	
	public View(Controller controller) {
		this.controller = controller;
	}	
	
	public void doSomething(){
		System.out.println("Hej");
	}
	
}
