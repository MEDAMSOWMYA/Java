package Questionaire;

public class c2_d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[]=new int[] {10,20,30,40,50,60};
    int b[]=new int[a.length/2],y=0;
    for(int x=0;x<a.length;x++)
    {
    	if(x%2 != 0)
    	{
    		b[y]=a[x];
    		y++;
    	}
    }
    for(int temp: b)
    	System.out.println(temp);
	}

}
