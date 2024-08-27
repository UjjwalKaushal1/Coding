import java.util.*;
public class Total_Even_and_Odds {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of test cases: ");
        int t = s.nextInt();
        s.nextLine();
        int sodd = 0,seve = 0;

//        int n = s.nextInt();
        int[] a = new int[t];
        System.out.println("Enter the size of array for each test case: ");
        for(int i = 0; i<t; i++)
        {
            a[i] = s.nextInt();
        }
        System.out.println("Enter the array elements: ");
        for(int i = 0; i<t; i++)
        {
            int[] A = new int[a[i]];
            for(int j = 0; j<a[i]; j++)
            {
                A[i] = s.nextInt();
                if(A[i]%2 != 0)
                {
                    sodd++;
                }
                else
                {
                    seve++;
                }
            }
        }
        System.out.println("The number of odd elements are: "+sodd+" and the number of even elements are: "+seve);


    }
}
