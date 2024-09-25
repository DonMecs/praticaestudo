package todolist;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import static todolist.DBFunctions.ExibirTaskPendente;
import static todolist.DBFunctions.FinalizarTask;

public class MenuTarefasPendentes {
    public void WriteTarefasPendentes() {
        System.out.println("=============PENDENTES=============");
        try {
            ExibirTaskPendente(); // a informação das tarefas pendentes deve ser exibida aqui
        } catch (SQLException ex) {
            Logger.getLogger(MenuTarefasPendentes.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("\n");
        System.out.println("DESEJA CONCLUIR UMA TAREFA PENDENTE?");
        System.out.println("[S] - SIM  |  [N] - NAO");
        
        Scanner resp = new Scanner(System.in);
        String respScan;
        respScan = resp.nextLine();
        if(respScan.equalsIgnoreCase("S")) {
            System.out.println("Insira o ID da tarefa que foi concluida: ");
            Scanner idScan = new Scanner(System.in);
            int idDesejado = idScan.nextInt();
            try {
                FinalizarTask(idDesejado);
                System.out.println("Tarefa concluída.");
            } catch (SQLException ex) {
                Logger.getLogger(MenuTarefasPendentes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        System.out.println("===================================");        
        System.out.println("[0] - Menu Inicial  |  [4] - Fechar");
    }
}
