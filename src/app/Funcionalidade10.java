import java.util.Scanner;

public class Funcionalidade10 {
    
    public int executar(Forum forum) {

        int retorno = 0;
        Scanner scan = new Scanner(System.in);
        
        //forum.exivirTopicos();
        /*forum.exibirMensagensDoTopico(0);
        forum.exibirMensagensDoTopico(1);
        forum.exibirMensagensDoTopico(2);
        forum.exibirMensagensDoTopico(3);
        forum.exibirMensagensDoTopico(4); */

        System.out.println("O que desejar fazer?");
        System.out.println("1 - Falar sobre um Tópico");
        System.out.println("2 - Adicionar um Tópico");
        System.out.println("3 - Ver Mensagens de um Tópico");
        System.out.println("4 - Voltar para o Menu");

        int input = scan.nextInt();

        switch (input) {

            case 1:
                System.out.println("Sobre qual tópico você gostaria de falar?");
                int topico = scan.nextInt();
                scan.nextLine();
                System.out.println("Informe seu nome");
                String nome = scan.nextLine();
                System.out.println("Digite sua mensagem");
                String mensagem = scan.nextLine();

                forum.adicionarMensagemNoTopico(topico - 1, nome, mensagem);

                break;

            case 2:
                System.out.println("Informe o titulo do tópico");
                String titulo = scan.nextLine();

                forum.criarTopico(titulo);

                break;

            case 3:
                System.out.println("Informe o tópico que desejar ver as mensagens");
                topico = scan.nextInt();

                forum.exibirMensagensDoTopico(topico - 1);
                break;

            case 4:
                retorno = 4;
                return retorno;

            default:
                break;
        }

        /* 

        if (input == 1) {

            System.out.println("Sobre qual tópico você gostaria de falar?");
            int topico = scan.nextInt();
            scan.nextLine();
            System.out.println("Informe seu nome");
            String nome = scan.nextLine();
            System.out.println("Digite sua mensagem");
            String mensagem = scan.nextLine();

            forum.adicionarMensagemNoTopico(topico - 1, nome, mensagem);

        }

        else if (input == 2) {

            System.out.println("Informe o titulo do tópico");
            String titulo = scan.nextLine();

            forum.criarTopico(titulo);
        }

        else if (input == 3) {

            System.out.println("Informe o tópico que desejar ver as mensagens");
            int topico = scan.nextInt();

            forum.exibirMensagensDoTopico(topico - 1);
        }

        else if (input == 4) {
            retorno = 4;
            return retorno;*/
        

        return retorno;

    }
}
