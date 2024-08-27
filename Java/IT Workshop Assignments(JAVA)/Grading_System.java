import java.util.*;
public class Grading_System{

    public static void main(String[] args){


        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        if(num >= 90)
            System.out.println("AA");

        else if(num >= 80 && num < 90)
            System.out.println("AB");

        else if(num >= 70 && num < 80)
            System.out.println("BB");

        else
            System.out.println("F");

    }

}
