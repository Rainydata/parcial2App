package eam.app.sprint.model;

import java.util.List;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import javax.persistence.*;

@SpringBootApplication

@Entity
@Table(name = "City")

public class City {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idCity;
	
	@Column(name = "nameCity")
	private String nameCity;
	
	
	//relaciones entre clases
	@ManyToOne
	@JoinColumn(name = "idDepartmen",referencedColumnName = "idDepartment")
	private Department department;
	
	@OneToMany(mappedBy = "city")
	private List<Hotel> hotels;
	
	// constructores
	public City() {
		
	}
	
	public City(String nameCity) {
		this.nameCity = nameCity;
	}

	public long getIdCity() {
		return idCity;
	}

	public void setIdCity(long idCity) {
		this.idCity = idCity;
	}

	public String getNameCity() {
		return nameCity;
	}

	public void setNameCity(String nameCity) {
		this.nameCity = nameCity;
	}
	
	
	
}
