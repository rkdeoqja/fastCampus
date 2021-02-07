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
		return customerName+"���� ����� "+grade+"�̸�, ���ʽ� ����Ʈ�� "+bonusPoint+"�� �Դϴ�. ��� ���� ��ȣ�� "+agentID+"�Դϴ�.";
	}


	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price*salesRatio);
	}
	
	
	

}
