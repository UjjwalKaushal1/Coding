import java.util.*;

class Bookk {
    int bookid;
    String booktitle;
    int yearofpub;
    String author;
    String publisher;
    int totalcopies;


    public Bookk() {

        this.bookid = 0;

        this.booktitle = null;
        this.yearofpub = 0;
        this.author = null;
        this.publisher = null;
        this.totalcopies = 0;
    }

    public Bookk(int totalcopies) {
        this.totalcopies = totalcopies;
    }

    void Setdetails(int id, String title, int year, String author, String publisher, int count) {

        this.bookid = id;
        this.booktitle = title;
        this.yearofpub = year;
        this.author = author;
        this.publisher = publisher;
        this.totalcopies = count;
    }

    void Getdetails() {
        System.out.println("Book ID: " + this.bookid);
        System.out.println("Book Title: " + this.booktitle);
        System.out.println("Book Author: " + this.author);
        System.out.println("Publisher: " + this.publisher);
        System.out.println("Year of Publication: " + this.yearofpub);
        System.out.println("Total Copies: " + this.totalcopies);
    }

    void Issue() {
        if (this.totalcopies > 0) {
            this.totalcopies--;
            System.out.println("Book issued. Remaining copies: " + this.totalcopies);
        } else {
            System.out.println("No copies available for issue.");
        }
    }

    void Return() {
        this.totalcopies++;
        System.out.println("Book returned. Total copies now: " + this.totalcopies);
    }
}

public class Library_Management_System{
    public static void main(String[] args) {
        Bookk[] bookarray = new Bookk[5];
        for (int i = 0; i < bookarray.length; i++) {
            bookarray[i] = new Bookk();
        }

        Scanner s = new Scanner(System.in);
        int x = 0;
        boolean istrue = true;
        while (istrue) {
            System.out.println("Enter 1 for Set Details: ");
            System.out.println("Enter 2 for Get Details: ");
            System.out.println("Enter 3 for Issue: ");
            System.out.println("Enter 4 for Return: ");
            System.out.println("Enter 5 for Exiting: ");

            int n = s.nextInt();
            s.nextLine();

            switch (n) {
                case 1:
                    if (x >= bookarray.length) {
                        System.out.println("Library is full, cannot add more books.");
                        break;
                    }
                    System.out.println("Enter bookid: ");
                    int id = s.nextInt();
                    s.nextLine();
                    System.out.println("Enter title: ");
                    String title = s.nextLine();
                    System.out.println("Enter year: ");
                    int year = s.nextInt();
                    s.nextLine();
                    System.out.println("Enter author: ");
                    String author = s.nextLine();
                    System.out.println("Enter publisher: ");
                    String publisher = s.nextLine();
                    System.out.println("Enter count: ");
                    int count = s.nextInt();
                    bookarray[x].Setdetails(id, title, year, author, publisher, count);
                    x++;
                    break;
                case 2:
                    System.out.println("Enter id: ");
                    id = s.nextInt();
                    s.nextLine();
                    boolean found = false;
                    for (int i = 0; i < bookarray.length; i++) {
                        if (bookarray[i].bookid == id) {
                            bookarray[i].Getdetails();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Book not found with ID: " + id);
                    }
                    break;
                case 3:
                    System.out.println("ID: ");
                    id = s.nextInt();
                    s.nextLine();

                    for (int i = 0; i < bookarray.length; i++) {
                        if (bookarray[i].bookid == id) {
                            bookarray[i].Issue();
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("ID: ");
                    id = s.nextInt();
                    s.nextLine();

                    for (int i = 0; i < bookarray.length; i++) {
                        if (bookarray[i].bookid == id) {
                            bookarray[i].Return();
                            break;
                        }
                    }
                    break;
                case 5:
                    istrue = false;
                    break;
                default:
                    System.out.println("System Closing!");
            }
        }
        s.close();
    }
}
