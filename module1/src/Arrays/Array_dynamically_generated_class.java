package Arrays;

import java.util.Random;
import java.util.Scanner;

public class Array_dynamically_generated_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]=new int[10];
        char c[]=new char[10];
        Abc a=new Abc();
        Xyz x=new Xyz();
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        System.out.println(a.getClass().getName());
        System.out.println(x.getClass().getName());
        System.out.println(sc.getClass().getName());
        System.out.println(r.getClass().getName());
        System.out.println(arr.getClass().getName());
        System.out.println(c.getClass().getName());
	}
}
class Abc
{
	
}
class Xyz
{
	
}
