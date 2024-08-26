public class EstadoVermelho implements EstadoSemaforo {
    @Override
    public void mostrarSinal() {
        System.out.println("Sinal: VERMELHO - PARE");
        int tempo = getTempo();
        while (tempo > 0) {
            System.out.println("Tempo restante: " + tempo + " segundos");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            tempo--;
        }
    }

    @Override
    public void transicionar(Semaforo semaforo) {
        semaforo.setEstado(new EstadoVerde());
    }

    @Override
    public int getTempo() {
        return 15;
    }
}
