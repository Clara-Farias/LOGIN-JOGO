package DAO;

import DTO.usuariosDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class UsuarioDAO {
    Connection conn;
    public ResultSet autenticacaoUsuario(usuariosDTO objusuariodto){
        conn = new conexaoDAO().conectaBD();
        
        try {
            String sql = "select * from usuarios where nome = ? and senha = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objusuariodto.getNome());
            pstm.setString(2, objusuariodto.getSenha());
            
            ResultSet rs = pstm.executeQuery();
            return rs;
        }catch (SQLException erro){
            JOptionPane.showMessageDialog(null, "UsuarioDAO: " + erro);
            return null;
        }
    }
    public void inserir(usuariosDTO usuariosDTO){
        conn = new conexaoDAO().conectaBD();
        try {
            String insql = "INSERT INTO usuarios(nome, email, senha) VALUES (?, ?, ?)";
            PreparedStatement inpstm = conn.prepareStatement(insql);
            inpstm.setString(1, usuariosDTO.getNome());
            inpstm.setString(2, usuariosDTO.getEmail());
            inpstm.setString(3, usuariosDTO.getSenha());
            
            inpstm.execute();
            inpstm.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"usuariosDTO" + ex);
        }
        
    }
    public void excluir(usuariosDTO usuariosDTO){
        conn = new conexaoDAO().conectaBD();
        try {
            String exsql = "DELETE FROM usuarios WHERE email = ?";
            PreparedStatement expstm = conn.prepareStatement(exsql);
            
            expstm.execute();
            expstm.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"usuariosDTO" + ex);
        }
        
    }
    public void pesquisar(usuariosDTO usuariosDTO){
        conn = new conexaoDAO().conectaBD();
        try {
            String insql = "INSERT INTO usuarios(nome, email, senha) VALUES (?, ?, ?)";
            PreparedStatement inpstm = conn.prepareStatement(insql);
            inpstm.setString(1, usuariosDTO.getNome());
            inpstm.setString(2, usuariosDTO.getEmail());
            inpstm.setString(3, usuariosDTO.getSenha());
            
            inpstm.execute();
            inpstm.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"usuariosDTO" + ex);
        }
        
    }
    public void alterar(usuariosDTO usuariosDTO){
        conn = new conexaoDAO().conectaBD();
        try {
            String alsql = "UPDATE usuarios(nome, email, senha) VALUES (?, ?, ?)";
            PreparedStatement alpstm = conn.prepareStatement(alsql);
            alpstm.setString(1, usuariosDTO.getNome());
            alpstm.setString(2, usuariosDTO.getEmail());
            alpstm.setString(3, usuariosDTO.getSenha());
            
            alpstm.execute();
            alpstm.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"usuariosDTO" + ex);
        }
        
    }
}