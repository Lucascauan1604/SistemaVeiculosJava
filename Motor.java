public class Motor {
    private int qtdPist;
    private int potencia;

    public Motor() {
    }

    public Motor(int qtdPist, int potencia) {
        this.qtdPist = qtdPist;
        this.potencia = potencia;
    }

    public int getQtdPist() {
        return qtdPist;
    }

    public void setQtdPist(int qtdPistAtual) {
        qtdPist = qtdPistAtual;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
}