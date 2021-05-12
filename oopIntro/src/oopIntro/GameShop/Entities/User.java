package oopIntro.GameShop.Entities;

public class User {
	private String FirstName;
	private String LastName;
	private String Password;
	private String BirthDay;
 
 public User(){
	 
 }
 
 public User(String firstName, String lastName, String password, String birthDay, String identityNumber) {
	super();
	FirstName = firstName;
	LastName = lastName;
	Password = password;
	BirthDay = birthDay;
	IdentityNumber = identityNumber;
}

public String getFirstName() {
	return FirstName;
}
public void setFirstName(String firstName) {
	FirstName = firstName;
}
public String getLastName() {
	return LastName;
}
public void setLastName(String lastName) {
	LastName = lastName;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
public String getBirthDay() {
	return BirthDay;
}
public void setBirthDay(String birthDay) {
	BirthDay = birthDay;
}
public String getIdentityNumber() {
	return IdentityNumber;
}
public void setIdentityNumber(String identityNumber) {
	IdentityNumber = identityNumber;
}
String IdentityNumber;
 
}
