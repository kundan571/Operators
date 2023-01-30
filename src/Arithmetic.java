import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sub = a - b;
        System.out.println(sub);
        int mul = a * b;
      //  System.out.println(mul);
        int div = a/b;
     //   System.out.println(div);
        System.out.println("modulus operator "+b%4);
    }
}
