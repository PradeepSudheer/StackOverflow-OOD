package users;
import enums.*;

public class Account {
	  private String id;
	  private String password;
	  private AccountStatus status;
	  private String name;
	  private Address address;
	  private String email;
	  private String phone;
	  private int reputation;

	  public boolean resetPassword() {
		  return false;
	  }
}

class Address{
	String address1;
	String address2;
	String city;
	String state;
	String country;
	String zipcode;
}