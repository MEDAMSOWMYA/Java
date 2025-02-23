package patterns2;

public class pattern23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=5,cols=5;
        for(int r=1;r<=rows;r++)
        {
        	for(int c=1;c<=r;c++)
        	{
        		if(c==1 || r==rows || r==c)
        		    System.out.print("# ");
        		else 
        			System.out.print(" ");
        	}
        	System.out.println();
        }
       
	}

}

