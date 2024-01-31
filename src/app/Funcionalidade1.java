import java.util.Scanner;

public class Funcionalidade1 {
    
    public int executar(Abrigo abrigo) {

        int retorno = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a Operação Desejada");
        System.out.println("1 - Listar Animais Disponíveis");
        System.out.println("2 - Adicionar Novo Animal");
        System.out.println("3 - Retornar ao Menu");
        System.out.printf("\n");
        int opcaoAnimal = scan.nextInt();
    
    
        switch (opcaoAnimal) {
            case 1:
                // Listar animais dispon�veis
                abrigo.imprimirAnimaisDisponiveis();
                break;

            case 2:
                // Adicionar novo animal
                System.out.println("Digite o nome do animal:");
                scan.nextLine(); // Limpar o buffer do scanner
                String nomeAnimal = scan.nextLine();
                System.out.println("Digite a idade do animal:");
                int idadeAnimal = scan.nextInt();
                System.out.println("Digite a ra�a do animal:");
                scan.nextLine(); // Limpar o buffer do scanner
                String racaAnimal = scan.nextLine();
                System.out.println("Digite a personalidade do animal:");
                String personalidadeAnimal = scan.nextLine();
                
                Animal novoAnimal = new Animal(nomeAnimal, idadeAnimal, racaAnimal, personalidadeAnimal);
                abrigo.adicionarAnimal(novoAnimal);
                System.out.println("Novo animal adicionado com sucesso!");
                break;

            case 3:
                retorno = 3;
                return retorno;

            default:
                System.out.println("Opção Inválida.");
                break;
        }

        return retorno; 
    }
}
