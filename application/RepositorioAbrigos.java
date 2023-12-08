import java.util.ArrayList;
import java.util.List;

public class RepositorioAbrigos {
    private List<Abrigo> abrigos; 

    public RepositorioAbrigos(){
        this.abrigos = new ArrayList<>();
    }

    public List<Abrigo> getAbrigos() {
        return this.abrigos;
    }

    public void setAbrigos(Abrigo abrigo) {
        this.abrigos.add(abrigo);
    }

    
}
