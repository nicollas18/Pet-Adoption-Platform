public class Abrigo {

    private String nomeAbrigo;
    private String localizacao;
    
    // Construtor
    public Abrigo(String nomeAbrigo, String localizacao) {
        this.nomeAbrigo = nomeAbrigo;
        this.localizacao = localizacao; 
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
