package Test;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee= new Student(101,"Lee");
		studentLee.addBookList("태백산맥1","조정래");
		studentLee.addBookList("태백산맥2","조정래");
		
		
		Student studentKim = new Student(102,"Kim");
		studentKim.addBookList("토지1","박경리");
		studentKim.addBookList("토지2","박경리");
		studentKim.addBookList("토지3","박경리");
		
		
		Student studentCho = new Student(103,"Kim");
		studentCho.addBookList("해리포터1","조앤롤링");
		studentCho.addBookList("해리포터2","조앤롤링");
		studentCho.addBookList("해리포터3","조앤롤링");
		studentCho.addBookList("해리포터4","조앤롤링");
		studentCho.addBookList("해리포터5","조앤롤링");
		studentCho.addBookList("해리포터6","조앤롤링");
		
		
		
		
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
		studentCho.showStudentInfo();
	}

}
