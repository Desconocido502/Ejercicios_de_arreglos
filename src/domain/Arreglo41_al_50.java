package domain;

import java.util.Scanner;

public class Arreglo41_al_50 {

    static Scanner sc = new Scanner(System.in);
    public static final int diez = 10;
    public static final int cien = 100;

    /*
    Leer 10 números enteros, almacenarlos en un vector y determinar cuántos 
    números de los almacenados en dicho vector comienzan con 3.
     */
    public static void empiezanEnTres() {
        int[] enteros = new int[diez];
        int tres = 3, aux = 0, contDgt = 0, ultsDgt = 0;
        System.out.print("Ingrese 10 numeros.\n");

        for (int i = 0; i < diez; i++) {
            System.out.print("num:");
            enteros[i] = sc.nextInt();
        }

        int j = 0;
        while (j < diez) {
            aux = enteros[j];
            while (aux != 0) {
                ultsDgt = aux - aux / diez * diez;
                aux /= diez;
            }

            System.out.println("primer Dgt: " + ultsDgt);
            if (ultsDgt == 3) {
                contDgt++;
            }
            j++;
        }
        System.out.println("Existen " + contDgt + " numeros que comienzan con tres.");
    }

    /*
    Leer 10 números enteros, almacenarlos en un vector y determinar cuántos 
    números con cantidad par de dígitos pares hay almacenados en dicho vector.
     */
    public static void determinarNumParDgt() {
        int[] enteros = new int[diez];
        int cont2 = 0, aux = 0, contDgt = 0, ultsDgt = 0, cont = 0;
        System.out.print("Ingrese 10 numeros.\n");

        for (int i = 0; i < diez; i++) {
            System.out.print("num:");
            enteros[i] = sc.nextInt();
        }

        int j = 0;
        while (j < diez) {
            aux = enteros[j];
            while (aux != 0) {
                ultsDgt = aux - aux / diez * diez;
                if ((ultsDgt % 2) == 0) {
                    contDgt++;
                }
                cont++;
                aux /= diez;
            }
            System.out.println(cont + " == " + contDgt);
            if (cont == contDgt) {
                cont2++;
                cont = 0;
                contDgt = 0;
            } else {
                cont = 0;
                contDgt = 0;
            }
            j++;
        }
        System.out.println("Existen " + cont2 + " numeros pares con digitos pares.");

    }

    /*
    Leer 10 números enteros, almacenarlos en un vector y determinar en qué 
    posicion se encuentra el número con mayor cantidad de dígitos primos.
     */
    public static void numMayorDgtPrimo() {
        int[] enteros = new int[diez];
        int[] conDgtPrimos = new int[diez];
        int aux2 = 0, aux = 0, contDgt = 0, ultsDgt = 0, cont = 0;
        System.out.print("Ingrese 10 numeros.\n");

        for (int i = 0; i < diez; i++) {
            System.out.print("num:");
            enteros[i] = sc.nextInt();
        }

        int j = 0;
        while (j < diez) {
            aux = enteros[j];
            while (aux != 0) {
                ultsDgt = aux - aux / diez * diez;
                if (ultsDgt == 2 || ultsDgt == 3 || ultsDgt == 5 || ultsDgt == 7) {
                    contDgt++;
                }
                aux /= diez;
            }
            conDgtPrimos[j] = contDgt;
            contDgt = 0;
            j++;
        }

        for (int k = 1; k < 10; k++) {
            if (conDgtPrimos[k] > conDgtPrimos[aux]) {
                aux = k;
                aux2 = enteros[aux];
            }
        }
        System.out.println("El numero con mayor digitos primos es: " + aux2);
    }

    /*
    Leer 10 números enteros, almacenarlos en un vector y determinar cuántos de 
    los números almacenados en dicho vector pertenecen a los 100 primeros 
    elementos de la serie de Fibonacci.
     */
    public static void valuarSeriFibo() {
        int[] enteros = new int[diez];
        int aux2 = 0, aux = 0, contF = 0, num1 = 0, num2 = 1;
        System.out.print("Ingrese 10 numeros.\n");

        for (int i = 0; i < diez; i++) {
            System.out.print("num:");
            enteros[i] = sc.nextInt();
        }

        for (int j = 0; j < diez; j++) {
            aux2 = enteros[j];
            while (num2 < 1134903170) {
                if (aux2 == aux) {
                    contF++;
                }
                aux = num1 + num2;
                num1 = num2;
                num2 = aux;
            }
            aux = 0;
            num1 = 0;
            num2 = 1;
        }

        System.out.println("Existen " + contF + " numeros de Fibonacci en el arreglo.");
    }

    /*
    Leer 10 números enteros, almacenarlos en un vector y determinar cuántos 
    números de los almacenados en dicho vector comienzan por 34.
     */
    public static void comienzaDosDgt() {
        int[] enteros = new int[diez];
        int aux = 0, cont = 0, TresCuatro = 34;
        System.out.print("Ingrese 10 numeros.\n");

        for (int i = 0; i < diez; i++) {
            System.out.print("num:");
            enteros[i] = sc.nextInt();
        }

        int j = 0;
        while (j < diez) {
            aux = enteros[j];
            while (aux > cien) {
                aux /= diez;
            }
            if (TresCuatro == aux) {
                cont++;
            }
            j++;
        }
        System.out.println("Existen: " + cont + " numeros que comienzan con 34.");

    }

    /*
    Leer 10 números enteros, almacenarlos en un vector y determinar cuántos 
    números de los almacenados en dicho vector son primos y comienzan por 5.
     */
    public static void primosComiCinco() {
        int[] enteros = new int[diez];
        int aux = 0, acum = 0, cont = 0;
        System.out.print("Ingrese 10 numeros.\n");

        for (int i = 0; i < diez; i++) {
            System.out.print("num:");
            enteros[i] = sc.nextInt();
        }
        int j = 0;
        while (j < diez) {
            aux = enteros[j];
            while (aux > diez) {
                aux /= diez;
            }
            for (int k = 1; k <= enteros[j]; k++) {
                int res = enteros[j] % k;
                if (res == 0) {
                    acum++;
                }
            }
            if (acum == 2 && aux == 5) {
                cont++;
                acum = 0;
            } else {
                acum = 0;
            }
            j++;
        }
        System.out.println("Existen: " + cont + " numeros primos que empiezan con 5.");

    }

    /*
    Leer 10 números enteros, almacenarlos en un vector y determinar en qué 
    posiciones se encuentran los números múltiplos de 10. No utilizar el número
    10 en ninguna operación.
     */
    public static void multiplosDeDiezSinDiez() {
        int[] enteros = new int[9 + 1];
        System.out.print("Ingrese 10 numeros.\n");

        for (int i = 0; i <= 9; i++) {
            System.out.print("num:");
            enteros[i] = sc.nextInt();
        }
        System.out.println("Lista de las posiciones multiplos de 10.");
        for (int j = 0; j <= 9; j++) {
            if ((enteros[j] % (9 + 1)) == 0) {
                System.out.print(" |");
                System.out.print(j + "|");
            }
        }
        System.out.println("");
    }

    /*
    Leer 10 números enteros, almacenarlos en un vector y determinar en qué 
    posición se encuentra el número primo con mayor cantidad de dígitos pares.
     */
    public static void buscarNumPrimoCantMayDgtPar() {
        int[] enteros = new int[diez];
        int[] pares = new int[diez];
        int aux = 0, ultDgt = 0, contPar = 0, acum = 0, cont = 0;
        System.out.print("Ingrese 10 numeros.\n");

        for (int i = 0; i < 10; i++) {
            System.out.print("num:");
            enteros[i] = sc.nextInt();
        }

        /*
        if (isPrimo(entero[j]) && pares[j] >= pares[aux]) {
            aux = j
        }
        
        */

    }

    /*
    Leer 10 números enteros, almacenarlos en un vector y determinar cuántos 
    números terminan en dígito primo.
     */
    public static void terminaNumPrimo() {
        int[] enteros = new int[diez];
        int aux = 0, ultDgt = 0, contPri = 0, acum = 0;
        System.out.print("Ingrese 10 numeros.\n");

        for (int i = 0; i < 10; i++) {
            System.out.print("num:");
            enteros[i] = sc.nextInt();
        }

        int j = 0;
        while (j < diez) {
            aux = enteros[j];
            ultDgt = aux - aux / diez * diez;

            for (int i = 1; i <= ultDgt; i++) {
                int residuo = ultDgt % i;
                if (residuo == 0) {
                    acum++;
                }
            }
            if (acum == 2) {
                contPri++;
                acum = 0;
            } else {
                acum = 0;
            }

            j++;
        }
        System.out.println("Existen " + contPri + " numeros primos al final de los numeros.");

    }

    /*
    . Leer 10 números enteros, almacenarlos en un vector y determinar cuántos 
    números de los almacenados en dicho vector comienzan en dígito primo.
     */
    public static void comienzaNumPrimo() {
        int[] enteros = new int[diez];
        int aux = 0, ultDgt = 0, acum = 0, contPri = 0;
        System.out.print("Ingrese 10 numeros.\n");

        for (int i = 0; i < 10; i++) {
            System.out.print("num:");
            enteros[i] = sc.nextInt();
        }
        int j = 0;
        while (j < diez) {
            aux = enteros[j];
            while (aux > diez) {
                aux /= diez;
            }
            for (int i = 1; i <= aux; i++) {
                int residuo = aux % i;
                if (residuo == 0) {
                    acum++;
                }
            }
            if (acum == 2) {
                contPri++;
                acum = 0;
            } else {
                acum = 0;
            }
            j++;
        }
        System.out.println("Existen " + contPri + " numeros primos al principio de los numeros.");
    }

}
