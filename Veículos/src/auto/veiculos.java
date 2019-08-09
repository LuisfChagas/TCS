package auto;

public class veiculos extends autoGen {

    public void escolha(int select) {

        if (select == 1) {
            setAutomovel("Carro");
            setCapacidade(50);
            setPneu(150);
        }
        if (select == 2) {
            setAutomovel("Moto");
            setCapacidade(35);
            setPneu(80);
        }
        if (select == 3) {
            setAutomovel("Caminhao");
            setCapacidade(180);
            setPneu(300);
        }
        
        setStatus(false);
    }

    public void menu(int select) {
        if (select == 1) {
            status();
        }
        if (select == 2) {
            ligar();
        }
        if (select == 3) {
            desligar();
        }
        if (select == 4) {
            acelerar();
        }
        if (select == 5) {
            abastecer();
        }
        if (select == 6) {
            trocaPneu();
        }
    }

    public void ligar() {
        if (getStatus() == true) {
            System.out.println("O veículo já está ligado");
        } else {
            setStatus(true);
            System.out.println("O veículo foi ligado");
        }
    }

    public void desligar() {
        if (getStatus() == false) {
            System.out.println("O veículo já está desligado");
        } else {
            setStatus(false);
            System.out.println("O veículo foi desligado");

        }
    }

    public void combustivel() {
        if (getCapacidade() <= 0) {
            System.out.println("Sem gasolina, favor abastecer");
        } else {
            System.out.println("Sua capacidade é de: " + getCapacidade());
        }

    }

    public void acelerar() {

        if (getStatus() == true) {
            if (getCapacidade() > 0) {
                if (getAutomovel().equals("Carro")) {
                    setCapacidade(getCapacidade()- 8);
                    setPneu(getPneu() - 5);
                }
                if (getAutomovel().equals("Moto")) {
                    setCapacidade(getCapacidade()- 5);
                    setPneu(getPneu()- 3);
                }
                if (getAutomovel().equals("Caminhao")) {
                    setCapacidade(getCapacidade()- 12);
                    setPneu(getPneu()- 10);
                }
                System.out.println("Você acelerou");

            } else {
                System.out.println("Você está sem combustível");
                    setStatus(false);
            }
        } else {
            System.out.println("Não tem como acelerar com o carro desligado");
        }
    }

    public void trocaPneu() {

        if (getStatus() == false) {
            if (getAutomovel().equals("Carro")) {
                setPrecoPneu(240.75f);
                setPneu(150);
                setTotal(getTotal() + getPrecoPneu());
            }
            if (getAutomovel().equals("Moto")) {
                setPrecoPneu(95.20f);
                setPneu(80);
                setTotal(getTotal() + getPrecoPneu());
            }
            if (getAutomovel().equals("Caminhao")) {
                setPrecoPneu(622.21f);
                setPneu(300);
                setTotal(getTotal() + getPrecoPneu());
            }
            System.out.println("Você trocou os pneus");
        } else {
            System.out.println("Você não pode trocar os pneus com o automovel ligado");
        }
    }

    public void status() {
        combustivel();
        System.out.println("O pneu: " + getPneu());
        System.out.println("Você está devendo: R$" + (getTotal()));
    }

    public void abastecer() {
        if (getStatus() == false) {
            if (getAutomovel().equals("Carro")) {
                setAuxPreco(50-getCapacidade());
                setPrecoGas(getAuxPreco()*3.90f);
                setCapacidade(50);
                setTotal(this.getTotal() + this.getPrecoGas());
            }
            if (getAutomovel().equals("Moto")) {
                setAuxPreco(35-getCapacidade());
                setPrecoGas(getAuxPreco()*3.90f);
                setCapacidade(35);
                setTotal(this.getTotal() + this.getPrecoGas());
            }
            if (getAutomovel().equals("Caminhao")) {
                setAuxPreco(180-getCapacidade());
                setPrecoGas(getAuxPreco()*2.25f);
                setCapacidade(180);
                setTotal(this.getTotal() + this.getPrecoGas());
            }
            System.out.println("Você completou o tanque");
        } else {
            System.out.println("Você não pode abastecer com o automovel ligado");

        }

    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getAcelerar() {
        return acelerar;
    }

    public void setAcelerar(int acelerar) {
        this.acelerar = acelerar;
    }

    public int getPneu() {
        return pneu;
    }

    public void setPneu(int pneu) {
        this.pneu = pneu;
    }

    public float getPreço() {
        return preço;
    }

    public void setPreço(float preço) {
        this.preço = preço;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getAutomovel() {
        return automovel;
    }

    public void setAutomovel(String automovel) {
        this.automovel = automovel;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getAuxPreco() {
        return auxPreco;
    }

    public void setAuxPreco(float auxPreco) {
        this.auxPreco = auxPreco;
    }

    public float getPrecoGas() {
        return precoGas;
    }

    public void setPrecoGas(float precoGas) {
        this.precoGas = precoGas;
    }

    public float getPrecoPneu() {
        return precoPneu;
    }

    public void setPrecoPneu(float precoPneu) {
        this.precoPneu = precoPneu;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

}
