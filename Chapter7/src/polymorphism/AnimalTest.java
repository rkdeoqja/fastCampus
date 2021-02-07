package polymorphism;

import java.util.ArrayList;

class Animal{
		public void move() {
			System.out.println("������ �����Դϴ�.");
		}
		
		public void eating() {
			
		}
	}

	class Human extends Animal{
		public void move() {
			System.out.println("����� �ι߷� �Ƚ��ϴ�.");
		}
		
		public void readBooks() {
			System.out.println("����� å�� �н��ϴ�.");
		}
	}
	
	class Tiger extends Animal{
		public void move() {
			System.out.println("ȣ���̰� �׹߷� �ݴϴ�.");
		}
		
		public void hunting() {
			System.out.println("ȣ���̰� ����� �մϴ�.");
		}
	}
	
	class Eagle extends Animal{
		public void move() {
			System.out.println("�������� �ϴ��� ���ư��ϴ�.");
		}
		public void flying() {
			System.out.println("�������� ������ �� ���ư��ϴ�");
		}
	}
	
	class Rabbit extends Animal{
		public void move() {
			System.out.println("�䳢�� ������� �پ�ϴ�");
		}
		public void jump() {
			System.out.println("�䳢�� ������ ���� �������� �����մϴ�");
		}
	}

	public class AnimalTest {
		public static void main(String[] args) {
			Animal hAnimal = new Human();
			Animal tAnimal = new Tiger();
			Animal eAnimal = new Eagle();
			Animal rAnimal = new Rabbit();
			
	/*		AnimalTest test = new AnimalTest();
			test.moveAnimal(hAnimal);
			test.moveAnimal(tAnimal);
			test.moveAnimal(eAnimal);*/
			
			ArrayList<Animal> animalList = new ArrayList<Animal>(); 
			animalList.add(hAnimal);
			animalList.add(tAnimal);
			animalList.add(eAnimal);
			animalList.add(rAnimal);
			
			AnimalTest test = new AnimalTest();
			test.testDownCasting(animalList);
			
	/*		for(Animal a: animalList) {
				System.out.print("Ȯ������: ");
				a.move();
			}*/
		}
		
		public void testDownCasting(ArrayList<Animal> list) {
			
			for(int i=0;i<list.size();i++) {
				Animal animal =list.get(i);
				
				if(animal instanceof Human) {
					Human human = (Human)animal;
					human.readBooks();
				}else if(animal instanceof Tiger) {
					Tiger tiger = (Tiger)animal;
					tiger.hunting();
				}else if(animal instanceof Eagle) {
					Eagle eagle = (Eagle)animal;
					eagle.flying();
				}else if(animal instanceof Rabbit){
					Rabbit rabbit = (Rabbit)animal;
					rabbit.jump();
				}else {
					System.out.println("error");
				}
			}
			
		}
		
		public void moveAnimal(Animal animal) {
			animal.move();
		}
		
		public void moveAnimal(Human animal) {
			animal.move();
		}
	}
