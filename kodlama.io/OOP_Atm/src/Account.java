
public class Account {
	private String userName;
	private String password;
	private int balance;

	public Account(String userName, String password, int balance) {
		this.userName = userName;
		this.password = password;
		this.balance = balance;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void paraYatir(int tutar) {
		balance += tutar;
		System.out.println("Yeni bakiyeniz: " + balance);
	}

	public void paraCek(int tutar) {
		if ((balance - tutar) < 0) {
			System.out.println("Yeterli Bakiyeniz Yok...");
		} else {
			balance -= tutar;
			System.out.println("Yeni Bakiyeniz: " + balance);
		}
	}

}
