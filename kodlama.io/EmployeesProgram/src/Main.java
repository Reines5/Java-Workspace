import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Çalışanlar Programını Hoşgeldiniz...");
		String processes = "İşlemler...\n" + "1.Yazılımcı İşlemleri\n" + "2.Yönetici İşlemleri\n"
				+ "Çıkış için q'ya basın.";

		while (true) {
			System.out.println("***************************************");
			System.out.println(processes);
			System.out.println("***************************************");
			System.out.print("İşlemi Seçiniz: ");
			String process = scanner.nextLine();

			if (process.equals("q")) {
				System.out.println("Programdan Çıkılıyor...");
				break;

			} else if (process.equals("1")) {
				Programmer programmer = new Programmer("Fatih Enes", "ÇOBAN", 555, "Python, C++, Java");
				String programmerProcess = "1.Format At\n" + "2.Bilgileri Göster\n" + "Çıkış için q'ya basın.";
				System.out.println(programmerProcess);
				while (true) {
					System.out.print("İşlemi Seçiniz: ");
					String xProcess = scanner.nextLine();

					if (xProcess.equals("q")) {
						System.out.println("***************************************");
						System.out.println("Yazılımcı İşlemlerinden Çıkılıyor...");
						System.out.println("***************************************");
						break;

					} else if (xProcess.equals("1")) {
						System.out.println("***************************************");
						System.out.print("İşletim Sistemi: ");
						String os = scanner.nextLine();
						programmer.formatIt(os);
						System.out.println("***************************************");

					} else if (xProcess.equals("2")) {
						System.out.println("***************************************");
						programmer.showInformation();
						System.out.println("***************************************");

					} else {
						System.out.println("Geçerli işlem giriniz!!");
					}
				}

			} else if (process.equals("2")) {
				Employer employer = new Employer("İlker", "ÇOBAN", 1111, 13);
				String employerProcess = "Yönetici İşlemleri\n" + "1.Zam Yap\n" + "2.Bilgileri Göster\n"
						+ "Çıkış için q'ya basın.";
				System.out.println(employerProcess);
				while (true) {
					System.out.print("İşlem Seçiniz: ");
					String xProcess = scanner.nextLine();

					if (xProcess.equals("q")) {
						System.out.println("***************************************");
						System.out.println("Yönetici İşlemlerinden Çıkılıyor...");
						System.out.println("***************************************");
						break;
					} else if (xProcess.equals("1")) {
						System.out.println("***************************************");
						System.out.print("Yöneticinin ne kadar zam yapmasını istiyorsunuz: ");
						int raiseAmount = scanner.nextInt();
						scanner.nextLine();
						employer.raise(raiseAmount);
						System.out.println("***************************************");

					} else if (xProcess.equals("2")) {
						System.out.println("***************************************");
						employer.showInformation();
						System.out.println("***************************************");

					} else {
						System.out.println("Geçerli işlem giriniz!!");

					}
				}

			} else {
				System.out.println("Geçerli bir işlem giriniz!!");

			}
		}
	}

}
