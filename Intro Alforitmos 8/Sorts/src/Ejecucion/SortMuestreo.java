package Ejecucion;

import Enums.SortList;
import Util.Tools;
import java.util.Arrays;

public class SortMuestreo {
    // Constantes de aplicacion
    private static final int LENGTH = 200000;   // Numero de elementos a generar en el arreglo random (1000, 10000, 20000, 50000, 100000, 200000)
    private static final int NUM_MAX = 100; // Maximo del rango de numeros random
    private static final int CYCLES = 5;   // Numero de veces que se ejecutara el ordenamiento
    private static final boolean PRN_ARR = false;   // Imprimir arreglos?
    private static final SortList SORT = SortList.ClassSort;   // Tipo de ordenamiento a utilizar

    public static void main(String[] args) {
        double av = 0;
        for (int i = 0; i < CYCLES; i++) {
            int[] arr = new int[LENGTH];

            // Generar arreglos random
            for (int j = 0; j < LENGTH; j++) {
                arr[j] = (int) (Math.random() * (NUM_MAX + 1));
            }

            // Imprimir arreglo generado
            if (PRN_ARR) {
                System.out.println("Array[" + i + "]: " + Arrays.toString(arr));
            }

            // Tiempo de inicio
            long in = System.nanoTime();

            // Ordenar arreglo
            boolean printTime = Tools.Ordenar(SORT, arr);

            // Tiempo final
            long fn = System.nanoTime();

            // Tiempo tardado
            if (printTime) {
                double t = (fn - in) / 1000000.0;
                System.out.println("SortedTime[" + i + "]: " + t + "ms");
                av += t;
            }

            // Imprimir arreglo ordenado
            if (PRN_ARR) {
                System.out.println("ArraySorted[" + i + "]: " + Arrays.toString(arr));
            }
        }
        av /= CYCLES;
        System.out.println("Average: " + av + "ms");
    }
}
