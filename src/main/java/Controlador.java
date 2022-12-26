import java.util.ArrayList;
import java.util.List;

public class Controlador{
    private List<Tarefa> tarefas = new ArrayList<>();

    public void executarTarefa(Tarefa tarefa){
        this.tarefas.add(tarefa);
        tarefa.executar();
    }

}
