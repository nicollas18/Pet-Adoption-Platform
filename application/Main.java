import java.util.ArrayList;
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

        /*--------------------------- BASE DE DADOS------------------------- */

        // USUARIOS:
        Usuario usuario1 = new Usuario("Joao", "joao@email.com", "senha123");
        Usuario usuario2 = new Usuario("Maria", "maria@email.com", "senha456");
        Usuario usuario3 = new Usuario("Camila", "camila@email.com", "senha789");

        // ANIMAIS:
        Animal animal1 = new Animal("Bolinha", 2, "Vira-lata", "Brincalhao");
        Animal animal2 = new Animal("Frajola", 3, "Siames", "Calmo");
        Animal animal3 = new Animal("Rex", 5, "Labrador", "Amigavel");

        // ABRIGOS:
        Abrigo abrigo1 = new Abrigo("Abrigo Amigo dos Animais", "Rua das Flores, 123");

        abrigo1.adicionarUsuario(usuario1);
        abrigo1.adicionarUsuario(usuario2);
        abrigo1.adicionarUsuario(usuario3);

        abrigo1.adicionarAnimal(animal1);
        abrigo1.adicionarAnimal(animal2);
        abrigo1.adicionarAnimal(animal3);

        // ------------------------------------------------------------------


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
                abrigo1.imprimirAnimaisDisponiveis();
                
                break;

            case 2:
                abrigo1.solicitarAdocao(null, animal3);
                break;

            case 3:
                System.out.println("Informe o criterio de busca e o seu tipo");

                //String criterio = scan.nextLine();
                //String tipo     = scan.nextLine();

                List<Animal> animaisEncontrados = new ArrayList<>();

                animaisEncontrados = abrigo1.buscarAnimaisPorCriterio("raca", "Vira-lata");

                for (int i = 0; i < animaisEncontrados.size(); i++) {
                    System.out.println(animaisEncontrados.get(i));
                }

                break;

            default:
                break;
        }




        
        

        



    }
}