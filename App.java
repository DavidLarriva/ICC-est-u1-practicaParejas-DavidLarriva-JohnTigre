import java.util.Scanner;
public class App {


    public static void main(String[] args) {

        MetodosOrdenamiento metodosOrdenamiento = new MetodosOrdenamiento();
        Utilidades utilidades = new Utilidades();

        //utilidades.crearYvalidarNumeroIncluyendoCero();

        int aux =0;
        boolean conf = false;
        int [] arreglo = null;
        int[] arregloOriginal = null;
        Scanner sc = new Scanner(System.in);
        boolean desordenado = true;

        do {
            System.out.println("  -------------------------------------------");
            System.out.println(" | MENU DE ARREGLOS                          |");
            System.out.println(" | 1 - Crear arreglo nuevo                   |");
            System.out.println(" | 2 - Menu de Ordenamientos eh impresion    |");
            System.out.println(" | 0 - Salir del programa                    |");
            System.out.println("  -------------------------------------------");
            System.out.println();

            aux = utilidades.crearYvalidarNumeroIncluyendoCero();

            switch (aux) {
                case 1: {
                    System.out.println();

                    arreglo = utilidades.crearArreglo();
                    arregloOriginal = arreglo.clone();

                    conf = true;


                    break;
                }

                case 2: {
                    System.out.println();

                    if(!conf ) {
                        System.out.println("Ud no ah creado ningun arreglo, cree uno para continuar");
                        System.out.println();

                        break;

                    }

                    int auxx = 5;

                    

                    do{
                        
                        System.out.println("**************************************************");
                        System.out.println("*                                                 *");
                        System.out.println("*           #MENU#                                *");
                        System.out.println("*                                                 *");
                        System.out.println("*   ORDENAMIENTOS:                                *");
                        System.out.println("                                                  *");
                        System.out.println("*  1 - Metodo Burbuja                             *");
                        System.out.println("*  2 - Metodo Seleccion                           *");
                        System.out.println("*  3 - Metodo Insercion                           *");
                        System.out.println("*  4 - Metodo Burbuja Mejorado                    *");
                        System.out.println("* -------------------------------------           *");
                        System.out.println("*  IMPRESION:                                     *");
                        System.out.println("*                                                 *");
                        System.out.println("*  5 - Imprimir Arreglo actual                    *");
                        System.out.println("*  6 - Imprimir arreglo original                  *");
                        System.out.println("* -------------------------------------           *");
                        System.out.println("*  7 - Desordenar arreglo                         *");
                        System.out.println("*  0 - Regresar al menu de creacion               *");
                        System.out.println("*                                                 *");
                        System.out.println("**************************************************");

                        auxx = utilidades.crearYvalidarNumeroIncluyendoCero();

                        switch(auxx) {
                            case 1:{

                                int a = 5;

                                do{
                                    System.out.println();
                                    System.out.println("Escoja ascendente o descendente");
                                    System.out.println();
                                    System.out.println("1 - Ascendente");
                                    System.out.println("2 - Descendente");
                                    System.out.println("0 - Regresar al menu de ordenamientos");
                                    System.out.println();

                                    a = utilidades.crearYvalidarNumeroIncluyendoCero();
                                    System.out.println();

                                    switch(a) {
                                        case 1: {
                                            boolean ascendente = true;
                                            boolean iteraciones;
                                            int e = 5;
                                            
                                            do{
                                                System.out.println();
                                                System.out.println("Quiere mostrar las iteraciones?");
                                                System.out.println();
                                                System.out.println("1 - si");
                                                System.out.println("2 - no");
                                                System.out.println("0 - Regresar");
                                                System.out.println();
                                                e = utilidades.crearYvalidarNumeroIncluyendoCero();;
                                                System.out.println();

                                                switch(e) {
                                                    case 1:{
                                                        iteraciones = true;
                                                        System.out.println();

                                                        metodosOrdenamiento.ordenamientoBurbuja(arreglo, iteraciones, ascendente);
                                                        desordenado = false;
                                                        System.out.println();
                                                        metodosOrdenamiento.imprimirVector(arreglo);

                                                        break;


                                                    }

                                                    case 2: {
                                                        iteraciones = false;
                                                        System.out.println();
                                                        metodosOrdenamiento.ordenamientoBurbuja(arreglo, iteraciones, ascendente);
                                                        desordenado = false;
                                                        System.out.println();
                                                        metodosOrdenamiento.imprimirVector(arreglo);

                                                        break;
                                                    }
                                                    case 0: {
                                                        System.out.println();
                                                        System.out.println("Regresando al anterior menu...");
                                                        System.out.println();
                                                        break;
                                                    }
                                                    default:{
                                                        System.out.println();
                                                        System.out.println("Ud no ah ingresado una ocpion valida");
                                                        System.out.println();
                                                        break;
                                                    }
                                                }

                                            }while( e!=0 );

                                            break;
                                        }

                                        case 2: {
                                            boolean ascendente = false;
                                            boolean iteraciones;
                                            int e = 5;
                                            
                                            do{
                                                System.out.println();
                                                System.out.println("Quiere mostrar las iteraciones?");
                                                System.out.println();
                                                System.out.println("1 - si");
                                                System.out.println("2 - no");
                                                System.out.println("0 - regresar");
                                                System.out.println();
                                                e = utilidades.crearYvalidarNumeroIncluyendoCero();;

                                                switch(e) {
                                                    case 1:{
                                                        iteraciones = true;
                                                        System.out.println();

                                                        metodosOrdenamiento.ordenamientoBurbuja(arreglo, iteraciones, ascendente);
                                                        desordenado = false;
                                                        desordenado = false;
                                                        System.out.println();
                                                        metodosOrdenamiento.imprimirVector(arreglo);

                                                        break;


                                                    }

                                                    case 2: {
                                                        iteraciones = false;
                                                        System.out.println();
                                                        metodosOrdenamiento.ordenamientoBurbuja(arreglo, iteraciones, ascendente);
                                                        desordenado = false;
                                                        desordenado = false;
                                                        System.out.println();
                                                        metodosOrdenamiento.imprimirVector(arreglo);
                                                        break;
                                                    }

                                                    case 0: {
                                                        System.out.println();
                                                        System.out.println("Regresando al anterior menu...");
                                                        System.out.println();
                                                        break;
                                                    }
                                                    default:{
                                                        System.out.println();
                                                        System.out.println("Ud no ah ingresado una ocpion valida");
                                                        System.out.println();
                                                        break;
                                                    }
                                                }

                                            }while( e!=0 );
                                        }

                                        case 0: {
                                            System.out.println();
                                            System.out.println("Regresando al menu anterior...");
                                            System.out.println();
                                            break;
                                        }

                                        default:{
                                            System.out.println();
                                            System.out.println("Ud no ah ingresado una ocpion valida");
                                            System.out.println();
                                            break;
                                        }
                                    } 


                                }while (a != 0);

                                break;

                            }

                            case 2:{

                                int a = 5;

                                do{
                                    System.out.println();
                                    System.out.println("Escoja ascendente o descendente");
                                    System.out.println();
                                    System.out.println("1 - Ascendente");
                                    System.out.println("2 - Descendente");
                                    System.out.println("0 - Regresar al menu de ordenamientos");
                                    System.out.println();

                                    a = utilidades.crearYvalidarNumeroIncluyendoCero();;
                                    System.out.println();

                                    switch(a) {
                                        case 1: {
                                            boolean ascendente = true;
                                            boolean iteraciones;
                                            int e = 5;
                                            
                                            do{
                                                System.out.println();
                                                System.out.println("Quiere mostrar las iteraciones?");
                                                System.out.println();
                                                System.out.println("1 - si");
                                                System.out.println("2 - no");
                                                System.out.println("0 - Regresar");
                                                System.out.println();
                                                e = utilidades.crearYvalidarNumeroIncluyendoCero();;
                                                System.out.println();

                                                switch(e) {
                                                    case 1:{
                                                        iteraciones = true;
                                                        System.out.println();

                                                        metodosOrdenamiento.ordenamientoSeleccion(arreglo, iteraciones, ascendente);
                                                        desordenado = false;
                                                        System.out.println();
                                                        metodosOrdenamiento.imprimirVector(arreglo);

                                                        break;


                                                    }

                                                    case 2: {
                                                        iteraciones = false;
                                                        System.out.println();
                                                        metodosOrdenamiento.ordenamientoSeleccion(arreglo, iteraciones, ascendente);
                                                        desordenado = false;
                                                        System.out.println();
                                                        metodosOrdenamiento.imprimirVector(arreglo);

                                                        break;
                                                    }
                                                    case 0: {
                                                        System.out.println();
                                                        System.out.println("Regresando al anterior menu...");
                                                        System.out.println();
                                                        break;
                                                    }
                                                    default:{
                                                        System.out.println();
                                                        System.out.println("Ud no ah ingresado una ocpion valida");
                                                        System.out.println();
                                                        break;
                                                    }
                                                }

                                            }while( e!=0 );

                                            break;
                                        }

                                        case 2: {
                                            boolean ascendente = false;
                                            boolean iteraciones;
                                            int e = 5;
                                            
                                            do{
                                                System.out.println();
                                                System.out.println("Quiere mostrar las iteraciones?");
                                                System.out.println();
                                                System.out.println("1 - si");
                                                System.out.println("2 - no");
                                                System.out.println("0 - regresar");
                                                System.out.println();
                                                e = utilidades.crearYvalidarNumeroIncluyendoCero();;

                                                switch(e) {
                                                    case 1:{
                                                        iteraciones = true;
                                                        System.out.println();

                                                        metodosOrdenamiento.ordenamientoSeleccion(arreglo, iteraciones, ascendente);
                                                        desordenado = false;
                                                        System.out.println();
                                                        metodosOrdenamiento.imprimirVector(arreglo);

                                                        break;


                                                    }

                                                    case 2: {
                                                        iteraciones = false;
                                                        System.out.println();
                                                        metodosOrdenamiento.ordenamientoSeleccion(arreglo, iteraciones, ascendente);
                                                        desordenado = false;
                                                        System.out.println();
                                                        metodosOrdenamiento.imprimirVector(arreglo);
                                                        break;
                                                    }

                                                    case 0: {
                                                        System.out.println();
                                                        System.out.println("Regresando al anterior menu...");
                                                        System.out.println();
                                                        break;
                                                    }
                                                    default:{
                                                        System.out.println();
                                                        System.out.println("Ud no ah ingresado una ocpion valida");
                                                        System.out.println();
                                                        break;
                                                    }
                                                }

                                            }while( e!=0 );
                                        }

                                        case 0: {
                                            System.out.println();
                                            System.out.println("Regresando al menu anterior...");
                                            System.out.println();
                                            break;
                                        }

                                        default:{
                                            System.out.println();
                                            System.out.println("Ud no ah ingresado una ocpion valida");
                                            System.out.println();
                                            break;
                                        }
                                    } 


                                }while (a != 0);

                                break;

                            }

                            case 3:{

                                int a = 5;

                                do{
                                    System.out.println();
                                    System.out.println("Escoja ascendente o descendente");
                                    System.out.println();
                                    System.out.println("1 - Ascendente");
                                    System.out.println("2 - Descendente");
                                    System.out.println("0 - Regresar al menu de ordenamientos");
                                    System.out.println();

                                    a = utilidades.crearYvalidarNumeroIncluyendoCero();;
                                    System.out.println();

                                    switch(a) {
                                        case 1: {
                                            boolean ascendente = true;
                                            boolean iteraciones;
                                            int e = 5;
                                            
                                            do{
                                                System.out.println();
                                                System.out.println("Quiere mostrar las iteraciones?");
                                                System.out.println();
                                                System.out.println("1 - si");
                                                System.out.println("2 - no");
                                                System.out.println("0 - Regresar");
                                                System.out.println();
                                                e = utilidades.crearYvalidarNumeroIncluyendoCero();
                                                System.out.println();

                                                switch(e) {
                                                    case 1:{
                                                        iteraciones = true;
                                                        System.out.println();

                                                        metodosOrdenamiento.ordenamientoInsercion(arreglo, iteraciones, ascendente);
                                                        desordenado = false;
                                                        System.out.println();
                                                        metodosOrdenamiento.imprimirVector(arreglo);

                                                        break;


                                                    }

                                                    case 2: {
                                                        iteraciones = false;
                                                        System.out.println();
                                                        metodosOrdenamiento.ordenamientoInsercion(arreglo, iteraciones, ascendente);
                                                        desordenado = false;
                                                        System.out.println();
                                                        metodosOrdenamiento.imprimirVector(arreglo);

                                                        break;
                                                    }
                                                    case 0: {
                                                        System.out.println();
                                                        System.out.println("Regresando al anterior menu...");
                                                        System.out.println();
                                                        break;
                                                    }
                                                    default:{
                                                        System.out.println();
                                                        System.out.println("Ud no ah ingresado una ocpion valida");
                                                        System.out.println();
                                                        break;
                                                    }
                                                }

                                            }while( e!=0 );

                                            break;
                                        }

                                        case 2: {
                                            boolean ascendente = false;
                                            boolean iteraciones;
                                            int e = 5;
                                            
                                            do{
                                                System.out.println();
                                                System.out.println("Quiere mostrar las iteraciones?");
                                                System.out.println();
                                                System.out.println("1 - si");
                                                System.out.println("2 - no");
                                                System.out.println("0 - regresar");
                                                System.out.println();
                                                e = utilidades.crearYvalidarNumeroIncluyendoCero();

                                                switch(e) {
                                                    case 1:{
                                                        iteraciones = true;
                                                        System.out.println();

                                                        metodosOrdenamiento.ordenamientoInsercion(arreglo, iteraciones, ascendente);
                                                        desordenado = false;
                                                        System.out.println();
                                                        metodosOrdenamiento.imprimirVector(arreglo);

                                                        break;


                                                    }

                                                    case 2: {
                                                        iteraciones = false;
                                                        System.out.println();
                                                        metodosOrdenamiento.ordenamientoInsercion(arreglo, iteraciones, ascendente);
                                                        desordenado = false;
                                                        System.out.println();
                                                        metodosOrdenamiento.imprimirVector(arreglo);
                                                        break;
                                                    }

                                                    case 0: {
                                                        System.out.println();
                                                        System.out.println("Regresando al anterior menu...");
                                                        System.out.println();
                                                        break;
                                                    }
                                                    default:{
                                                        System.out.println();
                                                        System.out.println("Ud no ah ingresado una ocpion valida");
                                                        System.out.println();
                                                        break;
                                                    }
                                                }

                                            }while( e!=0 );
                                        }

                                        case 0: {
                                            System.out.println();
                                            System.out.println("Regresando al menu anterior...");
                                            System.out.println();
                                            break;
                                        }

                                        default:{
                                            System.out.println();
                                            System.out.println("Ud no ah ingresado una ocpion valida");
                                            System.out.println();
                                            break;
                                        }
                                    } 


                                }while (a != 0);

                                break;

                                

                            }

                            case 4:{
                                int a = 5;

                                do{
                                    System.out.println();
                                    System.out.println("Escoja ascendente o descendente");
                                    System.out.println();
                                    System.out.println("1 - Ascendente");
                                    System.out.println("2 - Descendente");
                                    System.out.println("0 - Regresar al menu de ordenamientos");
                                    System.out.println();

                                    a = utilidades.crearYvalidarNumeroIncluyendoCero();
                                    System.out.println();

                                    switch(a) {
                                        case 1: {
                                            boolean ascendente = true;
                                            boolean iteraciones;
                                            int e = 5;
                                            
                                            do{
                                                System.out.println();
                                                System.out.println("Quiere mostrar las iteraciones?");
                                                System.out.println();
                                                System.out.println("1 - si");
                                                System.out.println("2 - no");
                                                System.out.println("0 - Regresar");
                                                System.out.println();
                                                e = utilidades.crearYvalidarNumeroIncluyendoCero();
                                                System.out.println();

                                                switch(e) {
                                                    case 1:{
                                                        iteraciones = true;
                                                        System.out.println();

                                                        metodosOrdenamiento.ordenamientoBurbujaPlus(arreglo, iteraciones, ascendente);
                                                        desordenado = false;
                                                        System.out.println();
                                                        metodosOrdenamiento.imprimirVector(arreglo);

                                                        break;


                                                    }

                                                    case 2: {
                                                        iteraciones = false;
                                                        System.out.println();
                                                        metodosOrdenamiento.ordenamientoBurbujaPlus(arreglo, iteraciones, ascendente);
                                                        desordenado = false;
                                                        System.out.println();
                                                        metodosOrdenamiento.imprimirVector(arreglo);

                                                        break;
                                                    }
                                                    case 0: {
                                                        System.out.println();
                                                        System.out.println("Regresando al anterior menu...");
                                                        System.out.println();
                                                        break;
                                                    }
                                                    default:{
                                                        System.out.println();
                                                        System.out.println("Ud no ah ingresado una ocpion valida");
                                                        System.out.println();
                                                        break;
                                                    }
                                                }

                                            }while( e!=0 );

                                            break;
                                        }

                                        case 2: {
                                            boolean ascendente = false;
                                            boolean iteraciones;
                                            int e = 5;
                                            
                                            do{
                                                System.out.println();
                                                System.out.println("Quiere mostrar las iteraciones?");
                                                System.out.println();
                                                System.out.println("1 - si");
                                                System.out.println("2 - no");
                                                System.out.println("0 - regresar");
                                                System.out.println();
                                                e = utilidades.crearYvalidarNumeroIncluyendoCero();

                                                switch(e) {
                                                    case 1:{
                                                        iteraciones = true;
                                                        System.out.println();

                                                        metodosOrdenamiento.ordenamientoBurbujaPlus(arreglo, iteraciones, ascendente);
                                                        desordenado = false;
                                                        System.out.println();
                                                        metodosOrdenamiento.imprimirVector(arreglo);

                                                        break;


                                                    }

                                                    case 2: {
                                                        iteraciones = false;
                                                        System.out.println();
                                                        metodosOrdenamiento.ordenamientoBurbujaPlus(arreglo, iteraciones, ascendente);
                                                        desordenado = false;
                                                        System.out.println();
                                                        metodosOrdenamiento.imprimirVector(arreglo);
                                                        break;
                                                    }

                                                    case 0: {
                                                        System.out.println();
                                                        System.out.println("Regresando al anterior menu...");
                                                        System.out.println();
                                                        break;
                                                    }
                                                    default:{
                                                        System.out.println();
                                                        System.out.println("Ud no ah ingresado una ocpion valida");
                                                        System.out.println();
                                                        break;
                                                    }
                                                }

                                            }while( e!=0 );
                                        }

                                        case 0: {
                                            System.out.println();
                                            System.out.println("Regresando al menu anterior...");
                                            System.out.println();
                                            break;
                                        }

                                        default:{
                                            System.out.println();
                                            System.out.println("Ud no ah ingresado una ocpion valida");
                                            System.out.println();
                                            break;
                                        }
                                    } 


                                }while (a != 0);

                                


                                break;


                            }

                            case 5: {
                                metodosOrdenamiento.imprimirVector(arreglo);
                                break;
                            }

                            case 6: {
                                metodosOrdenamiento.imprimirArregloOriginal(arregloOriginal);
                                break;
                            }

                            case 7: {
                                if(desordenado){
                                    System.out.println();
                                    System.out.println("El arreglo no ah sido ordenado aun");
                                    System.out.println();
                                    break;
                                }

                                int z = 6;
                                do{
                                    System.out.println();
                                    System.out.println("Quiere cambiar su arreglo a su orden ordiginal ?");
                                    System.out.println("1 - Si");
                                    System.out.println("2 - No");
                                    System.out.println();
                                    z=utilidades.crearYvalidarNumeroIncluyendoCero();


                                    switch(z) {
                                        case 1: {
                                            System.out.println();
                                            System.out.println("Arreglo cambiado a su orden original...");
                                            arreglo = arregloOriginal.clone();
                                            desordenado = true;

                                            break;

                                        }

                                        case 2:{
                                            System.out.println();
                                            System.out.println("Regresando al menu...");
                                            System.out.println();
                                            break;
                                        }

                                        default:{
                                            System.out.println();
                                            System.out.println("Ud no ah ingresado una ocpion valida");
                                            System.out.println();
                                            break;
                                        }

                                    }






                                }while (z!=2 && z!=1);
                                break;
                            }

                            case 0:{

                                break;



                            }

                            default:{
                                System.out.println();
                                System.out.println("Ud no ah ingresado una ocpion valida");
                                System.out.println();
                                break;
                            }
                        }
                        


                    }while(auxx != 0 );

                    break;

                    


                    
                }

                case 0: {
                    System.out.println();

                    System.out.println("Saliendo del programa...");

                    

                    break;
                }

                default: {

                    System.out.println();
                    System.out.println("Ud no ah ingresado una opcion valida,");
                    System.out.println();

                    break;
                }
            }

            

        } while(aux != 0);

        sc.close();

        
    }

    
}