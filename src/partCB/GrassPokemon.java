package partCB;

public class GrassPokemon extends Pokemon {
	
	private Types type;
	private String name;
	private int health;
	private int strength;
	private int defense;
	private boolean defenseStatus;

	public GrassPokemon(Types type, String name, int health, int strength,
			int defense) {
		super(type, name, health, strength, defense);
	}
	
	@Override
	public Types getType(){
		return Types.Grass;
	}
	
	@Override
	public String listOfAttacks(){
		return super.listOfAttacks() +" 2. Grass Slice";
	}
	
	@Override
	public int attackAmount(int attackNumber){
		super.attackAmount(attackNumber);
		switch(attackNumber){
		case 1:
			setDefenseStatus(true);
			return 0;
		case 2:
			return strength;
		default:
			return 0;
		}
	}
	
	@Override
	public String getAttackName(int attackNumber){
		switch(attackNumber){
		case 1:
			return "Defend";
		case 2:
			return "Grass Slice";
		default:
			return "";
		}
	}
	
	@Override
	public int damageAmount(int attackStrength,Types attackerType){
		
		super.damageAmount(attackStrength, attackerType);
		//If this Pokemon defended before the turn.
		if(isDefenseStatus()){
			attackStrength /= 2;
		}
		
		switch(attackerType){
		case Grass:
			return attackStrength / 2;
		case Water:
		case Rock:
			return attackStrength;
		case Fire:
			return attackStrength * 2;
		default:
			return attackStrength;
		}
		
	}
}
