package Test;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee= new Student(101,"Lee");
		studentLee.addBookList("�¹���1","������");
		studentLee.addBookList("�¹���2","������");
		
		
		Student studentKim = new Student(102,"Kim");
		studentKim.addBookList("����1","�ڰ渮");
		studentKim.addBookList("����2","�ڰ渮");
		studentKim.addBookList("����3","�ڰ渮");
		
		
		Student studentCho = new Student(103,"Kim");
		studentCho.addBookList("�ظ�����1","���طѸ�");
		studentCho.addBookList("�ظ�����2","���طѸ�");
		studentCho.addBookList("�ظ�����3","���طѸ�");
		studentCho.addBookList("�ظ�����4","���طѸ�");
		studentCho.addBookList("�ظ�����5","���طѸ�");
		studentCho.addBookList("�ظ�����6","���طѸ�");
		
		
		
		
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
		studentCho.showStudentInfo();
	}

}
