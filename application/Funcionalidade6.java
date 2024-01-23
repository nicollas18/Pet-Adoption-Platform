import java.util.Scanner;

public class Funcionalidade6 {
    
    public void executar(Abrigo abrigo) {

        Scanner scan = new Scanner(System.in);

        System.out.println("\nO que voce quer?");
        System.out.println("1 - Adicionar um Evento");
        System.out.println("2 - Lista dos Eventos");

        int input = scan.nextInt();

        switch (input) {

            case 1:
                System.out.println("Digite o nome do Evento:");
                scan.nextLine();
                String nomeEvento = scan.nextLine();
                System.out.println("Digite a descricao do Evento");
            
                String descricao = scan.nextLine();
                System.out.println("Digite a data do Evento");
            
                String data = scan.nextLine();
                System.out.println("Digite o tipo do Evento");
            

                String tipo = scan.nextLine();

                Evento novoEvento = new Evento(nomeEvento, descricao, data, tipo);

                abrigo.adicionarEvento(novoEvento);
                break;

            case 2:
                abrigo.listarEventos();
                break;
                
            default:
                break;
        }
    }
}
