package a.a;
import a.a.*;
import java.util.function.Function;

public class Player{
	public Weapon mainWeapon;
	public Weapon offWeapon;
//	public Armor armor;
	public Stats stats;
	
	public Player(){
		this.mainWeapon = new Weapon("Fist");
		this.offWeapon = new Weapon("Fist");
		this.stats = new Stats();
	}
	public void equipWeapon(boolean twoHands, boolean rightHand, String name){//Sword2H boost not being added
		System.out.println(this.stats.offense);
		System.out.println(new Weapon(name).type.bonuses.offense);
		if(rightHand){
			System.out.println("Here!!");
			if(this.mainWeapon != null){//Should always occur. Only the OH can be null, if he's using a 2H weapon
				this.unequipW(true);
			}
			this.mainWeapon = new Weapon(name);
			if(twoHands){
				if(this.offWeapon != null){
					this.unequipW(false);
				}
				this.offWeapon = null;
			}
			this.stats = new Stats(this.stats, this.mainWeapon.type.bonuses, true);//NEW: Everything is being added, but the S2H isn't being removed at the right time
		}
		else{
			System.out.println(this.mainWeapon.type.name);//Still S2H
//			System.out.println(this.offWeapon.type.name);//So it's null here. But then where is the mainWeapon being removed?
			if(this.offWeapon != null){
				System.out.println("Here!");//Being skipped
				this.unequipW(false);
				this.unequipW(true);
				this.mainWeapon = new Weapon("Fist");
			}
			this.offWeapon = new Weapon(name);
			System.out.println(this.offWeapon.type.name);//So it's a fist. When did this happen?
			System.out.println(this.stats.offense + " " + this.offWeapon.type.bonuses.offense);//12 + 5 = 12
			this.stats = new Stats(this.stats, this.offWeapon.type.bonuses, true);
		}
		System.out.println(this.stats.offense);
		System.out.println("");
	}
	public void unequipW(boolean hand){//Note that this averts the recursive "equip" call b/c fists don't have bonuses. However, that's all subject to change.
		if(hand){
			if(this.mainWeapon.type.hands){
				this.offWeapon = new Weapon("Fist");
			}
			this.stats = new Stats(this.stats, this.mainWeapon.type.bonuses, false);
			this.mainWeapon = new Weapon("Fist");
		}
		else{
//			System.out.println(this.stats.offense);//Still 12 here
//			if(this.mainWeapon.type.hands){
//				System.out.println(this.);
//				this.stats = new Stats(this.stats, this.mainWeapon.type.bonuses, false);//This line. This whole section doesn't fit.
//			}
			this.stats = new Stats(this.stats, this.offWeapon.type.bonuses, false);
			this.offWeapon = new Weapon("Fist");
		}
	}
	public static void main(String[] args){
		Player P1 = new Player();
//		System.out.println(P1.mainWeapon.type.name);
//		System.out.println(P1.offWeapon.type.name);
//		System.out.println(P1.stats.offense);
		P1.equipWeapon(true, true, "Sword2H");
//		System.out.println(P1.mainWeapon.type.name);
		if(P1.offWeapon != null){
//			System.out.println(P1.offWeapon.type.name);
		}
		else{
//			System.out.println("Off hand is empty");
		}
//		System.out.println(P1.stats.offense);
		P1.equipWeapon(false, false, "Sword1H");
		if(P1.mainWeapon != null){
//			System.out.println(P1.mainWeapon.type.name);
		}
		else{
//			System.out.println("Main hand is empty");
		}
//		System.out.println(P1.offWeapon.type.name);
//		System.out.println(P1.stats.offense);
		P1.equipWeapon(false, true, "Sword1H");
//		System.out.println(P1.mainWeapon.type.name);
//		System.out.println(P1.offWeapon.type.name);
//		System.out.println(P1.stats.offense);
	}
}