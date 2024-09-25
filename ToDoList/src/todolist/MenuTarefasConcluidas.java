package todolist;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static todolist.DBFunctions.ExibirTaskFinalizada;

public class MenuTarefasConcluidas {
    public void WriteTarefasConcluidas() {
        System.out.println("============Concluidas============");
        try {
            ExibirTaskFinalizada(); // a informação das tarefas Concluidas deve ser exibida aqui
        } catch (SQLException ex) {
            Logger.getLogger(MenuTarefasConcluidas.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("==================================");
        System.out.println("[0] - Menu Inicial  |  [4] - Fechar");
    }
}
