package patterns2;

public class pattern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int rows=4,cols=4,count=1;
        for(int r=1;r<=rows;r++)
        {       //r=1 r=2
        	count=r;
        	for(int c=1;c<=cols;c++)
        	{    //c=1   1<=4  2<=4  3<=4  4<=4  5<=4f
        		System.out.print(count+" ");  //1 2 3 4
        		count++;     //2 3 4 5
        	}
        	System.out.println();
        }
	}

}
