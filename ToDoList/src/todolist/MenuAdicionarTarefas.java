package todolist;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import static todolist.DBFunctions.AdicionarTask;

public class MenuAdicionarTarefas {
    public void WriteAdicionarTarefas() {
        Scanner nome = new Scanner(System.in);
        String nomeTarefa;
        String descTarefa;
        System.out.println("=============Adicionar=============");
        System.out.println("Nome da Tarefa: ");
        nomeTarefa = nome.nextLine();
        System.out.println("Descrição da Tarefa: ");
        descTarefa = nome.nextLine();
        
        try {
            AdicionarTask(nomeTarefa, descTarefa);
            System.out.println("[]<= TAREFA ADICIONADA =>[]");
        } catch (SQLException ex) {
            Logger.getLogger(MenuAdicionarTarefas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("===================================");
        System.out.println("[0] - Menu Inicial  |  [4] - Fechar");
    }
}
