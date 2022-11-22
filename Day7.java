import java.util.*;
class Day7
{
   public static void main(String args[])
  {
     Scanner sc= new Scanner(System.in);
     int month,year;
    System.out.println("enter the month:");
    month=sc.nextInt();
     System.out.println("enter the year:");
     year=sc.nextInt();
    switch(month)
  {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
               System.out.println("31 days in this months");
                break;
          
           case 4:
           case 6:
           case 9:
           case 11 :
               System.out.println("30 days in this months");
               break;
           case 2:
                 if((year%400==0) && ((year%4==0)|| (year%100!=0)))
                         System.out.println("29 days in feb");
                 else
                         System.out.println("28 days in feb");
                         break; 
           default:
                       System.out.println("invalid month");
                       break;
          
           }
   }
}
