/**
 * A interface "Veiculo" deve definir os metodos que mantem as informacoes minimas sobre cada veiculo 
 * e as diferentes implementacoes podem conter detalhes adicionais se for o caso
 * 
 * @author Miguel zanela, Rafael Mattone
 * 
 * version 24 Ago 2020
 */

public interface Veiculo {
    String getMarca();
    int getAno();
    double kmAtual();
    String getCor();
    double getValor();
    int getUnidadesDisponiveis();
}