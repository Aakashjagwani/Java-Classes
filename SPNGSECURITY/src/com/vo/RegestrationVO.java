package com.vo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ssreg")
public class RegestrationVO implements Serializable
	{
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		@Column(name="regId")
		private int id;
		
		@Column(name="regFn")
		private String regFn;
		
		@Column(name="regLn")
		private String regLn;
		
		@Column(name="regGender")
		private String regGender;
		
		@Column(name="regAddress")
		private String regAddress;
		
		@Column(name="regContact")
		private String regContact;
		
		@ManyToOne
		@JoinColumn(name="loginId")
		private LoginVO loginVO;
		
		public LoginVO getLoginVO() {
			return loginVO;
		}

		public void setLoginVO(LoginVO loginVO) {
			this.loginVO = loginVO;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getRegFn() {
			return regFn;
		}

		public void setRegFn(String regFn) {
			this.regFn = regFn;
		}

		public String getRegLn() {
			return regLn;
		}

		public void setRegLn(String regLn) {
			this.regLn = regLn;
		}

		public String getRegGender() {
			return regGender;
		}

		public void setRegGender(String regGender) {
			this.regGender = regGender;
		}

		public String getRegAddress() {
			return regAddress;
		}

		public void setRegAddress(String regAddress) {
			this.regAddress = regAddress;
		}

		public String getRegContact() {
			return regContact;
		}

		public void setRegContact(String regContact) {
			this.regContact = regContact;
		}
		
		
	}
