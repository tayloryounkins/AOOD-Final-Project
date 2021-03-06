
public class Player {

	/**
	 * @param args
	 */
	
	private String[] elements = {"fire", "ice", "earth", "wind"};
	private int[] defense = {100, 100, 100, 100};//player defense percentages
	private int[][] weaponsRange = {{5, 5, 5, 5},{10, 10, 10, 10}};//lower range of weapon, higher range of weapon
	private int maxHP;
	private int HP;
	private int count;
	
	public Player() {
		count = 0;
		HP = 100;
		maxHP = 100;
	}
	
	public int attack(int weapon, int[] monsterDefense) {
		int min = weaponsRange[0][weapon];
		int max = weaponsRange[1][weapon];
		int damage = (int)((max-min+1)*Math.random()+min);
		return damage*monsterDefense[weapon]/100;
	}
	
	public void heal() {
		HP += (int)(6*Math.random()+5);
	}
	
	public void increaseWeaponsRange(int weapon) {
		weaponsRange[0][weapon]++;
		weaponsRange[1][weapon]++;
	}
	
	public void increaseMaxHP(int points) {
		maxHP =+ points;
	}
	
	public int getHP() {
		return HP;
	}
	
	public int getMaxHP() {
		return maxHP;
	}
	
	public int[] getDefense() {
		return defense;
	}
	
	public int getPlayerCount() {
		return count;
	}
	
	public void levelUp() {
		increaseMaxHP(count);
		count++;
	}
	
	public void levelUp(int weapon) {
		increaseWeaponsRange(weapon);
		count++;
	}
}
