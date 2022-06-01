package domain;

import java.util.Scanner;

public class Arreglo1_al_10 {

    static Scanner sc = new Scanner(System.in);
    public static final int diez = 10;

    /*
    Leer 10 enteros, almacenarlos en un vector y determinar en qué posición del
    vector está el mayor número leído.
     */
    public static void ubicarNumMayor() {
        int[] enteros = new int[10];
        int posMayor = 0;
        System.out.print("Ingrese 10 numeros.\n");

        for (int i = 0; i < 10; i++) {
            System.out.print("num:");
            enteros[i] = sc.nextInt();
        }

        for (int j = 1; j < 10; j++) {
            if (enteros[j] > enteros[posMayor]) {
                posMayor = j;
            }
        }
        System.out.println("El número mayor está en la posición: " + posMayor);
    }

    /*
    Leer 10 enteros, almacenarlos en un vector y determinar en qué posición del
    vector está el mayor número par leído.
     */
    public static void ubicarNumMayPar() {

        int[] enteros = new int[10];
        int posMayor = 0, numParM = 0;
        System.out.print("Ingrese 10 numeros.\n");

        for (int i = 0; i < 10; i++) {
            System.out.print("num:");
            enteros[i] = sc.nextInt();
        }

        for (int j = 0; j < 10; j++) {
            if ((enteros[j] % 2) == 0) {

                if (enteros[j] > enteros[posMayor]) {
                    posMayor = j;
                    numParM = enteros[j];
                }
            }
        }
        System.out.println("posMayorPar: " + numParM);
        System.out.println("El numero par mayor esta en la posicion: " + (posMayor + 1));
    }

    /*
    Leer 10 enteros, almacenarlos en un vector y determinar en qué posición del 
    vector está el mayor número primo leído.
     */
    public static void ubicarNumMayPrimo() {

        int[] enteros = new int[10];
        int posMayor = 0, numPriM = 0, acum = 0;
        System.out.print("Ingrese 10 numeros.\n");

        for (int i = 0; i < 10; i++) {
            System.out.print("num:");
            enteros[i] = sc.nextInt();
        }

        int j = 0;
        while (j < 10) {

            for (int i = 1; i <= enteros[j]; i++) {
                int residuo = enteros[j] % i;
                if (residuo == 0) {
                    acum++;
                }
            }

            if (acum == 2) {

                if (enteros[j] > enteros[posMayor]) {
                    posMayor = j;
                    numPriM = enteros[j];
                }

                acum = 0;
            } else {
                acum = 0;
            }

            j++;
        }
        System.out.println("El mayor numero primo esta en la posicion: " + (posMayor + 1));

    }

    /*
    Cargar un vector de 10 posiciones con los 10 primeros elementos de la serie 
    de Fibonacci y mostrarlo en pantalla.
     */
    public static void mostVecSeriFibo() {
        int[] enteros = new int[10];
        int num1 = 0, num2 = 1, aux;

        int j = 0;
        while (num2 < 60) {
            enteros[j] = num1;
            aux = num1 + num2;
            num1 = num2;
            num2 = aux;
            j++;
        }

        System.out.println("Se muestra los primeros 10 numeros de Fibonacci: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(" |");
            System.out.print(enteros[i] + "|");
        }
        System.out.println("");

    }

    /*
    Almacenar en un vector de 10 posiciones los 10 números primos comprendidos 
    entre 100 y 300. Luego mostrarlos en pantalla.
     */
    public static void listaPrimos100_a_300() {
        int[] enteros = new int[10];
        int inicio = 100, Final = 300;

        int acum = 0, cont = 0, j = 0, residuo, aux = 0;
        while (inicio != Final) {

            for (int i = 1; i <= inicio; i++) {
                residuo = inicio % i;
                if (residuo == 0) {
                    acum++;
                }
            }

            if (acum == 2 && j < 10) {
                enteros[j] = inicio;
                j++;
                acum = 0;
            } else {
                acum = 0;
            }

            inicio++;
        }
        System.out.println("primos:");
        for (int r = 0; r < 10; r++) {
            System.out.print(" |");
            System.out.print(enteros[r] + "|");
        }
        System.out.println("");
    }

    /*
    Leer dos números enteros y almacenar en un vector los 10 primeros números 
    primos comprendidos entre el menor y el mayor. Luego mostrarlos en pantalla.
     */
    public static void intervaloPrimoMenMay() {
        int[] enteros = new int[10];
        System.out.println("Numeros de dos digitos.\n");
        System.out.print("Ingrese un numero entero:");
        int num1 = sc.nextInt();
        System.out.print("Ingrese un numero entero:");
        int num2 = sc.nextInt();

        int aux1 = num1, aux2 = num2;
        if (num1 > num2) {
            int aux = num2;
            num2 = num1;
            num1 = aux;
        }

        int acum = 0, residuo = 0, j = 0;
        while (num1 != num2) {

            for (int i = 1; i <= num1; i++) {
                residuo = num1 % i;
                if (residuo == 0) {
                    acum++;
                }
            }

            if (acum == 2 && j < 10) {

                enteros[j] = num1;
                j++;
                acum = 0;
            } else {
                acum = 0;
            }

            num1++;
        }
        System.out.println("Primeros 10 primos entre:" + aux1 + " y " + aux2 + ":");
        for (int r = 0; r < 10; r++) {
            System.out.print(" |");
            System.out.print(enteros[r] + "|");
        }
        System.out.println("");
    }

    /*
    Leer 10 números enteros, almacenarlos en un vector y determinar en qué 
    posiciones se encuentra el número mayor.
     */
    public static void ubicarNumMayor2() {
        int[] enteros = new int[10];
        int posMayor = 0;
        System.out.print("Ingrese 10 numeros.\n");

        for (int i = 0; i < 10; i++) {
            System.out.print("num:");
            enteros[i] = sc.nextInt();
        }

        System.out.println("Lista de posiciones donde el "
                + "numero mayor se encuentra:");
        for (int j = 1; j < 10; j++) {
            if (enteros[j] >= enteros[posMayor]) {
                posMayor = j;
                System.out.print(" |");
                System.out.print(posMayor + "|");
            }
        }
        System.out.println("");

    }

    /*
    Leer 10 números enteros, almacenarlos en un vector y determinar en qué 
    posiciones se encuentran los números terminados en 4.
     */
    public static void ubicarNumTer4() {
        int[] enteros = new int[10];
        int ultDgt = 0;
        System.out.print("Ingrese 10 numeros.\n");

        for (int i = 0; i < 10; i++) {
            System.out.print("num:");
            enteros[i] = sc.nextInt();
        }
        System.out.println("Lista de numeros terminados en 4.");
        for (int j = 0; j < 10; j++) {
            ultDgt = enteros[j] - (enteros[j] / diez) * diez;
            if (ultDgt == 4) {
                System.out.print(" |");
                System.out.print(enteros[j] + "|");
            }
        }
        System.out.println("");
    }

    /*
    Leer 10 números enteros, almacenarlos en un vector y determinar cuántas 
    veces está repetido el mayor.
     */
    public static void ubicarNumMayor3() {
        int[] enteros = new int[10];
        int posMayor = 0, cont = 0, aux = 0;
        System.out.print("Ingrese 10 numeros.\n");

        //Para rellenar el vector
        for (int i = 0; i < 10; i++) {
            System.out.print("num:");
            enteros[i] = sc.nextInt();
        }
        //Se busca el numero mayor
        for (int j = 0; j < 9; j++) {
            if (enteros[j] >= enteros[posMayor]) {
                posMayor = j;
                aux = enteros[j];
            }
        }
        //Se busca cuantas veces se repite el numero
        for (int k = 0; k < 10; k++) {
            if (aux == enteros[k]) {
                cont++;
            }
        }

        System.out.println("El mayor numero es: " + aux
                + " y se repite: " + (cont) + " veces.");
    }

    /*
    Leer 10 números enteros, almacenarlos en un vector y determinar en qué 
    posiciones se encuentran los números con mas de 3 dígitos.
     */
    public static void ubicarNumMayTresdGT() {
        int[] enteros = new int[10];
        int posMayor = 0, cont = 0, aux = 0;
        System.out.print("Ingrese 10 numeros.\n");

        //Para rellenar el vector
        for (int i = 0; i < 10; i++) {
            System.out.print("num:");
            enteros[i] = sc.nextInt();
        }
        
        int j = 0;
        System.out.println("Posiciones de los numeros con mas de 3 digitos:");
        while (j < 10) {

            aux = enteros[j];
            while (aux != 0) {
                aux /= diez;
                cont++;
            }

            if (cont > 3) {
                System.out.print(" |");
                System.out.print(j+"|");
                cont = 0;
            } else {
                cont = 0;
            }

            j++;
        }
        System.out.println("");

    }
}
