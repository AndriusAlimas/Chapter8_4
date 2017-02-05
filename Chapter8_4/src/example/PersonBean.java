package example;

import java.io.Serializable;

// JavaBean spec say that Bean object must be serializable and has public no-arg cunstructor:
public abstract class PersonBean implements Serializable {
	// FIELDS:
	private String firstName;
	private String lastName;
	// NO-ARG CONSTRUCTOR:
	public PersonBean() {
	}
	// OTHER CONSTRUCTOR:
	public PersonBean(String string, String string2) {
		this.firstName = string;
		this.lastName = string2;
	}
	// SETTERS:
	public void setFirstName(String string) {
		this.firstName = string;
	}
	public void setLastName(String string) {
		this.lastName = string;
	}
	// GETTERS:
	public String getFirstName() {
		return this.firstName;
	}
	public String getLastName() {
		return this.lastName;
	}
	
}
