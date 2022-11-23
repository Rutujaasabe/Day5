import java.util.*;
 class Day8
{
  public static void main(String ag[])
{
     double a,b,c;
      Scanner sc=new Scanner(System.in);
     System.out.println(" take value of a:");
      a=sc.nextDouble();

     System.out.println(" take value of b:");
      b=sc.nextDouble();

    System.out.println(" take value of c:");
      c=sc.nextDouble();

    //double z=sc.nextDouble();
    //double s=sc.nextDouble();
  
       double  s=(b*b)-(4*a*c);
        //z=(-b(+-s))/(2*a);

      if (s > 0)   
  {  
            double root1 = (-b + Math.pow(s, 0.5)) / (2 * a);  
            double root2 = (-b - Math.pow(s, 0.5)) / (2* a);  
                System.out.println("roots =  " + root1 + " and " + root2);  
   }   
      else if (s == 0)   
{  
     double root1 = -b / (2 * a);  
     System.out.println(" root  =  " + root1);  
}   
else   
{  
System.out.println(" not real ");  
}
}
}
