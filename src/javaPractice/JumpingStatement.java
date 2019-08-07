package javaPractice;

public class JumpingStatement {

	public static void main(String[] args) {
		
		//Print 1to10 number
		
		for(int i=1;i<=10;i++)
		{
			if(i==5) //condition true it will break don't go next block
			{
				break;
			}
		System.out.println(i);
		}
		
		
		for(int i=1;i<=10;i++)
		{
			if(i==5) //condition true it will keep going but don't print the true number
			{
				continue;
			}
		System.out.println(i);
		}
		
		//Or operator
		
		
		for(int i=1;i<=10;i++)
		{
			if(i==3 || i==5 || i==7) //condition true it will keep going but don't print the true number
			{
				continue;
			}
		System.out.println(i);
		}
		
		
	}

}
