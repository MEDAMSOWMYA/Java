package Questionaire;

public class c1_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[]=new int[] {10,20,30,40,50,60};
    //                 0   1  2  3  4  5
    int temp=0;
    for(int x=0;x<a.length;x+=2)
    {
    	temp=a[x];
    	a[x]=a[x+1];
    	a[x+1]=temp;
        System.out.println(a[x]);	
        System.out.println(a[x+1]);
    }
	}

}
