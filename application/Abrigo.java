import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Abrigo {

    private String nomeAbrigo;
    private String localizacao;
    private List<Animal> animaisDisponiveis;

    /*------------------- BASICO ------------------------*/
    
    // Construtor
    public Abrigo(String nomeAbrigo, String localizacao) {
        this.nomeAbrigo = nomeAbrigo;
        this.localizacao = localizacao; 
        this.animaisDisponiveis = new ArrayList<>();
    }

    // Métodos getters
    public String getNomeAbrigo() {
        return nomeAbrigo;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    // Métodos setters

    public void setNomeAbrigo(String nomeAbrigo) {
        this.nomeAbrigo = nomeAbrigo;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    /*---------------------------------------------------*/


    /* ----- 2:PROCESSAMENTO DE PEDIDOS DE ADOÇÃO ------ */  

    // Método para imprimir animais disponíveis
    public void imprimirAnimaisDisponiveis() {
        System.out.println("Animais Disponiveis no Abrigo " + nomeAbrigo + ":\n");
        for (Animal animal : animaisDisponiveis) {
            System.out.println("Nome: " + animal.getNome() + ", Idade: " + animal.getIdade()
                    + ", Raca: " + animal.getRaca() + ", Personalidade: " + animal.getPersonalidade());
            
        }
        System.out.printf("\n");
    }

    // Métodos para adicionar animal disponível para adoção 
    public void adicionarAnimal(Animal animal) {
        animaisDisponiveis.add(animal);
    }

    // Método para processar solicitação de adoção
    public boolean solicitarAdocao(Usuario usuario, Animal animal) {
        if (animaisDisponiveis.contains(animal)) {
            // Processamento da solicitação (pode incluir notificações, confirmações, etc.)
            animaisDisponiveis.remove(animal);
            System.out.println("O usuario " + usuario.getNome() + " solicitou adocao de " + animal.getNome());
            return true; // Adoção aprovada
        } else {
            System.out.println("Este animal não está disponível para adoção no momento.");
            return false; // Adoção não aprovada
        }
    }

    /*---------------------------------------------------*/



    /* --------- 3:OPÇÕES DE PESQUISA E FILTRO --------- */ 

    // Método para realizar pesquisa de animais por critérios
    public List<Animal> buscarAnimaisPorCriterio(String criterio, String valor) {
        List<Animal> animaisEncontrados = new ArrayList<>();
        switch (criterio) {
            case "raça":
                animaisEncontrados = animaisDisponiveis.stream()
                        .filter(animal -> animal.getRaca().equalsIgnoreCase(valor))
                        .collect(Collectors.toList());
                break;
            case "idade":
                int idade = Integer.parseInt(valor);
                animaisEncontrados = animaisDisponiveis.stream()
                        .filter(animal -> animal.getIdade() == idade)
                        .collect(Collectors.toList());
                break;
            case "personalidade":
                animaisEncontrados = animaisDisponiveis.stream()
                        .filter(animal -> animal.getPersonalidade().equalsIgnoreCase(valor))
                        .collect(Collectors.toList());
                break;
            // Outros critérios podem ser adicionados conforme necessário
            default:
                System.out.println("Critério de busca inválido.");
        }
        return animaisEncontrados;
    }

    /*---------------------------------------------------*/

    
}
