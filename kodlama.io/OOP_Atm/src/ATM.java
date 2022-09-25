import java.util.Scanner;

public class ATM {
	public void start(Account account) {
		Login login = new Login();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Bankamıza Hoşgeldiniz...");
		System.out.println("********************************");
		System.out.println("Kullanıcı Girişi");
		System.out.println("********************************");

		int giris_hakki = 3;

		while (true) {
			if (login.login(account)) {
				System.out.println("Giriş Başarılı...");
				break;
			} else {
				System.out.println("Giriş Başarısız!!!");
				giris_hakki -= 1;
				System.out.println("Kalan Giriş Hakkı: " + giris_hakki);
			}
			if (giris_hakki == 0) {
				System.out.println("Giriş Hakkınız Bitti...");
				return;
			}
		}

		System.out.println("********************************");
		String islemler = "1. Bakiye Görüntüle\n" + "2. Para Yatırma\n" + "3. Para Çekme\n"
				+ "Çıkış için q'ya basınız.";
		System.out.println(islemler);
		System.out.println("********************************");

		while (true) {
			System.out.print("İşlem Seçiniz: ");
			String islem = scanner.nextLine();

			if (islem.equals("q")) {
				break;

			} else if (islem.equals("1")) {
				System.out.println("Bakiyeniz: " + account.getBalance() + "\n");

			} else if (islem.equals("2")) {
				System.out.print("Yatırmak İstediğiniz Tutar: ");
				int tutar = scanner.nextInt();
				scanner.nextLine();

				account.paraYatir(tutar);
				System.out.println("Yeni Bakiyeniz: " + account.getBalance() + "\n");

			} else if (islem.equals("3")) {
				System.out.print("Çekmek İstediğiniz Tutar: ");
				int tutar = scanner.nextInt();
				scanner.nextLine();

				account.paraCek(tutar);
				System.out.println("Yeni Bakiyeniz: " + account.getBalance() + "\n");
			} else {
				System.out.println("Geçerli Bir İşlem Seçiniz...");
			}
		}
	}
}
