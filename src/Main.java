import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.replaceAll("[^a-zA-Z ]", "");
        str = new StringBuilder(str).reverse().toString();
        System.out.println(str);
    }
}