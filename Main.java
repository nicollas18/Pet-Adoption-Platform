public class Main {
    public static void main(String[] args) {
        
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
    }
}