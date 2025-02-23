package Patterns;

public class pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int rows=5,cols=5,temp=rows+1;
        for(int r=1;r<=rows;r++)
        {
        	for(int c=1;c<=cols;c++)
        	{
        		if(r+c==temp)
        			System.out.print("$ ");
        		else 
        			System.out.print("# ");
        	}
        	System.out.println();
        }
	}

}
