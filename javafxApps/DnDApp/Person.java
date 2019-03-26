package DnDApp;

import javafx.beans.property.StringProperty;
import javafx.beans.property.SimpleStringProperty;

public class Person {
	
	private StringProperty firstName = new SimpleStringProperty(this, "firstName", "");

	//Returns the object
	public StringProperty firstNamProperty(){
		return firstName;
	}

	//Normal getters and setters

	public String getFirstname()
	{
		return firstName.get();
	}

	public void setFirstname(String firstName)
	{
		this.firstName.set(firstName);
	}
 
}