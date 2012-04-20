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
		
		private Integer usekId;
		private String useName;
		private String useSurname;
		private Integer useNip;
		private String useLogin;
		private String usePassword;
		private Integer usePhone;
		private Integer usePesel;
		private String useEmail;
		private Address addAddress;
		
		public User(){
		}
		
		//TODO zastanowiæ siê nad konstruktorami
		
		public User(String useName, String useSurname, Integer useNip,
				String useLogin, String usePassword, Integer usePhone,
				String useEmail, Address addAddress) {
			
			this.useName = useName;
			this.useSurname = useSurname;
			this.useNip = useNip;
			this.useLogin = useLogin;
			this.usePassword = usePassword;
			this.usePhone = usePhone;
			this.useEmail = useEmail;
			this.addAddress = addAddress;
		}

		public User(String useName, String useSurname, Integer useNip,
				String useLogin, String usePassword, Integer usePhone,
				Integer usePesel, String useEmail, Address addAddress) {
			this.useName = useName;
			this.useSurname = useSurname;
			this.useNip = useNip;
			this.useLogin = useLogin;
			this.usePassword = usePassword;
			this.usePhone = usePhone;
			this.usePesel = usePesel;
			this.useEmail = useEmail;
			this.addAddress = addAddress;
		}

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="USEK_ID", nullable=false, unique=true)
		public Integer getUsekId() {
			return usekId;
		}
		public void setUsekId(Integer usekId) {
			this.usekId = usekId;
		}
		
		@Column(name="USE_NAME", nullable=false, length=15)
		public String getUseName() {
			return useName;
		}
		public void setUseName(String useName) {
			this.useName = useName;
		}
		
		@Column(name="USE_SURNAME", nullable=false, length=15)
		public String getUseSurname() {
			return useSurname;
		}
		public void setUseSurname(String useSurname) {
			this.useSurname = useSurname;
		}
		
		@Column(name="USE_NIP", nullable=false, unique=true)
		public Integer getUseNip() {
			return useNip;
		}
		public void setUseNip(Integer useNip) {
			this.useNip = useNip;
		}
		
		@Column(name="USE_LOGIN", nullable=false, unique=true, length=15)
		public String getUseLogin() {
			return useLogin;
		}
		public void setUseLogin(String useLogin) {
			this.useLogin = useLogin;
		}
		
		@Column(name="USE_PASSWORD", nullable=false, unique=true, length=15)
		public String getUsePassword() {
			return usePassword;
		}
		public void setUsePassword(String usePassword) {
			this.usePassword = usePassword;
		}
		
		@Column(name="USE_PHONE", nullable=false)
		public Integer getUsePhone() {
			return usePhone;
		}
		public void setUsePhone(Integer usePhone) {
			this.usePhone = usePhone;
		}
		
		@Column(name="USE_PESEL", unique = true)
		public Integer getUsePesel() {
			return usePesel;
		}
		public void setUsePesel(Integer usePesel) {
			this.usePesel = usePesel;
		}
		
		@Column(name="USE_EMAIL", nullable=false, length=20)
		public String getUseEmail() {
			return useEmail;
		}
		public void setUseEmail(String useEmail) {
			this.useEmail = useEmail;
		}
		
		@ManyToOne(cascade=CascadeType.ALL)
		public Address getAddAddress() {
			return addAddress;
		}
		public void setAddAddress(Address addAddress) {
			this.addAddress = addAddress;
		}
		

}
