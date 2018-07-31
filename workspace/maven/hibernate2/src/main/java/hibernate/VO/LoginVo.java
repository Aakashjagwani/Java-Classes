package hibernate.VO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="maven")
public class LoginVo {
	
	
	
	public LoginVo(int i, String firstname, String pass, String email) {
		super();
		this.i = i;
		this.firstname = firstname;
		this.pass = pass;
		this.email = email;
	}
	public LoginVo() {
		super();
	}
	@Id
	@Column(name="ID")
	@GeneratedValue 
	private int i;
	
	@Column(name="fname")
	private String firstname ;
	
	@Column(name="pwd")
	private String pass ;
	
	@Column(name="email")
	private String email;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
}
