package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="employers")
public class Employer {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	
	@Column(name ="companyname")
	private String CompanyName;
	
	@Column(name ="companywebsite")
	private String CompanyWebSite;
	
	@Column(name ="email")
	private String Email;
	
	@Column(name ="phonenumber")
	private String PhoneNumber;
	
	@Column(name ="password")
	private String Password;
	
	@Column(name ="status")
	private boolean Status;
	
	public Employer() {
		
	}


	public Employer(int id, String companyName, String companyWebSite, String email, String phoneNumber,
			String password, boolean status) {
		super();
		Id = id;
		CompanyName = companyName;
		CompanyWebSite = companyWebSite;
		Email = email;
		PhoneNumber = phoneNumber;
		Password = password;
		Status = status;
	}


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public String getCompanyName() {
		return CompanyName;
	}

	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}

	public String getCompanyWebSite() {
		return CompanyWebSite;
	}

	public void setCompanyWebSite(String companyWebSite) {
		CompanyWebSite = companyWebSite;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public boolean isStatus() {
		return Status;
	}

	public void setStatus(boolean status) {
		Status = status;
	}
}
