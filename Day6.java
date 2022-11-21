import java.util.*;
class Day6
{
   public static void main(String args[])
{
     Scanner sc=new Scanner(System.in);
    //  int  x ,y ;
    System.out.println("Enter the x value :");
     int  x=sc.nextInt();
   System.out.println("Enter the y value :");
     int  y=sc.nextInt();
    if(x>0 && y>0)
  {
      System.out.println("This point lies in first quadrant");
  }

   if( x<0  && y>0)
  {
     System.out.println("This point lies in second quadrant.");
  }

   if(x<0 && y<0)
  {
     System.out.println("This point lies in third quadrant.");
   }

   if( x>0 && y<0)
  {
      System.out.println("This point lies in fourth quadrant.");
  }
  
     
}

}