package Practice;

public class PersonTest {

	public static void main(String arg[]) {
		
		Person person = new Person();
		person.age = 40;
		person.name = "James";
		person.isMarried = true;
		person.numberOfChildren =3;
		
		System.out.println("����: "+ person.age );
		System.out.println("�̸�: "+ person.name);
		System.out.println("��ȥ����: "+person.isMarried );
		System.out.println("�ڽļ�: "+person.numberOfChildren);
		
	}
}
