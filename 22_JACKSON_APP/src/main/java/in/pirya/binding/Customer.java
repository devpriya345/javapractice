package in.pirya.binding;

public class Customer {
	private int id;
	private String name;
	private String email;
	private Long phno;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getPhno() {
		return phno;
	}
	public void setPhno(long i) {
		this.phno = i;
	}
	@Override
	public String toString() {
	    return "Customer [id=" + id + ", name=" + name +
	           ", email=" + email + ", phno=" + phno + "]";
	}

}
