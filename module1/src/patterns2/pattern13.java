package patterns2;

public class pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int rows=5,cols=5;
        for(int r=1;r<=5;r++)
        {
        	if(r%2==0)
        	{
        		for(int c=cols;c>=1;c--)
        			System.out.print(c+" ");
        	} 
        	else 
        	{
            for(int c=1;c<=5;c++)
        	{    
        		    System.out.print(c+" ");   	                                 
        	}
        	}
        	System.out.println();
        }
	}
  
}
