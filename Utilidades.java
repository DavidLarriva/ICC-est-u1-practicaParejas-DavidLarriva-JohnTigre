import java.util.Scanner;

public class Utilidades {
    public int crearYvalidarNumero () {
        Scanner sc = new Scanner(System.in);
        boolean numeroValido = false;
        int numero =0;

    while(!numeroValido) {
        if(sc.hasNextInt()) {
            numero = sc.nextInt();

            if (numero > 0){
                numeroValido = true;
            }else {
                System.out.println("Error el numero debe ser mayor a 0");
            }
        } else {
            System.out.println("Error no puedes ingresar ni letras ni simbolos");
            sc.next();
        }

        

    }

    return numero;


        



    }

    public int crearYvalidarNumeroIncluyendoCero () {
        Scanner sc = new Scanner(System.in);
        boolean numeroValido = false;
        int numero =0;

    while(!numeroValido) {
        if(sc.hasNextInt()) {
            numero = sc.nextInt();

            if (numero >= 0){
                numeroValido = true;
            }else {
                System.out.println("Error el numero no puede ser negativo");
            }
        } else {
            System.out.println("Error no puedes ingresar ni letras ni simbolos");
            sc.next();
        }

        

    }

    return numero;


        



    }

    public int crearYvalidarNumeroInlcuyendoNegativos () {
        Scanner sc = new Scanner(System.in);
        boolean numeroValido = false;
        int numero =0;

    while(!numeroValido) {
        if(sc.hasNextInt()) {
            numero = sc.nextInt();

            numeroValido = true;
        } else {
            System.out.println("Error no puedes ingresar ni letras ni simbolos");
            sc.next();
        }

        

    }

    return numero;


        



    }

    public int[] crearArreglo () {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el tamanio de su vector");
        

        int nElementos = crearYvalidarNumero();
        


        int[] arreglo = new int[nElementos];

        System.out.println();

        System.out.println("INGRESO DE VALORES:");
        System.out.println(); 

        for (int i =0; i<nElementos; i++) {
            System.out.println("Ingrese el valor para la posicion #" + (i+1));
            arreglo[i] = crearYvalidarNumeroInlcuyendoNegativos();
            System.out.println();
        }

        

        return arreglo;



    }
}
