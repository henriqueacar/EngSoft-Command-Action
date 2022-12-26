public class FecharComportaTarefa implements Tarefa{
    private Comporta comporta;

    public FecharComportaTarefa(Comporta comporta){
        this.comporta = comporta;
    }

    public void executar(){
        this.comporta.fecharComporta();
    }

    public void cancelar(){
        this.comporta.abrirComporta();
    }
}
