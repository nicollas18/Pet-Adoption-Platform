import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*--------------------------- BASE DE DADOS------------------------- */

        // USUARIOS:
        Usuario usuario1 = new Usuario("João", "joao@email.com", "senha123");
        Usuario usuario2 = new Usuario("Maria", "maria@email.com", "456senha");
        Usuario usuario3 = new Usuario("Carlos", "carlos@email.com", "789senha");
        Usuario usuario4 = new Usuario("Ana", "ana@email.com", "ana321senha");
        Usuario usuario5 = new Usuario("Pedro", "pedro@email.com", "1234pedrosenha");
        Usuario usuario6 = new Usuario("Sofia", "sofia@email.com", "567sofiasenha");
        Usuario usuario7 = new Usuario("Lucas", "lucas@email.com", "lucas789senha");
        Usuario usuario8 = new Usuario("Laura", "laura@email.com", "890senha");
        Usuario usuario9 = new Usuario("Gabriel", "gabriel@email.com", "gabrielsenha");
        Usuario usuario10 = new Usuario("Clara", "clara@email.com", "4321clarasenha");
        Usuario usuario11 = new Usuario("Gabriela", "gabriela@email.com", "789senha");
        Usuario usuario12 = new Usuario("Renato", "renato@email.com", "renato123senha");
        Usuario usuario13 = new Usuario("Beatriz", "beatriz@email.com", "456beatrizsenha");
        Usuario usuario14 = new Usuario("Ricardo", "ricardo@email.com", "ricardo987senha");
        Usuario usuario15 = new Usuario("Amanda", "amanda@email.com", "amanda321senha");

        
        // ANIMAIS:
        Animal animal1 = new Animal("Bolinha", 2, "Vira-lata", "Brincalhão");
        Animal animal2 = new Animal("Frajola", 3, "Siamês", "Calmo");
        Animal animal3 = new Animal("Rex", 5, "Labrador", "Amigável");
        Animal animal4 = new Animal("Luna", 1, "Persa", "Independente");
        Animal animal5 = new Animal("Thor", 4, "Golden Retriever", "Ativo");
        Animal animal6 = new Animal("Mia", 6, "Poodle", "Inteligente");
        Animal animal7 = new Animal("Simba", 2, "Bengal", "Curioso");
        Animal animal8 = new Animal("Nina", 3, "Boxer", "Energético");
        Animal animal9 = new Animal("Bob", 2, "Bulldog Francês", "Afetuoso");
        Animal animal10 = new Animal("Tobby", 4, "Dálmata", "Protetor");
        Animal animal11 = new Animal("Pelúcia", 2, "Chow Chow", "Alegre");
        Animal animal12 = new Animal("Marley", 4, "Pastor Alemão", "Protetor");
        Animal animal13 = new Animal("Luna", 3, "Shih Tzu", "Carinhosa");
        Animal animal14 = new Animal("Boris", 5, "Rottweiler", "Leal");
        Animal animal15 = new Animal("Miau", 1, "Gato Persa", "Curioso");

        
        //RepositorioAbrigos repositorioAbrigos = new RepositorioAbrigos();

        Abrigo abrigo1 = new Abrigo("Abrigo Amigos dos Animais", "Rua das Flores, 123", "abrigoamigo@email.com", "(11) 1234-5678", " Segunda a Sábado, das 10h às 17h");

        Abrigo abrigo2 = new Abrigo("Abrigo Patinhas Felizes", "Avenida dos Anjos, 456", "patinhasfelizes@email.com", "(22) 9876-5432", "Segunda a Sábado, das 10h às 17h");

        Abrigo abrigo3 = new Abrigo("Lar dos Peludos", "Endereço: Travessa das Ruas, 789", "lardospeludos@email.com", "(33) 8765-4321", " Segunda a Domingo, das 8h às 20h");



        // ABRIGO 1
        abrigo1.adicionarUsuario(usuario1);
        abrigo1.adicionarUsuario(usuario2);
        abrigo1.adicionarUsuario(usuario3);
        abrigo1.adicionarUsuario(usuario4);
        abrigo1.adicionarUsuario(usuario5);

        abrigo1.adicionarAnimal(animal1);
        abrigo1.adicionarAnimal(animal2);
        abrigo1.adicionarAnimal(animal3);
        abrigo1.adicionarAnimal(animal4);
        abrigo1.adicionarAnimal(animal5);

        // ABRIGO 2
        
        abrigo2.adicionarUsuario(usuario6);
        abrigo2.adicionarUsuario(usuario7);
        abrigo2.adicionarUsuario(usuario8);
        abrigo2.adicionarUsuario(usuario9);
        abrigo2.adicionarUsuario(usuario10);
        
        abrigo2.adicionarAnimal(animal6);
        abrigo2.adicionarAnimal(animal7);
        abrigo2.adicionarAnimal(animal8);
        abrigo2.adicionarAnimal(animal9);
        abrigo2.adicionarAnimal(animal10);


        // ABRIGO 3

        abrigo1.adicionarUsuario(usuario11);
        abrigo1.adicionarUsuario(usuario12);
        abrigo1.adicionarUsuario(usuario13);
        abrigo1.adicionarUsuario(usuario14);
        abrigo1.adicionarUsuario(usuario15);

   
        abrigo3.adicionarAnimal(animal11);
        abrigo3.adicionarAnimal(animal12);
        abrigo3.adicionarAnimal(animal13);
        abrigo3.adicionarAnimal(animal14);
        abrigo3.adicionarAnimal(animal15);


        

        // ------------------------------------------------------------------

        while(true){

            System.out.println();
            System.out.println("Escolha um abrigo");
            System.out.println("0 - Sair do programa");
            System.out.println("1 - Abrigo Amigos dos Animais");
            System.out.println("2 - Abrigo Patinhas Felizes");
            System.out.println("3 - Lar dos Peludos");

            Scanner scan = new Scanner(System.in);
            int input = scan.nextInt();
            Abrigo abrigoEscolhido = new Abrigo(null, null, null, null, null);

            if (input == 0) {
                break;
            }

            switch (input) {
                case 1:
                    abrigoEscolhido = abrigo1;
                    break;

                case 2:
                    abrigoEscolhido = abrigo2;
                    break;

                case 3:
                    abrigoEscolhido = abrigo3;
                    break;

                default:
                    System.out.println("Opcao invalida.");
                    break;
            }
            
            System.out.printf("\n");
            System.out.println("O que deseja fazer?");
            System.out.println("1 - Gereciamento de perfis de animais");
            System.out.println("2 - Processamento de Pedidos de Adocao");
            System.out.println("3 - Opcoes de pesquisa e filtro");
            System.out.println("4 - Perfil de organizações de abrigo e resgaste");
            System.out.println("5 - Recursos Educacionais");
            System.out.printf("\n");

            input = scan.nextInt();
    
            switch (input) {

                // CASO 1 MAIS EXTERNO
                case 1:
                System.out.println("Informe a operacao desejada");
                System.out.println("1 - Listar animais disponiveis");
                System.out.println("2 - Adicionar novo animal");
                System.out.printf("\n");
                int opcaoAnimal = scan.nextInt();
            
            
                switch (opcaoAnimal) {
                    case 1:
                        // Listar animais disponíveis
                        abrigoEscolhido.imprimirAnimaisDisponiveis();
                        break;

                    case 2:
                        // Adicionar novo animal
                        System.out.println("Digite o nome do animal:");
                        scan.nextLine(); // Limpar o buffer do scanner
                        String nomeAnimal = scan.nextLine();
                        System.out.println("Digite a idade do animal:");
                        int idadeAnimal = scan.nextInt();
                        System.out.println("Digite a raça do animal:");
                        scan.nextLine(); // Limpar o buffer do scanner
                        String racaAnimal = scan.nextLine();
                        System.out.println("Digite a personalidade do animal:");
                        String personalidadeAnimal = scan.nextLine();
                        
                        Animal novoAnimal = new Animal(nomeAnimal, idadeAnimal, racaAnimal, personalidadeAnimal);
                        abrigoEscolhido.adicionarAnimal(novoAnimal);
                        System.out.println("Novo animal adicionado com sucesso!");
                        break;

                    default:
                        System.out.println("Opção inválida.");
                        break;
                }
                break; // break do caso 1 mais externo

                // CASO 2 MAIS EXTERNO
                case 2:
                abrigoEscolhido.imprimirAnimaisDisponiveis();
                System.out.println("Selecione o numero do animal desejado para adocao:");
                int numeroAnimal = scan.nextInt();
                
                // Verificar se o número do animal é válido
                if (numeroAnimal >= 1 && numeroAnimal <= abrigoEscolhido.getAnimaisDisponiveis().size()) {
                    Animal animalSelecionado = abrigoEscolhido.getAnimaisDisponiveis().get(numeroAnimal - 1);
                    
                    // Simular o envio de pedido de adoção por um usuário
                    System.out.println("Digite seu nome de usuario para enviar o pedido:");
                    scan.nextLine(); // Limpar o buffer do scanner
                    String nomeUsuario = scan.nextLine();
                    
                    // Verificar se o usuário está relacionado ao abrigo
                    boolean usuarioExiste = abrigoEscolhido.getUsuariosRelacionados().stream().anyMatch(usuario -> usuario.getNome().equalsIgnoreCase(nomeUsuario));
                    
                    if (usuarioExiste) {
                        Usuario usuarioPedido = abrigoEscolhido.getUsuariosRelacionados().stream().filter(usuario -> usuario.getNome().equalsIgnoreCase(nomeUsuario)).findFirst().orElse(null);
                        
                        // Processamento do pedido de adoção
                        boolean pedidoAceito = abrigoEscolhido.solicitarAdocao(usuarioPedido, animalSelecionado);
                        

                        if (pedidoAceito) {
                            System.out.println("Pedido de adocao enviado com sucesso!");
                        } else {
                            System.out.println("Desculpe, o pedido de adocao não pode ser concluido.");
                        }
                    } else {
                        System.out.println("Usuario nao encontrado no abrigo.");
                    }
                } else {
                    System.out.println("Numero de animal invalido.");
                }
                break;

                // CASO 3 MAIS EXTERNO
                case 3:
                System.out.println("Escolha uma opcao de pesquisa:");
                System.out.println("1 - Pesquisar por raca");
                System.out.println("2 - Pesquisar por idade");
                System.out.println("3 - Pesquisar por personalidade");
                
                int opcaoPesquisa = scan.nextInt();
                
                switch (opcaoPesquisa) {
                    case 1:
                        // Pesquisar por raça
                        System.out.println("Digite a raça para pesquisa:");
                        scan.nextLine(); // Limpar o buffer do scanner
                        String racaPesquisa = scan.nextLine();

                        
                        
                        List<Animal> animaisPorRaca = abrigoEscolhido.buscarAnimaisPorCriterio("raca", racaPesquisa);

                        if (!animaisPorRaca.isEmpty()) {
                            System.out.println("Animais encontrados com a raca '" + racaPesquisa + "':");
                            for (Animal animal : animaisPorRaca) {
                                System.out.println(animal);
                            }
                        } else {
                            System.out.println("Nenhum animal encontrado com a raca '" + racaPesquisa + "'.");
                        }
                        break;
                    case 2:
                        // Pesquisar por idade
                        System.out.println("Digite a idade para pesquisa:");
                        int idadePesquisa = scan.nextInt();
                        
                        List<Animal> animaisPorIdade = abrigoEscolhido.buscarAnimaisPorCriterio("idade", String.valueOf(idadePesquisa));
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
                        
                        List<Animal> animaisPorPersonalidade = abrigoEscolhido.buscarAnimaisPorCriterio("personalidade", personalidadePesquisa);
                        if (!animaisPorPersonalidade.isEmpty()) {
                            System.out.println("Animais encontrados com a personalidade '" + personalidadePesquisa + "':");
                            for (Animal animal : animaisPorPersonalidade) {
                                System.out.println(animal);
                            }
                        } else {
                            System.out.println("Nenhum animal encontrado com a personalidade '" + personalidadePesquisa + "'.");
                        }
                        break;
                    default:
                        System.out.println("Opção inválida.");
                        break;
                }
                break;

                case 4:
                abrigo1.imprimirPerfilAbrigo();
                abrigo2.imprimirPerfilAbrigo();
                abrigo3.imprimirPerfilAbrigo();

                break;

                case 5:
                System.out.println("Recursos Educacionais Disponiveis:");
                System.out.println("1 - Cuidados Básicos com Animais de Estimação");
                System.out.println("2 - Guia de Adoção Responsável");
                System.out.println("3 - Comportamento Animal");

                System.out.println();
                System.out.println("Sobre qual voce desejar ler?");

                int opcao = scan.nextInt();

                System.out.println();

                if (opcao == 1) {
                    System.out.println("Cuidados Básicos com Animais de Estimação\r\n" + //
                            "\r\n" + //
                            "Os cuidados com seu animal de estimação são fundamentais para garantir uma vida longa e saudável. Aqui estão algumas dicas importantes para garantir o bem-estar do seu companheiro:\r\n" + //
                            "\r\n" + //
                            "Alimentação Balanceada:\r\n" + //
                            "\r\n" + //
                            "Ofereça uma dieta adequada ao seu pet, de acordo com sua espécie, idade e porte. Consulte um veterinário para orientações específicas sobre a quantidade e tipo de alimento ideal.\r\n" + //
                            "Evite oferecer alimentos inadequados, como chocolate, uva, cebola e alimentos muito condimentados, que podem ser prejudiciais à saúde do animal.\r\n" + //
                            "Higiene Diária:\r\n" + //
                            "\r\n" + //
                            "Mantenha a higiene do seu animal, realizando escovações regulares, banhos quando necessário e corte de unhas.\r\n" + //
                            "Limpeza do ambiente onde o animal vive é crucial para prevenir doenças e parasitas. Lave comedouros e bebedouros regularmente.\r\n" + //
                            "Saúde e Bem-Estar:\r\n" + //
                            "\r\n" + //
                            "Mantenha as vacinações e consultas veterinárias em dia para prevenir doenças e identificar problemas de saúde precocemente.\r\n" + //
                            "Proporcione atividades físicas e mentais para manter seu pet saudável e feliz. Brincadeiras e passeios são essenciais para o bem-estar emocional.\r\n" + //
                            "Lembre-se, cada animal é único, por isso, é fundamental estar atento às necessidades individuais do seu pet e buscar orientação profissional para um cuidado adequado e personalizado.\r\n" + //
                            "\r\n" + //
                            "");
                }

                else if (opcao == 2) {
                  System.out.println("Guia de Adoção Responsável\r\n" + //
                          "\r\n" + //
                          "Adotar um animal de estimação é uma decisão que requer responsabilidade e cuidado. Seguem alguns passos importantes para garantir uma adoção responsável e um cuidado adequado com o novo membro da família:\r\n" + //
                          "\r\n" + //
                          "Pesquise e Prepare-se:\r\n" + //
                          "\r\n" + //
                          "Antes de adotar, conheça a espécie e raça do animal que pretende ter. Esteja ciente das suas necessidades de alimentação, exercício e cuidados de saúde.\r\n" + //
                          "Escolha Consciente:\r\n" + //
                          "\r\n" + //
                          "Visite abrigos de animais e considere a personalidade, porte e necessidades do animal. Escolha um pet que se adapte ao seu estilo de vida.\r\n" + //
                          "Consulta Veterinária:\r\n" + //
                          "\r\n" + //
                          "Assim que adotar, leve o animal ao veterinário para um check-up e estabeleça um calendário de vacinações e cuidados preventivos.\r\n" + //
                          "Ambiente Seguro:\r\n" + //
                          "\r\n" + //
                          "Prepare o ambiente em casa para receber o novo animal. Garanta uma área segura, com comedouro, bebedouro, cama e brinquedos adequados.\r\n" + //
                          "Tempo e Dedicação:\r\n" + //
                          "\r\n" + //
                          "Reserve tempo para criar um vínculo com seu animal. Passeie, brinque e proporcione atenção diária para fortalecer o relacionamento.\r\n" + //
                          "Educação e Treinamento:\r\n" + //
                          "\r\n" + //
                          "Eduque seu pet com carinho e paciência. Treinamento básico é essencial para uma convivência harmoniosa.\r\n" + //
                          "Identificação e Registro:\r\n" + //
                          "\r\n" + //
                          "Coloque uma identificação no animal (como uma coleira com plaquinha) e mantenha os registros atualizados.\r\n" + //
                          "Amor e Cuidado Contínuo:\r\n" + //
                          "\r\n" + //
                          "Cuide do seu animal com amor e responsabilidade ao longo de toda a vida dele. Proporcione alimentação adequada, exercício regular e cuidados veterinários.\r\n" + //
                          "Adotar um animal de estimação é um compromisso para toda a vida. Ao oferecer um lar amoroso e cuidados adequados, você contribui para o bem-estar do animal.");
                
                }
                else if (opcao == 3) {
                    System.out.println("Entender o comportamento dos animais é fundamental para uma convivência saudável e harmoniosa. Aqui estão algumas informações sobre comportamento e dicas para lidar com diferentes situações:\r\n" + //
                            "\r\n" + //
                            "Compreendendo os Instintos:\r\n" + //
                            "\r\n" + //
                            "Animais têm comportamentos instintivos baseados na sua espécie. Por exemplo, gatos arranham para afiar suas garras e cães cheiram para conhecer o ambiente.\r\n" + //
                            "Comunicação Animal:\r\n" + //
                            "\r\n" + //
                            "Os animais se comunicam de diversas formas, seja através de vocalizações, linguagem corporal ou odores. Aprenda a interpretar os sinais para entender as necessidades do seu pet.\r\n" + //
                            "Estresse e Ansiedade:\r\n" + //
                            "\r\n" + //
                            "Mudanças na rotina, medo de barulhos ou separação podem causar estresse nos animais. Procure identificar e minimizar esses gatilhos.\r\n" + //
                            "Socialização:\r\n" + //
                            "\r\n" + //
                            "A socialização é essencial para a saúde mental dos animais. Introduza-os a outros animais e pessoas gradualmente para evitar comportamentos agressivos ou medrosos.\r\n" + //
                            "Enriquecimento Ambiental:\r\n" + //
                            "\r\n" + //
                            "Forneça estímulos mentais e físicos para evitar o tédio. Brinquedos interativos, desafios e atividades ajudam a manter o animal ativo e feliz.\r\n" + //
                            "Treinamento Positivo:\r\n" + //
                            "\r\n" + //
                            "Use métodos de treinamento positivos, baseados em recompensas e elogios, para ensinar e reforçar comportamentos desejados.\r\n" + //
                            "Respeite os Limites:\r\n" + //
                            "\r\n" + //
                            "Reconheça os limites do seu pet. Seja sensível aos momentos em que ele precisa de espaço ou descanso.\r\n" + //
                            "Consulte um Profissional:\r\n" + //
                            "\r\n" + //
                            "Se enfrentar problemas de comportamento persistentes, busque orientação de um profissional, como um veterinário comportamentalista.\r\n" + //
                            "Entender o comportamento animal é uma jornada contínua. Ao investir tempo para compreender e atender às necessidades do seu animal, você constrói uma relação mais forte e saudável.");
                }
                else System.out.println("Opcao Invalida!");

                break;

                default:
                    break;
            }
        }
    }
}