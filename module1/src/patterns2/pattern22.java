package patterns2;

public class pattern22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int rows=4,cols=4;
      
      for(int r=1;r<=rows;r++)
      {
    	  char letter='A';
    	  for(int c=1;c<=cols;c++)
    	  {
    		 System.out.print(letter+" "); 
    		 letter++;
    	  }
    	  System.out.println();
      }
	}

}
