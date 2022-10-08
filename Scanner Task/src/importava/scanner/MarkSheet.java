package importava.scanner;

import java.util.Scanner;

public class MarkSheet {
	public static void main(String[]args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the SchoolName:");
		String data1 =input.nextLine();
        System.out.println("Your School is:"+data1 );
        
        System.out.println("Enter your Name");
        String data2 =input.nextLine();
        System.out.println("Your Name"+data2);
        
        System.out.println("Enter Your age");
        int a =input.nextInt();
        System.out.println("Your age:"+a);
        
        System.out.println("tamil mark");
        int b=input.nextInt();
        System.out.println("tamil:"+b);
        
        System.out.println("English mark");
        int c=input.nextInt();
        System.out.println("English:"+c);
        
        long d=b+c;
        System.out.println("Total Mark is:"+d);
     input.close();  
	}

}
