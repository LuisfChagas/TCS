package auto;

import java.util.Scanner;

public class mainAuto {

    public static void main(String[] args) {
        Scanner digite = new Scanner(System.in);
        veiculos veiculo = new veiculos();
        System.out.println("Selecione seu automovel:\n1 - Carro\n2 - Moto\n3 - Caminhão");
        int select = Integer.parseInt(digite.nextLine());
        veiculo.escolha(select);
        System.out.println("\nVocê selecionou " + veiculo.getAutomovel());
        for (; select != 0;) {
            //System.out.println("\nEscolha uma opção: \n1 - Status 2 - Ligar 3 - Desligar 4 - Acelerar 5 - Abastecer 6 - Trocar Pneu 0 - sair");
            if (veiculo.getStatus() == false) {
                System.out.println("\nEscolha uma opção: \n1 - Status | 2 - Ligar | 3 - Abastecer | 4 - Trocar Pneu | 0 - sair");
                select = Integer.parseInt(digite.nextLine());
                switch (select) {
                    case 3:
                        veiculo.menu(5);
                        break;
                    case 4:
                        veiculo.menu(6);
                        break;
                    default:
                        veiculo.menu(select);
                        break;
                }
            } else {
                System.out.println("1 - Status | 2 - Acelerar | 3 - Desligar |");
                select = Integer.pars1eInt(digite.nextLine());
                if (select == 2) {
                    veiculo.menu(4);
                }
                else{
                    veiculo.menu(select);
                }
            }
        }
    }
}
