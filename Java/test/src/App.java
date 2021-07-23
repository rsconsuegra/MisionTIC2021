
public class App {
	public static void main(String[] args) throws Exception {
		Employee myemployee = new Employee();
		// Setting the employee details via the setter methods.
		myemployee.setId(1001);
		myemployee.setName("Pedro");
		myemployee.setDesignation("Software Developer");
		myemployee.setCompany("ABC Corporation");

		// Printing the employee details via the 'toString()' method that uses the
		// getter methods.
		System.out.println(myemployee.toString());
	}
}
