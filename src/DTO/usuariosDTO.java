
package DTO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


public class usuariosDTO {
    private int id_usuario;
    private String nome,email, senha;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public String salvar(){
        
             try {
            //FileWriter biblioteca para salvar arquivos de texto
            FileWriter fw = new FileWriter("Usuarios"+this.id_usuario+".txt",false);//criando o arquivo
            PrintWriter pw = new PrintWriter(fw);//escreve o conteÃºdo no arquivo e quebra as linhas;
            
            
               pw.println(this.id_usuario);
            
                pw.println(this.nome);
                pw.println(this.senha);
                   pw.println(this.email);
                           
                    
                  pw.flush();//enviar o arquivo
                     pw.close();//fechar
                     fw.close();//fechar
             
                    } catch (IOException ex) {
                        //JOptionPane.showMessageDialog(null, ex);
            Logger.getLogger(usuariosDTO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return "Cadastro com Sucesso";
    }
    
}
