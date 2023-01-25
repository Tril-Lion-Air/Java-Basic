package player;

public class Player {
	
	private PlayerLevel level;
	
	public PlayerLevel getLevel() {
		return level;
	}
	
	public Player() {
		level = new BeginnerLevel();
		level.showLevelMessage();
	}
	
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}
	
	public void play(int n) { 
		level.go(n);
	} 
}
