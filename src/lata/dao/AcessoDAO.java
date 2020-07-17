/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lata.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import lata.classes.Acesso;

/**
 *
 * @author glope
 */
public class AcessoDAO {
           Connection con;

    public AcessoDAO() throws SQLException {
        con = ConnectionFactory.getConnection();
    }
    
    public void create(Acesso u) {

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO tbacesso (nome,sexo,dataAni,celular,email,senha) VALUES (?,?,?,?,?,?)");
            stmt.setString(1, u.getNome());
            stmt.setString(2, u.getSexo());
            stmt.setString(3, u.getDataAni());
            stmt.setString(4, u.getCelular());
            stmt.setString(5, u.getEmail());
            stmt.setString(6, u.getSenha());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Usuário Salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    
    public boolean checkLogin(String email, String senha) {

        PreparedStatement stmt = null;
        ResultSet rs = null;

        boolean check = false;

        try {

            stmt = con.prepareStatement("SELECT * FROM tbacesso WHERE email = ? and senha = ?");
            stmt.setString(1, email);
            stmt.setString(2, senha);

            rs = stmt.executeQuery();

            if (rs.next()) {

                check = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(AcessoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return check;

    }
}
