package patterns2;

public class pattern18 {
	public static void main(String[] args)
	{
		int rows=5,cols=5;
		for(int r=1;r<=rows;r++)
		{
			for(int c=cols;c>=r;c--)
			{
				System.out.print(c+"" );
			}
			System.out.println();
		}
	}

}
