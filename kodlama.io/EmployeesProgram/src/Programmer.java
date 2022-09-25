
public class Programmer extends Employee {
	private String languages;

	public Programmer(String firstName, String lastName, int id, String languages) {
		super(firstName, lastName, id);
		this.languages = languages;
	}

	public void formatIt(String os) {
		System.out.println(getFirstName() + " '" + os + "' sistemini yüklüyor");
	}
	
	@Override
	public void showInformation() {
		super.showInformation();
		System.out.println("Yazılımcının bildiği diller: " + languages);
	}
}
