package DataAccess;

public class Customers {
		
	private int customerNumber;
	private String customerName;
	private String addressLine1;
	private String addressLine2;
	private String addressLine3;
	private String postcode;
	private String phone;
	private String email;
	private String securityQuestion;
	private String securityQuestionAnswer;
	
	public Customers() {};
	
	public Customers(int customerNumber, String customerName, String customerAddressLine1, String customerAddressLine2,
			String customerAddressLine3, String postcode, String phone, String email, String securityQuestion,
			String securityQuestionAnswer) {
		super();
		this.customerNumber = customerNumber;
		this.customerName = customerName;
		this.addressLine1 = customerAddressLine1;
		this.addressLine2 = customerAddressLine2;
		this.addressLine3 = customerAddressLine3;
		this.postcode = postcode;
		this.phone = phone;
		this.email = email;
		this.securityQuestion = securityQuestion;
		this.securityQuestionAnswer = securityQuestionAnswer;
	}
	
	public int getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getAddressLine3() {
		return addressLine3;
	}

	public void setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
	}

	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSecurityQuestion() {
		return securityQuestion;
	}
	public void setSecurityQuestion(String securityQuestion) {
		this.securityQuestion = securityQuestion;
	}
	public String getSecurityQuestionAnswer() {
		return securityQuestionAnswer;
	}
	public void setSecurityQuestionAnswer(String securityQuestionAnswer) {
		this.securityQuestionAnswer = securityQuestionAnswer;
	}
	
	
	
}
