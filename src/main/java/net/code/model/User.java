package net.code.model;

public class User {
	
    public User(String fullname, String email, String password) {
		super();
		this.fullname = fullname;
		this.email = email;
		this.password = password;
	}
    
    public User(String fullname, String email, String password, int age) {
		super();
		this.fullname = fullname;
		this.email = email;
		this.password = password;
		this.age = age; 
	}
	private int id;
    private String fullname;
    private String email;
    private String password;
    private int age; 
    private String registrierungsCode;
    
    
	public String getRegistrierungsCode() {
		return registrierungsCode;
	}

	public void setRegistrierungsCode(String registrierungsCode) {
		this.registrierungsCode = registrierungsCode;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
 
    
}
