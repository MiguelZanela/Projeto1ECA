import java.util.ArrayList;
import java.util.List;

/**
 * A classe "Catalogo" mantem uma lista com os veiculos a venda. bem como serve de super para os veiculos 
 * Por simplicidade a inicializacao desta lista pode ser "hard coded"
 * 
 * @author Miguel zanela, Rafael Mattone
 * 
 * version 24 Ago 2020
 */

public class Catalogo{
    protected String marca;
    protected String cor;
    protected int ano;
    protected int uniDisponiveis;
    protected double kmAtual;
    protected double valor;
    public static List <Veiculo> veiculos = new ArrayList<>(); //apenas para teste no modo public static


    @Override // falta organizar o print
    public String toString(){
        return "Veiculo: "+ this.marca + ", Cor: " + this.cor + ", Ano: " + this.ano  + ", Unidade: " + this.uniDisponiveis  + ", Km: " + this.kmAtual + ", Valor: " + this.valor;
    }

}