
public class Employer extends Employee {
	private int personsResponsible;

	public Employer(String firstName, String lastName, int id, int personsResponsible) {
		super(firstName, lastName, id);
		this.personsResponsible = personsResponsible;
	}

	@Override
	public void showInformation() {
		super.showInformation();
		System.out.println("Yöneticinin sorumlu olduğu kişi sayısı: " + personsResponsible);
	}

	public void raise(int raiseAmount) {
		System.out.println(getFirstName() + " çalışanlara " + raiseAmount + " kadar zam yapıldı.");
	}

}
