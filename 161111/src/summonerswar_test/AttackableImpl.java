package summonerswar_test;

public class AttackableImpl implements Attackable
{
	/*
	private Attacker myAt; 
	private Defender myDf;
	private Supporter mySp;
	private Physical myPy;
		*/
	
	public void hit(int attack) 
	{		
		EnemyBoss myEb = new EnemyBoss();
		myEb.beaten(attack);
	}
}
