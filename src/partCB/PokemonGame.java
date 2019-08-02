package partCB;

import java.util.*;

public class PokemonGame {

	/**
	 * This method will return a String containing who got attacked, who did the attacking, and the move used.
	 * @param attacker
	 * @param move
	 * @param victim
	 * @return
	 */
	public static void turn(Pokemon attacker, int move, Pokemon victim){
		FirePokemon firePoke = new FirePokemon(Types.Fire,"",0,0,0),fireVic = new FirePokemon(Types.Fire,"",0,0,0);
		WaterPokemon waterPoke = new WaterPokemon(Types.Water,"",0,0,0),waterVic = new WaterPokemon(Types.Water,"",0,0,0);
		GrassPokemon grassPoke = new GrassPokemon(Types.Grass,"",0,0,0),grassVic = new GrassPokemon(Types.Grass,"",0,0,0);
		RockPokemon rockPoke = new RockPokemon(Types.Rock,"",0,0,0),rockVic = new RockPokemon(Types.Rock,"",0,0,0);

		//This number will help verify which type the attacker is.
		int atkNum = 0;

		//This 'if' block will make verify what type of Pokemon is being used for the attacker.
		if(attacker instanceof FirePokemon){
			firePoke = (FirePokemon)attacker;
		}else if(attacker instanceof WaterPokemon){
			atkNum = 1;
			waterPoke = (WaterPokemon)attacker;
		}else if(attacker instanceof GrassPokemon){
			atkNum = 2;
			grassPoke = (GrassPokemon)attacker;
		}else if(attacker instanceof RockPokemon){
			atkNum = 3;
			rockPoke = (RockPokemon)attacker;
		}


		//This number will help verify which type the attacker is.
		int vicNum = 0;

		//Same thing as above has to be done for victim too.
		//This 'if' block will make verify what type the victim is.
		if(victim instanceof FirePokemon){
			fireVic = (FirePokemon)victim;
		}else if(victim instanceof WaterPokemon){
			vicNum = 1;
			waterVic = (WaterPokemon)victim;
		}else if(victim instanceof GrassPokemon){
			vicNum = 2;
			grassVic = (GrassPokemon)victim;
		}else if(victim instanceof RockPokemon){
			vicNum = 3;
			rockVic = (RockPokemon)victim;
		}


		if(move == 1){
			System.out.println(attacker.getName()+" used "+attacker.getAttackName(move));

			//This next 'if' is for a Fire type vs a Fire type
		}else if(atkNum == 0 && vicNum == 0){
			System.out.println(firePoke.getName()+" used "+firePoke.getAttackName(move)+" on "+fireVic.getName());
			int tempHP = fireVic.getHealth();
			firePoke.attackPokemon(move, fireVic);
			System.out.println(fireVic.getName()+" lost "+(tempHP-fireVic.getHealth())+" hp!");

			//This next 'if' is for a Fire type vs a Water type
		} else if(atkNum == 0 && vicNum == 1){
			System.out.println(firePoke.getName()+" used "+firePoke.getAttackName(move)+" on "+waterVic.getName());
			int tempHP = fireVic.getHealth();
			firePoke.attackPokemon(move, waterVic);
			System.out.println(fireVic.getName()+" lost "+(tempHP-waterVic.getHealth())+" hp!");

			//This next 'if' is for a Fire type vs a Grass type
		} else if(atkNum == 0 && vicNum == 2){
			System.out.println(firePoke.getName()+" used "+firePoke.getAttackName(move)+" on "+grassVic.getName());
			int tempHP = grassVic.getHealth();
			firePoke.attackPokemon(move, grassVic);
			System.out.println(grassVic.getName()+" lost "+(tempHP-grassVic.getHealth())+" hp!");

			//This next 'if' is for a Fire type vs a Rock type
		} else if(atkNum == 0 && vicNum == 3){
			System.out.println(firePoke.getName()+" used "+firePoke.getAttackName(move)+" on "+rockVic.getName());
			int tempHP = rockVic.getHealth();
			firePoke.attackPokemon(move, rockVic);
			System.out.println(rockVic.getName()+" lost "+(tempHP-rockVic.getHealth())+" hp!");
			
			//This next 'if' is for a Water type vs a Fire type
		} else if(atkNum == 1 && vicNum == 0){
			System.out.println(waterPoke.getName()+" used "+waterPoke.getAttackName(move)+" on "+fireVic.getName());
			int tempHP = fireVic.getHealth();
			waterPoke.attackPokemon(move, fireVic);
			System.out.println(fireVic.getName()+" lost "+(tempHP-fireVic.getHealth())+" hp!");

			//This next 'if' is for a Water type vs a Water type
		} else if(atkNum == 1 && vicNum == 1){
			System.out.println(waterPoke.getName()+" used "+waterPoke.getAttackName(move)+" on "+waterVic.getName());
			int tempHP = fireVic.getHealth();
			waterPoke.attackPokemon(move, waterVic);
			System.out.println(fireVic.getName()+" lost "+(tempHP-waterVic.getHealth())+" hp!");

			//This next 'if' is for a Water type vs a Grass type
		} else if(atkNum == 1 && vicNum == 2){
			System.out.println(waterPoke.getName()+" used "+waterPoke.getAttackName(move)+" on "+grassVic.getName());
			int tempHP = grassVic.getHealth();
			waterPoke.attackPokemon(move, grassVic);
			System.out.println(grassVic.getName()+" lost "+(tempHP-grassVic.getHealth())+" hp!");

			//This next 'if' is for a Water type vs a Rock type
		} else if(atkNum == 1 && vicNum == 3){
			System.out.println(waterPoke.getName()+" used "+waterPoke.getAttackName(move)+" on "+rockVic.getName());
			int tempHP = rockVic.getHealth();
			waterPoke.attackPokemon(move, rockVic);
			System.out.println(rockVic.getName()+" lost "+(tempHP-rockVic.getHealth())+" hp!");
			
			//This next 'if' is for a Grass type vs a Fire type.
		} else if(atkNum == 2 && vicNum == 0){
			System.out.println(grassPoke.getName()+" used "+grassPoke.getAttackName(move)+" on "+fireVic.getName());
			int tempHP = fireVic.getHealth();
			grassPoke.attackPokemon(move, fireVic);
			System.out.println(fireVic.getName()+" lost "+(tempHP-fireVic.getHealth())+" hp!");

			//This next 'if' is for a Grass type vs a Water type
		} else if(atkNum == 2 && vicNum == 1){
			System.out.println(grassPoke.getName()+" used "+grassPoke.getAttackName(move)+" on "+waterVic.getName());
			int tempHP = fireVic.getHealth();
			grassPoke.attackPokemon(move, waterVic);
			System.out.println(fireVic.getName()+" lost "+(tempHP-waterVic.getHealth())+" hp!");

			//This next 'if' is for a Grass type vs a Grass type
		} else if(atkNum == 2 && vicNum == 2){
			System.out.println(grassPoke.getName()+" used "+grassPoke.getAttackName(move)+" on "+grassVic.getName());
			int tempHP = grassVic.getHealth();
			grassPoke.attackPokemon(move, grassVic);
			System.out.println(grassVic.getName()+" lost "+(tempHP-grassVic.getHealth())+" hp!");

			//This next 'if' is for a Grass type vs a Rock type
		} else if(atkNum == 2 && vicNum == 3){
			System.out.println(grassPoke.getName()+" used "+grassPoke.getAttackName(move)+" on "+rockVic.getName());
			int tempHP = rockVic.getHealth();
			grassPoke.attackPokemon(move, rockVic);
			System.out.println(rockVic.getName()+" lost "+(tempHP-rockVic.getHealth())+" hp!");
			
			//This next 'if' is for a Rock type vs a Fire type
		} else if(atkNum == 3 && vicNum == 0){
			System.out.println(rockPoke.getName()+" used "+rockPoke.getAttackName(move)+" on "+fireVic.getName());
			int tempHP = fireVic.getHealth();
			rockPoke.attackPokemon(move, fireVic);
			System.out.println(fireVic.getName()+" lost "+(tempHP-fireVic.getHealth())+" hp!");

			//This next 'if' is for a Rock type vs a Water type
		} else if(atkNum == 3 && vicNum == 1){
			System.out.println(rockPoke.getName()+" used "+rockPoke.getAttackName(move)+" on "+waterVic.getName());
			int tempHP = fireVic.getHealth();
			rockPoke.attackPokemon(move, waterVic);
			System.out.println(fireVic.getName()+" lost "+(tempHP-waterVic.getHealth())+" hp!");

			//This next 'if' is for a Rock type vs a Grass type
		} else if(atkNum == 3 && vicNum == 2){
			System.out.println(rockPoke.getName()+" used "+rockPoke.getAttackName(move)+" on "+grassVic.getName());
			int tempHP = grassVic.getHealth();
			rockPoke.attackPokemon(move, grassVic);
			System.out.println(grassVic.getName()+" lost "+(tempHP-grassVic.getHealth())+" hp!");

			//This next 'if' is for a Rock type vs a Rock type
		} else if(atkNum == 3 && vicNum == 3){
			System.out.println(rockPoke.getName()+" used "+rockPoke.getAttackName(move)+" on "+rockVic.getName());
			int tempHP = rockVic.getHealth();
			rockPoke.attackPokemon(move, rockVic);
			System.out.println(rockVic.getName()+" lost "+(tempHP-rockVic.getHealth())+" hp!");

		}
		
		//This will update the victim Pokemon's values.
				switch(victim.getType()){
				case Fire:
					victim = (Pokemon) fireVic;
					break;
				case Water:
					victim = (Pokemon) waterVic;
					break;
				case Grass:
					victim= (Pokemon) grassVic;
					break;
				case Rock:
					victim = (Pokemon) rockVic;
					break;
				case Glitch:
					System.out.println("GLITCH");
					break;
				}

	}

	/**
	 * Returns a String that displays who won.
	 * @param winner
	 * @return 
	 */
	public static String win(Pokemon winner){
		return "The winner is "+ winner.getName();
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Pokemon> players = new ArrayList<Pokemon>();

		System.out.println("Welcome challengers! Let's get this battle started!");

		//This 'for' loop will setup the beginning of the game by creating both of the pokemon
		for(int i = 0; i < 2; i++){
			System.out.println("Please enter the name of your pokemon Player "+(i+1));
			String name = scan.nextLine();
			int typeNum = 0;
			boolean correct = true;
			//This loop will make sure a type is chosen, and then will create a pokemon for the player
			while(correct){
				System.out.println("Player "+(i+1)+" what is the type of your pokemon?!");
				System.out.println("Please enter the corresponding number.\n1. Fire 2. Water 3. Grass 4. Rock");
				typeNum = scan.nextInt();
				int hp = 50 + (int)(Math.random()*50);
				int def = 1 + (int)(Math.random()*9);
				int str = 10 + (int)(Math.random()*10);
				switch(typeNum){
				case 1:
					FirePokemon firePoke = new FirePokemon(Types.Fire,name,hp,def,str);
					correct = false;
					players.add(firePoke);
					break;
				case 2:
					WaterPokemon waterPoke = new WaterPokemon(Types.Water,name,hp,def,str);
					correct = false;
					players.add(waterPoke);
					break;
				case 3:
					GrassPokemon grassPoke = new GrassPokemon(Types.Grass,name,hp,def,str);
					correct = false;
					players.add(grassPoke);
					break;
				case 4:
					RockPokemon rockPoke = new RockPokemon(Types.Rock,name,hp,def,str);
					correct = false;
					players.add(rockPoke);
					break;
				}
				scan.nextLine();
			}

		}

		scan.reset();
		int round = 1;

		//This loop will control the battle sequencing
		while(players.get(0).getHealth()>0 && players.get(1).getHealth()>0){
			System.out.println("-----ROUND "+round+"-----");

			int moveNum1 = 0;
			int moveNum2 = 0;

			//These next two print statements print out the health and names of the Players' pokemon. 
			System.out.println(players.get(0).getName()+" hp is "+players.get(0).getHealth());
			System.out.println(players.get(1).getName()+" hp is "+players.get(1).getHealth());
			for(int i = 0; i < 2; i++){
				boolean turn = true;

				//This loop will control the player's turn
				while(turn){

					int move = 0;
					System.out.println("Player "+ (i+1)+ " what would you have "+players.get(i).getName()+" do?");
					System.out.println(players.get(i).listOfAttacks());

					move = scan.nextInt();

					//This switch block will check that the move has been spelled right and then
					//assigns the type of the move to "moveType" to be used later. Also stores what
					//move was used to the pokemon who used it.
					switch(move){
					case 1:
						if(i == 0){
							moveNum1 = move;
							players.get(i).setDefenseStatus(true);
						}else{
							moveNum2 = move;
							players.get(i).setDefenseStatus(true);
						}
						turn = false;
						break;
					case 2:
						if(i == 0){
							moveNum1 = move;
						}else{
							moveNum2 = move;
						}
						turn = false;
						break;
					}
				}
			}

			//This will display what happened during the turn.
			//This statement will display player 1's perspective
			turn(players.get(0),moveNum1,players.get(1));
			//This statement will display player 2's perspective
			turn(players.get(1),moveNum2,players.get(0));

			round++;
		}

	}
}
