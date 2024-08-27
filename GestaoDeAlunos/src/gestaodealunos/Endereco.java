package gestaodealunos;

public class Endereco {
    private String cidade;
    private String rua;
    private int numero;
    private String complemento;
    
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public String getComplemento() {
        return complemento;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
       
    public Endereco(String cidade, String rua, int numero) {                       //método construtor de Endereco sem o atributo 'complemento'
        this.cidade = cidade;
        this.rua = rua;
        this.numero = numero;
    }
    
    public Endereco(String cidade, String rua, int numero, String complemento) {   //método construtor de Endereco com o atributo 'complemento' incluso
        this.cidade = cidade;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
    }

    @Override
    public String toString() {
        return "Endereco{" + "cidade=" + cidade + ", rua=" + rua + ", numero=" + numero + ", complemento=" + complemento + '}';
    }

}
