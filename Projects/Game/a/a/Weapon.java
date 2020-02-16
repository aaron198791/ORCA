package a.a;
import a.a.*;
import java.util.function.Function;

public class Weapon{
//	public Function<Integer, Integer>[] attacks;
	public Object[] attacks;
	public Type type;
	public enum Type{                                                //Sum of bonuses. Note that relative value of stats is a factor. Adjusted to show "per hand"
		Fist(false, "Fist", 1,                new Stats(0, 0, 0, 0)),//0  || 0
		Sword2H(true, "Sword2H", 3,         new Stats(10, 10, 0, 0)),//20 || 10
		Sword1H(false, "Sword1H", 2,          new Stats(5, 5, 0, 0)),//10 || 10
		Shield(false, "Shield", 1,          new Stats(-5, 10, 0, 7)),//12 || 12
		TwinShield(true, "Twin Shields", 3, new Stats(5, 10, -5, 5)),//15 || 7.5
		Scimitar(true, "Scimitar", 5,        new Stats(12, 0, 0, 0)),//12 || 6
		Axe(true, "Battleaxe", 3,           new Stats(10, 5, -5, 5)),//15 || 7.5
		HAxe(false, "Handaxe", 3,             new Stats(3, 0, 0, 0)),//3  || 3
		QStaff(true, "Quarterstaff", 3,       new Stats(2, 7, 0, 4)),//13 || 6.5
		MStaff(true, "Magic Staff", 3,       new Stats(5, 0, 10, 3));//18 || 9
		
		public int moves;
		public String name;//Is this necessary/useful? Looks like it.
		public boolean hands;
		public Stats bonuses;
		private Type(boolean twoHands, String str, int x, Stats a){
			this.hands = true;
			this.moves = x;
			this.name = str;
			this.bonuses = a;
		}
	}
	public static Type identify(String str){
		switch(str){
			case "Fist":
				return Type.Fist;
			case "Shield":
				return Type.Shield;
			case "Sword2H":
				return Type.Sword2H;
			case "Sword1H":
				return Type.Sword1H;
			case "Twin Shields":
				return Type.TwinShield;
			case "Scimitar":
				return Type.Scimitar;
			case "Battleaxe":
				return Type.Axe;
			case "Handaxe":
				return Type.HAxe;
			case "Quarterstaff":
				return Type.QStaff;
			case "Magic Staff":
				return Type.MStaff;
		}
		return null;
	}
	public Weapon(String str){
		this.type = identify(str);
		this.attacks = new Object[this.type.moves];
//		this.attacks = new Function<Integer, Integer>[this.type.moves];
		Function<Integer, Integer> a = (Integer x) -> {return x;};
		switch(this.type.name){
			case "Sword2H":
//				attacks[0] = (Integer x) -> {return x;};
//				attacks[1] = (Integer x) -> {return x;};
//				attacks[2] = (Integer x) -> {return x;};
				attacks[0] = a;
				attacks[1] = a;
				attacks[2] = a;
				break;
			case "Sword1H":
//				attacks[0] = (Integer x) -> {return x;};
//				attacks[1] = (Integer x) -> {return x;};
				attacks[0] = a;
				attacks[1] = a;
				break;
			case "Fist":
				attacks[0] = a;
		}
	}
	public static void main(String[] args){
		
	}
}