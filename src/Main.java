import java.util.Arrays;

public class Main{

    public static void main(String[] args) {
        int[] arreglo = {5, 2, 4, 6, 1, 3};

        System.out.println("Arreglo original:");
        imprimirArreglo(arreglo);

        quickSort(arreglo, 0, arreglo.length - 1);

        System.out.println("Arreglo ordenado:");
        imprimirArreglo(arreglo);
    }

    private static void quickSort(int[] arreglo, int izquierda, int derecha) {
        if (izquierda >= derecha) {
            return;
        }

        int pivote = arreglo[(izquierda + derecha) / 2];
        int i = izquierda;
        int j = derecha;

        while (i <= j) {
            while (arreglo[i] < pivote) {
                i++;
            }

            while (arreglo[j] > pivote) {
                j--;
            }

            if (i <= j) {
                int temp = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = temp;

                i++;
                j--;
            }
        }

        quickSort(arreglo, izquierda, j);
        quickSort(arreglo, i, derecha);
    }

    private static void imprimirArreglo(int[] arreglo) {
        for (int numero : arreglo) {
            System.out.print(numero + " ");
        }

        System.out.println();
    }
}
