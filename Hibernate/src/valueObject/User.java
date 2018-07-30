package valueObject;

public class User {
	int uid;
	private String un;
	private String pw;
	public int getUid() {
		return uid;
	}
	public void setUid(int id) {
		this.uid = id;
	}
	public String getUn() {
		return un;
	}
	public void setUn(String un) {
		this.un = un;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
}
