package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employees")
public class Employee {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	
	@Column(name ="firstname")
	private String FistName;
	
	@Column(name ="lastname")
	private String LastName;
	
	@Column(name ="nationalidentity")
	private String NationalIdentity;
	
	@Column(name ="email")
	private String Email;
	
	@Column(name ="password")
	private String Password;
	
	@Column(name ="yearofbirth")
	private int YearOfBirth;
	
	@Column(name ="status")
	private boolean Status;
	
	public Employee() {
		
	}


	public Employee(int id, String fistName, String lastName, String nationalIdentity, String email, String password,
			int yearOfBirth, boolean status) {
		super();
		Id = id;
		FistName = fistName;
		LastName = lastName;
		NationalIdentity = nationalIdentity;
		Email = email;
		Password = password;
		YearOfBirth = yearOfBirth;
		Status = status;
	}


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public String getFistName() {
		return FistName;
	}

	public void setFistName(String fistName) {
		FistName = fistName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getNationalIdentity() {
		return NationalIdentity;
	}

	public void setNationalIdentity(String nationalIdentity) {
		NationalIdentity = nationalIdentity;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public int getYearOfBirth() {
		return YearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		YearOfBirth = yearOfBirth;
	}

	public boolean isStatus() {
		return Status;
	}

	public void setStatus(boolean status) {
		Status = status;
	}
	
}
