package eam.app.sprint.model;

import javax.persistence.*;


import java.util.Date;
import java.util.List;

import javax.persistence.Entity;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

@Entity
@Table(name = "Booking")

public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idBooking;

	@Column(name = "userBooking")
	private long usertBooking;
	
	@Column(name = "hotelBooking")
	private long hotelBooking;
	
	@Column(name = "entryDate")
	private Date entryDate;
	
	@Column(name = "exitDate")
	private Date  exitDate;
	
	@Column(name = "stateBooking")
	private boolean stateBooking;
	
	@Column(name = "priceBooking")
	private float priceBooking;
	
	//relaciones entre clases
	
	@ManyToOne
	@JoinColumn(name = "idUser",referencedColumnName = "idUser")
	private User user;
	
	@ManyToOne
	@JoinColumn(name = "idHotel",referencedColumnName = "idHotel")
	private Hotel hotel;
	
	@OneToOne(mappedBy = "booking")
	private Invoice invoice;
	
	@OneToMany(mappedBy = "booking")
	private List<Room> rooms;
	
	
	//Contructor vacio y con params
	public Booking() {
		
	}
	
	public Booking(long userBooking, long hotelBooking,
			Date entryDate, Date exitDate, boolean stateBooking,
			float priceBooking) {
		this.usertBooking = userBooking;
		this.hotelBooking = hotelBooking;
		this.entryDate = entryDate;
		this.exitDate = exitDate;
		this.stateBooking = stateBooking;
		this.priceBooking = priceBooking; 
	}

	
	//getter y setter
	public long getIdBooking() {
		return idBooking;
	}

	public void setIdBooking(long idBooking) {
		this.idBooking = idBooking;
	}

	public long getUserBooking() {
		return usertBooking;
	}

	public void setUserBooking(long userBooking) {
		this.usertBooking = userBooking;
	}

	public long getHotelBooking() {
		return hotelBooking;
	}

	public void setHotelBooking(long hotelBooking) {
		this.hotelBooking = hotelBooking;
	}

	public Date getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}

	public Date getExitDate() {
		return exitDate;
	}

	public void setExitDate(Date exitDate) {
		this.exitDate = exitDate;
	}

	public boolean isStateBooking() {
		return stateBooking;
	}

	public void setStateBooking(boolean stateBooking) {
		this.stateBooking = stateBooking;
	}

	public float getPriceBooking() {
		return priceBooking;
	}

	public void setPriceBooking(float priceBooking) {
		this.priceBooking = priceBooking;
	}
	}
