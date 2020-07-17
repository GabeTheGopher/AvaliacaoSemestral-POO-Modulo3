package lata.classes;

import java.sql.Date;
/**
 *
 * @author Gabriel Lopes
 */
public class Acesso {
    private int id;
    private String nome;
    private String sexo;
    private String email;
    private String dataAni;
    private String celular;
    private String senha;

    public int getId() {
        return id;
    }
    
    public String getEmail(){
        return email;
    }
    
    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public String getDataAni() {
        return dataAni;
    }

    public String getCelular() {
        return celular;
    }

    public String getSenha() {
        return senha;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setEmail(String email){
        this.email = email;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setDataAni(String dataAni) {
        this.dataAni = dataAni;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public String formatarData(String data){
        String [] dataFormatada = data.split("/");
        return dataFormatada[2] +"-" +dataFormatada[1] +"-"+dataFormatada[0];
    }

    public String formatarNumero(String numero){
       String [] caracteres = {"-", " "};
       for(int i = 0; i<caracteres.length;i++){
           numero = numero.replaceAll(caracteres[i], "");
       }
       return numero;
    }
    public String toString() {
        return "Usuario{" + "id=" + id + ", nome=" + nome + ", sexo=" + sexo + ", dataAni=" + dataAni + ", celular=" + celular + ", senha=" + senha + '}';
    }    
    
}
 