package partCB;

public interface BasePoke {
	public int attackAmount(int attackNumber);
	public int damageAmount(int attackStrength,Types attackerType);
	public void receiveDamage(int attackStrength,Types attackType);
	public void attackPokemon(int attackNumber,Pokemon victim);
}
