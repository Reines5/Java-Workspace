import java.util.Scanner;

public class Player {
	
	Scanner scanner = new Scanner(System.in);
	
	private int damage, healty, money, rHealty;
	private String name, cName;
	private Inventory inv;
	
	public Player(String name) {
		this.name = name;
		this.inv = new Inventory();
	}
	
	//initPlayer ile selectCha birbiriyle bağımlı olarak çalışıyor.
	public void initPlayer(String cName, int dmg, int healthy, int money) {
		setcName(cName);
		setDamage(dmg);
		setHealthy(healthy);
		setMoney(money);
		setrHealthy(healthy);
	}
	
	public void selectCha() {
		switch(chaMenu()) {
		case 1:
			initPlayer("Samuray", 5, 21, 15);
			break;
			
		case 2:
			initPlayer("Okcu", 7, 18, 20);
			break;

		case 3:
			initPlayer("Sovalye", 8, 24, 5);
			break;
			
		default:
			initPlayer("Insan", 1, 10, 50);
			break;
		}
		System.out.println("Adiniz: " + getName() +" \t |Karakter: " + getcName()+ " | " + "Hasar:" + getDamage()+ " | " + "Can: " + getHealthy() + " | " + "Para: " + getMoney() + "|");
	}
	
	public int chaMenu() {
		System.out.println("Lutfen bir sinif seciniz: ");
		System.out.println("- 1) Samuray\t Hasar: 5 | Saglik:21 | Para: 15");
		System.out.println("- 2) Okcu\t Hasar: 7 | Saglik:18 | Para: 20");
		System.out.println("- 3) Sovalye\t Hasar: 8 | Saglik:24 | Para: 5");
		System.out.print("Karakter seciminiz: ");
		int chaID = scanner.nextInt();
		
		while (1>chaID || chaID >3) {
			System.out.println("Lutfen gecerli bir sinif seciniz...");
			System.out.print("Karakter seciminiz: ");
			chaID = scanner.nextInt();
		}
		
		return chaID;
	}
	
	public int getTotalDamage() {
		return this.getDamage() + this.getInv().getDamage();
	}
	
	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getHealthy() {
		return healty;
	}

	public void setHealthy(int healty) {
		this.healty = healty;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public Inventory getInv() {
		return inv;
	}

	public void setInv(Inventory inv) {
		this.inv = inv;
	}

	public int getrHealthy() {
		return rHealty;
	}

	public void setrHealthy(int rHealty) {
		this.rHealty = rHealty;
	}
}
