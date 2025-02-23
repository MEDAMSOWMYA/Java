package Arrays;

public class Assigning_Arr_ele_To_Another {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int b[]=new int[] {10,20,30,80,50};
        int c[]=new int[b.length];
        System.out.println("B array elements are");
        for(int x=0;x<b.length;x++)
        {
        	c[x]=b[x];
        	System.out.println(b[x]);
        }
        System.out.println();
        System.out.println("C array elements are");
        for(int x=0;x<c.length;x++)
        {
        System.out.println(c[x]);
        }
        
	}

}
