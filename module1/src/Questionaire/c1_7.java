//Sort the array elements in ascending order 

package Questionaire;
public class c1_7
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
    int a[]=new int[] {40,70,30,60,50,20,10},t1=0;
    for(int x=0;x<=a.length-2;x++)
    {
        for(int y=x+1;y<a.length;y++)
        {
       	if(a[x]>a[y])
       	  {
       		t1=a[x];
       		a[x]=a[y];
       		a[y]=t1;
       	  }
        }
    }
    for(int temp1:a)
    	System.out.println(temp1);
    System.out.println("------------------");
    //Sort the array elements in descending order
    
    int b[]=new int[] {40,70,30,60,50,20,10},t2=0;
	for(int x=0;x<=b.length-2;x++)
	{
		for(int y=x+1;y<b.length;y++)
		{
			if(b[x]<b[y])
			{
				t2=b[x];
				b[x]=b[y];
				b[y]=t2;
			}			
		}
	}
		for(int temp2: b)
			System.out.println(temp2);
}
}
