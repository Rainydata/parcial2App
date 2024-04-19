package eam.app.sprint.model;

import java.util.List;

import javax.persistence.*;

import org.springframework.boot.autoconfigure.SpringBootApplication;

	@SpringBootApplication
	@Entity
	@Table(name = "User")
	public class User {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long idUser;
		
	
		@Column(name = "userName")
		private String userName;
		
		@Column (name = "UserPassword")
		private String UserPassword;
		
		@Column (name = "userEmail")
		private String userEmail;

		@Column (name = "userRol")
		private String userRol;
		
		// relaciones entre clases
		
		@OneToMany(mappedBy = "user")
		private List<Booking> bookings;
		
		@OneToMany(mappedBy = "user")
		private List<Invoice> invoices;
		
		//constructores
		public User() {
		}
		
		public User(String userName, String userPassword, String userEmail, String userRol) {
			this.userName = userName;
			this.UserPassword = userPassword;
			this.userEmail = userEmail;
			this.userRol = userRol;
			
		
		}

		public long getIdUser() {
			return idUser;
		}

		public void setIdUser(long idUser) {
			this.idUser = idUser;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getUserPassword() {
			return UserPassword;
		}

		public void setUserPassword(String userPassword) {
			UserPassword = userPassword;
		}

		public String getUserEmail() {
			return userEmail;
		}

		public void setUserEmail(String userEmail) {
			this.userEmail = userEmail;
		}

		public String getUserRol() {
			return userRol;
		}

		public void setUserRol(String userRol) {
			this.userRol = userRol;
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