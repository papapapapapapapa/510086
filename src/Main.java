import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        String str;
        char a;
        str = in.next();
        a = in.next().charAt(0);
        System.out.println(str.replace(a, '\n'));
    }
}