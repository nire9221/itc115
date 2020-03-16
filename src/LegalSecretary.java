public class LegalSecretary extends Secretary{
	
	private double salary;
	
	public LegalSecretary() {
		
		super();
		
	}

	public void showSalary() {
//		System.out.println("My salary is $45,000");
		System.out.println(super.getSalary() + 5000.00);
		
	}
	
	public void fileLegalBriefs() {
		System.out.println("I can file all day!");
	}
	
	
}