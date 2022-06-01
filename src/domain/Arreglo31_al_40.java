package domain;

import java.util.Scanner;

public class Arreglo31_al_40 {

    static Scanner sc = new Scanner(System.in);
    public static final int diez = 10;
    public static final int cien = 100;

    /*
    Leer 10 números enteros, almacenarlos en un vector. Luego leer un entero y 
    determinar cuantos divisores exactos tiene este último número entre los 
    valores almacenados en el vector.
     */
    public static void mostrarDivisorExacto() {
        int[] enteros = new int[diez];
        int num = 0, cont = 0;
        System.out.print("Ingrese 10 numeros.\n");

        //Para rellenar el vector
        for (int i = 0; i < diez; i++) {
            System.out.print("num:");
            enteros[i] = sc.nextInt();
        }

        System.out.print("\nIngrese un numero entero:");
        num = sc.nextInt();
        for (int j = 0; j < 10; j++) {
            if ((num % enteros[j]) == 0) {
                cont++;
            }
        }
        System.out.println("El " + num + " tiene: " + cont + " divisores exactos.");

    }

    /*
    Leer 10 números enteros, almacenarlos en un vector. Luego leer un entero y 
    determinar cuántos números de los almacenados en el vector terminan en el 
    mismo dígito que el último valor leído.
     */
    public static void valuarUltDgt() {
        int[] enteros = new int[diez];
        int num = 0, cont = 0, ultDgt1 = 0, ultDgt2 = 0;
        System.out.print("Ingrese 10 numeros.\n");

        for (int i = 0; i < diez; i++) {
            System.out.print("num:");
            enteros[i] = sc.nextInt();
        }

        System.out.print("\nIngrese un numero entero:");
        num = sc.nextInt();

        int j = 0;
        while (j < 10) {
            ultDgt1 = enteros[j] - enteros[j] / diez * diez;
            ultDgt2 = num - num / diez * diez;
            if (ultDgt1 == ultDgt2) {
                cont++;
            }
            j++;
        }
        System.out.println("En total hay: " + cont + " numeros que terminan en: " + ultDgt2);
    }

    /*
    Leer 10 números enteros, almacenarlos en un vector y determinar a cuánto es 
    igual la suma de los dígitos pares de cada uno de los números leídos.
     */
    public static void sumaDgtPares() {
        int[] enteros = new int[diez];
        int aux = 0, total = 0, ultDgt = 0;
        System.out.print("Ingrese 10 numeros.\n");

        for (int i = 0; i < diez; i++) {
            System.out.print("num:");
            enteros[i] = sc.nextInt();
        }

        int j = 0;
        while (j < 10) {
            aux = enteros[j];
            while (aux != 0) {
                ultDgt = aux - aux / diez * diez;
                if ((ultDgt % 2) == 0) {
                    total += ultDgt;
                }
                aux /= diez;
            }
            j++;
        }
        System.out.println("La suma de los digitos pares del vector es: " + total);

    }

    /*
    Leer 10 números enteros, almacenarlos en un vector y determinar cuántas 
    veces en el vector se encuentra el dígito 2. No se olvide que el dígito 2 
    puede estar varias veces en un mismo número
     */
    public static void contarDgt2() {
        int[] enteros = new int[diez];
        int aux = 0, cont = 0, ultDgt = 0, dgtDos = 2;
        System.out.print("Ingrese 10 numeros.\n");

        for (int i = 0; i < diez; i++) {
            System.out.print("num:");
            enteros[i] = sc.nextInt();
        }

        int j = 0;
        while (j < 10) {
            aux = enteros[j];
            while (aux != 0) {
                ultDgt = aux - aux / diez * diez;
                if (dgtDos == ultDgt) {
                    cont++;
                }
                aux /= diez;
            }
            j++;
        }
        System.out.println("El digito 2 aparece: " + cont + " veces.");
    }

    /*
    Leer 10 números enteros, almacenarlos en un vector y determinar si el 
    promedio entero de dichos números es un número primo.
     */
    public static void promNumPrimo() {
        int[] enteros = new int[diez];
        int acum = 0, cont = 0, suma = 0;
        System.out.print("Ingrese 10 numeros.\n");

        for (int i = 0; i < diez; i++) {
            System.out.print("num:");
            enteros[i] = sc.nextInt();
            suma += enteros[i];
        }
        int prom = suma / enteros.length;
        System.out.println("promedio:" + prom);
        for (int i = 1; i <= prom; i++) {
            int residuo = prom % i;
            if (residuo == 0) {
                acum++;
            }
        }

        if (acum == 2) {
            System.out.println("El promedio del vector: " + prom + " es un numero primo.");
        } else {
            System.out.println("El promedio del vector: " + prom + " no es un numero primo.");
        }

    }

    /*
    Leer 10 números enteros, almacenarlos en un vector y determinar cuántos 
    dígitos primos hay en los números leídos.
     */
    public static void contarNumPrimos() {
        int[] enteros = new int[diez];
        int acum = 0, cont = 0, aux = 0, ultDgt = 0;
        System.out.print("Ingrese 10 numeros.\n");

        for (int i = 0; i < diez; i++) {
            System.out.print("num:");
            enteros[i] = sc.nextInt();
        }

        int j = 0;
        while (j < 10) {
            aux = enteros[j];
            while (aux != 0) {
                ultDgt = aux - aux / diez * diez;
                for (int i = 1; i <= ultDgt; i++) {
                    int residuo = ultDgt % i;
                    if (residuo == 0) {
                        acum++;
                    }
                }
                if (acum == 2) {
                    cont++;
                    acum = 0;
                } else {
                    acum = 0;
                }
                aux /= diez;
            }
            j++;
        }
        System.out.println("Hay un total de: " + cont + " numeros primos");

    }

    /*
    Leer 10 números enteros, almacenarlos en un vector y determinar a cuántos 
    es igual el cuadrado de cada uno de los números leídos.
     */
    public static void mostrarCuadradNum() {
        int[] enteros = new int[diez];
        System.out.print("Ingrese 10 numeros.\n");

        for (int i = 0; i < diez; i++) {
            System.out.print("num:");
            enteros[i] = sc.nextInt();
        }
        for (int j = 0; j < 10; j++) {
            System.out.println("\n-------------");
            System.out.print(" |" + (enteros[j] * enteros[j]) + "|");
        }
        System.out.println("");
    }

    /*
    Leer 10 números enteros, almacenarlos en un vector y determinar si la 
    semisuma entre el valor mayor y el valor menor es un número primo.
     */
    public static void semiSumaPrimo() {
        int[] enteros = new int[diez];
        int semiSuma = 0, aux = 1, numMay = 0, numMen = 0, acum = 0, cont = 0;
        System.out.print("Ingrese 10 numeros.\n");

        for (int i = 0; i < diez; i++) {
            System.out.print("num:");
            enteros[i] = sc.nextInt();
        }

        for (int j = 0; j < 10; j++) {
            if (enteros[j] >= enteros[aux]) {
                aux = j;
                numMay = enteros[aux];
            }
        }

        aux = 1;
        for (int k = 0; k < 10; k++) {
            if (enteros[k] <= enteros[aux]) {
                aux = k;
                numMen = enteros[aux];
            }
        }
        semiSuma = (numMay + numMen) / 2;
        for (int r = 1; r <= semiSuma; r++) {
            if ((semiSuma % r) == 0) {
                acum++;
            }
        }

        if (acum == 2) {
            System.out.println("La semisuma es un numero primo.");
        } else {
            System.out.println("La semisuma no es numero primo.");
        }

    }

    /*
    Leer 10 números enteros, almacenarlos en un vector y determinar si la 
    semisuma entre el valor mayor y el valor menor es un número par.
     */
    public static void semiSumaPar() {
        int[] enteros = new int[diez];
        int semiSuma = 0, aux = 1, numMay = 0, numMen = 0, acum = 0, cont = 0;
        System.out.print("Ingrese 10 numeros.\n");

        for (int i = 0; i < diez; i++) {
            System.out.print("num:");
            enteros[i] = sc.nextInt();
        }

        for (int j = 0; j < 10; j++) {
            if (enteros[j] >= enteros[aux]) {
                aux = j;
                numMay = enteros[aux];
            }
        }

        aux = 1;
        for (int k = 0; k < 10; k++) {
            if (enteros[k] <= enteros[aux]) {
                aux = k;
                numMen = enteros[aux];
            }
        }
        semiSuma = (numMay + numMen) / 2;

        if (semiSuma % 2 == 0) {
            System.out.println("La semisuma da como resultado un numero par.");
        } else {
            System.out.println("La semisuma da como resultado un numero impar.");
        }

    }

    /*
    Leer 10 números enteros, almacenarlos en un vector y determinar cuántos 
    números de los almacenados en dicho vector terminan en 15.
     */
    public static void terminaEnQuince() {
        int[] enteros = new int[diez];
        int quince = 15, aux = 0, cont2Dgt = 0, ultsDgt = 0;
        System.out.print("Ingrese 10 numeros.\n");

        for (int i = 0; i < diez; i++) {
            System.out.print("num:");
            enteros[i] = sc.nextInt();
        }

        int j = 0;
        while (j < 10) {
            aux = enteros[j];
            ultsDgt = aux - aux / cien * cien;
            if (ultsDgt == quince) {
                cont2Dgt++;
            }
            j++;
        }
        System.out.println("Hay un total de: " + cont2Dgt + " numeros que "
                + "terminan en 15.");
    }

}
