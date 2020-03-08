

public class UseStudent {

	public static void main(String[] args) {

		Student azriel = new Student(001, "Azriel", "4448 s f", 100.00, 4);
		System.out.println(azriel.getClasses());
		azriel.drop(2);
		System.out.println(azriel.getClasses());
	}

}
