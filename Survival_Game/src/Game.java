import java.util.Scanner;

public class Game {
	Scanner scanner = new Scanner(System.in);
	
	Player player;
	Location location;
	
	public void login() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Macera Oyununa Hosgeldiniz!");
		System.out.println("Oyuna baslamadan once isminizi giriniz: Reines");// ln'i sonra sil
		//String playerName = scan.nextLine();
		
		player = new Player("Reines");
		player.selectCha();
		
		start();
	}
	public void start() {

		while(true) {
			System.out.println();
			System.out.println("----------------------------------------------");
			System.out.println();
			
			System.out.println("Lutfen gideceginiz yeri seciniz: ");
			System.out.println("- 1) Guvenli Ev --> Size ait guvenli bir mekan...");
			System.out.println("- 2) Magara --> Karsiniza vampir cikabilir!!");
			System.out.println("- 3) Orman --> Karsiniza zombi vb. hayvan ve canavarlar cikabilir!!");
			System.out.println("- 4) Nehir --> Karsiniza ayi vb. hayvanlar cikabilir!!");
			System.out.println("- 5) Magaza --> Silah ve zirh alabilirsiniz...");
			System.out.print("Ilerlemek istediginiz yer: ");
			int selectLoc = scanner.nextInt();
			
			while (selectLoc < 1 || selectLoc > 5) {
				System.out.println("Lutfen gecerli bir yer seciniz...");
				System.out.print("Ilerlemek istediginiz yer: ");
				selectLoc = scanner.nextInt();
			}
			
			switch (selectLoc){
				case 1:
					location = new SafeHouse(player);
					break;
					
				case 2:
					location = new Cave(player);
					break;
					
				case 3:
					location = new Forest(player);
					break;
					
				case 4:
					location = new River(player);
					break;
					
				case 5:
					location = new ToolStore(player);
					break;
					
				default:
					location = new SafeHouse(player);
			}
			
			if (location.getClass().getName().equals("SafeHouse")) {
				if (player.getInv().isFood() && player.getInv().isFirewood() && player.getInv().isWater()) {
					System.out.println("Tebrikler oyunu kazandiniz...");
					break;
				}
			}
			
			if(!location.getLocation()) {
				System.out.println("Oyun Bitti!!");
				break;
			}
			
		}
		
	}
}
