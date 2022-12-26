import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControladorTest {

    Controlador controlador;
    Comporta comporta;

    @BeforeEach
    void setUp(){
        comporta = new Comporta();
        controlador = new Controlador();
    }

    @Test
    void deveAbrirComporta(){
        Tarefa abrirComporta = new AbrirComportaTarefa(comporta);
        controlador.executarTarefa(abrirComporta);

        assertEquals("Comporta aberta", comporta.getEstadoAtual());
    }

    @Test
    void deveFecharComporta(){
        Tarefa fecharComporta = new FecharComportaTarefa(comporta);
        controlador.executarTarefa(fecharComporta);

        assertEquals("Comporta fechada", comporta.getEstadoAtual());
    }

    @Test
    void deveCancelarAberturaComporta(){
        Tarefa aberturaComporta = new AbrirComportaTarefa(comporta);
        controlador.executarTarefa(aberturaComporta);
        aberturaComporta.cancelar();

        assertEquals("Comporta fechada", comporta.getEstadoAtual());
    }

    @Test
    void deveCancelarFechamentoComporta(){
        Tarefa fecharComporta = new FecharComportaTarefa(comporta);
        controlador.executarTarefa(fecharComporta);
        fecharComporta.cancelar();

        assertEquals("Comporta aberta", comporta.getEstadoAtual());
    }

}