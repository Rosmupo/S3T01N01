import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static void main(String[] args) throws Exception {
        final int endProgram = 4;

        int menuOperation = 0;
        Undo undo= Undo.getInstance();

        while(menuOperation != endProgram){
            menuOperation = chooseOperation();

            switch(menuOperation){
                case 1:
                    undo.addCommand(askInfoInt("cree el número de la comanda"));
                    break;

                case 2:
                    System.out.println(undo.getListCommand().toString());
                    break;

                case 3:
                    undo.deleteCommand(askInfoInt("indique el número de la comanda para borrarla"));
                    break;

            }

        } System.out.println("FINALIZÓ EL PROGRAMA");


    }

    private static int chooseOperation() {
        int menuOperation;
        System.out.println("Elija operacion");
        System.out.println("1. Agregar comanda.");
        System.out.println("2. Listar comandas.");
        System.out.println("3. Borrar comanda.");
        System.out.println("4. Salir del programa:");
        Scanner sc = new Scanner(System.in);
        menuOperation = sc.nextInt();
        return menuOperation;

    }
    private static int askInfoInt(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextInt();
    }

}


