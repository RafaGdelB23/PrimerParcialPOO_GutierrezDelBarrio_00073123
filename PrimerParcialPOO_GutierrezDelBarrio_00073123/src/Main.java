import ArticulosElectronicos.*;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ObtenerMenu();
    }

    public static void ObtenerMenu() {

        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        ArrayList<ArticulosElectronicos> listadoArticulos = new ArrayList<>();

        do {


            try {

                menu();
                opcion = sc.nextInt();
                sc.nextLine();


                switch (opcion) {
                    case 1:
                        System.out.println("Ha escogido agregar un articulo a la lista");
                        System.out.println("\n");

                        agregarArticulo(listadoArticulos);

                        break;
                    case 2:
                        System.out.println("Ha escogido modificar un articulo a la lista");
                        System.out.println("\n");

                        modificarArticulo(listadoArticulos);

                        break;
                    case 3:
                        System.out.println("Ha escogido mostrar el listado de articulos completo");
                        System.out.println("\n");

                        mostrarListado(listadoArticulos);

                        break;
                    case 4:
                        System.out.println("Ha escogido salir del programa");
                        System.out.println("\n");
                        break;
                    default:
                        System.out.println("Por favor escoja una opcion valida");
                        System.out.println("\n");
                }


            } catch (InputMismatchException e) {
                System.out.println("Por favor escoja un dato valido a la hora de seleccionar la opcion");
                System.out.println("\n");
                sc.nextLine();
            }


        } while (opcion != 4);

    }


    public static void menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------  MENU --------");
        System.out.println("1. Agregar articulo a la lista");
        System.out.println("2. Modificar articulo de la lista");
        System.out.println("3. Listado de todos los articulos");
        System.out.println("4. Salir");
        System.out.print("Escoja la opcion que desee: ");
    }

    public static void agregarArticulo(ArrayList<ArticulosElectronicos> listadoArticulos) {
        Scanner sc = new Scanner(System.in);
        int opc = 0;

        do {

            try {


                System.out.println("1. Telefono Movil");
                System.out.println("2. Laptop");
                System.out.println("3. Salir");
                System.out.print("Escoja la opcion que desee: ");
                opc = sc.nextInt();
                sc.nextLine();

                switch (opc) {
                    case 1:
                        System.out.println("TELEFONO MOVIL\n");
                        System.out.print("Escriba el nombre del articulo: ");
                        String nombre = sc.nextLine();
                        System.out.print("Escriba el modelo del articulo: ");
                        String modelo = sc.nextLine();
                        System.out.print("Escriba la marca del articulo: ");
                        String marca = sc.nextLine();
                        System.out.print("Escriba el almacenamiento del articulo: ");
                        String almacenamiento = sc.nextLine();
                        System.out.print("Escriba el color del articulo: ");
                        String color = sc.nextLine();
                        System.out.println("\n");

                        ArticulosElectronicos nuevoArticulo = new TelefonoMovil();
                        listadoArticulos.add(nuevoArticulo);
                        System.out.println("Articulo agregado exitosamente");


                        break;

                    case 2:
                        System.out.println("LAPTOP");
                        System.out.print("Escriba el nombre del articulo: ");
                        String nombreL = sc.nextLine();
                        System.out.print("Escriba el modelo del articulo: ");
                        String modeloL = sc.nextLine();
                        System.out.print("Escriba la marca del articulo: ");
                        String marcaL = sc.nextLine();
                        System.out.print("Escriba el almacenamiento del articulo: ");
                        String almacenamientoL = sc.nextLine();
                        System.out.print("Escriba el color del articulo: ");
                        String colorL = sc.nextLine();
                        System.out.println("\n");

                        ArticulosElectronicos nuevoArticulo1 = new Laptop();
                        listadoArticulos.add(nuevoArticulo1);
                        System.out.println("Articulo agregado exitosamente");

                        break;

                    case 3:
                        System.out.println("Salir");
                        System.out.println("\n");
                        break;
                    default:
                        System.out.println("Escoja una opcion valida");
                        System.out.println("\n");
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Escoja un dato valido");
                System.out.println("\n");
                sc.nextLine();
            }

        } while (opc != 3);

    }

    public static void mostrarListado(ArrayList<ArticulosElectronicos> listadoArticulos){

        System.out.println("LISTADO DE ARTICULOS");

        TelefonoMovil telefono =  new TelefonoMovil();
        Laptop laptop = new Laptop();

        for (ArticulosElectronicos articulo : listadoArticulos){

            System.out.println("-------------------------");
            System.out.println(telefono.getNombre());
            System.out.println(telefono.getModelo());
            System.out.println(telefono.getMarca());
            System.out.println(telefono.getAlmacenamiento());
            System.out.println(telefono.getColor());
            System.out.println("-------------------------");


        }
    }

    public static void modificarArticulo(ArrayList<ArticulosElectronicos> listadoArticulos){


        Scanner sc = new Scanner(System.in);
        String nombre = null;

        System.out.println("Digite el nombre del articulo: ");
        nombre = sc.nextLine();

        for (int i = 0; i < listadoArticulos.size(); i++){

            if (listadoArticulos.get(i).getNombre().equals(nombre)){

                System.out.println("Digite el nuevo nombre del articulo: ");
                String nuevoNombre = sc.nextLine();

                listadoArticulos.get(i).setNombre(nuevoNombre);
                System.out.println("El nuevo nombre del articulo " + listadoArticulos.get(i).getNombre() + " es: " + nuevoNombre);

            }

        }

    }

}