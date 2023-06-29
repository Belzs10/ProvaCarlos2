package provaCarlos2;

public enum Setor {
    ENGENHARIA("Engenharia"),
    SAUDE("Saúde"),
    JURIDICO("Jurídico"),
    RECURSOS("Recursos"),
    MARKETING("Marketing"),
    OPERACOES("Operações");

    private String text;

    Setor(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
