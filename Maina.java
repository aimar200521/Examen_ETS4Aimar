import java.util.Scanner;

/**
 * Clase Maina
 */
public class Maina {
    /**
     * La clase pide dos numeros al usuario y deacubre cual es el mayor y el menor
     *
     *
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero1, numero2;
        boolean ep;
        System.out.print("Introduzca primer numero: ");
        numero1 = teclado.nextInt();
        System.out.print("Introduzca segundo numero: ");
        numero2 = teclado.nextInt();
        int mayor, menor;
        if (numero1 > numero2) {
            mayor = numero1;
            menor = numero2;
        } else {
            mayor = numero2;
            menor = numero1;
        }
        for (int i = menor; i <= mayor; i++) {
            ep = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    ep = false;
                }
            }
            if (ep) {
                System.out.println(i + " ");
            }
        }
    }
}