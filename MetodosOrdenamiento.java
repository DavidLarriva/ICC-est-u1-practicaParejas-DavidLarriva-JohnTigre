import java.util.Arrays;
////////
public class MetodosOrdenamiento {

    

    

    public void ordenamientoBurbuja (int[] arreglo, boolean iteraciones, boolean ascendente) {
        System.out.println("");
        System.out.println("ORDENAMIENTO BURBUJA");
        System.out.println();
        

        int tamanio = arreglo.length;

        for (int i = 0; i<tamanio; i++){
            if (iteraciones) {
                System.out.println("Iteracion externa #" + (i + 1));
            }
            for (int j = 0; j<tamanio - 1; j++){
                if (iteraciones) {
                    System.out.println("\ti=" + i + ", j=" + j + ", Comparando: " + arreglo[j] + " y " + arreglo[j + 1]);
                }
                
                if(ascendente ? arreglo[i] < arreglo[j] : arreglo[i] > arreglo[j]) {
                    int aux = arreglo[i];
                    arreglo [i] = arreglo[j];
                    arreglo [j] = aux;

                    if (iteraciones) {
                        System.out.println("\t\tIntercambio realizado: " + Arrays.toString(arreglo));
                    }
                }
            }

            if (iteraciones) {
                System.out.println("Arreglo despues de la iteracion #" + (i + 1) + ": " + Arrays.toString(arreglo));
            }
        }

        

    }

    public void ordenamientoSeleccion(int[] arreglo, boolean iteraciones, boolean ascendente) {
        System.out.println("");
        System.out.println("ORDENAMIENTO SELECCION");
        System.out.println();
        int tamanio = arreglo.length;
    
        for (int i = 0; i < tamanio - 1; i++) {
            int indiceMinMax = i;
    
            if (iteraciones) {
                System.out.println("Iteracion externa #" + (i + 1));
            }
    
            for (int j = i + 1; j < tamanio; j++) {
                if (iteraciones) {
                    System.out.println("\ti=" + i + ", j=" + j + ", Comparando: " + arreglo[indiceMinMax] + " y " + arreglo[j]);
                }
    
                if (ascendente ? arreglo[j] < arreglo[indiceMinMax] : arreglo[j] > arreglo[indiceMinMax]) {
                    indiceMinMax = j;
                }
            }
    
            if (indiceMinMax != i) {
                int aux = arreglo[i];
                arreglo[i] = arreglo[indiceMinMax];
                arreglo[indiceMinMax] = aux;
    
                if (iteraciones) {
                    System.out.println("\t\tIntercambio realizado: " + Arrays.toString(arreglo));
                }
            }
    
            if (iteraciones) {
                System.out.println("Arreglo después de la iteracion #" + (i + 1) + ": " + Arrays.toString(arreglo));
            }
        }
    }

    public void imprimirVector(int[] arreglo){
        System.out.println();
        System.out.println("ARREGLO ACTUAL:");
        System.out.println(); System.out.println(Arrays.toString(arreglo));
        System.out.println();
    }

    

    public void imprimirArregloOriginal (int[] arreglo) {
        System.out.println();
        System.out.println("ARREGLO ORIGINAL:");
        System.out.println(); System.out.println(Arrays.toString(arreglo));
        System.out.println();

    }
    
    

    public void ordenamientoInsercion(int[] arreglo, boolean iteraciones, boolean ascendente) {
        System.out.println("");
        System.out.println("ORDENAMIENTO INSERCION");
        System.out.println();
    int tamanio = arreglo.length;

    for (int i = 1; i < tamanio; i++) {
        int aux = arreglo[i];
        int j = i - 1;

        if (iteraciones) {
            System.out.println("Iteracion externa #" + i);
            System.out.println("\ti=" + i + ", j=" + j + ", Valor a insertar: " + aux);
        }

        while (j >= 0 && (ascendente ? arreglo[j] > aux : arreglo[j] < aux)) {
            if (iteraciones) {
                System.out.println("\t\tComparando " + aux + " con " + arreglo[j]);
            }

            arreglo[j + 1] = arreglo[j];
            j--;

            if (iteraciones) {
                System.out.println("\t\tDesplazamiento: " + Arrays.toString(arreglo));
            }
        }

        arreglo[j + 1] = aux;

        if (iteraciones) {
            System.out.println("Arreglo despues de la iteracion #" + i + ": " + Arrays.toString(arreglo));
        }
    }
}


public void ordenamientoBurbujaPlus(int[] arreglo, boolean iteraciones, boolean ascendente) {
    System.out.println();
    System.out.println("ORDENAMIENTO BURBUJA PLUS");
    System.out.println();

    int tamanioVector = arreglo.length;
    boolean intercambiado;
    int aux;

    for (int i = 0; i < (tamanioVector - 1); i++) {
        intercambiado = false;

        if (iteraciones) {
            System.out.println("Pasada #" + (i + 1));
        }

        for (int j = 0; j < (tamanioVector - 1 - i); j++) {
            if (iteraciones) {
                System.out.println("\tj=" + j + " [j]=" + arreglo[j] + " j+1=" + (j + 1) + " [j+1]=" + arreglo[j + 1]);
            }

            
            if (ascendente ? arreglo[j] > arreglo[j + 1] : arreglo[j] < arreglo[j + 1]) {
                if (iteraciones) {
                    System.out.println("\t\tIntercambio realizado");
                }

                
                aux = arreglo[j];
                arreglo[j] = arreglo[j + 1];
                arreglo[j + 1] = aux;

                intercambiado = true;

                if (iteraciones) {
                    System.out.println("\t\tArreglo actual: " + Arrays.toString(arreglo));
                }
            }
        }

        
        if (!intercambiado) {
            if (iteraciones) {
                System.out.println("No hubo intercambios, el arreglo está ordenado.");
            }
            break;
        }

        if (iteraciones) {
            System.out.println("Arreglo después de la pasada #" + (i + 1) + ": " + Arrays.toString(arreglo));
        }
    }
}
}
