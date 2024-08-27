package gestaodealunos;

public class GestaoDeAlunos {

    public static void main(String[] args) {
        Aluno luis = new Aluno("Luis");             // cria um objeto 'luis' da classe ALUNO com o nome "Luis" passado no parametro da classe construtora
        luis.setRA("F3553AE5");
        luis.setNotaB1(3);
        luis.setNotaB2(2);
        Telefone telefone_luis = new Telefone("16","91119-1232"); // cria um objeto da class Telefone (DDD, Numero)
        luis.setTelefone(telefone_luis);            // seta o objeto telefone_luis como valor de telefone da class Aluno
        luis.getTelefone().setNumero("90909090");   // seta somente o 'numero' de telefone_luis para um novo valor
        Endereco endereco_luis = new Endereco("Sao Joaquim da Barra", "R. Piaui", 2020);
        luis.setEndereco(endereco_luis);
        
        Aluno stenio = new Aluno("Stenio");
        stenio.setRA("F454ER4");
        stenio.setNotaB1(8);
        stenio.setNotaB2(10);
        Telefone telefone_stenio = new Telefone("16","99999-8888");
        stenio.setTelefone(telefone_stenio);
        Endereco endereco_stenio = new Endereco("Ribeirao Preto", "R. Niteroi", 1001, "Apartamento 6");
        stenio.setEndereco(endereco_stenio);
        stenio.getEndereco().setComplemento("Apartamento 10");
        
        System.out.println(luis);          
        System.out.println(stenio);

    }
}
