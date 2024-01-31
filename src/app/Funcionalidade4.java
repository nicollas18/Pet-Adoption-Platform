import java.util.List;
public class Funcionalidade4 {
    
    public void executar(List<Abrigo> abrigos) {

        for (Abrigo abrigo : abrigos) {
            abrigo.imprimirPerfilAbrigo();
        }
    }
}
