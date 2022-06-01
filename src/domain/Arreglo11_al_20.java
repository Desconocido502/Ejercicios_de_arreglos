package domain;

import java.util.Scanner;

public class Arreglo11_al_20 {

    static Scanner sc = new Scanner(System.in);
    public static final int diez = 10;

    /*
    Leer 10 números enteros, almacenarlos en un vector y determinar cuántos 
    números, de los almacenados allí, tienen menos de 3 dígitos.
     */
    public static void ubicarNumMenTresdGT() {
        int[] enteros = new int[10];
        int contNum2 = 0, cont = 0, aux = 0;
        System.out.print("Ingrese 10 numeros.\n");

        //Para rellenar el vector
        for (int i = 0; i < 10; i++) {
            System.out.print("num:");
            enteros[i] = sc.nextInt();
        }

        System.out.println("Cantidad de numeros con menos de 3 digitos:");
        for (int j = 0; j < 10; j++) {
            aux = enteros[j];

            while (aux > 0) {
                aux /= diez;
                cont++;
            }

            if (cont < 3) {
                contNum2++;
                cont = 0;
            } else {
                cont = 0;
            }

        }
        System.out.print(contNum2 + "\n");

    }

    /*
    Leer 10 números enteros, almacenarlos en un vector y determinar a cuánto 
    es igual el promedio entero de los datos del vector.
     */
    public static void promValVector() {
        int[] enteros = new int[10];
        int suma = 0, cont = 0, aux = 0;
        System.out.print("Ingrese 10 numeros.\n");

        //Para rellenar el vector
        for (int i = 0; i < 10; i++) {
            System.out.print("num:");
            enteros[i] = sc.nextInt();
        }

        for (int j = 0; j < 10; j++) {
            suma += enteros[j];
        }
        System.out.println("Promedio de los numeros almacenados: " + (suma / enteros.length));
    }

    /*
    Leer 10 números enteros, almacenarlos en un vector y determinar si el 
    promedio entero de estos datos está almacenado en el vector.
     */
    public static void encontrarNumPromedio() {

        int[] enteros = new int[10];
        int suma = 0, cont = 0, prom = 0;
        boolean bandera = false;
        System.out.print("Ingrese 10 numeros.\n");

        //Para rellenar el vector
        for (int i = 0; i < 10; i++) {
            System.out.print("num:");
            enteros[i] = sc.nextInt();
            suma += enteros[i];
        }

        prom = suma / enteros.length;
        for (int j = 0; j < 10; j++) {
            if (prom == enteros[j]) {
                bandera = true;
                System.out.println("bandera:" + bandera);
            }
        }

        for (int k = 0; k < 10; k++) {
            System.out.print(" |");
            System.out.print(enteros[k] + "|");
        }

        if (bandera) {
            System.out.println("\nEl promedio " + prom + " se encuentra en el vector.");
        } else {
            System.out.println("\nEl promedio " + prom + " no se encuentra en el vector.");
        }

    }

    /*
    Leer 10 números enteros, almacenarlos en un vector y determinar cuántas 
    veces se repite el promedio entero de los datos dentro del vector.
     */
    public static void enconCantNumPromedio() {
        int[] enteros = new int[10];
        int suma = 0, contNum = 0, prom = 0;
        boolean bandera = false;
        System.out.print("Ingrese 10 numeros.\n");

        //Para rellenar el vector
        for (int i = 0; i < 10; i++) {
            System.out.print("num:");
            enteros[i] = sc.nextInt();
            suma += enteros[i];
        }

        prom = suma / enteros.length;
        for (int j = 0; j < 10; j++) {
            if (prom == enteros[j]) {
                contNum++;
            }
        }
        System.out.println("El promedio se repite: "
                + contNum + " veces en el vector.");
    }

    /*
    Leer 10 números enteros, almacenarlos en un vector y determinar cuántos 
    datos almacenados son múltiplos de 3.
     */
    public static void encontrarMultDe3() {
        int[] enteros = new int[10];
        int contMult3 = 0;
        System.out.print("Ingrese 10 numeros.\n");

        //Para rellenar el vector
        for (int i = 0; i < 10; i++) {
            System.out.print("num:");
            enteros[i] = sc.nextInt();

            if ((enteros[i] % 3) == 0) {
                contMult3++;
            }
        }
        System.out.println("La cantidad de datos multiplos de 3: " + contMult3);
    }

    /*
    Leer 10 números enteros, almacenarlos en un vector y determinar cuáles 
    son los datos almacenados múltiplos de 3.
     */
    public static void mostrarMultDe3() {

        int[] enteros = new int[10];
        int contMult3 = 0;
        System.out.print("Ingrese 10 numeros.\n");

        //Para rellenar el vector
        for (int i = 0; i < 10; i++) {
            System.out.print("num:");
            enteros[i] = sc.nextInt();
        }

        System.out.println("Los datos multiplos de 3 son: ");
        for (int j = 0; j < 10; j++) {
            if ((enteros[j] % 3) == 0) {
                System.out.print(" |");
                System.out.print(enteros[j] + "|");
            }
        }
        System.out.println("");
    }

    /*
    7. Leer 10 números enteros, almacenarlos en un vector y determinar cuántos 
    números negativos hay.
     */
    public static void contNumNegativos() {
        int contNgt = 0;
        int[] enteros = new int[10];
        System.out.print("Ingrese 10 numeros.\n");

        //Para rellenar el vector
        for (int i = 0; i < 10; i++) {
            System.out.print("num:");
            enteros[i] = sc.nextInt();
            if (enteros[i] < 0) {
                contNgt++;
            }
        }
        System.out.println("Hay " + contNgt + " numeros negativos.");
    }

    /*
    Leer 10 números enteros, almacenarlos en un vector y determinar en qué
    posiciones están los números positivos.
     */
    public static void detNumPositivos() {
        int contNgt = 0;
        int[] enteros = new int[10];
        System.out.print("Ingrese 10 numeros.\n");

        //Para rellenar el vector
        for (int i = 0; i < 10; i++) {
            System.out.print("num:");
            enteros[i] = sc.nextInt();
        }
        System.out.println("Lista de posiciones de los numeros positivos:");
        for (int j = 0; j < 10; j++) {
            if (enteros[j] > 0) {
                System.out.print(" |");
                System.out.print(j + "|");
            }
        }
        System.out.println("");
    }

    /*
    Leer 10 números enteros, almacenarlos en un vector y determinar cuál es 
    el número menor.
     */
    public static void detNumMenor() {
        int[] enteros = new int[10];
        int aux = 1, menNum = 0;
        System.out.print("Ingrese 10 numeros.\n");

        //Para rellenar el vector
        for (int i = 0; i < 10; i++) {
            System.out.print("num:");
            enteros[i] = sc.nextInt();
        }

        for (int j = 0; j < 10; j++) {
            if (enteros[j] < enteros[aux]) {
                System.out.println(enteros[j] + " < " + enteros[aux]);
                aux = j;
                menNum = enteros[aux];
            }
        }
        System.out.println("El numero menor del vector es: " + menNum);
    }

    /*
    Leer 10 números enteros, almacenarlos en un vector y determinar en qué 
    posición está el menor número primo.
     */
    public static void detMenorNumPrimo1() {
        int[] miarreglo = new int[10];
        int aux = 1, menNum = 0, acum = 0;
        System.out.print("Ingrese 10 numeros.\n");

        //Para rellenar el vector
        for (int i = 0; i < 10; i++) {
            System.out.print("num:");
            miarreglo[i] = sc.nextInt();
        }

        int valorMax = miarreglo[0];
        int posicion = 0;

        for (int i = 0; i < 10; i++) {
            if (miarreglo[i] % 2 == 1) {
                if (miarreglo[i] < valorMax) {
                    valorMax = miarreglo[i];
                }
                posicion = i;
            }
        }
        System.out.println("El menor numero primo se encuentra en la  posicion: " + posicion);

    }

}
