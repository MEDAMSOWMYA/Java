package My_String;

public class basic_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        String s1=new String("Hello all good morning");
//        System.out.println(s1.length());      //length
//        int res=s1.length();
//        System.out.println(res);
//        System.out.println("hello all good morning".length());
//        System.out.println(s1.toUpperCase()); //toUpperCase
//        String s2=s1.toUpperCase();
//        System.out.println(s2);
//        System.out.println(s1.toLowerCase()); //toLowerCase
//        boolean b=s1.equals("Hello");         //equals
//        System.out.println(b);
//        System.out.println("Hi ".concat(s1)); //concat
//        String s3=new String(" Hello all ");
//        String s4=s3.trim();                  //trim
//        System.out.println(s4);
//        System.out.println(s1.charAt(4));     //charAt
//        String s5[]=s1.split(" ");              //split
//        System.out.println(s5.length);
//        System.out.println(s5);
        
        String s=new String("hey good morninggggggggggg hyd");
        System.out.println(s.codePointAt(2));
        System.out.println(s.contains("Good"));
        System.out.println(s.endsWith("gntr"));
        System.out.println(s.equalsIgnoreCase("hey Good MORNINGGGGGGGGGGG HYD"));
        System.out.println(s.intern());
        System.out.println(s.isEmpty());
        System.out.println(s.replace('o','e'));
        System.out.println(s.replaceAll("hey good morninggggggggggg hyd", "hi"));
        System.out.println(s.replaceFirst(s, s));
//        System.out.println(s.startsWith());
//        System.out.println(s.subSequence());
//        System.out.println(s.subString());
        
//        
        
	}

}
//concat is used for adding strings only ,  + is used for anything
