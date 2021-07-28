package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="job_positions")
public class JobPosition {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="position")
	private String position;
	
	@Column(name="position_detail")
	private String position_detail;
	
	public JobPosition() {
		
	}

	public JobPosition(int id, String position, String position_detail) {
		super();
		this.id = id;
		this.position = position;
		this.position_detail = position_detail;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getPosition_detail() {
		return position_detail;
	}

	public void setPosition_detail(String position_detail) {
		this.position_detail = position_detail;
	}

	
}
