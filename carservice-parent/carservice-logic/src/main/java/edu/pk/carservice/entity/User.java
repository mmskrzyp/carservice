package edu.pk.carservice.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

	@Entity
	@Table(name="USERS")
public class User {
		
		private Integer id;
		private String name;
		private String surname;
		private Integer nip;
		private String login;
		private String password;
		private Integer phone;
		private Integer pesel;
		private String email;
		private Address address;
		
		public User(){
		}
		
		//TODO zastanowiæ siê nad konstruktorami
		
		public User(String name, String surname, Integer nip,
				String login, String password, Integer phone,
				String email, Address address) {
			
			this.name = name;
			this.surname = surname;
			this.nip = nip;
			this.login = login;
			this.password = password;
			this.phone = phone;
			this.email = email;
			this.address = address;
		}

		public User(String name, String surname, Integer nip,
				String login, String password, Integer phone,
				Integer pesel, String email, Address address) {
			this.name = name;
			this.surname = surname;
			this.nip = nip;
			this.login = login;
			this.password = password;
			this.phone = phone;
			this.pesel = pesel;
			this.email = email;
			this.address = address;
		}

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="USEK_ID", nullable=false, unique=true)
		public Integer getId() {
			return id;
		}
		public void setId(Integer usekId) {
			this.id = usekId;
		}
		
		@Column(name="USE_NAME", nullable=false, length=15)
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		@Column(name="USE_SURNAME", nullable=false, length=15)
		public String getSurname() {
			return surname;
		}
		public void setSurname(String surname) {
			this.surname = surname;
		}
		
		@Column(name="USE_NIP", nullable=false, unique=true)
		public Integer getNip() {
			return nip;
		}
		public void setNip(Integer nip) {
			this.nip = nip;
		}
		
		@Column(name="USE_LOGIN", nullable=false, unique=true, length=15)
		public String getLogin() {
			return login;
		}
		public void setLogin(String login) {
			this.login = login;
		}
		
		@Column(name="USE_PASSWORD", nullable=false, unique=true, length=50)
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		
		@Column(name="USE_PHONE", nullable=false)
		public Integer getPhone() {
			return phone;
		}
		public void setPhone(Integer phone) {
			this.phone = phone;
		}
		
		@Column(name="USE_PESEL", unique = true)
		public Integer getPesel() {
			return pesel;
		}
		public void setPesel(Integer pesel) {
			this.pesel = pesel;
		}
		
		@Column(name="USE_EMAIL", length=20)
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		
		@ManyToOne(cascade=CascadeType.ALL)
		public Address getAddress() {
			return address;
		}
		public void setAddress(Address address) {
			this.address = address;
		}
		

}
