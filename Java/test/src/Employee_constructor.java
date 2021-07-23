// Employee class.
class NewEmployee {

	// Member variables of the class.
	// As per Java specification the member variables of a POO class is always
	// marked as 'private'.
	// Making them 'public' will expose the class data which is against the Java
	// specification.
	int id;
	String name;
	String designation;
	String company;

	public NewEmployee() {
	}

	public NewEmployee(int id, String name, String designation, String company) {
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.company = company;
	}

	public String job_position(){
		return "I'm " + this.name + " " + this.designation;
	}

	// 'toString()' method to print the values.
	@Override
	public String toString() {
		return "Employee: [id= " + this.id + ", name= " + this.name + ", designation= " + this.designation
				+ ", company= " + this.company + "]";
	}
}

// Main class.
public class Employee_constructor {

	public static void main(String[] args) {
		// Creating the employee object.
		final NewEmployee myemployee = new NewEmployee();
		myemployee.id = 1001;
		myemployee.name = "James";
		myemployee.designation = "Software Developer";
		myemployee.company = "ABC Corporation";
		System.out.println(myemployee.toString());
	}
}
