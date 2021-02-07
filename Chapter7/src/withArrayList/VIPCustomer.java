package withArrayList;

public class VIPCustomer extends Customer{
	
	protected int agentID;
	double salesRatio;

	public VIPCustomer(int customerID, String customerName,int agentID) {
		super(customerID, customerName);
		this.agentID = agentID;
		grade = "VIP";
		salesRatio = 0.1;
		bonusRatio = 0.05;
	}
	
	
	public String showCustomerInfo() {
		return customerName+"님의 등급은 "+grade+"이며, 보너스 포인트는 "+bonusPoint+"점 입니다. 담당 상담원 번호는 "+agentID+"입니다.";
	}


	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price*salesRatio);
	}
	
	
	

}
