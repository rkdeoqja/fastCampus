package abstractex;

public class ComputerTest {

	public static void main(String[] args) {
		
		Computer computer = new Desktop();
		computer.display();
		computer.turnOff();
		
		Computer myNote = new MyNoteBook();
		myNote.display();
		myNote.turnOff();
	}

}
