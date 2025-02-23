package My_String;

public class Unique_Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s=new String("Hello all good morning");
        String s1[]=s.split(" ");  //s1 = 0 hello    1 all    2 good   3 morning
        System.out.println(s.length());
        System.out.println(s1.length);
//        System.out.println(s[1]);
        for(int x=0;x<s1.length;x++)
        {
        System.out.println(s1[x]);
        }
//        System.out.println(s1.indexOf('H'));
//        System.out.println(s1.lastIndexOf("H"));
	}

}
