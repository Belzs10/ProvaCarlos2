package provaCarlos2;

public enum Genero {
    FEMININO("Feminino"),
    MASCULINO("Masculino");

    private String text;

    Genero(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
