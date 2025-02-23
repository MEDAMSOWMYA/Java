package Questionaire;

public class c2_e_f {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int a[]=new int[] {5,10,15,20,25,30};
   int b[]=new int[a.length/2],y=0;
   int c[]=new int[a.length/2],z=0;
   for(int x=0;x<a.length;x++)
   {
	   if(a[x]%2==0)
	   {
		   b[y]=a[x];
		   y++;
	   }
	   else
	   {
		   c[z]=a[x];
		   z++;
	   }
   }
   System.out.println("Even elements");
   for(int temp : b)
	   System.out.println(temp);
   System.out.println("Odd elements");
   for(int temp : c)
	   System.out.println(temp);
	}
}
