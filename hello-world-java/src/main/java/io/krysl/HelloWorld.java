package io.krysl;
import java.util.ResourceBundle;

public class HelloWorld{

	public String getWelcomeMessage(){
		final ResourceBundle rb = ResourceBundle.getBundle("messages");

		return rb.getString("welcome");
	}	

}	
