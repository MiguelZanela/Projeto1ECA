/**
 * O objetivo deste exercicio e praticar a colaboração em um projeto fechado com equipe pequena.
 * Cada equipe, de 2 a 4 integrantes devera desenvolver um catalogo de veiculos a venda. 
 * O sistema e formado, basicamente pelas classes "Catalogo", pela interface "Veiculo" (e suas implementacoes) 
 * e pela classe que contém a interface com o usuario (pode ser texto) e o metodo main. 
 * 
 *  
 * @author Miguel zanela, 
 * 
 * version 24 Ago 2020
 */

public class App {
    public static void main(String args[]){

        //apenas para teste
        Catalogo.veiculos.add(new Carro("VM", "gol", 1995, 2, 1546165156, 1551.24156));
        Catalogo.veiculos.add(new Moto("honda", "cg", 1995, 2, 1546165156, 1551.24156));
        Catalogo.veiculos.add(new Suv("Jeep", "Renegade", 1995, 2, 1546165156, 1551.24156));
        Catalogo.veiculos.add(new Suv("VM", "saveiro", 1995, 2, 1546165156, 1551.24156));

        //apenas para teste
        for(Veiculo it: Catalogo.veiculos){
            System.out.println(it);
        }
    }
}