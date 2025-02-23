package Application;

import java.util.Scanner;

public class Application {
      public static void main(String[] args)
      {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Welcome!");
  		System.out.println("Types of Restaurants are: ");
  		System.out.println("1.Kritunga\n2.Pista House\n3.Paradise\n4.Bawarchi");
  		System.out.println("Enter 1 to 4 to choose the restaurant you wanna try");
  		int num=sc.nextInt();
    	  int total=0,num2=0,item=0,quantity=0;
    	  while(true)
    	  {
//    		S=sc.nextInt();
    		switch(num)
    		{
    		case 1:
    			System.out.println("You choosed Kritunga restaurant");
    			System.out.println("Enter 1 to 2 to choose Veg/Non veg:");
    		    num2=sc.nextInt();
    		    int veg_bir=200,butternan=150,panner=250,chi_bir=300,chi_lolli=350,mutton_bir=400;
    			if(num2==1)
    			{
    				System.out.println("you choosed veg course");
    			    System.out.println("And The Menu is here:\n1.veg biriyani\n2.Fried rice\n3.Noodles");
    			    System.out.println("select the items which you wanna want");
    			    item=sc.nextInt();
    			    System.out.println("Enter quantity:");
    			    quantity=sc.nextInt();
    			    if(item==1)
    			    total=total+(quantity*veg_bir);
    			    else if(item==2)
    			    total=total+(quantity*butternan);
    			    else
    			    total=total+(quantity*panner);
    			    
    			    break;
    			}
    			    else
    			    {
    			    	System.out.println("you choosed Non-veg course");
        			    System.out.println("And Menu is here:\n1.chicken biriyani\n2.chicken lollipop\n3.mutton biriyani");
        			    System.out.println("select the items which you wanna want");
        			    item=sc.nextInt();
        			    System.out.println("Enter quantity:");
        			    quantity=sc.nextInt();
        			    if(item==1)
        			    total=total+(quantity*chi_bir);
        			    else if(item==2)
        			    	total=total+(quantity*chi_lolli);
        			    else
        			    	total=total+(quantity*mutton_bir);
        			    break;
    			    }
    		case 2:
    			System.out.println("You choosed Pista House restaurant");
    			System.out.println("Enter 1 to 2 to choose Veg/Non veg:");
    		    num2=sc.nextInt();
    		    int veg_biryani=220,butternaan_panner=350,manchuriya=250,chi_fry_bir=359,Fish_bir=400,mutton_biryani=450;
    			if(num2==1)
    			{
    				System.out.println("you choosed veg course");
    			    System.out.println("And The Menu is here:\n1.veg biriyani\n2.Manchuriya\n3.butterNaan with panner");
    			    System.out.println("select the items which you wanna want");
    			    item=sc.nextInt();
    			    System.out.println("Enter quantity:");
    			    quantity=sc.nextInt();
    			    if(item==1)
    			    total=total+(quantity*veg_biryani);
    			    else if(item==2)
    			    total=total+(quantity*butternaan_panner);
    			    else
    			    total=total+(quantity*manchuriya);
    			    
    			    break;
    			}
    			    else
    			    {
    			    	System.out.println("you choosed Non-veg course");
        			    System.out.println("And Menu is here:\n1.chicken fry biriyani\n2.Fish_bir\n3.mutton biriyani");
        			    System.out.println("select the items which you wanna want");
        			    item=sc.nextInt();
        			    System.out.println("Enter quantity:");
        			    quantity=sc.nextInt();
        			    if(item==1)
        			    total=total+(quantity*chi_fry_bir);
        			    else if(item==2)
        			    	total=total+(quantity*Fish_bir);
        			    else
        			    	total=total+(quantity*mutton_biryani);
        			    break;
    			    }
    		case 3:
    			System.out.println("You choosed Paradise restaurant");
    			System.out.println("Enter 1 to 2 to choose Veg/Non veg:");
    		    num2=sc.nextInt();
    		    int vegbir1=230,pulav=299,veg_noodles=90,chi_bir1=250,prawns_bir=450,mutton_bir1=450;
    			if(num2==1)
    			{
    				System.out.println("you choosed veg course");
    			    System.out.println("And The Menu is here:\n1.veg biriyani\n2.Pulav\n3.Veg noodles");
    			    System.out.println("select the items which you wanna want");
    			    item=sc.nextInt();
    			    System.out.println("Enter quantity:");
    			    quantity=sc.nextInt();
    			    if(item==1)
    			    total=total+(quantity*vegbir1);
    			    else if(item==2)
    			    total=total+(quantity*pulav);
    			    else
    			    total=total+(quantity*veg_noodles);
    			    
    			    break;
    			}
    			    else
    			    {
    			    	System.out.println("you choosed Non-veg course");
        			    System.out.println("And Menu is here:\n1.chicken biriyani\n2.prawns biriyani\n3.mutton biriyani");
        			    System.out.println("select the items which you wanna want");
        			    item=sc.nextInt();
        			    System.out.println("Enter quantity:");
        			    quantity=sc.nextInt();
        			    if(item==1)
        			    total=total+(quantity*chi_bir1);
        			    else if(item==2)
        			    	total=total+(quantity*prawns_bir);
        			    else
        			    	total=total+(quantity*mutton_bir1);
        			    break;
    			    }
    		case 4:
    			System.out.println("You choosed Bawarchi restaurant");
    			System.out.println("Enter 1 to 2 to choose Veg/Non veg:");
    		    num2=sc.nextInt();
    		    int veg65=180,chilli_manchuriya=200,veg_fried_rice=250,dum_bir=199,chic_roast_bir=350,mugalai_bir=359;
    			if(num2==1)
    			{
    				System.out.println("you choosed veg course");
    			    System.out.println("And The Menu is here:\n1Veg 65.\n2.chilli_manchuriya\n3.veg_fried_rice");
    			    System.out.println("select the items which you wanna want");
    			    item=sc.nextInt();
    			    System.out.println("Enter quantity:");
    			    quantity=sc.nextInt();
    			    if(item==1)
    			    total=total+(quantity*veg65);
    			    else if(item==2)
    			    total=total+(quantity*chilli_manchuriya);
    			    else
    			    total=total+(quantity*veg_fried_rice);
    			    break;
    			}
    			    else
    			    {
    			    	System.out.println("you choosed Non-veg course");
        			    System.out.println("And Menu is here:\n1.chicken dum biriyani\n2.chicken roast biriyani\n3.mutton biriyani");
        			    System.out.println("select the items which you wanna want");
        			    item=sc.nextInt();
        			    System.out.println("Enter quantity:");
        			    quantity=sc.nextInt();
        			    if(item==1)
        			    total=total+(quantity*dum_bir);
        			    else if(item==2)
        			    	total=total+(quantity*chic_roast_bir);
        			    else
        			    	total=total+(quantity*mugalai_bir);
        			    break;
    			    }
    		default:
    			System.out.println("Invalid");	
    		}
    		System.out.println("do you wanna continue");
    		char ch=sc.next().charAt(0);
    		if(ch=='n')
    		{
    			System.out.println("your total bill is"+total);
    			System.out.println("Thank you");
    			break;
    		}
    	  }
      }
}