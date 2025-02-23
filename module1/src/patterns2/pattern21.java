package patterns2;

public class pattern21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int rows=5,cols=5;
        for(int r=1;r<=rows;r++)
        {
        	for(int c=r;c<=cols;c++)
        	{
        		System.out.print(r+" ");
        	}     
        	System.out.println();
        }
	}

}
