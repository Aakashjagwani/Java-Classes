package ValueObject;

public class vo {
	
	
	private String fn;
	private String ln;
	private int id;
	//System.out.println("in the VO");
	
	public String getFn() {
		return fn;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
