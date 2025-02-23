package Patterns;

public class pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int rows=3,cols=3,count=0;
       for(int r=1;r<=rows;r++)
       {
    	   for(int c=1;c<=cols;c++)
    	   {
    		   count++;
    		   System.out.print(count+" ");
    	   }
    	   System.out.println();
       }
	}
}
