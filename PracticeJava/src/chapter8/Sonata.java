package chapter8;

public class Sonata extends Car{

	@Override
	public void startCar() {
		System.out.println("Sonata �õ��� �մϴ�");
		
	}

	@Override
	public void drive() {
		System.out.println("Sonata �޸��ϴ�");
	}

	@Override
	public void stop() {
		System.out.println("Sonata ����ϴ�");		
	}

	@Override
	public void turnOff() {
		System.out.println("Sonata �õ��� ���ϴ�");		
	}
	

}
