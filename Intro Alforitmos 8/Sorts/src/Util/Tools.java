package Util;

import Enums.SortList;
import Sorts.*;

public class Tools {
    public static boolean Ordenar(SortList sort, int[] arr) {
        switch (sort) {
            case InsertionSort:
                InsertionSort.Sort(arr);
                break;
            case ClassSort:
                ClassSort.Sort(arr);
                break;
            default:
                System.out.println("Ordenamiento no valido: " + sort);
                return false;
        }
        return true;
    }
}
