package patterns2;

public class pattern20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int rows=5,cols=5;
        for(int r=1;r<=rows;r++)
        {      //r=1        r=2
        	for(int c=r;c<=cols;c++)
        	{     //c=1   2<=5    2            1 2 3 4 5
        		  //c=2   2<=5
        		System.out.print("# ");   // 1 # # # # #
        	}                             // 2   # # # #
        	System.out.println(); 
        }
        for(int r=2;r<=rows;r++)
        {
        	for(int c=1;c<=r;c++)
        	{
        		System.out.print("# ");// 3     # # #
        	}
        	System.out.println();
        }                                 // 4       # #
	}                                     // 5         #
     
}
