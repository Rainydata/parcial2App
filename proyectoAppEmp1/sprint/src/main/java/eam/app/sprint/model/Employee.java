package eam.app.sprint.model;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import javax.persistence.*;

@SpringBootApplication

@Entity
@Table(name = "Employee")

public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idEmployee;
	
	@Column(name = "nameEmployee")
	private String nameEmployee;
	
	@Column(name = "lastnameEmployee")
	private String lastnameEmployee;
	
	@Column(name = "position")
	private String position;
	
	@ManyToOne
	@JoinColumn(name = "idHotel", referencedColumnName = "idHotel")
	private Hotel hotel;
	
	public Employee() {
		
	}
	
	public Employee(String nameEmployee, String lastnameEmployee, String position) {
		this.nameEmployee = nameEmployee;
		this.lastnameEmployee = lastnameEmployee;
		this.position = position;
	}

	public long getIdEmployee() {
		return idEmployee;
	}

	public void setIdEmployee(long idEmployee) {
		this.idEmployee = idEmployee;
	}

	public String getNameEmployee() {
		return nameEmployee;
	}

	public void setNameEmployee(String nameEmployee) {
		this.nameEmployee = nameEmployee;
	}

	public String getLastnameEmployee() {
		return lastnameEmployee;
	}

	public void setLastnameEmployee(String lastnameEmployee) {
		this.lastnameEmployee = lastnameEmployee;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}}
