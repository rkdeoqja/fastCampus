package coffee;

public class Person {
	String name;
	int money;
	
	public Person(String name,int money) {
		this.name = name;
		this.money = money;
	}
	
	public void buyStarCoffee(StarCoffee menu,int money) {
		this.money -= money;
		Menu mm = new Menu();
		if(mm.STARAMERICANO == money) {
			System.out.println(name+"���� "+money+"�� ���ٹ� �Ƹ޸�ī�븦 �����߽��ϴ�.");
		}else if(mm.STARLATTE == money) {
			System.out.println(name+"���� "+money+"�� ���ٹ� �󶼸� �����߽��ϴ�.");
		}
	}
	
	public void buyBeanCoffee(BeanCoffee menu,int money) {
		this.money -= money;
		Menu mm = new Menu();
		if(mm.BEANAMERICANO == money) {
			System.out.println(name+"���� "+money+"�� �� �ٹ� �Ƹ޸�ī�븦 �����߽��ϴ�.");
		}else if(mm.BEANLATTE == money) {
			System.out.println(name+"���� "+money+"�� �� �ٹ� �󶼸� �����߽��ϴ�.");
		}
	}
	
	
}
