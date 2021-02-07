package withArrayList;

public class Customer {
	
	protected int customerID;
	protected String customerName;
	protected String grade;
	int bonusPoint;
	double bonusRatio;
	
	public Customer(int customerID,String customerName) {
		grade = "SILVER";
		bonusRatio = 0.01;
		this.customerID = customerID;
		this.customerName = customerName;
	}
	
	public String showCustomerInfo() {
		return customerName+"���� ����� "+ grade+"�̸�, ���ʽ� ����Ʈ�� "+bonusPoint+"�� �Դϴ�.";
	}
	
	public int calcPrice(int price) {
		bonusPoint += price*bonusRatio;
		return price;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	
}
