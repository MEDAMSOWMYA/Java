package Arrays;

public class Sum_Of_Array_Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[]=new int[6];
        a[0]=10;
        a[1]=20;
        a[2]=30;
        a[3]=40;
        a[4]=50;
        a[5]=60;
        int sum=0;
        for(int x=0;x<a.length;x++)
        {
        	sum=sum+a[x];
        }
        System.out.println(sum);
	}

}
