package stream.coffee;

public class CoffeeTest {

	public static void main(String[] args) {
		
		Coffee americano = new kenyaAmericano();
		americano.brewing();
		System.out.println();
		
		Coffee kenyaLatte = new Latte(new kenyaAmericano());
		kenyaLatte.brewing();
		System.out.println();
		
		Coffee kenyaMocha = new Mocha(new Latte(new kenyaAmericano()));
		kenyaMocha.brewing();
		System.out.println();
		
		Coffee Eamericano = new EtiopiaAmericano();
		Eamericano.brewing();
		System.out.println();
		
	}

}
