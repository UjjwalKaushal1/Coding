import java.util.*;
public class MergeSort {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];

        for(int i  = 0; i<n; i++)
            a[i] = s.nextInt();

        for(int i = 0; i<n; i++)
        {
            for(int j = i+1; j<n; j++)
            {
                if(a[i] > a[j])
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        for(int i = 0; i<n; i++)
        {
            int num = a[i]+'0';
            System.out.print(num+" ");
        }
        System.out.println();
    }
}
