
public abstract class BattleLoc extends Location {
	protected Obstacle obstacle;
	protected String award;
	
	BattleLoc(Player player, String name, Obstacle obstacle, String award) {
		super(player);
		this.obstacle = obstacle;
		this.name = name;
		this.award = award;
	}
	public boolean getLocation() {
		int obsCount = obstacle.count();
		
		System.out.println();
		System.out.println("----------------------------------------------");
		System.out.println();
		
		System.out.println("Suan buradasiniz: " + this.getName());
		System.out.println("Dikkatli ol! Burada " + obsCount + " tane " + obstacle.getName() + " bulunmakta...");
		System.out.print("<S>avas ya da <K>ac: ");
		String selCase = scanner.next();
		selCase = selCase.toUpperCase();
		
		if (selCase.equals("S")) {
			if (combat(obsCount)) {
				System.out.println(this.getName() + " bolgesindeki tum dusmanlari temizlediniz!");
				
				if (this.award.equals("Yemek") && player.getInv().isFood() == false) {
					System.out.println(this.award + " kazandiniz!");
					player.getInv().setFood(true);
				}else if (this.award.equals("Yakacak Odun") && player.getInv().isFirewood() == false) {
					System.out.println(this.award + " kazandiniz!");
					player.getInv().setFirewood(true);
				}
				else if (this.award.equals("Su") && player.getInv().isWater() == false) {
					System.out.println(this.award + " kazandiniz!");
					player.getInv().setWater(true);
				}
				
				return true;
			}
			if (player.getHealthy() <= 0) {
				System.out.println("Oldunuz! Bir dahaki sefere...");
				return false;
			}
		}
		
		return true;
	}
	
	public boolean combat(int obsCount) {
		for(int i = 0; i < obsCount; i++) {
			int defObsHealth = obstacle.getHealth();
			
			playerStats();
			enemyStats();
			
			while (player.getHealthy() > 0 && obstacle.getHealth() > 0) {
				System.out.println("\n--------------------");
				System.out.print("<V>ur ya da <K>ac: ");
				String selCase = scanner.next();
				selCase = selCase.toUpperCase();
				
				if (selCase.equals("K")) {
					System.out.println("Basariyla kactiniz...");
					return false;
				}
				if (selCase.equals("V")) {
					System.out.println("Canavara vurdunuz!");
					obstacle.setHealth(obstacle.getHealth() - player.getTotalDamage());
					afterHit();
					if (obstacle.getHealth() > 0) {
						System.out.println("");
						System.out.println(obstacle.getName() + " size vurdu!");
						player.setHealthy(player.getHealthy() - (obstacle.getDamage() - player.getInv().getArmor()));
						afterHit();
					}
				}else {
					return false;
				}
			}
			
			if (obstacle.getHealth() <player.getHealthy()) {
				System.out.println("Dusmani yenidiniz!!");
				player.setMoney(player.getMoney() + obstacle.getAward());
				System.out.println("Yeni paraniz: " + player.getMoney());
				obstacle.setHealth(defObsHealth);
			}else {
				return false;
			}
			System.out.println("--------------------");
		}
		
		return true;
	}
	
	public void playerStats() {
		System.out.println("Oyuncu Degerleri\n--------------------");
		System.out.println("Cani: " + player.getHealthy());
		System.out.println("Hasari: " + player.getTotalDamage());
		System.out.println("Parasi: " + player.getMoney());
		
		if (player.getInv().getDamage() > 0) {
			System.out.println("Silahi: " + player.getInv().getwName());
		}
		if (player.getInv().getArmor() > 0) {
			System.out.println("Zirhi: " + player.getInv().getaName());
		}
		
	}
	
	public void enemyStats() {
		System.out.println("\n"+ obstacle.getName() + " Degerleri\n--------------------");
		System.out.println("Cani: " + obstacle.getHealth());
		System.out.println("Hasari: " + obstacle.getDamage());
		System.out.println("Odulu: " + obstacle.getAward());
		
	}
	
	public void afterHit() {
		System.out.println("Oyuncu Cani: " + player.getHealthy());
		System.out.println(obstacle.getName() + " cani: " + obstacle.getHealth());
	}

}
