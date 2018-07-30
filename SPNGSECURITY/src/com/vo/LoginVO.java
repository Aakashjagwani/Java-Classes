package com.vo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sslogin")
public class LoginVO implements Serializable
	{
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		@Column(name="loginId")
		private int loginId;
		
		@Column(name="loginUsername")
		private String loginUsername;
		
	
		@Column(name="loginPassword")
		private String loginPassword;
		
		@Column(name="loginRole")
		private String loginRole;
		
		@Column(name="loginEnable")
		private String loginEnable;


		public int getLoginId() {
			return loginId;
		}

		public void setLoginId(int loginId) {
			this.loginId = loginId;
		}

		public String getLoginUsername() {
			return loginUsername;
		}

		public void setLoginUsername(String loginUsername) {
			this.loginUsername = loginUsername;
		}

		public String getLoginPassword() {
			return loginPassword;
		}

		public void setLoginPassword(String loginPassword) {
			this.loginPassword = loginPassword;
		}

		public String getLoginRole() {
			return loginRole;
		}

		public void setLoginRole(String loginRole) {
			this.loginRole = loginRole;
		}

		public String getLoginEnable() {
			return loginEnable;
		}

		public void setLoginEnable(String loginEnable) {
			this.loginEnable = loginEnable;
		}
		
		

	}
