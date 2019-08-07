package javaPractice;

public class WhileLoop {

	public static void main(String[] args) {
		
		int i=1;
		//1to 10 number
		
		while(i<=10)
		{
			System.out.println(i);
			i++;
		}
		// print even number from 1to 10
		i=2;
		while(i<=10)
		{
			System.out.println(i);
			i+=2; //i=i+2;
		}
		
		//print decending order
		i=10;
		while(i>0)
		{
			System.out.println(i);
			i--;
		}
		

	}

}
