package Patterns;

public class pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int rows=8,cols=5,count=0;
        for(int r=1;r<=rows;r++)
        {
        	for(int c=1;c<=cols;c++)
        	{
        		if(r==c)
        			System.out.print("$ ");
        		else
        			System.out.print("# ");
        	}
        	System.out.println();
        }
	}

}
