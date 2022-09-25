
public class ToolStore extends NormalLoc{

	ToolStore(Player player) {
		super(player, "Magaza");
	}
	
	public boolean getLocation() {
		System.out.println();
		System.out.println("----------------------------------------------");
		System.out.println();
		
		System.out.println("Menu:");
		System.out.println("- 1) Silahlar");
		System.out.println("- 2) Zirhlar");
		System.out.println("- 3) Cikis");
		System.out.println("Paraniz: " + player.getMoney());
		System.out.print("Lutfen secim yapiniz: ");
		int selTool = scanner.nextInt();
		int selItemID;
		
		switch(selTool) {
		case 1:
			selItemID = weaponMenu();
			buyWeapon(selItemID);
			break;
		
		case 2:
			selItemID = armorMenu();
			buyArmor(selItemID);
			break;
			
		case 3:
			break;
		}

		return true;
	}
	
	public int weaponMenu() {
		System.out.println();
		System.out.println("----------------------------------------------");
		System.out.println();
		
		System.out.println("- 1) Tabanca\t |Para: 25|  |Hasar: 2|");
		System.out.println("- 2) Kilic\t |Para: 35|  |Hasar: 3|");
		System.out.println("- 3) Tufek\t |Para: 45|  |Hasar: 7|");
		System.out.println("- 4) Iptal.");
		System.out.print("Secim yapiniz: ");
		int selWeaponID = scanner.nextInt();
		return selWeaponID;
		
	}
	
	public int armorMenu() {
		System.out.println();
		System.out.println("----------------------------------------------");
		System.out.println();
		
		System.out.println("- 1) Hafif Zirh\t |Para: 15|  |Koruma: 1|");
		System.out.println("- 2) Normal Zirh |Para: 25|  |Koruma: 3|");
		System.out.println("- 3) Agir Zirh\t |Para: 40|  |Koruma: 5|");
		System.out.println("- 4) Iptal.");
		System.out.print("Secim yapiniz: ");
		int selArmorID = scanner.nextInt();
		return selArmorID;
		
	}
	
	public void buyWeapon(int itemID) {
		int damage = 0, price = 0;
		String wName = null;
		
		switch (itemID) {
		case 1:
			damage = 2;
			wName = "Tabanca";
			price = 25;
			break;
			
		case 2:
			damage = 3;
			wName = "Kilic";
			price = 35;
			break;
			
		case 3:
			damage = 7;
			wName = "Tufek";
			price = 45;
			break;
			
		case 4:
			System.out.println("Iptal ediliyor...");
			break;
			
		default:
			System.out.println("Gecersiz islem!!");
			break;
		}
		
		if (price > player.getMoney()) {
			System.out.println("Paraniz yetersiz!!");
			
		}
		
		if(price > 0) {
			if(player.getMoney() >= price) {
				player.getInv().setDamage(damage);
				player.getInv().setwName(wName);
				player.setMoney(player.getMoney() - price);
				
				System.out.println(wName + "satin aldiniz, onceki hasar: " + player.getDamage() + ", yeni hasar: " + player.getTotalDamage());
				System.out.println("Kalan para: " + player.getMoney());
			}
			
		}else;
		
	}
	
	public void buyArmor(int itemID) {
		int avoid = 0, price = 0;
		String aName = null;
		
		switch (itemID) {
		case 1:
			avoid = 1;
			aName = "Hafif Zirh";
			price = 15;
			break;
			
		case 2:
			avoid = 3;
			aName = "Normal Zirh";
			price = 25;
			break;
			
		case 3:
			avoid = 5;
			aName = "Agir Zirh";
			price = 40;
			break;
			
		case 4:
			System.out.println("Iptal ediliyor...");
			break;
			
		default:
			System.out.println("Gecersiz islem!!");
			break;
		}
		
		if (price > player.getMoney()) {
			System.out.println("Paraniz yetersiz!!");
		}
		
		if(price > 0) {
			if(player.getMoney() >= price) {
				player.getInv().setArmor(avoid);
				player.getInv().setaName(aName);
				player.setMoney(player.getMoney() - price);
				
				System.out.println(aName + "satin aldiniz, zirh korumasi: " + player.getInv().getArmor());
				System.out.println("Kalan para: " + player.getMoney());
				
			}
			
		}else;
		
	}

}
