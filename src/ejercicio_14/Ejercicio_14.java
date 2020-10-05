package ejercicio_14;

import java.util.Scanner;

/**
 * 14. Pedir al usuario que introduzca dos numeros cualesquiera. Despues de
 * haberlos introducido se le pedirá que seleccione que operacion desea realizar
 * con ellos (suma, resta, multiplicación, división). Las operaciones serán
 * realizadas en procedimientos fuera del main.
 *
 */
public class Ejercicio_14 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double numero1;
        double numero2;
        int operacion;
        System.out.print("Introduzca el primer número: ");
        numero1 = teclado.nextInt();
        System.out.print("Introduzca el segundo número: ");
        numero2 = teclado.nextInt();
        System.out.println("---------------------------------------------------");
        System.out.println("1. Suma\n" + "2. Resta\n" + "3. Multiplicación\n" + "4. División\n");
        System.out.print("Escoja una opción (1-4): ");
        operacion = teclado.nextInt();

        switch (operacion) {
            case 1:
                System.out.println("Resultado: " + suma(numero1, numero2));
                break;
            case 2:
                System.out.println("Resultado: " + resta(numero1, numero2));
                break;
            case 3:
                System.out.println("Resultado: " + multiplicacion(numero1, numero2));
                break;
            case 4:
                System.out.println("Resultado: " + division(numero1, numero2));
                break;
        }

    }

    /**
     * Suma dos números.
     *
     * @param x Primer número.
     * @param y Segundo número.
     * @return Resultado de la suma.
     */
    public static double suma(double x, double y) {
        double resultadoSuma = x + y;
        return resultadoSuma;
    }

    /**
     * Resta dos números.
     *
     * @param x Primer número.
     * @param y Segundo número.
     * @return Resultado de la resta.
     */
    public static double resta(double x, double y) {
        double resultadoResta = x - y;
        return resultadoResta;
    }

    /**
     * Multiplica dos números.
     *
     * @param x Primer número.
     * @param y Segundo número.
     * @return Resultado de la multiplicación.
     */
    public static double multiplicacion(double x, double y) {
        double resultadoMultiplicacion = x * y;
        return resultadoMultiplicacion;
    }

    /**
     * Divide dos números.
     *
     * @param x Primer número.
     * @param y Segundo número.
     * @return Resultado de la división.
     */
    public static double division(double x, double y) {
        double resultadoDivision = x / y;
        return resultadoDivision;
    }

}
