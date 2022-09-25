
public class Employee {
	private String firstName;
	private String lastName;
	private int id;

	public Employee(String firstName, String lastName, int id) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void showInformation() {
		System.out.println("ÇALIŞAN BİLGİLERİ");
		System.out.println("Ad: " + firstName);
		System.out.println("Soyad: " + lastName);
		System.out.println("Id: " + id);
	}
}
