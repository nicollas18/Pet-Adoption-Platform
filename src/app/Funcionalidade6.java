import java.util.Scanner;

public class Funcionalidade6 {
    
    public int executar(Abrigo abrigo) {

        int retorno = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("\nO que voce quer?");
        System.out.println("1 - Adicionar um Evento");
        System.out.println("2 - Lista dos Eventos");
        System.out.println("3 - Voltar para o Menu");

        int input = scan.nextInt();

        switch (input) {

            case 1:
                System.out.println("Digite o nome do Evento:");
                scan.nextLine();
                String nomeEvento = scan.nextLine();
                System.out.println("Digite a descrição do Evento");
            
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

            case 3:
                retorno = 3;
                return retorno;
                
            default:
                break;
        }

        return retorno;
    }
}
