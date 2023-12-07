import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*

        // Criando um animal
        Animal animal = new Animal("Bolinha", 2, "Vira-lata", "Brincalhão");
        
        // Criando um abrigo
        Abrigo abrigo = new Abrigo("Abrigo Amigo dos Animais", "Rua das Flores, 123");
        
        // Adicionando o animal ao abrigo
        abrigo.adicionarAnimal(animal);

        // Criando um usuário
        Usuario usuario = new Usuario("Maria", "maria@email.com", "senha123");
        
        // Simulando a solicitação de adoção
        boolean adocaoAprovada = abrigo.solicitarAdocao(usuario, animal);
        
        if (adocaoAprovada) {
            System.out.println("Adocao aprovada! Parabens, " + usuario.getNome() + "!");
        } else {
            System.out.println("Desculpe, a adocao nao foi aprovada.");
        }

        // Realizando uma busca por raça
        List<Animal> animaisPorRaca = abrigo.buscarAnimaisPorCriterio("raça", "Vira-lata");
        // Isso retornará uma lista de animais com raça "Vira-lata", se houver no abrigo

        */ 

        System.out.printf("\n");
        System.out.println("O que voce deseja fazer?");
        System.out.println("1 - Gereciamento de perfis de animais");
        System.out.println("2 - Processamento de Pedidos de Adocao");
        System.out.println("3 - Opcoes de pesquisa e filtro");
        System.out.printf("\n");

        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        switch (input) {
            case 1:
            Animal animal1 = new Animal("Bolinha", 2, "Vira-lata", "Brincalhao");
            Animal animal2 = new Animal("Frajola", 3, "Siames", "Calmo");
            Animal animal3 = new Animal("Rex", 5, "Labrador", "Amigavel");

            Abrigo abrigo = new Abrigo("Abrigo Amigo dos Animais", "Rua das Flores, 123");

            abrigo.adicionarAnimal(animal1);
            abrigo.adicionarAnimal(animal2);
            abrigo.adicionarAnimal(animal3);

            abrigo.imprimirAnimaisDisponiveis();
                
                break;
            default:
                break;
        }




        
        

        



    }
}