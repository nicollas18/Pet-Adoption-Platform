import java.util.List;
import java.util.Scanner;


public class Funcionalidade3 {
    
    public int executar(Abrigo abrigo) {

        int retorno = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Escolha uma opção de pesquisa:");
        System.out.println("1 - Pesquisar por Ra�a");
        System.out.println("2 - Pesquisar por Idade");
        System.out.println("3 - Pesquisar por Personalidade");
        System.out.println("4 - Voltar para o Menu");
        System.out.printf("\n");
        
        
        int opcaoPesquisa = scan.nextInt();
        
        switch (opcaoPesquisa) {
            case 1:
                // Pesquisar por ra�a
                System.out.println("Digite a raça para pesquisa:");
                scan.nextLine(); // Limpar o buffer do scanner
                String racaPesquisa = scan.nextLine();

                
                
                List<Animal> animaisPorRaca = abrigo.buscarAnimaisPorCriterio("raca", racaPesquisa);

                if (!animaisPorRaca.isEmpty()) {
                    System.out.println("Animais encontrados com a raça '" + racaPesquisa + "':");
                    for (Animal animal : animaisPorRaca) {
                        System.out.println(animal);
                    }
                } else {
                    System.out.println("Nenhum animal encontrado com a raça '" + racaPesquisa + "'.");
                }
                break;
            case 2:
                // Pesquisar por idade
                System.out.println("Digite a idade para pesquisa:");
                int idadePesquisa = scan.nextInt();
                
                List<Animal> animaisPorIdade = abrigo.buscarAnimaisPorCriterio("idade", String.valueOf(idadePesquisa));
                if (!animaisPorIdade.isEmpty()) {
                    System.out.println("Animais encontrados com a idade '" + idadePesquisa + "':");
                    for (Animal animal : animaisPorIdade) {
                        System.out.println(animal);
                    }
                } else {
                    System.out.println("Nenhum animal encontrado com a idade '" + idadePesquisa + "'.");
                }
                break;
            case 3:
                // Pesquisar por personalidade
                System.out.println("Digite a personalidade para pesquisa:");
                scan.nextLine(); // Limpar o buffer do scanner
                String personalidadePesquisa = scan.nextLine();
                
                List<Animal> animaisPorPersonalidade = abrigo.buscarAnimaisPorCriterio("personalidade", personalidadePesquisa);
                if (!animaisPorPersonalidade.isEmpty()) {
                    System.out.println("Animais encontrados com a personalidade '" + personalidadePesquisa + "':");
                    for (Animal animal : animaisPorPersonalidade) {
                        System.out.println(animal);
                    }
                } else {
                    System.out.println("Nenhum animal encontrado com a personalidade '" + personalidadePesquisa + "'.");
                }
                break;

            case 4:
                retorno = 4;
                return retorno;

            default:
                System.out.println("Opção Inválida.");
                break;
        }

        return retorno;
        
    }
}
