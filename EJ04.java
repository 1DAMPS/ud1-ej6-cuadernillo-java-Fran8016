import java.util.Scanner;
public class EJ04 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("¿Di un numero entero?");
    int numero1 = sc.nextInt();
    System.out.println("¿Di otro numero entero?");
    int numero2 = sc.nextInt();
    System.out.println("La suma de numero es "+(numero1 + numero2)+"");
    }
}