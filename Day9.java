import java.util.*;

class Day9 {
    public static void main(String[] args)

    {
        int num, i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("take a number ");
        num = sc.nextInt();

        while (num != 0) {
            num = num / 10;
            i++;
        }
        System.out.println("number of digit :" + i);

    }
}