package eam.app.sprint.model;

import java.util.List;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import javax.persistence.*;

@SpringBootApplication

@Entity
@Table(name = "Hotel")

public class Hotel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idHotel;

	@Column(name = "nameHotel")
	private String nameHotel;
	
	@Column(name = "addressHotel")
	private String addresHotel;
	
	@Column(name = "classifyHotel")
	private int classifyHotel;
	
	@Column(name = "modscons")
	private String modscons;
	
	@Column(name = "totalRoom")
	private int totalRoom;
	
	@Column(name = "image")
	private byte[] image;
	
	//relaciones entre clases
	
	@OneToMany(mappedBy = "hotel")
	private List<Room> rooms;
	
	@OneToMany(mappedBy = "hotel")
	private List<Booking> bookings;
	
	@OneToMany(mappedBy = "hotel")
	private List<Invoice> invoices;
	
	@ManyToOne
	@JoinColumn(name = "idCity", referencedColumnName = "idcity")
	private City city;
	
	@OneToMany(mappedBy = "hotel")
	private List<Employee> employees;
	
	@ManyToOne
	@JoinColumn(name = "idDepartment", referencedColumnName = "idDepartment")
	private Department departmen;
	
	//Constructores
	public Hotel() {
		
	}
	
	public Hotel(String nameHotel, String addressHotel, int classifyHotel, String modscons, int totalRoom
			,byte[] image) {
		this.nameHotel = nameHotel;
		this.addresHotel = addressHotel;
		this.classifyHotel = classifyHotel;
		this.modscons = modscons;
		this.totalRoom = totalRoom;
		this.image = image;
	}

	//getter y setter
	public long getIdHotel() {
		return idHotel;
	}

	public void setIdHotel(long idHotel) {
		this.idHotel = idHotel;
	}

	public String getNameHotel() {
		return nameHotel;
	}

	public void setNameHotel(String nameHotel) {
		this.nameHotel = nameHotel;
	}

	public String getAddresHotel() {
		return addresHotel;
	}

	public void setAddresHotel(String addresHotel) {
		this.addresHotel = addresHotel;
	}

	public int getClassifyHotel() {
		return classifyHotel;
	}

	public void setClassifyHotel(int classifyHotel) {
		this.classifyHotel = classifyHotel;
	}

	public String getModscons() {
		return modscons;
	}

	public void setModscons(String modscons) {
		this.modscons = modscons;
	}

	public int getTotalRoom() {
		return totalRoom;
	}

	public void setTotalRoom(int totalRoom) {
		this.totalRoom = totalRoom;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public List<Room> getRooms() {
		return rooms;
	}

	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}

	public List<Booking> getBookings() {
		return bookings;
	}

	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;
	}

	public List<Invoice> getInvoices() {
		return invoices;
	}

	public void setInvoices(List<Invoice> invoices) {
		this.invoices = invoices;
	}

}
