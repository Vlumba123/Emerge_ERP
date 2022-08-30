package emerge.bean;

public class OrderBean {

	private String CustomerName;
	private String CustomerAddress;
	private String Requirement;
	private String mobile;

	public String getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}

	public String getCustomerAddress() {
		return CustomerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		CustomerAddress = customerAddress;
	}

	public String getRequirement() {
		return Requirement;
	}

	public void setRequirement(String requirement) {
		Requirement = requirement;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}
