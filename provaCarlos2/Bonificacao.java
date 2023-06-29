package provaCarlos2;

public enum Bonificacao {
    GERENTE(0.15),
    DIRETOR(0.25);

    private double valor;

    Bonificacao(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
