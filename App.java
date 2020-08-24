/**
 * O objetivo deste exercicio e praticar a colaboração em um projeto fechado com equipe pequena.
 * Cada equipe, de 2 a 4 integrantes devera desenvolver um catalogo de veiculos a venda. 
 * O sistema e formado, basicamente pelas classes "Catalogo", pela interface "Veiculo" (e suas implementacoes) 
 * e pela classe que contém a interface com o usuario (pode ser texto) e o metodo main. 
 * 
 *  
 * @author Miguel zanela, Rafael Mattone
 * 
 * version 24 Ago 2020
 */
import java.util.Scanner;
public class App {
    public static void main(String args[]){

        //apenas para teste
        Catalogo.veiculos.add(new Carro("VM Gol", "Vermelho", 1995, 1, 152.000, 15.246));
        Catalogo.veiculos.add(new Carro("Nissan March","Branco",2015,1,29.000,28.500));
        Catalogo.veiculos.add(new Carro("Fiat Uno Mille","Amarelo",2016,1,33.890,18.000));
        Catalogo.veiculos.add(new Carro("Fiat Palio","Branco",2017,1,23.874,32.589));
        Catalogo.veiculos.add(new Moto("honda CG", "Azul", 2009, 1, 94.054, 12.246));
        Catalogo.veiculos.add(new Moto("Honda Biz","Vermelho",2020,1,0,8.150));
        Catalogo.veiculos.add(new Moto("Honda NXR 160 Bros","Preto e Vermelho",2019,1,8.750,10.500));
        Catalogo.veiculos.add(new Moto("Honda CB 250F Twister","Verde",1,2020,0,14.636));
        Catalogo.veiculos.add(new Suv("Jeep Renegade", "Prata", 2015, 1, 36.009, 89.156));
        Catalogo.veiculos.add(new Suv("VM Saveiro", "Preto", 1995, 1, 74.616, 42.500));
        Catalogo.veiculos.add(new Suv("Jeep Compass","Prata",2019,1,8.000,94.000));
        Catalogo.veiculos.add(new Suv("Chery Tiggo 2","Vermelho",2018,1,28.000,58.000));
        Catalogo.veiculos.add(new Caminhonete("Volkswagen, Saveiro Robust","branco", 2020, 1,0,52.360));
        Catalogo.veiculos.add(new Caminhonete("Chevrolet Montana LS","Prata",2019,1,12.000,52.590));
        Catalogo.veiculos.add(new Caminhonete("Renault Duster Oroch Express", "Preto",2018,1,19.000,65.000));
        Catalogo.veiculos.add(new Caminhonete("Fiat Strada Adventure CD","Verde",2019,1,14.540,71.000));


        Scanner sc = new Scanner(System.in);
        int opcao = 0;

	    do {
            System.out.println("\n\n### Veículos ###");
            System.out.println("\n                  =========================");
            System.out.println("                  |     1 - Todos");
            System.out.println("                  |     2 - Caminhonete");
            System.out.println("                  |     3 - Carro");
            System.out.println("                  |     4 - Moto");
            System.out.println("                  |     5 - Suv");
            System.out.println("                  |     0 - Sair");
            System.out.println("                  =========================\n");

            opcao = sc.nextInt();
            System.out.print("\n");
            switch (opcao) {
                case 1:
                    System.out.println("Todos");
                    for(Veiculo it: Catalogo.veiculos){
                        System.out.println(it);
                    }            
                    break;
                case 2:
                    System.out.println("Caminhonete:");
                    for(Veiculo it: Catalogo.veiculos){        
                        String className = it.getClass().getSimpleName();
                        if(className=="Caminhonete"){
                            System.out.println(it);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Carros:");
                    for(Veiculo it: Catalogo.veiculos){        
                        String className = it.getClass().getSimpleName();
                        if(className=="Carro"){
                            System.out.println(it);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Moto:");
                    for(Veiculo it: Catalogo.veiculos){        
                        String className = it.getClass().getSimpleName();
                        if(className=="Moto"){
                            System.out.println(it);
                        }
                    }
                    break;
                case 5:
                    System.out.println("Suv:");
                    for(Veiculo it: Catalogo.veiculos){        
                        String className = it.getClass().getSimpleName();
                        if(className=="Suv"){
                            System.out.println(it);
                        }
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        } while (opcao != 0);
    }
}