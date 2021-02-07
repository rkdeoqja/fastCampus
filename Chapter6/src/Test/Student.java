package Test;

import java.util.ArrayList;

public class Student {
	
	private int studentID;
	private String studentName;
	
	ArrayList<Book> list ;
	
	public Student(int studentID,String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		list = new ArrayList<Book>();
	}
	
	public void addBookList(String title,String author) {
		Book book = new Book();
		book.setBookTitle(title);
		book.setAuthor(author);
		list.add(book);
	}
	
	public void showStudentInfo() {
		System.out.print(studentName+"학생이 읽은책은 : ");
		for(Book book: list) {
			System.out.print(book.getBookTitle()+" ");
		}
		System.out.println("입니다");
	}

}
