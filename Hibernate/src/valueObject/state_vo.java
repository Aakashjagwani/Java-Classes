 package valueObject;

public class state_vo {
	private String state;
	private int id;
	private country_vo v;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getState() {
		return state;
	}

	public country_vo getV() {
		return v;
	}

	public void setV(country_vo v) {
		this.v = v;
	}

	public void setState(String state) {
		this.state = state;
	}
	
}
