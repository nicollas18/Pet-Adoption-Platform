import java.util.Scanner;

public class Funcionalidade9 {

    public int executar(Abrigo abrigo) {

        int retorno = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("O que desejar fazer");
        System.out.println("1 - Adicionar um História");
        System.out.println("2 - Ver as Histórias");
        System.out.println(("3 - Voltar para o Menu"));

        int input = scan.nextInt();

        switch (input) {
            case 1:
                System.out.println("Conte sua história");
                scan.nextLine();
                String historia = scan.nextLine();

                abrigo.adicionarHistoriaSucesso(historia);
                break;

            case 2:
                abrigo.listarHistoriasSucesso();
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
