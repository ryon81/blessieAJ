import java.util.*;

class Bingo 
{
	public static void main(String[] args) 
	{
		Set set = new HashSet();
		//Set set = new LinkedHashSet() ���ε� ���� ȿ���� �� �� ����
		int[][] board = new int[5][5];
		int count = 0;
		long start = System.currentTimeMillis();
		
		for (int i=0; set.size() <25; i++ )
		{
			set.add((int)(Math.random()*50)+1+"");
			++count;
		}
		
		ArrayList list = new ArrayList(set);
		Collections.shuffle(list);
		Iterator it = list.iterator();
		
		for(int i=0; i<board.length; i++)
		{
			for(int j=0;j<board[i].length; j++)
			{
				board[i][j] = Integer.parseInt((String)it.next());
				System.out.print((board[i][j] < 10? "  ": " ") + board[i][j]);
				
			}
			System.out.println();					
		}
		System.out.println();
		long end = System.currentTimeMillis();
		
		System.out.println("�������Է� �ݺ�Ƚ�� : " + count + "��");
		System.out.println("��ɼ��� �Ϸ�ð� "+ (double)(end-start)/(double)1000+" ��");
		
	}
}
