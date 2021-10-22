import java.util.Scanner;
import java.lang.*;

class GetInputFromUser{
       public static void main(String args[]){
       int a;
       float b;
       String s;
       Scanner x=new Scanner(System.in);
       
       System.out.println("Enter the integer : ");
       a=x.nextInt();
System.out.println("Integer you entered is "+a);
System.out.println("Enter the float: ");
b=x.nextFloat();
System.out.println("Float you entered is"+b);
System.out.println("Enter a string : ");
s=x.nextLine();
s=x.nextLine();
System.out.println("String entered :"+s);
}
}
      
 