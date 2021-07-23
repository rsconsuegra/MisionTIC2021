
// Employee class.
class Employee {

	// Member variables of the class.
	private int id;
	private String name;
	private String designation;
	private String company;

	public int getId() {
		return id;
	}

	public void setId(final int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		// Validating the name and throwing an exception if name is null or length is <=
		// 0.
		if (name == null || name.length() <= 0) {
			throw new IllegalArgumentException();
		}

		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(final String designation) {
		this.designation = designation;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(final String company) {
		this.company = company;
	}

	// 'toString()' method to print the values.
	@Override
	public String toString() {
		return "Employee: [id= " + getId() + ", name= " + getName() + ", designation= " + getDesignation()
				+ ", company= " + getCompany() + "]";
	}
}

// Main class.
public class Employee_no_constructor {

	public static void main(String[] args) {
		// Creating the employee object.
		final Employee myemployee = new Employee();

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
