import java.util.Scanner;

public class Login {
	public boolean login(Account account) {
		Scanner scanner = new Scanner(System.in);
		String user_Name;
		String password;

		System.out.print("Kullanıcı Adı: ");
		user_Name = scanner.nextLine();
		System.out.print("Parola: ");
		password = scanner.nextLine();

		if (account.getUserName().equals(user_Name) && account.getPassword().equals(password)) {
			return true;
		} else {
			return false;
		}
	}
}
