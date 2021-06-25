package emailapp;

import java.util.Scanner;

public class Email {
	
	private String firstName;
	private String lastName;
	private String department;
	private String password;
	private String email;
	private int defaultPasswordLength=10;
	private int mailBoxCapacity = 500;
	private String alternateEmail;
	private String companySuffix = "aeycompany.com";
	
	// constructor to receive the first name and last name
	public Email(String firstName, String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
		System.out.println("EMAIL CREATED:" +this.firstName +" "+this.lastName);
		
		//call a method asking for the department - return the department
		this.department= setDepartment();
		System.out.println("Department:" +this.department);
		
		//call a method that returns a random password
		this.password= randomPassword(defaultPasswordLength);
		System.out.println("YOUR PASSWORD IS : "+this.password);
		
		//combine everything to generate email
		email= firstName.toLowerCase()+ "."+ lastName.toLowerCase()+ "@" +department+ ". "+ companySuffix;
		System.out.println("your email is:" +email);
		
	}
	
	//ask for department 
	
	private String setDepartment() {
		System.out.println("DEPARTMENT CODES\n1 for sales\n2 for development\n3 for accountancy\n0 for none\nEnter the department code:");
		Scanner in = new Scanner(System.in);
		int depChoice= in.nextInt();
		if(depChoice== 1) {return "sales";}
		else if(depChoice== 2) {return "dev";}
		else if(depChoice== 3) {return "acct";}
		else {return "";
		  }
		}
		
		//generate a random password
		
		private String randomPassword(int length) {
			String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@#$&_";
			char[] password = new char[length];
			for(int i=0;i<length;i++) { 
				int rand = (int) (Math.random()* passwordSet.length());
				password[i] = passwordSet.charAt(rand);
				System.out.println(rand);
				System.out.println(passwordSet.charAt(rand));
			
			}
			return new String (password);
		
				
		
		
	
		}
	
	//set mailbox capacity
		public void setmailBoxCapacity(int capacity) {
			this.mailBoxCapacity = capacity;
		}
		
	
	//set alternate email
		public  void setAlternateEmail(String altEmail) {
			this.alternateEmail = altEmail;
		}
	
	//change the password
		public void ChangePassword(String password) {
			this.password= password;
		}
		
		public int getmailBoxCapacity() {return mailBoxCapacity;}
		public String getAlternateEmail() {return alternateEmail;}
		public String getPassword() {return password;}
		
		
		public String showInfo() {
			return "DISPLAY NAME:"+ firstName + " " +lastName+
					"\nCOMPANY EMAIL:" +email+
					"\nMAILBOX CAPACITY :" +mailBoxCapacity + "mb";
		}
	
	

}
