import java.util.Scanner;

public class Menu {
    private static boolean state = false;
    private static boolean subMenu = false;
    private static final Scanner read = new Scanner(System.in);
    private static int num;

    public static int lecturaMenu(){
        System.out.println("Bienvenido al menu, selecciona una de las opciones disponibles: ");
        while (!state) {
            System.out.println("");
            System.out.println("-----Menu------");
            System.out.println("1. Menu");
            System.out.println("2. Cerrar programa");
            System.out.println("");

            System.out.println("Ingrese una de las opciones: ");
            num = Recibir.recibirInt();

            switch (num){
                case 1:
                    while (!subMenu){
                        System.out.println("");
                        System.out.println("-----SubMenu------");
                        System.out.println("1. Clase 1");
                        System.out.println("2. Cerrar SubMenu");
                        System.out.println("");

                        System.out.println("Ingrese una de las opciones: ");
                        num = Recibir.recibirInt();
                        switch (num){
                            case 1:
                                System.out.println("Hola");
                                break;
                            case 2:
                                subMenu = true;
                                break;
                            default:
                                System.out.println("Solo se admite valores entre 1 y 2.");

                        }
                    }
                    break;
                case 2:
                    state = true;
                    System.out.println("Cerrando programa...");
                    break;
                default:
                    System.out.println("Solo se admite valores entre 1 y 2.");
            }
        }
        return 0;
    }
}