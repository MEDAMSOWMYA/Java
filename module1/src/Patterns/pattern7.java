package Patterns;

public class pattern7 {
	public static void main(String[] args)
	{
		int rows=8,cols=8,temp=rows+1;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=cols;c++)
			{
				if(r==c || r+c==temp || r==1 || r==rows || c==1 || c==cols)
					System.out.print("# ");
				else 
					System.out.print("$ ");
			}
			System.out.println( );
		}
	}

}
