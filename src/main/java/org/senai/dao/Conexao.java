package org.senai.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    public static Connection getConexao() throws SQLException {

        final String URL = "jdbc:mysql://localhost:3306/primeira_api";
        final String USER = "root";
        final String PASSWORD = "Hwbfaa65@";

        try {
        Connection conexao = DriverManager.getConnection(URL, USER, PASSWORD);
        if (conexao != null) {
            System.out.println("Conectado com sucesso!");
        }
        return conexao;
        }
        catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

}
