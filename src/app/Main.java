import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        InicializadorDados.inicializadorBaseDados();

        List<Abrigo> abrigos = InicializadorDados.getAbrigos();
        Forum forum = InicializadorDados.getForum();

        while(true){

            System.out.println();
            System.out.println("Escolha um abrigo");
            
            int i = 1;

            for (Abrigo abrigo : abrigos) {
                System.out.println(i + " - " + abrigo.getNomeAbrigo());
                i++;
            }
    
            Scanner scan = new Scanner(System.in);
            int input = scan.nextInt();
            Abrigo abrigoEscolhido = null;


            switch (input) {

                case 1: 
                case 2:
                case 3:
                    abrigoEscolhido = abrigos.get(input - 1);
                    break;

                default:
                    System.out.println("\nOpc�o Inv�lida.");
                    continue;
            }

            while (true) {

                new opcoes().exibirOpcoes();
                input = scan.nextInt();

                if (input == 0){
                    return;
                }

                if (input == 11) {
                    break;
                }

                new menu().exibirMenu(input, abrigoEscolhido, abrigos, forum);
            }
   
        }
    }
}