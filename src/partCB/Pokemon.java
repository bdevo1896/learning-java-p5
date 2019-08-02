package partCB;

public abstract class Pokemon implements BasePoke {

	private Types type;
	private String name;
	private int health;
	private int strength;
	private int defense;
	private boolean defenseStatus;

	public Pokemon(Types type, String name, int health, int strength, int defense) {
		this.type = type;
		this.name = name;
		this.health = health;
		this.strength = strength;
		this.defense = defense;
		defenseStatus = false;
	}

	public Types getType() {
		return Types.Glitch;
	}

	public String getName() {
		return name;
	}

	public int getHealth() {
		return health;
	}

	public int getStrength() {
		return strength;
	}

	public int getDefense() {
		return defense;
	}

	public boolean isDefenseStatus() {
		return defenseStatus;
	}
	
	public void setDefenseStatus(boolean newDefenseStatus){
		this.defenseStatus = newDefenseStatus;
	}

	public String listOfAttacks(){
		return "1. Defend";
	}
	
	public String getAttackName(int attackNumber){
		return "Defend";
	}


	/**
	 * Returns the calculated power of the attack.
	 */
	public int attackAmount(int attackNumber) {
		return 0;
	}


	/**
	 * Calculates the damage of the attack made depending on its power.
	 */
	public int damageAmount(int attackStrength, Types attackerType) {
		return 0;
	}


	/**
	 * This method will reduce the health of this Pokemon depending on the type and power of the attacking
	 * Pokemon.
	 */
	public void receiveDamage(int attackStrength, Types attackType) {
		this.health -= damageAmount(attackStrength,attackType);

	}
	

	/**
	 * This method will reduce the victim Pokemon by the calculated damage from the attack.
	 */
	public void attackPokemon(int attackNumber, Pokemon victim) {
		int damage = attackAmount(attackNumber);
		if(victim.isDefenseStatus()){
			damage /= 2;
		}

		victim.receiveDamage(damage, this.type);
		victim.setDefenseStatus(false);

	}


}
