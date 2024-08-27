import java.util.*;
import java.util.Arrays;
public class Sorting {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int[] a = new int[10];
        for(int i = 0; i<10; i++)
        {
            int num = s.nextInt();
            a[i] = num;
        }
        Arrays.sort(a);
        System.out.println(a[8]);

    }
}
