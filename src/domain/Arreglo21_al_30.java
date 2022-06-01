package domain;

import java.util.Scanner;

public class Arreglo21_al_30 {

    static Scanner sc = new Scanner(System.in);
    public static final int diez = 10;

    /*
    Leer 10 números enteros, almacenarlos en un vector y determinar en qué 
    posición está el número cuya suma de dígitos sea la mayor.
     */
    public static void mayorCantDigitos() {
        int[] enteros = new int[diez];
        int[] contDigitos = new int[diez];
        int aux = 1, mayNum = 0, cont = 0, sumDgt = 0, ultDgt;
        System.out.print("Ingrese 10 numeros.\n");

        //Para rellenar el vector
        for (int i = 0; i < 10; i++) {
            System.out.print("num:");
            enteros[i] = sc.nextInt();
        }

        for (int j = 0; j < 10; j++) {

            aux = enteros[j];
            while (aux > 0) {
                ultDgt = aux - aux / diez * diez;
                sumDgt += ultDgt;
                aux /= diez;
                cont++;
            }

            contDigitos[j] = cont;
            cont = 0;
        }

        aux = 1;
        for (int k = 0; k < 10; k++) {
            if (contDigitos[k] > contDigitos[aux]) {
                aux = k;
                mayNum = enteros[aux];
            }
        }
        System.out.print("\nEl numero con mayor digitos esta en la posicion: ");
        System.out.print(aux + "\n");

    }

    /*
    Leer 10 números enteros, almacenarlos en un vector y determinar cuáles 
    son los números múltiplos de 5 y en qué posiciones están.
     */
    public static void determinarMultiplos5() {
        int[] enteros = new int[diez];
        System.out.print("Ingrese 10 numeros.\n");

        //Para rellenar el vector
        for (int i = 0; i < diez; i++) {
            System.out.print("num:");
            enteros[i] = sc.nextInt();
        }
        System.out.println("Numeros multiplos de 5 y su posicion: ");
        for (int j = 0; j < diez; j++) {
            if ((enteros[j] % 5) == 0) {
                System.out.println("----------------");
                System.out.print("| [");
                System.out.print("|");
                System.out.print(enteros[j] + "|");
                System.out.print(" |");
                System.out.print(j + "|");
                System.out.print("]  |\n");
            }
        }

    }

    /*
    Leer 10 números enteros, almacenarlos en un vector y determinar si existe 
    al menos un número repetido.
     */
    public static void numRepetido() {
        int aux = 0, cont = 0;
        int[] enteros = new int[diez];
        boolean bandera = false;
        System.out.print("Ingrese 10 numeros.\n");

        //Para rellenar el vector
        for (int i = 0; i < 10; i++) {
            System.out.print("num:");
            enteros[i] = sc.nextInt();
        }

        int j = 0;
        while (j < diez) {
            aux = enteros[j];
            for (int k = 0; k < diez; k++) {
                if (aux == enteros[k]) {
                    cont++;
                }
            }
            if (cont > 1) {
                bandera = true;
                cont = 0;
            } else {
                cont = 0;
            }
            j++;
        }

        if (bandera) {
            System.out.println("Existe un numero repetido en el vector.");
        } else {
            System.out.println("No existe un numero repetido en el vector.");
        }
    }

    /*
     Leer 10 números enteros, almacenarlos en un vector y determinar en qué 
    posición está el número con mas dígitos.
     */
    public static void encontrarDgtMayor() {
        int aux = 0, cont = 0, ultDgt = 0, mayNum = 0;
        int[] enteros = new int[diez];
        int[] contDigitos = new int[diez];
        System.out.print("Ingrese 10 numeros.\n");

        //Para rellenar el vector
        for (int i = 0; i < 10; i++) {
            System.out.print("num:");
            enteros[i] = sc.nextInt();
        }

        for (int j = 0; j < 10; j++) {
            aux = enteros[j];
            while (aux > 0) {
                ultDgt = aux - aux / diez * diez;
                aux /= diez;
                cont++;
            }

            contDigitos[j] = cont;
            cont = 0;
        }

        aux = 1;
        for (int k = 0; k < 10; k++) {
            if (contDigitos[k] > contDigitos[aux]) {
                aux = k;
                mayNum = enteros[aux];
            }
        }
        System.out.print("\nEl numero con mayor digitos esta en la posicion: ");
        System.out.print(aux + "\n");
    }

    /*
    Leer 10 números enteros, almacenarlos en un vector y determinar cuántos 
    de los números leídos son números primos terminados en 3.
     */
    public static void primosTerminadosEnTres() {
        int[] enteros = new int[diez];
        int aux = 0, ultDgt = 0, acum = 0, cont = 0;
        System.out.print("Ingrese 10 numeros.\n");

        //Para rellenar el vector
        for (int i = 0; i < 10; i++) {
            System.out.print("num:");
            enteros[i] = sc.nextInt();
        }

        int j = 0;
        while (j < 10) {
            aux = enteros[j];
            ultDgt = aux - aux / diez * diez;
            for (int k = 1; k <= aux; k++) {
                int residuo = aux % k;
                if (residuo == 0) {
                    acum++;
                }
            }

            if (acum == 2 && ultDgt == 3) {
                cont++;
                acum = 0;
            } else {
                acum = 0;
            }

            j++;
        }
        System.out.println("Los numeros primos terminados en 3 son: " + cont);
    }

    /*
    Leer 10 números enteros, almacenarlos en un vector y calcularle el factorial
    a cada uno de los números leídos almacenándolos en otro vector.
     */
    public static void calcularListaPrimos() {
        int[] enteros = new int[diez];
        int[] primos = new int[diez];
        int aux = 1;
        System.out.print("Ingrese 10 numeros.\n");

        //Para rellenar el vector
        for (int i = 0; i < 10; i++) {
            System.out.print("num:");
            enteros[i] = sc.nextInt();
        }

        int j = 0;
        while (j < 10) {
            primos[j] = aux;
            for (int i = enteros[j]; i > 0; i--) {
                primos[j] *= i;
            }

            System.out.print(" |");
            System.out.print(primos[j] + "|");
            j++;
        }
        System.out.println("");

    }

    /*
    Leer 10 números enteros, almacenarlos en un vector y determinar a cuánto es 
    igual el promedio entero de los factoriales de cada uno de los números leídos.
     */
    public static void calcPromListPrimos() {
        int[] enteros = new int[diez];
        int[] primos = new int[diez];
        int aux = 1, total = 0;
        System.out.print("Ingrese 10 numeros.\n");

        //Para rellenar el vector
        for (int i = 0; i < 10; i++) {
            System.out.print("num:");
            enteros[i] = sc.nextInt();
        }

        int j = 0;
        while (j < 10) {
            primos[j] = aux;
            for (int i = enteros[j]; i > 0; i--) {
                primos[j] *= i;
            }
            total += primos[j];
            j++;
        }
        System.out.println("El promedio de todos los factoriales es: " + (total / enteros.length));
    }

    /*
    Leer 10 números enteros, almacenarlos en un vector y mostrar en pantalla 
    todos los enteros comprendidos entre 1 y cada uno de los números almacenados
    en el vector.
     */
    public static void mostrarlistaRango() {
        int[] enteros = new int[diez];
        System.out.print("Ingrese 10 numeros.\n");

        //Para rellenar el vector
        for (int i = 0; i < 10; i++) {
            System.out.print("num:");
            enteros[i] = sc.nextInt();
        }

        int j = 0;
        while (j < 10) {

            System.out.println("\n------------");
            for (int i = 2; i < enteros[j]; i++) {
                System.out.print(" |");
                System.out.print(i + "|");
            }

            j++;
        }
        System.out.println("");

    }

    /*
    Leer 10 números enteros, almacenarlos en un vector y mostrar en pantalla 
    todos los enteros comprendidos entre 1 y cada uno de los dígitos de cada uno
    de los números almacenados en el vector.
     */
    public static void mostrarDgtlistaRango() {
        int[] enteros = new int[diez];
        int aux = 0, ultDgt;
        System.out.print("Ingrese 10 numeros.\n");

        //Para rellenar el vector
        for (int i = 0; i < 10; i++) {
            System.out.print("num:");
            enteros[i] = sc.nextInt();
        }

        System.out.println("Lista de rango de 1 y los digitos de cada numero: ");
        int j = 0;
        while (j < 10) {
            aux = enteros[j];
            System.out.println("\nNumero:" + enteros[j]);
            while (aux != 0) {
                ultDgt = aux - aux / diez * diez;
                System.out.println("\n-------------------");
                for (int k = 2; k < ultDgt; k++) {
                    System.out.print(" |");
                    System.out.print(k + "|");
                }
                aux /= diez;
            }
            j++;
        }
        System.out.println("");
    }

    /*
    Leer 10 números enteros, almacenarlos en un vector. Luego leer un entero y 
    determinar si este último entero se encuentra entre los 10 valores 
    almacenados en el vector.
     */
    public static void valuarValorEnArreglo() {
        int[] enteros = new int[diez];
        int num = 0;
        boolean bandera = false;
        System.out.print("Ingrese 10 numeros.\n");

        //Para rellenar el vector
        for (int i = 0; i < diez; i++) {
            System.out.print("num:");
            enteros[i] = sc.nextInt();
        }

        System.out.print("\nIngrese un numero entero:");
        num = sc.nextInt();
        for (int j = 0; j < diez; j++) {
            if (num == enteros[j]) {
                bandera = true;
            }
        }
        if (bandera) {
            System.out.println("El " + num + " se ha encontrado en el vector.");
        } else {
            System.out.println("El " + num + " no se ha encontrado en el vector.");
        }
    }

}
