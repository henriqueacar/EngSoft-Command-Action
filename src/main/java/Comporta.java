public class Comporta {
    private String estadoAtual;

    public Comporta(){};

    public String getEstadoAtual(){
        return this.estadoAtual;
    }

    public void abrirComporta(){
        this.estadoAtual = "Comporta aberta";
    }

    public void fecharComporta(){
        this.estadoAtual = "Comporta fechada";
    }


}
