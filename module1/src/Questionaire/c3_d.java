package Questionaire;

public class c3_d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[]=new int[]{12,45,14,8,56,18,13};
    int max=0,min=a[0],sec_max=0;
    for(int x=0;x<a.length;x++)
    {
    	if(a[x]>max)
    	{
    		max=a[x];
    	}
    }
    for(int x=0;x<a.length;x++)
    {
    	if(a[x]>sec_max && a[x]!=max)
    	{
    		sec_max=a[x];
    	}
    }
    for(int x=0;x<a.length;x++)
    {
    	if(a[x]<min)
    	{
    		min=a[x];
    	}
    }
    System.out.println("maximum element in an array is: "+max);
    System.out.println("Second maximum element in an array is: "+sec_max);
    System.out.println("minimum element in an array is: "+min);
	}

}
