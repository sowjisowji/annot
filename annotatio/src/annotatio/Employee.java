package annotatio;
@Info(AuthorID =435, Date ="24-Nov-2021", Time ="07:30pm", Version =8)
public class Employee {
	String name;
	String depart;
	public Employee(String name, String depart) {
		super();
		this.name = name;
		this.depart = depart;
	}
	
	public void getEmployeeDetails() {
		System.out.println("Employee name "+name);
		System.out.println("Employee Department "+ depart);
	}
}
