public class Camionete extends Catalogo implements Veiculo {

    public Camionete(String marca, String cor, int ano, int uniDisponiveis, double km, double valor){
        super.marca = marca;
        super.ano = ano;
        super.cor = cor;
        super.uniDisponiveis = uniDisponiveis;
        super.kmAtual = km;
        super.valor = valor;
    }

    @Override
    public String getMarca() {        
        return marca;
    }

    @Override
    public int getAno() {        
        return ano;
    }

    @Override
    public double kmAtual() {
        return kmAtual;
    }

    @Override
    public String getCor() {
        return cor;
    }

    @Override
    public double getValor() {
        return valor;
    }

    @Override
    public int getUnidadesDisponiveis() {
        return uniDisponiveis;
    }
}