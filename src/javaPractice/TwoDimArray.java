package javaPractice;

public class TwoDimArray {

	public static void main(String[] args) {
		
		int a[][]=new int [3][2];
		
		a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=600;
		
		//int a[][]= {{100,200},{300,400},{500,600}};
		System.out.println("Number of rows is:" +a.length);
		System.out.println("Number of column is:" +a[0].length);
		
		/*for(int i=0;i<a.length;i++) //outer loop
		{
			for(int j=0;j<a[i].length;j++) //Inner loop
			{
				System.out.println(a[i][j]);
				
			}
	}*/
		
		//Enhanced for loop
		for(int r[]:a) //r is array variable as play role single dim array
		{
			for(int i:r)
			{
				System.out.println(i);
			}
		}
		
		}

	}


