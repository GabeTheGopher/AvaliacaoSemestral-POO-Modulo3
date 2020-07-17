package lata.classes;
/**
 *
 * @author Gabriel Lopes
 */
public class Lata {
    private int id;
    private String marca;
    private double volume;
    private int ano;
    private String pais;
    private double altura;
    private double diametro;
    private String descricao;

    public int getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public double getVolume() {
        return volume;
    }

    public int getAno() {
        return ano;
    }

    public String getPais() {
        return pais;
    }

    public double getAltura() {
        return altura;
    }

    public double getDiametro() {
        return diametro;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public double formartarAltura(String altura){
        double resp =Double.parseDouble(altura.replaceAll(",","."));
        return resp;
    }
    
    public double formatarDiametro(String diametro){
        double resp =Double.parseDouble(diametro.replaceAll(",", "."));
        return resp;
    }
    
    public double formatarVolume(String volume){
        double resp = Double.parseDouble(volume.replaceAll(",", "."));
        return resp;
    }
    
    public String toString() {
        return "Lata{" + "id=" + id + ", marca=" + marca + ", volume=" + volume + ", ano=" + ano + ", pais=" + pais + ", altura=" + altura + ", diametro=" + diametro + ", descricao=" + descricao + '}';
    }
}
