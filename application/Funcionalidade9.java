import java.util.Scanner;

public class Funcionalidade9 {

    public void executar(Abrigo abrigo) {

        Scanner scan = new Scanner(System.in);

        System.out.println("O que desejar fazer");
        System.out.println("1 - Adicionar um História");
        System.out.println("2 - Ver as Histórias");

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
            default:
                break;
        }
    }
}
