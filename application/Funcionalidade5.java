import java.util.Scanner;

public class Funcionalidade5 {
    
    public String executar() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Recursos Educacionais Dispon�veis:");
        System.out.println("1 - Cuidados B�sicos com Animais de Estima��o");
        System.out.println("2 - Guia de Ado��o Respons�vel");
        System.out.println("3 - Comportamento Animal");

        System.out.println();
        System.out.println("Sobre qual você deseja ler?");

        int opcao = scan.nextInt();
        String caminhoDoArquivo = "";

        switch (opcao) {
            case 1:
                caminhoDoArquivo = "1 - Cuidados Basicos.txt";
                break;
            case 2:
                caminhoDoArquivo = "2 - Guia de Adocao Responsavel.txt";
                break;
            case 3:
                caminhoDoArquivo = "3 - Comportamento Animal.txt";
                break;
            default:
                System.out.println("Op��o Inv�lida!");
                break;
        }

        return caminhoDoArquivo;
    }
}
