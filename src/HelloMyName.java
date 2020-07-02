import java.util.Scanner;
public class HelloMyName {
    static void MyName() {
        System.out.println("input your name and press Enter:");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("Hello " + name);
    }
    public static void main (String[] args) {
        MyName();
    }
}
