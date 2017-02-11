public class PhoneBookEntry {
	private String name; //holds person's name
	private String phone; //holds person's phone number
	
	//constructor
	public PhoneBookEntry(String userName, String number) {
		name = userName;
		phone = number;
	}
	
	//accessor methods
	public String getPhone() {
		return phone;
	}
	
	public String getName() {
		return name;
	}
	
	//mutator methods
	public void setPhone(String number) {
		phone = number;
	}
	
	public void setName(String userName) {
		name = userName;
	}
	
}