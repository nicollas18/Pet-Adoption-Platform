import java.util.ArrayList;
import java.util.List;

public class Abrigo {

    private String nomeAbrigo;
    private String localizacao;
    private List<Animal> animaisDisponiveis;
    
    // Construtor
    public Abrigo(String nomeAbrigo, String localizacao) {
        this.nomeAbrigo = nomeAbrigo;
        this.localizacao = localizacao; 
    }

    // Métodos para adicionar animal disponível para adoção 
    public void adcionarAnimal(Animal animal) {
        animaisDisponiveis.add(animal);
    }

    // Método para processar solicitação de adoção
    public boolean solicitarAdocao(Usuario usuario, Animal animal) {
        if (animaisDisponiveis.contains(animal)) {
            // Processamento da solicitação (pode incluir notificações, confirmações, etc.)
            animaisDisponiveis.remove(animal);
            System.out.println("O usuário " + usuario.getNome() + " solicitou adoção de " + animal.getNome());
            return true; // Adoção aprovada
        } else {
            System.out.println("Este animal não está disponível para adoção no momento.");
            return false; // Adoção não aprovada
        }
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

    
}
