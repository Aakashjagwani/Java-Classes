package newspaper.Issues.com.VO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="registration")
public class registration {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="news_id")
	private int id;

	@Column(name="news_name")
	private String name;
	
	@Column(name="news_city")
	private String city;
	
	@Column(name="news_date")
	private String date;
	
	@Column(name="news_attendance")
	private String attendance;
	
	
	
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getAttendance() {
		return attendance;
	}
	public void setAttendance(String attendance) {
		this.attendance = attendance;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
 }
