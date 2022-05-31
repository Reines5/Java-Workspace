
public class SafeHouse extends NormalLoc{

	SafeHouse(Player player) {
		super(player, "Guvenli Ev");
	}
	
	public boolean getLocation() {
		System.out.println();
		System.out.println("----------------------------------------------");
		System.out.println();
		
		player.setHealthy(player.getrHealthy());
		System.out.println("Caniniz Yenilendi...");
		System.out.println("Suan guvenli evdesiniz.");
		
		return true;
	}
}
