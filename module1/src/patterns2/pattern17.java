package patterns2;

public class pattern17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int rows=4,cols=4;
       char letter='A',letter1='a';
       for(int r=1;r<=rows;r++)
       {
    	   for(int c=1;c<=cols;c++)
    	   {
    		   if(r%2==0)
    		   {
    		   System.out.print(letter1+" ");
    		   letter1++;
    		   }
    		   else
    			   System.out.print(letter+" ");
    		       letter++;  
    	   }
    	   System.out.println();
    	  
          }
	}

}
