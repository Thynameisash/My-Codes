import java.util.Scanner;

class book {
    String title;
    int nop;
    Scanner sc = new Scanner(System.in);

    void getinfo() {
        System.out.println("Enter title: ");
        title = sc.nextLine();
        System.out.println("Enter No. of Pages: ");
        nop = sc.nextInt();
    }

    void setinfo() {
        System.out.println("Title is : " + title);
        System.out.println("Num of Pages are : " + nop);

    }
}

class Textbook extends book {
    String pname;

    void getinfo() {
        System.out.println("Enter Publisher Name: ");
        pname = sc.nextLine();
    }

    void setinfo() {
        System.out.println("Publisher Name is : " + pname);
    }
}

public class demobook {
    public static void main(String[] args) {
        book b1 = new book();
        b1.getinfo();
        b1.setinfo();
        Textbook tb = new Textbook();
        tb.getinfo();
        tb.setinfo();
    }
}
