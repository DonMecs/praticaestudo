package todolist;

import java.sql.*;
import java.util.Scanner;

public class DBFunctions {
    
    public static void AdicionarTask(String nome, String descricao) throws SQLException {
        //método para inserir uma nova tarefa ao banco de dados
        String connectionString = "jdbc:postgresql://localhost:5432/ToDoListDBJAVA?user=postgres&password=123";
    	Connection connection = DriverManager.getConnection(connectionString);
        
        String sql = "INSERT INTO tasks (nome, descricao, situacao) VALUES (?, ?, ?)";
    	PreparedStatement preparedStatement = connection.prepareStatement(sql);
    	preparedStatement.setString(1, nome);
    	preparedStatement.setString(2, descricao);
    	preparedStatement.setString(3, "aberto");
    	preparedStatement.executeUpdate();
    	preparedStatement.close();
        
        connection.close();
    }
    
    public static void ExibirTaskPendente() throws SQLException {
        //método para exibir tarefas pendentes no banco de dados
        String connectionString = "jdbc:postgresql://localhost:5432/ToDoListDBJAVA?user=postgres&password=123";
    	Connection connection = DriverManager.getConnection(connectionString);
        
        String sql = "SELECT nome, descricao, id FROM tasks WHERE situacao='aberto' ORDER BY id";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        
        while(resultSet.next()) {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Nome: " + resultSet.getString("nome"));
            System.out.println("Descricao: " + resultSet.getString("descricao"));
            System.out.println("ID: " + resultSet.getString("id"));
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
        
        connection.close();
    }
    
    public static void ExibirTaskFinalizada() throws SQLException {
        //método para exibir tarefas finalizadas no banco de dados
        String connectionString = "jdbc:postgresql://localhost:5432/ToDoListDBJAVA?user=postgres&password=123";
    	Connection connection = DriverManager.getConnection(connectionString);
        
        String sql = "SELECT nome, descricao, id FROM tasks WHERE situacao='fechado' ORDER BY id";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        
        while(resultSet.next()) {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Nome: " + resultSet.getString("nome"));
            System.out.println("Descricao: " + resultSet.getString("descricao"));
            System.out.println("ID: " + resultSet.getString("id"));
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
        
        connection.close();
    }
    
    public static void ExibirTodasTasks() throws SQLException {
        //método para remover uma tarefa do banco de dados
        String connectionString = "jdbc:postgresql://localhost:5432/ToDoListDBJAVA?user=postgres&password=123";
    	Connection connection = DriverManager.getConnection(connectionString);
        
        String sql = "SELECT nome, descricao, id FROM tasks ORDER BY id";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        
        System.out.println("TODAS AS TAREFAS: ");
        while(resultSet.next()) {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Nome: " + resultSet.getString("nome"));
            System.out.println("Descricao: " + resultSet.getString("descricao"));
            System.out.println("ID: " + resultSet.getString("id"));
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
        
        connection.close();
    }
    
    public static void FinalizarTask(int id) throws SQLException {
        //método para finalizar uma tarefa do banco de dados
        String connectionString = "jdbc:postgresql://localhost:5432/ToDoListDBJAVA?user=postgres&password=123";
    	Connection connection = DriverManager.getConnection(connectionString);
        
        String sql = "UPDATE tasks SET situacao = 'fechado' WHERE id = ?";
        
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
    	preparedStatement.setInt(1, id);
        preparedStatement.executeUpdate();
    	preparedStatement.close();
        
        connection.close();
    }
}
