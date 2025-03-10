package model;

public class LoginInfo {
	

	private String uid; 
	private String uname; 
	private String email; 
	private String photo;
	
	public LoginInfo(String uid, String uname, String email, String photo) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.email = email;
		this.photo = photo;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	@Override
	public String toString() {
		return "LoginInfo [uid=" + uid + ", uname=" + uname + ", email=" + email + ", photo=" + photo + "]";
	}
	
	
	
	

}
