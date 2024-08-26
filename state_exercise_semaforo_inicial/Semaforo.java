public class Semaforo {
    private EstadoSemaforo estadoAtual;

    public Semaforo() {
        this.estadoAtual = new EstadoVermelho();
    }

    public void setEstado(EstadoSemaforo novoEstado) {
        this.estadoAtual = novoEstado;
    }

    public void iniciar() {
        while (true) {
            estadoAtual.mostrarSinal();
            estadoAtual.transicionar(this); 
        }
    }
}
