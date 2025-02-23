package Questionaire;

public class c1_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[]=new int[] {40,70,30,60,50,20,10,80};
        //                 0   1  2 3 | 4  5  6  7
        int b[]=new int[a.length/2];
        int c[]=new int[a.length/2];
        int d[]=new int[a.length];
        int t=0;
        for(int x=0;x<b.length;x++)
        {
        	for(int y=x+1;y<=b.length-1;y++)
        	{
        		if(a[x]>a[y])
        		{
        			t=a[x];
        			a[x]=a[y];
        			a[y]=t;
        		}
        		
        	}
        	b[x]=a[x];
        }
        for(int temp: b)
        	System.out.println(temp);
        System.out.println("-------------------");
        for(int x=0;x<c.length;x++)
        {
        	for(int y=x+1;y<=c.length-1;y++)
        	{
        		if(a[x]<a[y])
        		{
        			t=a[x];
        			a[x]=a[y];
        			a[y]=t;
        		}
        		
        	}
        	c[x]=a[x];
        }
        for(int temp: c)
        	System.out.println(temp);
        System.out.println("--------------");
        for(int x=0;x<d.length/2;x++)
        {
        	d[x]=b[x];
        }
        int y=0;
        for(int x=d.length/2;x<d.length;x++)
        {
        	d[x]=c[y];
        	y++;
        }
        for(int temp: d)
        	System.out.println(temp);
        	
	}

}
