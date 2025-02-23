package patterns2;

public class pattern25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int rows=4,cols=5;
       for(int r=1;r<=rows;r++)
       {
    	   for(int c=1;c<=cols;c++)
    	   {
    		   if(r%2==0)
    		   {
    			   if(c%2==0)
    				   System.out.print(1+" ");
    			   else
    				   System.out.print(0+" ");
    		   }
    		   else
    		   {
    			   if(c%2==0)
    				   System.out.print(0+" ");
    			   else
    				   System.out.print(1+" ");
    		   } 
    	   }
    	   System.out.println();
       }
       
	}

}
