package chapter8;

public class Avante extends Car{

	@Override
	public void startCar() {
		System.out.println("Avante �õ��� �մϴ�");
		
	}

	@Override
	public void drive() {
		System.out.println("Avante �޸��ϴ�");
	}

	@Override
	public void stop() {
		System.out.println("Avante ����ϴ�");		
	}

	@Override
	public void turnOff() {
		System.out.println("Avante �õ��� ���ϴ�");		
	}
}
