package patterns2;

public class pattern19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int rows=5,cols=5;
        for(int r=1;r<=rows;r++)
        {
        	for(int c=1;c<=r;c++)
        	{
        		System.out.print("# ");
        	}
        	System.out.println();
        }
        for(int r=1;r<=rows;r++)
        {
        	for(int c=r;c<=cols-1;c++)
        	{
        		System.out.print("# ");
        	}
        	System.out.println();
        }
	}

}
