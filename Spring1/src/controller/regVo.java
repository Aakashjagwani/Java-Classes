package controller;

import javax.persistence.*;

import javax.persistence.criteria.*;


@Entity
@Table(name="nice")
public class regVo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	@Column(name="fn")
	String fn;
	@Column(name="ln")
	String ln;
	


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFn() {
		return fn;
	}
	public void setFn(String fn) {
		this.fn = fn;
	}
	public String getLn() {
		return ln;
	}
	public void setLn(String ln) {
		this.ln = ln;
	}
	

}
