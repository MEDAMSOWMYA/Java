package My_String;

public class IndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s=new String("Hello");
        System.out.println(s.indexOf('e'));
        System.out.println(s.indexOf('o'));
        System.out.println(s.indexOf('l'));      //2      //first occurence
        System.out.println(s.lastIndexOf('l'));  //3      //last occurence
        
        if(s.indexOf('l')==(s.lastIndexOf('l')))
        {    //2                  3
        	System.out.println("l is unique element");
        }
        else
        {
        	System.out.println("l is duplicate element");
        }
	}

}
