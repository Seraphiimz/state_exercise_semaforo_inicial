public interface EstadoSemaforo {
    void mostrarSinal();
    void transicionar(Semaforo semaforo);
    int getTempo();
}
