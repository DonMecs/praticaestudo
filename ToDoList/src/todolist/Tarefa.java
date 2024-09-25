package todolist;

public class Tarefa {
    private String nome;
    private String descricao;
    private int estadoint;
    private String descestado;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getEstadoint() {
        return estadoint;
    }
    public void setEstadoint(int estadoint) {
        this.estadoint = estadoint;
    }

    public String getDescestado() {
        return descestado;
    }
    public void setDescestado(String descestado) {
        this.descestado = descestado;
    }
    
}
