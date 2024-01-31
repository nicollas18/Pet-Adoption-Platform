import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class menu {

    private static void imprimirRecursoEducacional(String caminhoDoArquivo) {
        File arquivo = new File(caminhoDoArquivo);

        try {
            FileReader fileReader = new FileReader(arquivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String linha;

            while ((linha = bufferedReader.readLine()) != null) {
                System.out.println(linha);
            }

            bufferedReader.close();
        } catch (IOException e) {
            System.err.println("Erro ao configurar a codificação UTF-8: " + e.getMessage());
        }
    }
    
    public void exibirMenu(int input, Abrigo abrigoEscolhido, List<Abrigo> abrigos, Forum forum) {

        switch (input) {

            case 1:
                while (true) {

                    if (new Funcionalidade1().executar(abrigoEscolhido) == 3) {
                        break;
                    }
                }
                break;
                
            case 2:
                new Funcionalidade2().executar(abrigoEscolhido);
                break;

            case 3:
                while (true) {
                    if (new Funcionalidade3().executar(abrigoEscolhido) == 4) {
                        break;
                    }
                }
                break;
            
            case 4:
                new Funcionalidade4().executar(abrigos);
                break;
            
            case 5:
                String caminho = new Funcionalidade5().executar();
                imprimirRecursoEducacional(caminho);
                break;

            case 6:
                while (true) {
                    if (new Funcionalidade6().executar(abrigoEscolhido) == 3) {
                        break;
                    }
                }
                break;

            case 7:
                while (true) {
                    if (new Funcionalidade7().executar(abrigoEscolhido) == 4) {
                        break;
                    }
                }
                
                break;

            case 8:
                new Funcionalidade8().executar(abrigoEscolhido);
                break;

            case 9:
                while (true) {
                    if (new Funcionalidade9().executar(abrigoEscolhido) == 3) {
                        break;
                    }
                }
                
                break;

            case 10:
                while (true) {
                    System.out.println();
                    forum.exivirTopicos();
                    

                    if (new Funcionalidade10().executar(forum) == 4)
                    break;
                }
                break;

            default:
                break;
        } 
    }
}
