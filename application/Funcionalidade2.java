import java.util.Scanner;

public class Funcionalidade2 {
    
    public void executar(Abrigo abrigo) {

        Scanner scan = new Scanner(System.in);

        abrigo.imprimirAnimaisDisponiveis();
        System.out.println("Selecione o numero do animal desejado para ado��o:");
        int numeroAnimal = scan.nextInt();
        
        // Verificar se o n�mero do animal � v�lido
        if (numeroAnimal >= 1 && numeroAnimal <= abrigo.getAnimaisDisponiveis().size()) {
            Animal animalSelecionado = abrigo.getAnimaisDisponiveis().get(numeroAnimal - 1);
            
            // Simular o envio de pedido de ado��o por um usu�rio
            System.out.println("Digite seu nome de usu�rio para enviar o pedido:");
            scan.nextLine(); // Limpar o buffer do scanner
            String nomeUsuario = scan.nextLine();
            
            // Verificar se o usu�rio est� relacionado ao abrigo
            boolean usuarioExiste = abrigo.getUsuariosRelacionados().stream().anyMatch(usuario -> usuario.getNome().equalsIgnoreCase(nomeUsuario));
            
            if (usuarioExiste) {
                Usuario usuarioPedido = abrigo.getUsuariosRelacionados().stream().filter(usuario -> usuario.getNome().equalsIgnoreCase(nomeUsuario)).findFirst().orElse(null);
                
                // Processamento do pedido de ado��o
                boolean pedidoAceito = abrigo.solicitarAdocao(usuarioPedido, animalSelecionado);
                
    
                if (pedidoAceito) {
                    System.out.println("Pedido de ado��o enviado com sucesso!");
                } else {
                    System.out.println("Desculpe, o pedido de ado��o n�o pode ser conclu�do.");
                }
            } else {
                System.out.println("Usu�rio n�o encontrado no abrigo.");
            }
        } else {
            System.out.println("N�mero de animal inv�lido.");
        }

        
    }
}
