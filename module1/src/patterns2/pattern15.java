package patterns2;

public class pattern15 {
    public static void main(String[] args)
    {
    	int rows=5,cols=5,temp=rows+1,count=1;
    	for(int r=1;r<=rows;r++)
    	{
    		for(int c=1;c<=cols;c++)
    		{
    			if(r==c || r+c==temp)
    			{
    				System.out.print(count);
    				count++;
    			}
    			else 
    				System.out.print(" ");
    		}
    		System.out.println();
    	}
    }
}
