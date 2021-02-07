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
			System.out.println(name+"님이 "+money+"로 별다방 아메리카노를 구입했습니다.");
		}else if(mm.STARLATTE == money) {
			System.out.println(name+"님이 "+money+"로 별다방 라떼를 구입했습니다.");
		}
	}
	
	public void buyBeanCoffee(BeanCoffee menu,int money) {
		this.money -= money;
		Menu mm = new Menu();
		if(mm.BEANAMERICANO == money) {
			System.out.println(name+"님이 "+money+"로 콩 다방 아메리카노를 구입했습니다.");
		}else if(mm.BEANLATTE == money) {
			System.out.println(name+"님이 "+money+"로 콩 다방 라떼를 구입했습니다.");
		}
	}
	
	
}
