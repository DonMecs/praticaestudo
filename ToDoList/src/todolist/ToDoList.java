package todolist;

import java.util.Scanner;

public class ToDoList {

    public static void main(String[] args) {
        int auxtela;                                                             //variavel para o controle de telas de menu 
        int fecha = 0;
        Scanner escolha = new Scanner(System.in);
        
        MenuInicial menuinicial = new MenuInicial();                             //declaraçao de objetos dos menus
        MenuAdicionarTarefas menuadicionar = new MenuAdicionarTarefas();       //
        MenuTarefasPendentes menupendentes = new MenuTarefasPendentes();         //
        MenuTarefasConcluidas menuconcluidas = new MenuTarefasConcluidas();      //
        
        menuinicial.WriteMenuInicial();
        while (fecha == 0){           
            auxtela = escolha.nextInt();
            
            switch (auxtela){
                default:
                    System.out.println("Finalizando Aplicacao...");
                    fecha = 1;
                    break;
                case 0:
                    menuinicial.WriteMenuInicial();
                    break;
                case 1: 
                    menupendentes.WriteTarefasPendentes();
                    break;
                case 2:
                    menuconcluidas.WriteTarefasConcluidas();
                    break;
                case 3:
                    menuadicionar.WriteAdicionarTarefas();
                    break;
            }
        }
        
    }
    
}
