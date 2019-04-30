package a.a;

public class Stats{
	public int offense = 12;
	public int defense = 10;
	public int magic = 5;
	public int health = 20;
	
	public Stats(){}
	
	public Stats(int[] a){
		this.offense = a[0];
		this.defense = a[1];
		this.magic = a[2];
		this.health = a[3];
	}
	public Stats(int a, int b, int c, int d){
		this.offense = a;
		this.defense = b;
		this.magic = c;
		this.health = d;
	}
	public Stats(Stats a, Stats b, boolean adding){
		if(adding){
			this.offense = a.offense + b.offense;
			this.defense = a.defense + b.defense;
			this.magic = a.magic + b.magic;
			this.health = a.health + b.health;
		}
		else{
			this.offense = a.offense - b.offense;
			this.defense = a.defense - b.defense;
			this.magic = a.magic - b.magic;
			this.health = a.health - b.health;
		}
	}
	public static void main(String[] args){
		
	}
}