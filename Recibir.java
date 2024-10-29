import java.util.Scanner;

public class Recibir {

    private static boolean valid = false;
    private static Scanner lectura=new Scanner (System.in);
    private static String revisar="";
    private static String validIStr="";


    public static int recibirInt(){
        while(!valid){
            revisar=lectura.next();
            if(revisar.matches("[1-4]*")){
                return Integer.parseInt(revisar);
            }
            else{
                System.out.println("Ingreso un dato invalido, intente de nuevo.");
            }
        }
        return 0;
    };

    public static String recibirString(){
        return lectura.next();
    };
}
