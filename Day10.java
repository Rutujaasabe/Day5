import java.util.*;
class Day10
{
   public static void main(String arg[])
{
    Scanner sc =new Scanner(System.in);
     int fact= 1;
       System.out.println("take a number : ");
       int num = sc.nextInt();
	if( num==0 || num==1)
		System.out.println("factorial="+1);
	else
	
		for(int i=1 ; i<=num ; i++)
		{
       			fact=fact*i;
 		}
		System.out.println(" factorial of given number is : "+fact);
	
 
   }
     }