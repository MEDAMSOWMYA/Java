package Questionaire;

import java.util.Scanner;

public class c1_1 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	//a 
    int a[]=new int[] {139,12,34,5,566,7}; //compile time
    for(int x=0;x<a.length;x++)
    {
    	System.out.println(a[x]);
    }
    System.out.println("a array length "+a.length);
    int b[]=new int[6];
    int count=0;
    System.out.println("Enter b array elements: ");
    for(int x=0;x<b.length;x++)
    {
    	count++;
    	b[x]=sc.nextInt();    //run time
    }
    System.out.println("length of array b is "+count);
    System.out.println("b array elements are using for loop");
    for(int x=0;x<b.length;x++)
    {
    	System.out.println(b[x]);
    }
    System.out.println("b array length "+b.length);
    System.out.println("b array elements using for each loop");
    for(int temp:b)
    	System.out.println(temp);

    
//	//b
	char c[]=new char[] {'c','3','(','?'};  //compile time
	for(int x=0;x<c.length;x++)
	{
		System.out.println(c[x]);
	}
	char d[]=new char[4];
	System.out.println("Enter d array elements: ");
	for(int x=0;x<d.length;x++)
	{
		d[x]=sc.next().charAt(x); //run time
	}
	System.out.println("d array elements are: ");
	for(int x=0;x<d.length;x++)
	{
		System.out.println(d[x]);
	}
	System.out.println("d array length "+d.length);
	System.out.println("d array elements using for each loop");
	for(char temp:d)
		System.out.println(temp);
	
	
	//c
	String e[]=new String[] {"hello","all","good","Morning","453","?<>|+_"};
	for(int x=0;x<e.length;x++)
	{
		System.out.println(e[x]);
	}
	System.out.println("e array length "+e.length);
	System.out.println("Enter f array elements");
	String f[]=new String[6];
	for(int x=0;x<f.length;x++)
	{
		f[x]=sc.next();
	}
	System.out.println("F array elements are: ");
	for(int x=0;x<f.length;x++)
	{
		System.out.println(f[x]);
	}
	System.out.println("f array length "+f.length);
	System.out.println("f array elements using for each loop");
	for(String temp:f)
		System.out.println(temp);
	//d
	
	boolean g[]=new boolean[] {true,false,true,false,true,true}; 
	for(int x=0;x<g.length;x++)
	{
		System.out.println(g[x]);
	}
	System.out.println("g array length "+g.length);
	boolean h[]=new boolean[6];
	System.out.println("Enter h array elements:");
	for(int x=0;x<h.length;x++)
	{
		h[x]=sc.nextBoolean();
	}
	System.out.println("h array elements are:");
	for(int x=0;x<h.length;x++)
	{
		System.out.println(h[x]);
	}
	System.out.println("h array length "+h.length);
	System.out.println("h array elements using for each loop");
	for(boolean temp:h)
		System.out.println(temp);
	}
}
