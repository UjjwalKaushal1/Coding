import java.util.*;
class Student {
    int roll;
    String name;
    String branch;
    double cgpa;

    void set(int roll, String name, String branch, double cgpa)
    {
        this.roll = roll;
        this.name = name;
        this.branch = branch;
        this.cgpa = cgpa;
    }

    void print_details()
    {
        System.out.println(this.roll+" ");
        System.out.println(this.name+" ");
        System.out.println(this.branch+" ");
        System.out.println(this.cgpa+" ");
    }
    boolean branch_change(){
        if(cgpa > 9.0)
        {
            if(this.branch == "ECE")
            {
                this.branch = "CSE";
            }
            return true;
        }
        return false;
    }

}
public class Classes_and_Objects {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
//        Student s1 = new Student();
//        System.out.print("Student 1 details: "+ "\n");
//        s1.set(236,"UJJWAL KAUSHAL","ECE",9.1);
////        boolean var = s1.branch_change();
////        System.out.println(var);
//        s1.print_details();
//        boolean var = s1.branch_change();
//        System.out.println(var);
//
//        System.out.print("Student 2 details: "+ "\n");
//        Student s2 = new Student();
//
//        s2.set(182,"SAHARSH JAIN","CSE",9.3);
//        s2.print_details();
////
////        boolean varr = s2.branch_change();
////        System.out.println(varr);
////        s2.print_details();
        Student s1 = new Student();
        Student s2 = new Student();

        int roll1 = s.nextInt();
        double d1 = s.nextDouble();
        String b1 = s.next();
        String name1 = s.next();

        s1.set(roll1,name1,b1,d1);
        s1.print_details();
        boolean var = s1.branch_change();
        System.out.println(var);
        if(var == true)
         s1.set(roll1,name1,"CSE",d1);
        s1.print_details();
        //Scanner sc2 = new Scanner(System.in);

        int roll2 = s.nextInt();
        double d2 = s.nextDouble();
        String b2 = s.next();
        String name2 = s.next();

        s2.set(roll2,name2,b2,d2);
//        boolean varr = s2.branch_change();
//        System.out.println(varr);
        s2.print_details();
        boolean varr = s2.branch_change();
        System.out.println(varr);
        if(varr == true)
            s2.set(roll2,name2,"CSE",d2);

        s2.print_details();

    }
}
