package Questionaire;

public class c3_e {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[]=new int[] {10,27,56,89,56,27};
    for(int x=0;x<a.length;x++)
    {
    	int count=0;
    	for(int y=0;y<a.length;y++)
    	{
    		if(a[x]==a[y])
    		{
    			count++;	
    		}
    	}
        if(count==1)
           {
        	System.out.println(a[x]);
           }	
    }
}
}
