
public class Main {

	public static void main(String[] args) {
		ATM atm = new ATM();
		Account account = new Account("Fatih Enes", "12345", 2000);
		
		atm.start(account);
		System.out.println("Programdan çıkılıyor...");

	}

}
