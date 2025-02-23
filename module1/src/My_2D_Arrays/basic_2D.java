package My_2D_Arrays;

public class basic_2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[]=new int[] {56,67,78,89,90};
        for(int x=0;x<a.length;x++) {
        	System.out.println(a[x]);
        }
        System.out.println();
        int marks1[][]= {{76,36,89,78,67},  //initialization
        		        {87,45,50,95,56},
        		        {44,89,67,56,89}};
        int marks[][]=new int[3][5];       //second type of initialization
        marks[0][0]=76;
        marks[0][1]=36;
        marks[0][2]=89;
        marks[0][3]=78;
        marks[0][4]=67;
        
        marks[1][0]=87;
        marks[1][1]=45;
        marks[1][2]=50;
        marks[1][3]=95;
        marks[1][4]=56;
         
        marks[2][0]=44;
        marks[2][1]=89;
        marks[2][2]=67;
        marks[2][3]=56;
        marks[2][4]=89;
        
        int b[][]=new int[][] {{76,36,89,78,67},{87,45,50,95,56},{44,89,67,56,89}}; //third type of initialization
        for(int x=0;x<3;x++)
        {
        	for(int y=0;y<5;y++)
        	{
        		System.out.print(b[x][y]+"\t");
        	}
        	System.out.println();
        }
	}

}
