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
		return customerName+"님의 등급은 "+ grade+"이며, 보너스 포인트는 "+bonusPoint+"점 입니다.";
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
