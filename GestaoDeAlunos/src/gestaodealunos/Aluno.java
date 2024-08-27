
package gestaodealunos;


public class Aluno {
    private String nome;
    private String ra;
    private double notaB1;
    private double notaB2;
    private Telefone telefone;
    private Endereco endereco;
    
    public Aluno(String nome){
        this.nome = nome;
    }

    private boolean verificarNota(int nota){
        return ( (nota >= 0 && nota <=10) ); //qualquer valor de nota que condiza com essa condição será TRUE!
    }
    
    public boolean isAprovado(){
        return getMedia() >= 5;
            
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getRA() {
        return ra;
    }
    public void setRA(String ra) {
        this.ra = ra;
    }
    
    public void setNotaB1(int notaB1){
        if(verificarNota(notaB1)){
            this.notaB1 = notaB1;
        }
    }
    public double getNotaB1(){
        return notaB1;
    }
    
    
    public void setNotaB2(int notaB2){
        if(verificarNota(notaB2)){
            this.notaB2 = notaB2;
        }
    }
    public double getNotaB2(){
        return notaB2;
    }
    
    public double getMedia(){
        return (notaB1 + notaB2)/2;
    }
    
    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }
    public Telefone getTelefone() {
        return telefone;
    }
    
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public Endereco getEndereco() {
        return endereco;
    }
   
    @Override
    public String toString() {
        return "Aluno{" 
                + "nome=" + nome 
                + ", notaB1=" + notaB1 
                + ", notaB2=" + notaB2 
                + ", media=" + getMedia() 
                + ", aprovado=" + (isAprovado() ? "Sim":"Nao")
                + ", telefone=" + telefone
                + ", endereco=" + endereco
                +'}';
    }
    
    
}
