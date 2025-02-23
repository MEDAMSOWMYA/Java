package patterns2;

public class paatern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int rows=5,cols=5;
        char letter='A';
        for(int r=1;r<=rows;r++)
        {
        	for(int c=1;c<=cols;c++)
        	{
        		System.out.print(letter+" ");
        	}
        	letter++;
        	System.out.println();
        }
	}

}
