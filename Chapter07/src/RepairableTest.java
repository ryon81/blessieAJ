class RepairableTest 
{
	public static void main(String[] args) 
	{
		Tank tank = new Tank();
		Dropship dropship = new Dropship();
		
		Marine marine = new Marine();
		SCV scv = new SCV();
		
		Medic medic = new Medic();
		
		scv.repair(tank);
		scv.repair(dropship);
		scv.repair(scv);
		//scv.repair(marine);
		
		System.out.println();
		
		medic.cure(marine);
		medic.cure(scv);
		medic.cure(medic);
		
	}
}

interface Repairable{}
interface Curable{}

class GroundUnit extends Unit
{
	GroundUnit(int hp)
	{
		super(hp);
	}
}

class AirUnit extends Unit
{
	AirUnit(int hp)
	{
		super(hp);
	}
}

class Unit
{
	int hitPoint;
	final int MAX_HP;
	Unit(int hp)
	{
		MAX_HP = hp;
	}
}

class Tank extends GroundUnit implements Repairable
{
	Tank()
	{
		super(150);
		hitPoint = MAX_HP;
	}
	
	public String toString()
	{
		return "Tank";
	}	
}

class Dropship extends AirUnit implements Repairable
{
	Dropship()
	{
		super(125);
		hitPoint = MAX_HP;
	}
	
	public String toString()
	{
		return "Dropship";
	}	
}

class Marine extends GroundUnit implements Curable
{
	Marine()
	{
		super(40);
		hitPoint = MAX_HP;
	}
	
	public String toString()
	{
		return "Marine";
	}	
}

class SCV extends GroundUnit implements Repairable, Curable
{
	SCV()
	{
		super(60);
		hitPoint = MAX_HP;
	}
	void repair(Repairable r)
	{
		if (r instanceof Unit)
		{
			Unit u = (Unit) r;
			while(u.hitPoint!=u.MAX_HP)
			{
				u.hitPoint++;
			}
			System.out.println(u.toString()+"의 수리가 끝났습니다. ");
		}
	}
	public String toString()
	{
		return "SCV";
	}	
}

class Medic extends GroundUnit implements Curable
{
	Medic()
	{
		super(40);
		hitPoint = MAX_HP;
	}
	void cure(Curable c)
	{
		if (c instanceof Unit)
		{
			Unit u = (Unit) c;
			while(u.hitPoint!=u.MAX_HP)
			{
				u.hitPoint++;
			}
			System.out.println(u.toString()+"의 치료가 끝났습니다. ");
		}
	}
	public String toString()
	{
		return "Medic";
	}	
}
