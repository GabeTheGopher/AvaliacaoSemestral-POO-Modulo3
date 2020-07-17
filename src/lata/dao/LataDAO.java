package lata.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import lata.classes.Lata;

/**
 *
 * @author glope
 */
public class LataDAO {
    Connection con;

    public LataDAO() throws SQLException {
        con = ConnectionFactory.getConnection();
    }
    public void create(Lata u) {

    PreparedStatement stmt = null;

    try {
        stmt = con.prepareStatement("INSERT INTO tblata (marca,volume,ano,pais,altura,diametro,descricao) VALUES (?,?,?,?,?,?,?)");
        stmt.setString(1, u.getMarca());
        stmt.setDouble(2, u.getVolume());
        stmt.setInt(3, u.getAno());
        stmt.setString(4, u.getPais());
        stmt.setDouble(5, u.getAltura());
        stmt.setDouble(6, u.getDiametro());
        stmt.setString(7, u.getDescricao());
        
        stmt.executeUpdate();

        JOptionPane.showMessageDialog(null, "Usuário Salvo com sucesso!");
        } 
    catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,ex.getMessage());
        } 
    finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

    
    
}
