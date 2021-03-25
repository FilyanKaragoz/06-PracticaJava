package Comparable.Demo;

import Demo.Persona;

public class SortUtil {
    public static <T extends Comparable <T>> void ordenar (Persona[] arr){
        for (int i =0 ; i< arr.length;i++){
            for (int j =0 ; j< arr.length-1;j++){
                if (arr[j].compareTo((T)arr[j+1]) > 0) {
                    T aux = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = aux;
                }

            }
        }
    }
}
