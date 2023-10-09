package com.dl.model;

public class Student {

	// In Model layer 
	// we will have properties and their setters and getters
	// constructors => default + Parameterized
	// To string method
	
	 //Properties

	    private int id;
	    private String firstName;
	    private String lastName;
	    private long contact;
	    private String location;
	    
	    
	    
	    public Student(){
	    	
	    }
	    
	    
	    
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public long getContact() {
			return contact;
		}
		public void setContact(long contact) {
			this.contact = contact;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public Student(int id, String firstName, String lastName, long contact, String location) {
			super();
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.contact = contact;
			this.location = location;
		}
		@Override
		public String toString() {
			return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", contact=" + contact
					+ ", location=" + location + "]";
		}
	    
	    
	
	
	
	
	
	
}
