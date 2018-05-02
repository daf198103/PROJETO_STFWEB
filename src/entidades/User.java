package entidades;

public class User {
	
	private Integer Id;
	private String userName;
	private String userEmail;
	private String password;
	private String telephone;
	
	public User(Integer id,String UserName,String UserEmail,String Password,String Telephone){
		this.Id = id;
		this.userName = UserName;
		this.userEmail = UserEmail;
		this.password = Password;
		this.telephone = Telephone;
	}
	
	public User(){}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	
}
