public class AbrirComportaTarefa implements Tarefa{
    private Comporta comporta;

    public AbrirComportaTarefa(Comporta comporta){
        this.comporta = comporta;
    }

    public void executar(){
        this.comporta.abrirComporta();
    }

    public void cancelar(){
        this.comporta.fecharComporta();
    }
}
